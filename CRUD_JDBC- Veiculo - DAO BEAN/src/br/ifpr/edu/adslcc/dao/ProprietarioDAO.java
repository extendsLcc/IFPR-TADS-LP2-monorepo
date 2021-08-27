/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.edu.adslcc.dao;

import java.util.List;
import br.ifpr.edu.adslcc.bean.Proprietario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ProprietarioDAO implements Dao<Integer, Proprietario>{

    protected Connection con;

    public ProprietarioDAO(Connection con) {
        this.con = con;
    }
    
    @Override
    public void create(Proprietario entity) {
    
        String sql = "INSERT INTO Proprietario (nome, endereco, bairro, cpf, telefone, rg, nascimento) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement query = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            query.setString(1, entity.getNome());
            query.setString(2, entity.getEndereco());
            query.setString(3, entity.getBairro());
            query.setString(4, entity.getCpf());
            query.setString(5, entity.getTelefone());
            query.setString(6, entity.getRg());
            query.setDate(7, new Date( entity.getNascimento().getTime() ));
            
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
    public Proprietario retrieve(Integer pk) {
    
        Proprietario proprietario = null;
        
        String sql = "SELECT nome, endereco, bairro, cpf, telefone, rg, nascimento"
                + " FROM Proprietario WHERE id = ?";
        
        try {
            PreparedStatement query = con.prepareStatement(sql);
            query.setInt(1, pk);
            
            ResultSet rs = query.executeQuery();
            
            while(rs.next()) {
                proprietario = new Proprietario();
                proprietario.setId( pk );
                proprietario.setNome(rs.getString("nome"));
                proprietario.setEndereco(rs.getString("endereco"));
                proprietario.setBairro(rs.getString("bairro"));
                proprietario.setCpf(rs.getString("cpf"));
                proprietario.setTelefone(rs.getString("telefone"));
                proprietario.setRg(rs.getString("rg"));
                proprietario.setNascimento( rs.getDate("nascimento"));
                
            }
            
            query.close();
            
        } catch (SQLException e) {
            
            System.out.println("SQL Exception occured - RETRIVE -" + e);
            
        }
        
        return proprietario;   
    
    }

    @Override
    public void update(Proprietario entity) {
        
        String sql = "UPDATE FROM Proprietario SET "
                + "nome = ?, endereco = ?, bairro = ?, cpf = ?, telefone = ?, rg = ?, nascimento = ?"
                + " WHERE id = ?";

        try {
            PreparedStatement query = con.prepareStatement(sql);
            query.setString(1, entity.getNome());
            query.setString(2, entity.getEndereco());
            query.setString(3, entity.getBairro());
            query.setString(4, entity.getCpf());
            query.setString(5, entity.getTelefone());
            query.setString(6, entity.getRg());
            query.setDate(7, new Date( entity.getNascimento().getTime() ));
            query.setInt(8, entity.getId());
            
            query.executeUpdate();
            query.close();
            
        } catch (SQLException e) {
            System.out.println("SQL Exception occured - UPDATE -" + e);
        }
        

    }

    @Override
    public void delete(Integer pk) {

        String sql = "DELETE FROM Proprietario WHERE id = ?";
        
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
    public List<Proprietario> findAll() {
        
        String sql = "SELECT * FROM Proprietario";
        List<Proprietario> proprietarios = new ArrayList<>();
        
        try {
            
            Statement query = con.createStatement();
            ResultSet result = query.executeQuery( sql );
            
            while ( result.next() ) {

                Proprietario proprietario = new Proprietario();
                proprietario.setId( result.getInt("id") );
                proprietario.setNome(result.getString("nome"));
                proprietario.setEndereco(result.getString("endereco"));
                proprietario.setBairro(result.getString("bairro"));
                proprietario.setCpf(result.getString("cpf"));
                proprietario.setTelefone(result.getString("telefone"));
                proprietario.setRg(result.getString("rg"));
                proprietario.setNascimento( result.getDate("nascimento"));
                
            }
            
            query.close();
            
        } catch (SQLException e) {
        
            System.out.println("SQL Exception occured - FINDALL -" + e);
        
        }

        return proprietarios;

    }
    
}
