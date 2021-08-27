/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Contato;
import java.sql.Connection;
import java.sql.Date;
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
public class ContatoDAO implements Dao<Integer, Contato>{

    private Connection con;

    public ContatoDAO(Connection con) {
        this.con = con;
    }
    
    @Override
    public void create(Contato entity) {
        
        String sql = "INSERT INTO contato ( nome, idade, dataCadastro ) VALUES ( ?, ?, ? )";
        
        try {
            
            PreparedStatement query = con.prepareStatement(sql);
            query.setString( 1, entity.getNome());
            query.setInt( 2, entity.getIdade() );
            query.setDate( 3, new Date( entity.getDataCadastro().getTime() ) );
            
            query.execute();
            query.close();
            
        } catch (SQLException e) {
        
            System.out.println("Erro no SQL create");
        
        }

    }

    @Override
    public Contato retrive(Integer primaryKey) {
        
        Contato contato = new Contato();
        String sql = "SELECT * FROM contato WHERE id = ?";
        
        try {

            PreparedStatement query = con.prepareStatement(sql);
            query.setInt( 1, primaryKey );
            ResultSet rs = query.executeQuery();
            
            while ( rs.next() ) {                
                
                contato.setId( rs.getInt( "id" ) );
                contato.setNome(rs.getString("nome" ) );
                contato.setIdade( rs.getInt( "idade" ) );
                contato.setDataCadastro( rs.getDate("dataCadastro" ) );
                
            }
            
            query.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Erro no SQL read");
            ex.printStackTrace();
            
        }
        
        return contato;
        
    }

    @Override
    public void update(Contato entity) {

        String sql = "UPDATE contato SET nome = ?, idade = ?, dataCadastro = ? WHERE id=?";
        
        try {
            
            PreparedStatement query = con.prepareStatement(sql);
            query.setString( 1, entity.getNome() );
            query.setInt( 2, entity.getIdade() );
            query.setDate(3, new Date( entity.getDataCadastro().getTime() ) );
            query.setInt( 4, entity.getId() );
            query.executeUpdate();
            query.close();
            
        } catch (SQLException e) {
            
            System.out.println("Erro no SQL update");
            //e.printStackTrace();
            
        }

    }

    @Override
    public void delete(Integer primaryKey) {

        String sql = "DELETE FROM contato WHERE id = ?";
        
        try {
            
            PreparedStatement query = con.prepareStatement(sql);
            query.setInt( 1, primaryKey );
            query.executeUpdate();
            
            query.close();
            
        } catch (Exception e) {
            
            System.out.println("Erro no SQL delete");
            
        }

    }

    @Override
    public List<Contato> retriveAll() {

        String sql = "select * from contato";
        List<Contato> contatos = new ArrayList<>();
        
        try {
            
            Statement query = con.createStatement();
            ResultSet result = query.executeQuery( sql );
            
            while ( result.next() ) {

                Contato contato = new Contato();
                contato.setId( result.getInt("id") );
                contato.setNome( result.getString( "nome" ) );
                contato.setIdade( result.getInt( "idade" ) );
                contato.setDataCadastro( new java.util.Date( result.getDate("dataCadastro").getTime() ) );
                contatos.add(contato);
                
            }
            
            query.close();
            
        } catch (SQLException e) {
        
            System.out.println("Erro no SQL readAll");
        
        }

        return contatos;
        
    }
    
    
}
