/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.exercicio1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author aluno
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str = "ZABCDDCBAZ";
        
        Stack pilhaX = new Stack(),
                pilhaY = new Stack();
        
        
        for (int i = 0; i < str.length(); i++) {

            pilhaX.push( str.charAt(i) );
            
        }
        
        if ( pilhaX.size() % 2 == 0 ) {
            
            for (int i = 0; i < str.length() / 2; i++) {

                pilhaY.push( pilhaX.pop() );
                
            }
            
            while ( ! pilhaX.empty() ) {                
                
                String caracterX = pilhaX.pop() + "",
                        caracterY = pilhaY.pop() + "";
                
                if( !caracterX.equalsIgnoreCase( caracterY ) ){
                
                    System.out.println("Não é inverso!");
                    return;
                }
                
            }
            
            System.out.println("É inverso");
            
        }else{
        
            System.out.println("Não é inverso! Quantidade impar de caracteres");
            
        }
        
    }
    
}
