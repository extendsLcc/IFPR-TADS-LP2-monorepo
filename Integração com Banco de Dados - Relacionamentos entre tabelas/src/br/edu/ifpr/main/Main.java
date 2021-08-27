/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.main;

import br.edu.ifpr.bean.Categoria;
import br.edu.ifpr.bean.Produto;
import br.edu.ifpr.dao.ProdutoDAO;
import br.edu.ifpr.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) throws SQLException {
        /*
        Categoria cat = new Categoria(1, "Eletronico");
        Produto prod = new Produto( 0, "Ryzen 5 3600", cat);
        */
        Connection con = ConnectionFactory.createConnectionToMySQL();
        
        ProdutoDAO prodDao = new ProdutoDAO(con);
        
        //prodDao.create(prod);
        System.out.println( prodDao.findAll() );
        
        con.close();
        
    }
    
}
