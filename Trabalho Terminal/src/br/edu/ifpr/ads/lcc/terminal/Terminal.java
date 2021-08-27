/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.terminal;

import br.edu.ifpr.ads.lcc.terminal.commands.Cat;
import br.edu.ifpr.ads.lcc.terminal.commands.Cd;
import br.edu.ifpr.ads.lcc.terminal.commands.Cd;
import br.edu.ifpr.ads.lcc.terminal.commands.Touch;
import br.edu.ifpr.ads.lcc.terminal.commands.Echo;
import br.edu.ifpr.ads.lcc.terminal.commands.Exit;
import br.edu.ifpr.ads.lcc.terminal.commands.Help;
import br.edu.ifpr.ads.lcc.terminal.commands.Ls;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 */
public class Terminal{

    private Scanner scan = new Scanner( System.in );
    private String currentPath = File.listRoots()[0].toString();
    private String user = System.getProperty( "user.name" );
    private LinkedList< Command> commands = new LinkedList<Command>();
    private String lastinput = "";
    private boolean exit = false;

    public Terminal(){

        Command[] cmds = {
            new Cd( this ),
            new Ls( this ),
            new Touch( this ),
            new Echo( this ),
            new Cat( this ),
            new Exit( this ),
            new Help( this )
        };

        commands.addAll( Arrays.asList( cmds ) );

        mainLoop();

    }

    private void mainLoop(){

        do{

            System.out.print( user + ": " + currentPath.toString() + "> " );
            lastinput = scan.nextLine();
            queryInput( lastinput );

        }while( !isExit() );

    }

    private void queryInput( String userInput ){

        // !! TODO review possibility of multiple commands
        StringTokenizer args = getArguments( userInput );
        String commandCode = args.hasMoreTokens() ? args.nextToken() : null;

        if( commandCode == null ){

            System.out.println( "Nenhum Commando foi digitado." );
            return;

        }

        Command cmd = checkCommand( commandCode );

        if( cmd != null ){

            String argumento = userInput.replaceFirst( commandCode, "" ).trim();
            cmd.run( argumento );

        }else{

            System.out.println( "Commando não encontrado." );

        }

    }

    // For now, only one Command
    private Command checkCommand( String command ){

        return commands.stream()
                .filter( ( cmd ) -> cmd.toString().equalsIgnoreCase( command ) )
                .findFirst()
                .orElse( null );

    }

    // !! 
    private StringTokenizer getArguments( String args ){

        StringTokenizer token = new StringTokenizer( args, " " );
        return token;

    }

    public String getCurrentPath(){
        return currentPath;
    }

    public String getUser(){
        return user;
    }

    public void setCurrentPath( String currentPath ){
        this.currentPath = currentPath;
    }

    public boolean isExit(){
        return exit;
    }

    public void setExit( boolean exit ){
        this.exit = exit;
    }

    public String getCommandNames(){

        return commands.stream()
                .map( (cmd) -> { return cmd.getCommand() + "\t" + cmd.getCommandName(); } )
                .collect( Collectors.joining("\n") );
        
    }

}
