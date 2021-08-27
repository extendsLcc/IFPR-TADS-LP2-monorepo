/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import listaligada.ListaDuplamenteEncadeada;
import listaligada.Lista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class main {
    
    public static void main(String[] args) {
        /*
        Lista list = new ListaEncadeada();
        
        System.out.println(list);
        
        list.adicionaInicio("A");
        list.adicionaInicio("B");
        list.adicionaInicio("C");
        list.adicionaInicio("D");
        list.adicionaFim("Z");
        list.adicionaIndice("H", 2);
        
        System.out.println(list);
        System.out.println( list.encontrar(5) );*/
        
        Lista list = new ListaDuplamenteEncadeada();
        
        
        list.adicionaInicio( "D" );
        list.adicionaInicio( "C" );
        list.adicionaInicio( "B" );
        list.adicionaInicio( "A" );
        
        System.out.println(list);
        
        list.adicionaFim( "Z" );
        
        System.out.println(list);
        
        list.adicionaIndice("H", 1);
        
        System.out.println(list);
        list.adicionaIndice("K", 1);
        
        String s = "XYZ";
        
        list.adicionaIndice(s, 7);
        
        System.out.println(list);
        
        list.remover(s);
        
        System.out.println(list);
        
        list.adicionaIndice(s, 7);
        list.adicionaFim( "O" );
        
        System.out.println(list);
        
        System.out.println("posição 7 --" + list.encontrar( 7 ));
        System.out.println("possui elemento XYZ? " + list.possuiElemento( s ));
        
    }
    
}
