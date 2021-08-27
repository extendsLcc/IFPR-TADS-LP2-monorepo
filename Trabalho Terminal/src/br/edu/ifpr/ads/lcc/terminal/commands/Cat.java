/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.terminal.commands;

import br.edu.ifpr.ads.lcc.terminal.Command;
import br.edu.ifpr.ads.lcc.terminal.Terminal;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author LCC
 */
public class Cat extends Command{

    public Cat( Terminal terminal ){
        super( terminal );
        this.commandName = "Read File";
        this.command = "cat";
    }

    @Override
    public String run( String args ){

        String filePath = terminal.getCurrentPath() + "\\" + args;

        if( isFileExist( filePath ) ){

            readFile( filePath );
            
        }

        return "";

    }
    
    private void readFile( String filePath ){
    
        try{
            
            Scanner file = new Scanner( Paths.get( filePath ) );
            
            while( file.hasNextLine()){
                
                System.out.printf( file.nextLine());
                System.out.println( "" );
                
            }
            
        }catch( IOException ex ){
            
            System.out.println( "Ocorrou um problema na leitura do arquivo, verifique se possui permissão para fazer a leitura do arquivo." );
            
        }
    
    }

    private boolean isFileExist( String filePath ){

        File file = new File( filePath );

        if( file.isFile() ){

            if( !file.canRead() ){

                System.out.println( "Você não possui permissão para efetuar a leitura do arquivo especificado" );
                return false;
                
            }

            return true;

        }else{

            System.out.println( "O arquivo informado não existe." );

        }

        return false;

    }

}
