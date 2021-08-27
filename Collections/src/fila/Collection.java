/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Fila fila = new FilaCircularEstatica(5);
            System.out.println(fila);
            fila.add("01");
            System.out.println(fila);
            fila.add("02");
            fila.add("03");
            System.out.println(fila);
            fila.remove();
            System.out.println(fila);
            fila.add("04");
            fila.add("05");
            fila.add("06");
            System.out.println(fila);
            fila.remove();
            fila.add("07");
            System.out.println(fila);

            while (!fila.isEmpty()) {

                fila.remove();

            }
            System.out.println(fila);

            System.out.println("=====================================");

            fila = new FilaDinamica();
            System.out.println(fila);
            fila.add("01");
            System.out.println(fila);
            fila.add("02");
            fila.add("03");
            System.out.println(fila);
            fila.remove();
            System.out.println(fila);
            fila.add("04");
            fila.add("05");
            fila.add("06");
            System.out.println(fila);
            fila.add("07");
            System.out.println(fila);

            while (!fila.isEmpty()) {

                fila.remove();

            }

            System.out.println(fila);

            for (int i = 0; i < (new Random().nextInt(20) + 10); i++) {

                fila.add("0" + i);

            }

            System.out.println(fila);

            while (!fila.isEmpty()) {

                fila.remove();

            }

            System.out.println(fila);
            fila.remove();

        } catch (FilaVaziaException e) {
            
            System.out.println(e.getMessage());
            
        } catch ( FilaCheiaException e ){
            System.out.println(e.getMessage());
        }

    }

}
