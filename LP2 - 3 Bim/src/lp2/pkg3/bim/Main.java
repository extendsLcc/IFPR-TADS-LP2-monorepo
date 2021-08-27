/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.pkg3.bim;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static Formatter saida;
    
    public static void main(String[] args) {

        abrirArquivo();
        adicionarRegistros();
        fecharArquivo();

    }

    private static void abrirArquivo() {

        try {

            saida = new Formatter("F:\\arquivo.txt");

        } catch (FileNotFoundException ex) {

            System.err.println("Erro ao abrir o arquivo. Fechando o sistema. \n" + ex.getMessage());
            System.exit(1);

        }

    }

    private static void adicionarRegistros() {

        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Número da conta: ");
            int conta = scan.nextInt();
            System.out.println("Primeiro nome: ");
            String nome = scan.next();
            System.out.println("Segundo nome: ");
            String segundoNome = scan.next();
            System.out.println("Saldo da conta: ");
            double saldo = scan.nextDouble();
            
            saida.format( "%-6d %-15s %-15s %.2f\n" , conta, nome, segundoNome, saldo);
            
            if ( scan.next().equalsIgnoreCase("0") ) {
                
                System.out.println("Até mais!");
                break;
                
            }
            
        }
        
    }

    private static void fecharArquivo() {

        if ( saida != null ) {
            
            saida.close();
            
        }
        
    }

}
