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

/**
 *
 * @author LCC
 */
public class Touch extends Command{

    public Touch( Terminal terminal ){
        
        super( terminal );
        this.commandName = "Create File";
        this.command = "touch";
        
    }

    @Override
    public String run( String args ){

        
        if( args.matches( "[\\/:*?<>\"|]")){
            
            System.out.println( "Nome do arquivo inválido! O nome não pode possuir os seguintes caracteres: \\ / : * ? < > \" |" );
            return "failed";
            
        }
        
        File file = new File( terminal.getCurrentPath() + args + ".txt" );
        
        try{
            
            if( file.createNewFile() ){
                
                System.out.println( "Arquivo criado com sucesso." );
                return "success";
            
            }else{
            
                System.out.println( "O arquivo já existe." );
                
            }
            
        }catch( IOException ex ){

            System.out.println( "Problema ao criar o arquivo." );
            
        }
        
        return "failed";

    }
    
}
