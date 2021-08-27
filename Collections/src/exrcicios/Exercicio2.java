/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios;

import javax.swing.JOptionPane;
import pilha.Pilha;
import pilha.PilhaEstatica;

/**
 *
 * @author aluno
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Digite a sequencia de caracterer para ser impresso invertido");
        
        Pilha pilha = new PilhaEstatica( input.length() );
        
        for (int i = 0; i < input.length(); i++) {

            pilha.empilhar( input.charAt(i) );
            
        }
        
        String output = "";
        
        for (int i = 0; i < pilha.size(); i++) {

            output += pilha.desempilhar();
            
        }
        
        JOptionPane.showMessageDialog(null, "Texto digitado: " + input + "\nTexto invertido: " + output +"\n"
                + "É um palíndromo: " + ( output.equalsIgnoreCase(input) ));
        
    }
    
}
