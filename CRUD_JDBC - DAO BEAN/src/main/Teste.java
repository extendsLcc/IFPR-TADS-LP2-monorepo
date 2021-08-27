/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bean.Contato;
import dao.ContatoDAO;
import java.sql.Connection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectionFactory;

/**
 *
 * @author aluno
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Contato contato;
        
        try {
            
            Connection con = ConnectionFactory.createConnectionMariaDB();
            ContatoDAO dao = new ContatoDAO( con );
            //dao.create(contato);
            
            contato = new Contato( 3, "Yeo Albert", 90, new Date() );
            dao.update(contato);
            
            contato = dao.retrive( 3 );
            System.out.println( contato );
            
            contato.setNome("Capiroto Jr");
            contato.setDataCadastro( new Date() );
            dao.update(contato);
            contato = dao.retrive( 3 );
            System.out.println( contato );
            
            System.out.println("===");
            
            dao.retriveAll().forEach( (e) -> System.out.println( e ));
            
            con.close();
            
        } catch (Exception ex) {
            
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
}
