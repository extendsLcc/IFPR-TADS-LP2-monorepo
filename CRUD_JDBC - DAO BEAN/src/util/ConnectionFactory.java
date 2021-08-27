/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class ConnectionFactory {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda?zeroDateTimeBehavior=convertToNull";
    
    public  static Connection createConnectionMariaDB() throws Exception{

        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        
        return connection;
        
    }
    
    public static void main(String[] args) {
        
        try {
            
            Connection con = createConnectionMariaDB();
            
            if ( con != null ) {
                
                System.out.println("Conexão obtida com sucesso: " + con);
                con.close();
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
