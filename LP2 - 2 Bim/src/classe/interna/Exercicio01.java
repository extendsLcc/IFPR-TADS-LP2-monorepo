/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.interna;

import classe.interna.FabricaLampada.Fluorescente;
import classe.interna.FabricaLampada.Incandescente;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exercicio01 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Object opcoes[] = {
            "Fluorescente",
            "Incandescente"
        };

        JComboBox box = new JComboBox(opcoes);
        JOptionPane.showMessageDialog(null, box, "Selecione o tipo de lampada que deseja testar", JOptionPane.QUESTION_MESSAGE);

        Class tipoLampada = box.getSelectedIndex() == 0 ? Fluorescente.class : Incandescente.class;

        Lampada lamp = FabricaLampada.construir(tipoLampada);
        lamp.ligar();
        lamp.desligar();

        // Como Classe interna Local
        if (false) {
            return;
        }

        lampadaLocal(box.getSelectedIndex());

        // Como Classe anonima
        if (false) {
            return;
        }

        Lampada lampAnonima;

        if (box.getSelectedIndex() == 1) {

            lampAnonima = new Lampada() {

                @Override
                public void ligar() {
                    System.out.println("Lampada Incandescente ligada");
                }

                @Override
                public void desligar() {
                    System.out.println("Lampada Incandescente desligada");
                }

            };

        } else {

            lampAnonima = new Lampada() {

                @Override
                public void ligar() {
                    System.out.println("Lampada Fluorescente ligada");
                }

                @Override
                public void desligar() {
                    System.out.println("Lampada Fluorescente desligada");

                }

            };

        }

        lampAnonima.ligar();
        lampAnonima.desligar();

    }

    private static void lampadaLocal(int selected) {

        class Incandescente implements Lampada {

            @Override
            public void ligar() {
                System.out.println("Lampada Incandescente ligada");
            }

            @Override
            public void desligar() {
                System.out.println("Lampada Incandescente desligada");
            }

        }

        class Fluorescente implements Lampada {

            @Override
            public void ligar() {
                System.out.println("Lampada Fluorescente ligada");
            }

            @Override
            public void desligar() {
                System.out.println("Lampada Fluorescente desligada");

            }

        }

        Lampada lampadaLocal;
        
        if (selected == 0) {
            
            lampadaLocal = new Fluorescente();
            
        } else {
            
            lampadaLocal = new Incandescente();
            
        }

        lampadaLocal.ligar();
        lampadaLocal.desligar();
    }

}
