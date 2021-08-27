/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios;

import exrcicios.exercicio6.Fila;
import exrcicios.exercicio6.FilaDinamica;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import fila.FilaCircularEstatica;

/**
 *
 * @author aluno
 */
public class Exercicio5 {

        static Fila fila = new FilaDinamica();
        
    public static void main(String[] args) {

        Paciente[] pacientes = {
            new Paciente("156", "Paciente X", 1),
            new Paciente("856", "Paciente Y", 2),
            new Paciente("489", "Paciente Z", 3)
        };

        for (Paciente paciente : pacientes) {

            fila.add(paciente);

        }

        System.out.println(fila);

        JComboBox mainMenu = new JComboBox(new Object[]{
            "Adicionar Paciente a Fila",
            "Chamar Paciente",
            "Sair"
        });

        do {

            int selectedItem = mainMenu.getSelectedIndex();

            switch (selectedItem) {

                case 0:

                    cadastrarPaciente();

                    break;
                case 1:
                    atenderPaciente();

                    break;
                default:
                    mainMenu.setSelectedIndex(2);

            }

        } while (mainMenu.getSelectedIndex() != 2);

    }

    static String character = "XYZ";

    private static void cadastrarPaciente() {

        String nome = JOptionPane.showInputDialog("Digite o nome do Paciente");
        String senha = Integer.parseInt(Math.random() * 100 + "")
                + (character.charAt( Integer.parseInt(Math.random() * 3 + "") ) + "") 
                + (character.charAt( Integer.parseInt(Math.random() * 3 + "") ) + "");
        int numeroSequencial = ( (Paciente) fila.get( fila.size() - 1 )).numeroSequencial;
        Paciente paciente = new Paciente(senha, nome, numeroSequencial);
        
        System.out.println(paciente + " Adicionado a fila");

    }

    private static void atenderPaciente() {
        
        String nome = JOptionPane.showInputDialog("Digite o nome do paciente a ser atendido: ");
        
        for (int i = 0; i < fila.size(); i++) {

            Paciente paciente = (Paciente) fila.get( i );
            
            if ( paciente.nome.equalsIgnoreCase(nome) ) {
                
            }
        
        }
        
    }

    static class Paciente {

        String senha;
        String nome;
        int numeroSequencial;

        public Paciente(String senha, String nome, int numeroSequencial) {
            this.senha = senha;
            this.nome = nome;
            this.numeroSequencial = numeroSequencial;
        }

        @Override
        public String toString() {
            return "Paciente{" + "senha=" + senha + ", nome=" + nome + ", numeroSequencial=" + numeroSequencial + '}';
        }

    }

}
