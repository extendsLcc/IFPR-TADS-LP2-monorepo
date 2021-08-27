/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.terminal.commands;

import br.edu.ifpr.ads.lcc.terminal.Command;
import br.edu.ifpr.ads.lcc.terminal.Terminal;

/**
 *
 * @author LCC
 */
public class Exit extends Command{

    public Exit( Terminal terminal ){
        
        super( terminal );
        this.commandName = "Close Terminal";
        this.command = "exit";
        
    }

    @Override
    public String run( String args ){
        
        terminal.setExit( true );
        System.out.println( "Bye" );
        return "0";
        
    }
    
}
