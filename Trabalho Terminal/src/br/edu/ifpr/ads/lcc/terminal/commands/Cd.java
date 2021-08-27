/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.terminal.commands;

import br.edu.ifpr.ads.lcc.terminal.Command;
import br.edu.ifpr.ads.lcc.terminal.Terminal;
import br.edu.ifpr.ads.lcc.terminal.Util;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 */
public class Cd extends Command{

    public Cd( Terminal terminal ){

        super( terminal );
        this.commandName = "Change Directory";
        this.command = "cd";

    }

    @Override
    public String run( String args ){

        Util.debug( "Captured agument: {" + args + "}" );

        if( args.length() > 0 ){

            if( validateDirectory( getNewPath( args ) ) ){
                
                return "success";
                
            }
            
            System.out.println( "Diretório não econtrado" );


        }else{

            System.out.println( "Nenhum Argumento foi informado. Informe o caminho do diretório que deseja entrar." );
            System.out.println( "exemplos:\n \t cd D:\\users\\lcc\\documents" );
            System.out.println( "\t cd users\\lcc" );
            System.out.println( "\t cd ..\\.." );
            System.out.println( "\t cd \\users" );

        }

        return "failed";

    }
    
    private boolean validateDirectory( String path ){
    
        Util.debug( "Processed directory: " + path );

        try{

            if( Files.isDirectory( Paths.get( path ) ) ){

                Util.debug( "Valid Directory" );
                Util.debug( Paths.get( path ).toString() );
                terminal.setCurrentPath( path );
                return true;

            }
            
        }catch( Exception e ){

            System.out.println( "Erro ao tentar acessar diretório. Verifique se possui permição de acesso ao diretório." );
            
        }
        
        return false;
        
    }

    private String getNewPath( String args ){

        String rootPath = terminal.getCurrentPath();
        String newPath = args.trim();
        newPath = newPath.replaceAll( "/", "\\\\" );
        
        // Se o diretório atual for um diretório raiz, remove a '\'
        if( rootPath.indexOf( ":\\" ) == rootPath.length() - 2 ){
            
            rootPath = rootPath.replaceFirst( ":\\\\", ":");
        
        }

        //  Separa todos os elementos no formato "\nome"
        List<String> folders = new ArrayList<>( Arrays.asList( newPath.split( "(?=\\\\)" ) ) );

        String item = folders.get( 0 );
        String firstChar = folders.get( 0 ).charAt( 0 ) + "";

        // Voltar a Raiz principal atual
        if( firstChar.equalsIgnoreCase( "\\" ) ){

            Util.debug( "Return to root folder" );
            rootPath = rootPath.substring( 0, rootPath.indexOf( ":" ) + 1 );
            folders.remove( 0 );
            folders.add( 0, item.substring( 1, item.length() ) );

        }

        Stack<String> rootFolders = new Stack<>();
        rootFolders.addAll( Arrays.asList( rootPath.split( "(?=\\\\)" ) ) );

        // Mudança total de diretório, descartando diretório atual
        if( item.contains( ":" ) ){

            Util.debug( "Ignore current rootFolder" );
            rootFolders.clear();

        }

        Util.debug( "root folders: " + rootFolders + " size: " + rootFolders.size() );
        Util.debug( "arg folders: " + folders );

        folders.forEach( ( folder ) -> {

            if( folder.equalsIgnoreCase( "\\.." ) || folder.equalsIgnoreCase( ".." ) ){

                if( rootFolders.size() > 1 ){

                    rootFolders.pop();

                }

            }else if( !folder.equalsIgnoreCase( "\\" ) ){

                if( !folder.contains( ":" ) && !folder.contains( "\\") ){
                    
                    folder = "\\" + folder;
                    
                }
                
                rootFolders.push( folder );

            }

        } );

        // Para cada ITEM '..' ou '\..' remover o diretório anterior
        Util.debug( "processed root folders: " + rootFolders + " size " + rootFolders.size() );
        Util.debug( "processed arg folders: " + folders );
        
        
        rootPath = rootFolders.stream()
                .collect( Collectors.joining() );
        
        // Caso exista apenas o diretório raiz, adiciona uma "\" a frente do mesmo.
        if( rootFolders.size() == 1 ){
            
            rootPath = rootPath.replaceFirst( ":", ":\\\\");
        
        }

        return rootPath;

    }

}
