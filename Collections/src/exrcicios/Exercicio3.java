/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios;

import java.util.Arrays;
import java.util.stream.Collectors;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import pilha.Pilha;
import pilha.PilhaEstatica;

/**
 *
 * @author aluno
 */
public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Pilha pilha = new PilhaEstatica( 5 );
        
        Object[] items = {
            "01",
            "02",
            "03",
            "04",
            "05"
        };
        
        for (int i = 0; i < items.length; i++) {
            
            pilha.empilhar(items[i]);
            
        }
        
        /*String txtItems = Arrays.asList(items).stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));*/
        
        JComboBox combo = new JComboBox(items);
        JOptionPane.showMessageDialog(null, combo, "Selecione o item a ser removido da pilha: ", JOptionPane.QUESTION_MESSAGE );
        Object item = combo.getSelectedItem();
        
        Pilha tmpPilha = new PilhaEstatica(pilha.size());
        System.out.println(pilha);
        
        while (true) {            
            
            Object element = pilha.desempilhar();
            
            if ( element.equals(item) ) {
                break;
            }
            
            tmpPilha.empilhar(element);
            
        }
        
        System.out.println(pilha);
        System.out.println("Pilha TEMP: " + tmpPilha);
        
        while (!tmpPilha.isEmpty()) {            
            
            pilha.empilhar( tmpPilha.desempilhar() );
            
        }
        
        System.out.println(pilha);
        
    }
    
}
