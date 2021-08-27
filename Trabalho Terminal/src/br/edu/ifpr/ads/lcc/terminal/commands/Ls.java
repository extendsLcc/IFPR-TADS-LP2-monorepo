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
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LCC
 */
public class Ls extends Command{

    public Ls( Terminal terminal ){
        
        super( terminal );
        this.commandName = "List subfiles";
        this.command = "ls";
        
    }

    
    //private static Formater = new ;
    
    @Override
    public String run( String args ){

        File[] subfold = new File( terminal.getCurrentPath() ).listFiles( File::exists );
        
        for( File file : subfold ){
            
            try {
                
                BasicFileAttributes attr = Files.readAttributes( file.toPath() , BasicFileAttributes.class );
                
                Date creationDate = new Date( attr.creationTime().toMillis() );
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd/MM/yyyy");
                
                System.out.printf( "%-15s %-8s %-22s %-5s" , attr.size(), "bytes", 
                        formatter.format( creationDate ), file.getName() );
                System.out.println("");
                
            } catch (IOException ex) {
                
                Logger.getLogger(Ls.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        return "";

    }
    
}
