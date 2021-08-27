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
public class Exercicio4 {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Digite a expressão matematica: ");
        Pilha pilha = new PilhaEstatica(input.length());
        boolean valido = false;

        for (int i = 0; i < input.length(); i++) {

            String tmpChar = input.charAt(i) + "";

            if (tmpChar.equalsIgnoreCase("(")) {

                pilha.empilhar(tmpChar);
                System.out.println("( empilhado");

            } else if (tmpChar.equalsIgnoreCase(")")) {

                try {

                    String top = (String) pilha.getTop();
                    
                    if (top.equalsIgnoreCase("(")) {

                        System.out.println("( desempilhado");
                        pilha.desempilhar();

                    }

                } catch (Exception e) {

                    pilha.empilhar("!");
                    break;// invalido

                }

            }

        }

        valido = pilha.isEmpty();
        System.out.println(valido);

    }

}
