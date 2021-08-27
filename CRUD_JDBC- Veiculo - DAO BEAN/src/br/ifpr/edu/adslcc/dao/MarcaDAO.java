/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.edu.adslcc.dao;

import java.util.List;
import br.ifpr.edu.adslcc.bean.Marca;
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
public class MarcaDAO implements Dao<Integer, Marca>{

    protected Connection con;

    public MarcaDAO(Connection con) {
        this.con = con;
    }
    
    @Override
    public void create(Marca entity) {
    
        String sql = "INSERT INTO Marca (descricao) VALUES (?)";
        
        try {
            PreparedStatement query = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            query.setString(1, entity.getDescricao());
            
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
    public Marca retrieve(Integer pk) {
    
        Marca marca = null;
        
        String sql = "SELECT id, descricao FROM Marca WHERE id = ?";
        
        try {
            PreparedStatement query = con.prepareStatement(sql);
            query.setInt(1, pk);
            
            ResultSet rs = query.executeQuery();
            
            while(rs.next()) {
                marca = new Marca();
                marca.setId(rs.getInt("id"));
                marca.setDescricao(rs.getString("descricao"));
            }
            query.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception occured - RETRIVE -" + e);
        }
        
        return marca;   
    
    }

    @Override
    public void update(Marca entity) {
        
        String sql = "UPDATE FROM Marca SET descricao = ? WHERE id = ?";

        try {
            PreparedStatement query = con.prepareStatement(sql);
            query.setString( 1, entity.getDescricao() );
            query.setInt(2, entity.getId());
            
            query.executeUpdate();
            query.close();
            
        } catch (SQLException e) {
            System.out.println("SQL Exception occured - UPDATE -" + e);
        }
        

    }

    @Override
    public void delete(Integer pk) {

        String sql = "DELETE FROM Marca WHERE id = ?";
        
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
    public List<Marca> findAll() {
        
        String sql = "SELECT * FROM Marca";
        List<Marca> marcas = new ArrayList<>();
        
        try {
            
            Statement query = con.createStatement();
            ResultSet result = query.executeQuery( sql );
            
            while ( result.next() ) {

                Marca marca = new Marca();
                marca.setId( result.getInt("id") );
                marca.setDescricao(result.getString( "descricao" ) );
                marcas.add(marca);
                
            }
            
            query.close();
            
        } catch (SQLException e) {
        
            System.out.println("SQL Exception occured - FINDALL -" + e);
        
        }

        return marcas;

    }
    
}
