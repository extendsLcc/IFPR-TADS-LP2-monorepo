/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.edu.adslcc.dao;

import java.util.List;
import br.ifpr.edu.adslcc.bean.Veiculo;
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
public class VeiculoDAO implements Dao<Integer, Veiculo>{

    protected Connection con;

    public VeiculoDAO(Connection con) {
        this.con = con;
    }
    
    @Override
    public void create(Veiculo entity) {
    
        String sql = "INSERT INTO Veiculo (placa, ano, "
                + "Proprietario_id, Marca_id, Municipio_id, Categoria_id) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        if (entity.getMunicipio().getId() == 0) {
            MunicipioDAO dao = new MunicipioDAO(con);
            dao.create(entity.getMunicipio());
        }
        
        if (entity.getMarca().getId() == 0) {
            MarcaDAO dao = new MarcaDAO(con);
            dao.create(entity.getMarca());
        }
        
        if (entity.getProprietario().getId() == 0) {
            ProprietarioDAO dao = new ProprietarioDAO(con);
            dao.create(entity.getProprietario());
        }
        
        if (entity.getCategoria().getId() == 0) {
            CategoriaDAO dao = new CategoriaDAO(con);
            dao.create(entity.getCategoria());
        }
        
        try {
            PreparedStatement query = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            query.setString(1, entity.getPlaca());
            query.setDate( 2,  new Date( entity.getAno().getTime()) );
            query.setInt(3, entity.getProprietario().getId() );
            query.setInt(4, entity.getMarca().getId() );
            query.setInt(5, entity.getMunicipio().getId() );
            query.setInt(6, entity.getCategoria().getId() );
            
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
    public Veiculo retrieve(Integer pk) {
    
        Veiculo veiculo = null;
        
        String sql = "SELECT placa, ano, Proprietario_id, Marca_id, Municipio_id, Categoria_id "
                + "FROM Veiculo WHERE id = ?";
        
        try {
            PreparedStatement query = con.prepareStatement(sql);
            query.setInt(1, pk);
            
            ResultSet rs = query.executeQuery();
            
            while(rs.next()) {
                veiculo = new Veiculo();
                veiculo.setId(pk);
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setAno( rs.getDate("ano") );
                
                ProprietarioDAO proprietarioDAO = new ProprietarioDAO(con);
                veiculo.setProprietario( proprietarioDAO.retrieve( rs.getInt( "Proprietario_id" ) ) );
                
                MarcaDAO marcaDAO = new MarcaDAO(con);
                veiculo.setMarca( marcaDAO.retrieve( rs.getInt( "Marca_id" ) ) );
                
                MunicipioDAO municipioDAO = new MunicipioDAO(con);
                veiculo.setMunicipio( municipioDAO.retrieve( rs.getInt( "Municipio_id" ) ) );
                
                CategoriaDAO categoriaDAO = new CategoriaDAO(con);
                veiculo.setCategoria( categoriaDAO.retrieve( rs.getInt( "Categoria_id" ) ) );
                
            }
            
            query.close();
            
        } catch (SQLException e) {
            
            System.out.println("SQL Exception occured - RETRIVE -" + e);
            
        }
        
        return veiculo;   
    
    }

    @Override
    public void update(Veiculo entity) {
        
        String sql = "UPDATE FROM Veiculo SET "
                + "placa = ?, ano = ?, Proprietario_id = ?, Marca_id = ?, Municipio_id = ?, Categoria_id = ? "
                + "WHERE id = ?";

        
        if (entity.getMunicipio().getId() == 0) {
            MunicipioDAO dao = new MunicipioDAO(con);
            dao.create(entity.getMunicipio());
        }
        
        if (entity.getMarca().getId() == 0) {
            MarcaDAO dao = new MarcaDAO(con);
            dao.create(entity.getMarca());
        }
        
        if (entity.getProprietario().getId() == 0) {
            ProprietarioDAO dao = new ProprietarioDAO(con);
            dao.create(entity.getProprietario());
        }
        
        if (entity.getCategoria().getId() == 0) {
            CategoriaDAO dao = new CategoriaDAO(con);
            dao.create(entity.getCategoria());
        }
        
        try {
            
            PreparedStatement query = con.prepareStatement(sql);
            query.setString(1, entity.getPlaca());
            query.setDate( 2,  new Date( entity.getAno().getTime()) );
            query.setInt(3, entity.getProprietario().getId() );
            query.setInt(4, entity.getMarca().getId() );
            query.setInt(5, entity.getMunicipio().getId() );
            query.setInt(6, entity.getCategoria().getId() );
            query.setInt(7, entity.getId() );
            
            query.executeUpdate();
            query.close();
            
        } catch (SQLException e) {
            System.out.println("SQL Exception occured - UPDATE -" + e);
        }
        

    }

    @Override
    public void delete(Integer pk) {

        String sql = "DELETE FROM Veiculo WHERE id = ?";
        
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
    public List<Veiculo> findAll() {
        
        String sql = "SELECT id, placa, ano, Proprietario_id, Marca_id, Municipio_id, Categoria_id"
                + " FROM Veiculo";
        List<Veiculo> veiculos = new ArrayList<>();
        
        try {
            
            Statement query = con.createStatement();
            ResultSet result = query.executeQuery( sql );
            
            while ( result.next() ) {

                Veiculo veiculo = new Veiculo();
                veiculo.setId(result.getInt( "id" ));
                veiculo.setPlaca(result.getString("placa"));
                veiculo.setAno( result.getDate("ano") );
                
                ProprietarioDAO proprietarioDAO = new ProprietarioDAO(con);
                veiculo.setProprietario( proprietarioDAO.retrieve( result.getInt( "Proprietario_id" ) ) );
                
                MarcaDAO marcaDAO = new MarcaDAO(con);
                veiculo.setMarca( marcaDAO.retrieve( result.getInt( "Marca_id" ) ) );
                
                MunicipioDAO municipioDAO = new MunicipioDAO(con);
                veiculo.setMunicipio( municipioDAO.retrieve( result.getInt( "Municipio_id" ) ) );
                
                CategoriaDAO categoriaDAO = new CategoriaDAO(con);
                veiculo.setCategoria( categoriaDAO.retrieve( result.getInt( "Categoria_id" ) ) );
                
            }
            
            query.close();
            
        } catch (SQLException e) {
        
            System.out.println("SQL Exception occured - FINDALL -" + e);
        
        }

        return veiculos;

    }
    
}
