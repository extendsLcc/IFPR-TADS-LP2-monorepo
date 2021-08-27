/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.terminal.commands;

import br.edu.ifpr.ads.lcc.terminal.Command;
import br.edu.ifpr.ads.lcc.terminal.Terminal;
import br.edu.ifpr.ads.lcc.terminal.Util;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 *
 * @author LCC
 */
public class Echo extends Command{

    public Echo( Terminal terminal ){

        super( terminal );
        this.commandName = "Echo Menssage";
        this.command = "echo";

    }

    @Override
    public String run( String args ){

        System.out.println( args.length() + "%"  + (args.length() <= 0));
        if( args.length() <= 0 ){
        
            System.out.println("Nenhum argumento encontrado.");
            System.out.println("Formato do comando: ");
            System.out.println("echo \"<Texto a ser imprimido>\" ");
            System.out.println("echo \"<Texto a ser imprimido>\" > <Nome do arquivo a ser editado.txt>");
            return "failed";
        
        }
         
        String text = args.substring( args.indexOf( "\"" ) + 1, args.lastIndexOf( "\"" ) );
        String fileName = args.indexOf( ">" ) > 0 ? args.substring( args.indexOf( ">" ) + 1 ) : "";
        Util.debug("text: " + text + " file: " + fileName );

        if( fileName.length() > 0 ){

            handleFile( text, fileName );

        }else{

            System.out.println( text );

        }

        return "";

    }

    private void handleFile( String text, String fileName ){

        fileName = fileName.trim();
        
        if ( !fileName.contains( ".txt" ) ) {
            
            System.out.println("Formato do arquivo não especificado!");
            return;
            
        }
        
        Path path = Paths.get( terminal.getCurrentPath() + "\\" + fileName );
        File file = new File( path.toString() );
        
        if ( !Files.exists( path ) ) {
            
            try {
                
                file.createNewFile();
                System.out.println("Arquivo " + fileName + " não existe, foi criado um novo arquivo.");
                
            } catch (IOException ex) {
                
                System.out.println("Ocorreu um problema ao tentar criar o arquivo. Verifique a permisão de acesso ao diretório atual");
                
            }
            
        }else{
            
            System.out.println("Arquivo " + fileName + " já existe, conteudo do mesmo será editado");
        
        }
        
        try{
            
            Charset utf8 = StandardCharsets.UTF_8;
            Files.write( path, Arrays.asList( text ), utf8 );
            
        }catch( IOException e ){

            System.out.println( "Erro de leitura do arquivo " + fileName + " !" );

        }

    }

}
