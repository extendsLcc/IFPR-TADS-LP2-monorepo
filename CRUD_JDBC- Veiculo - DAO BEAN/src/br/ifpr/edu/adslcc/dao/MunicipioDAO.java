/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.edu.adslcc.dao;

import java.util.List;
import br.ifpr.edu.adslcc.bean.Municipio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class MunicipioDAO implements Dao<Integer, Municipio>{

    protected Connection con;

    public MunicipioDAO(Connection con) {
        this.con = con;
    }
    
    @Override
    public void create(Municipio entity) {
    
        String sql = "INSERT INTO Municipio (nome, Estado_id) VALUES (?, ?)";
        
        if (entity.getEstado().getId() == 0) {
            EstadoDAO dao = new EstadoDAO(con);
            dao.create(entity.getEstado());
        }
        
        try {
            PreparedStatement query = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            query.setString(1, entity.getNome());
            query.setInt(2, entity.getEstado().getId());
            
            query.executeUpdate();
            ResultSet rs = query.getGeneratedKeys();
            
            if (rs.next()) {
                int id = rs.getInt(1);
                entity.setId(id);
            }
            
            query.close();
            
        } catch (SQLException e) {
            System.out.println("SQL exception ocorred - CREATE - " + e);
        }    
    
    }

    @Override
    public Municipio retrieve(Integer pk) {
    
        Municipio municipio = null;
        
        String sql = "SELECT id, nome, Estado_id FROM Municipio WHERE id = ?";
        
        try {
            PreparedStatement query = con.prepareStatement(sql);
            query.setInt(1, pk);
            
            ResultSet rs = query.executeQuery();
            
            while(rs.next()) {
                municipio = new Municipio();
                municipio.setId(rs.getInt("id"));
                municipio.setNome(rs.getString("nome"));
                
                EstadoDAO estadoDAO = new EstadoDAO(con);
                municipio.setEstado( estadoDAO.retrieve( rs.getInt( "Estado_id" ) ) );
                
            }
            
            query.close();
            
        } catch (SQLException e) {
            
            System.out.println("SQL Exception occured - RETRIVE -" + e);
            
        }
        
        return municipio;   
    
    }

    @Override
    public void update(Municipio entity) {
        
        String sql = "UPDATE FROM Municipio SET nome = ?, Estado_id = ? WHERE id = ?";

        try {
            PreparedStatement query = con.prepareStatement(sql);
            query.setString( 1, entity.getNome());
            query.setInt( 2, entity.getEstado().getId());
            query.setInt(3, entity.getId());
            
            query.executeUpdate();
            query.close();
            
        } catch (SQLException e) {
            System.out.println("SQL Exception occured - UPDATE -" + e);
        }
        

    }

    @Override
    public void delete(Integer pk) {

        String sql = "DELETE FROM Municipio WHERE id = ?";
        
        try {
            
            PreparedStatement query = con.prepareStatement(sql);
            query.setInt( 1, pk );
            query.executeUpdate();
            
            query.close();
            
        } catch (Exception e) {
            
            System.out.println("SQL Exception occured - DELETE -" + e);
            
        }

    }

    @Override
    public List<Municipio> findAll() {
        
        String sql = "SELECT * FROM Municipio";
        List<Municipio> municipios = new ArrayList<>();
        
        try {
            
            Statement query = con.createStatement();
            ResultSet result = query.executeQuery( sql );
            
            while ( result.next() ) {

                Municipio municipio = new Municipio();
                municipio.setId( result.getInt("id") );
                municipio.setNome(result.getString( "nome" ) );
                
                EstadoDAO estadoDAO = new EstadoDAO(con);
                municipio.setEstado( estadoDAO.retrieve( result.getInt( "Estado_id" ) ) );
                municipios.add(municipio);
                
            }
            
            query.close();
            
        } catch (SQLException e) {
        
            System.out.println("SQL Exception occured - FINDALL -" + e);
        
        }

        return municipios;

    }
    
}
