/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.file;

import br.edu.ifpr.Cliente;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class FileControl {
    
    private String filePath = "F:\\Cliente.txt";

    public FileControl() {

        createFile();
        
    }

    public String getFilePath(){
        return filePath;
    }

    public void setFilePath( String filePath ){
        this.filePath = filePath;
    }

    public void createFile(){
    
        if ( !Files.exists( Paths.get( filePath ) )) {
            
            try {
                
                File file = new File(filePath);
                file.createNewFile();
                
            } catch ( IOException e) {
                
                System.out.println("Ocorreu um problema ao tentar criar o arquivo. Verifique a permisão de acesso ao diretório atual");
                
            }
            
        }
    
    }
    
    public void updateFile( List <Cliente> clientes  ){
    
        Formatter file;
        
        try {
            
            file = new Formatter( filePath );
            
            clientes.forEach( 
                    ( cli ) -> file.format("%-10s %-10d %-10s %n", cli.getNome(), cli.getIdade(), cli.getCpf())
            );
            
            
            file.close();
            
        } catch (FileNotFoundException ex) {
            
            System.out.println( "Erro de leitura do arquivo! Verifique a permisão de acesso ao diretório atual" );
            
        }
        
        
    }
    
    public List<Cliente> readClientes(){
    
        List<Cliente> clientes = new ArrayList<>();
        
        try {
            
            Scanner file = new Scanner( Paths.get( filePath ) );
            
            System.out.println( filePath );
            
            while (file.hasNext()) {
                
                String nome = file.next();
                int idade = Integer.parseInt( file.next() );
                String cpf = file.next();
                
                Cliente cliente = new Cliente(nome, idade, cpf);
                clientes.add( cliente );
                
            }
            
        } catch (IOException ex) {
            
            System.out.println( "Erro de leitura do arquivo! Verifique a permisão de acesso ao diretório atual" );
            
        }
        
        return clientes;
        
    }
    
}
