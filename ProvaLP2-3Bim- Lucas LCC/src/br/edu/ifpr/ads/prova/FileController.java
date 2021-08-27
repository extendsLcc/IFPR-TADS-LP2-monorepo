/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.prova;

import java.io.FileNotFoundException;
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
public class FileController {
    
    private String filePath = "C:\\biblioteca.txt";

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    public void updateFile( List<Livro> livros ){
    
        try {
            
            Formatter format = new Formatter( filePath );
            
            livros.forEach((liv) -> format.format( "%s", livros.toString() ) );
            
            format.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    public List<Livro> readBooks(){
    
        List<Livro> livros = new ArrayList<>();
        
        try {
            
            Scanner file = new Scanner( Paths.get(filePath) );
            
            while (file.hasNext() ) {
                
                String[] elements = file.nextLine().split( ", " );
                
                Livro livro = new Livro( elements[0] , elements[1], elements[2], 
                        elements[3], elements[4], Integer.parseInt( elements[5] ),
                        Integer.parseInt(elements[6]), new Editora(elements[7] ) );
                
                livros.add(livro);
                
            }
            
        } catch (Exception e) {
            
            System.out.println("Erro ao abrir o arquivo");
            
        }
        
        return livros;
        
    }
    
}
