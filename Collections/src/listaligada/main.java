/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class main {
    
    public static void main(String[] args) {
        
        ListaLigada listaLigada = new ListaLigada();
        
        listaLigada.adicionaFim( 1 );
        listaLigada.adicionaFim( 2 );
        listaLigada.adicionaFim( 3 );
        listaLigada.adicionaFim( 4 );
        listaLigada.adicionaFim( 5 );
        listaLigada.adicionaInicio( 10 );
        listaLigada.adicionaIndice( 20, 6 );
        listaLigada.adicionaIndice( 25, 2 );
        listaLigada.adicionaIndice( 26, 0 );
        listaLigada.adicionaIndice( 27, listaLigada.tamanho() );
        listaLigada.adicionaInicio( 15 );
        listaLigada.limparLista();
        //listaLigada.mergeSort( listaLigada );
        
        System.out.println( listaLigada );
        
    }
    
}
