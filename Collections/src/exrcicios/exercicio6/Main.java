/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios.exercicio6;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {

        JComboBox mainMenu = new JComboBox(new Object[]{
            "Listar o número de aviões aguardando na fila de decolagem",
            "Autorizar a decolagem do primeiro avião da fila",
            "Adicionar um avião à fila de espera",
            "Listar todos os aviões na fila de espera",
            "Listar as características do primeiro avião da fila",
            "Sair"
        });

        PistaDecolagem pista = new PistaDecolagem();
        
        Aviao[] avioes = {
            new Aviao("Aviao X", 50, "773"),
            new Aviao("Aviao Y", 150, "192"),
            new Aviao("Aviao Z", 350, "456"),
        };

        for (Aviao avioe : avioes) {

            pista.adicionarAviao(avioe);

        }

        do {

            JOptionPane.showMessageDialog(null, mainMenu, "Selecione a opção ser executado: ", JOptionPane.QUESTION_MESSAGE);
            int selectedOption = mainMenu.getSelectedIndex();

            switch (selectedOption) {
                
                case 0:
                    pista.listarAvioesEmEspera();
                    System.out.println("------------------------------------");
                    break;
                case 1:
                    pista.autorizarVoo();
                    System.out.println("------------------------------------");
                    break;
                case 2:
                    String nome = JOptionPane.showInputDialog("Digite o nome do avião:");
                    int identificador;

                    do {
                        
                        try {
                            
                            identificador = Integer.parseInt(JOptionPane.showInputDialog("Digite o identificador do Avião:"));
                            break;
                            
                        } catch (Exception e) {
                            
                            JOptionPane.showMessageDialog(null, "O identificador deve ser um número! por favor digite um número inteiro valido!");
                        
                        }
                            
                    } while (true);

                    String modelo = JOptionPane.showInputDialog("Digite o modelo do avião:");
                    pista.adicionarAviao(new Aviao(nome, identificador, modelo));
                    System.out.println("------------------------------------");
                    break;
                case 3:
                    pista.listarFilaDecolagem();
                    System.out.println("------------------------------------");
                    break;
                case 4:
                    pista.listarPrimeiroFila();
                    System.out.println("------------------------------------");
                    break;
                default:
                    mainMenu.setSelectedIndex(5);
                    
            }

        } while (mainMenu.getSelectedIndex() != 5);

    }

}
