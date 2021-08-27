/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.terminal;

import java.util.StringTokenizer;

/**
 *
 * @author aluno
 */
public abstract class Command {
    
    protected String commandName;
    protected String command;
    protected Terminal terminal;

    public Command(Terminal terminal) {
        this.terminal = terminal;
    }

    abstract public String run( String args );

    public String getCommandName() {
        return commandName;
    }

    public String getCommand() {
        return command;
    }

    @Override
    public String toString() {
        return command;
    }

    public Terminal getTerminal() {
        return terminal;
    }

}
