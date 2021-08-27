/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.edu.adslcc.main;

import br.ifpr.edu.adslcc.bean.Categoria;
import br.ifpr.edu.adslcc.bean.Estado;
import br.ifpr.edu.adslcc.bean.Marca;
import br.ifpr.edu.adslcc.bean.Municipio;
import br.ifpr.edu.adslcc.bean.Proprietario;
import br.ifpr.edu.adslcc.bean.Veiculo;
import br.ifpr.edu.adslcc.dao.VeiculoDAO;
import br.ifpr.edu.adslcc.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) throws SQLException {
        
        Estado estado = new Estado( "Paraná", "PR");
        Municipio municipio = new Municipio("Umuarama", estado);
        
        Proprietario proprietario = new Proprietario("LucasLCC", "Endereço X", 
                "Bairro X", "231234124", "2938423948", "384753845", new Date() );
        Marca marca = new Marca( "Marca X" );
        Categoria categoria = new Categoria("Categoria X");
        
        Veiculo veiculo = new Veiculo( "Veiculo X", new Date(), proprietario, marca, municipio, categoria);
        
        Connection con = ConnectionFactory.createConnectionToMySQL();
        VeiculoDAO dao = new VeiculoDAO(con);
        //dao.create(veiculo);
        System.out.println( dao.retrieve(1));
        
    }
    
}
