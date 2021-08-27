/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.pkg3.bim;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class LerArquivo {
    
    private static Scanner entrada;
    
    public static void main(String[] args) {
        
        abrirArquivo();
        lerArquivo();
        fecharArquivo();
        
    }

    private static void abrirArquivo() {

        Path caminhoArquivo = Paths.get( "F:\\arquivo.txt" );
        
        try {
            
            entrada = new Scanner( caminhoArquivo );
            
        } catch (IOException ex) {
            
            System.err.println("Erro ao abrir o arquivo");
            System.exit( 1 );
            
        }
        
    }

    private static void lerArquivo() {
        
        System.out.printf( "%-6s %-15s %-15s %.2s\n", "Conta", "Nome", "Sobrenome", "Saldo" );

        
        while ( entrada.hasNext() ) {            
            
            try {

                System.out.printf( "%-6d %-15s %-15s %.2f\n", 
                        entrada.nextInt(), entrada.next(), entrada.next(), entrada.nextDouble() );
            
                
            } catch (InputMismatchException e) {
                
                System.out.println("Arquivo indevidamente formatado. Terminando.");
                System.exit(1);
                
            }catch (IllegalStateException e) {
                
                System.out.println("Erro de leitura do arquivo. Terminando.");
                System.exit(1);
                
            }
            
        }
        
    }

    private static void fecharArquivo() {

        if ( entrada != null ) {
            
            entrada.close();
            
        }
        
    }
    
}
