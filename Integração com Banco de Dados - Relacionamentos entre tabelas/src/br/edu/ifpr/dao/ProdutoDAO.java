/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.dao;

import br.edu.ifpr.bean.Categoria;
import br.edu.ifpr.bean.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ProdutoDAO implements Dao<Integer, Produto>{
    
    protected Connection con;

    public ProdutoDAO(Connection con) {
        this.con = con;
    }

    @Override
    public void create(Produto entity) {
        String sql = "INSERT INTO Produto (descricao, Categoria_id) "
                + "VALUES (?, ?)";
        
        if (entity.getCategoria().getId() == 0) {
            CategoriaDAO dao = new CategoriaDAO(con);
            dao.create(entity.getCategoria());
        }
        
        try {
            PreparedStatement query = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            query.setString(1, entity.getDescricao());
            query.setInt(2, entity.getCategoria().getId());
            
            query.executeUpdate();
            ResultSet rs = query.getGeneratedKeys();
            
            if (rs.next()) {
                int id = rs.getInt(1);
                entity.setId(id);
            }
            
            query.close();
            
        } catch (SQLException e) {
        }
    }

    @Override
    public Produto retrieve(Integer pk) {
        Produto produto = null;
        
        String sql = "SELECT id, descricao, Categoria_id FROM Produto WHERE id = ?";
        
        try {
            PreparedStatement query = con.prepareStatement(sql);
            query.setInt(1, pk);
            
            ResultSet rs = query.executeQuery();
            
            while (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                
                CategoriaDAO dao = new CategoriaDAO(con);
                Categoria categoria = dao.retrieve(rs.getInt("Categoria_id"));                
                produto.setCategoria(categoria);                
            }
            
            query.close();
            
        } catch (SQLException e) {
            System.out.println("SQL execption occured " + e);
        }
        
        return produto;
    }

    @Override
    public void update(Produto entity) {

        String sql = "UPDATE FROM Produto SET descricao = ?, Categoria_id = ? WHERE id = ?";

        try {
            PreparedStatement query = con.prepareStatement(sql);
            query.setString( 1, entity.getDescricao() );
            query.setInt( 2, entity.getCategoria().getId() );
            query.setInt(3, entity.getId());
            
            query.executeUpdate();
            query.close();
            
        } catch (SQLException e) {
            System.out.println("SQL Exception occured - UPDATE - " + e);
        }

    }

    @Override
    public void delete(Integer pk) {

        String sql = "DELETE FROM Produto WHERE id = ?";
        
        try {
            
            PreparedStatement query = con.prepareStatement(sql);
            query.setInt( 1, pk );
            query.executeUpdate();
            
            query.close();
            
        } catch (Exception e) {
            
            System.out.println("Erro no SQL delete");
            
        }

    }

    @Override
    public List<Produto> findAll() {

        String sql = "SELECT * FROM Produto";
        List<Produto> produtos = new ArrayList<>();
        
        try {
            
            Statement query = con.createStatement();
            ResultSet result = query.executeQuery( sql );
            
            while ( result.next() ) {

                Produto produto = new Produto();
                produto.setId( result.getInt("id") );
                produto.setDescricao( result.getString( "descricao" ) );
                produto.setCategoria( new CategoriaDAO(con).retrieve( result.getInt( "Categoria_id" ) ) );
                produtos.add(produto);
                
            }
            
            query.close();
            
        } catch (SQLException e) {
        
            System.out.println("Erro no SQL readAll");
        
        }

        return produtos;

    }
    
}
