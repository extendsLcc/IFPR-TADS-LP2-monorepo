/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.edu.adslcc.dao;

import java.util.List;
import br.ifpr.edu.adslcc.bean.Categoria;
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
public class CategoriaDAO implements Dao<Integer, Categoria>{

    protected Connection con;

    public CategoriaDAO(Connection con) {
        this.con = con;
    }
    
    @Override
    public void create(Categoria entity) {
    
        String sql = "INSERT INTO Categoria (descricao) VALUES (?)";
        
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
    public Categoria retrieve(Integer pk) {
    
        Categoria categoria = null;
        
        String sql = "SELECT id, descricao FROM Categoria WHERE id = ?";
        
        try {
            PreparedStatement query = con.prepareStatement(sql);
            query.setInt(1, pk);
            
            ResultSet rs = query.executeQuery();
            
            while(rs.next()) {
                categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setDescricao(rs.getString("descricao"));
            }
            query.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception occured - RETRIVE -" + e);
        }
        
        return categoria;   
    
    }

    @Override
    public void update(Categoria entity) {
        
        String sql = "UPDATE FROM Categoria SET descricao = ? WHERE id = ?";

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

        String sql = "DELETE FROM Categoria WHERE id = ?";
        
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
    public List<Categoria> findAll() {
        
        String sql = "SELECT * FROM Categoria";
        List<Categoria> categorias = new ArrayList<>();
        
        try {
            
            Statement query = con.createStatement();
            ResultSet result = query.executeQuery( sql );
            
            while ( result.next() ) {

                Categoria categoria = new Categoria();
                categoria.setId( result.getInt("id") );
                categoria.setDescricao(result.getString( "descricao" ) );
                categorias.add(categoria);
                
            }
            
            query.close();
            
        } catch (SQLException e) {
        
            System.out.println("SQL Exception occured - FINDALL -" + e);
        
        }

        return categorias;

    }
    
}
