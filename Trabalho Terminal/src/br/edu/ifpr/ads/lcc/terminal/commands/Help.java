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
 * @author aluno
 */
public class Help extends Command{

    public Help( Terminal terminal ){
        super( terminal );
        this.commandName = "List avalible commands";
        this.command = "help";
    }

    @Override
    public String run( String args ){

        System.out.println( getTerminal().getCommandNames() );
        
        return "";

    }
    
}
