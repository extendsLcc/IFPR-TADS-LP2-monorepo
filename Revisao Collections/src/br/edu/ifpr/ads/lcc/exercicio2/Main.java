/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.exercicio2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {

        Integer[] numbers = {
            1,
            2,
            3,
            4
        };
        
        Deque fila = new ArrayDeque(Arrays.asList(numbers));
        
        System.out.println("Fila:" +  fila );
        
        reverseQueue(fila);
        
        System.out.println("Fila:" +  fila );
        
    }
    
    static void reverseQueue( Deque fila ){
    
        Stack pilha = new Stack();
        
        while ( !fila.isEmpty() ) {            
            
            pilha.push( fila.pollFirst() );            
        
        }
        
        System.out.println("Pilha:" + pilha);
        
        while ( !pilha.isEmpty() ) {            
            
            fila.addLast( pilha.pop() );
            
        }
    
    }
    
}
