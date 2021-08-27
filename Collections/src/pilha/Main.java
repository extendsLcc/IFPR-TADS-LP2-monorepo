/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pilha pilha = new PilhaEstatica( 10 );
        
        Object[] items = {
        
            "01",
            "02",
            "03",
            "04"
        
        };
        
        System.out.println("Pilha Vazia: " + pilha.isEmpty());
        pilha.empilhar(items[0]);
        System.out.println("Pilha Vazia: " + pilha.isEmpty());
        pilha.desempilhar();
        System.out.println("Pilha Vazia: " + pilha.isEmpty());
        System.out.println(pilha);
        pilha.empilhar(items[0]);
        pilha.empilhar(items[1]);
        pilha.empilhar(items[2]);
        System.out.println(pilha);
        System.out.println("Pilha Vazia: " + pilha.isEmpty());
        
        while ( !pilha.isEmpty() ) {            
            
            pilha.desempilhar();
            
        }
        
        pilha.desempilhar();
        System.out.println(pilha);
        
        System.out.println("------------------------------------");
        
        pilha = new PilhaDinamica();
        
        for (int i = 0; i < items.length; i++) {
            
            pilha.empilhar(items[i]);
            
        }
        
        System.out.println(pilha);
        
        
        
    }
    
}
