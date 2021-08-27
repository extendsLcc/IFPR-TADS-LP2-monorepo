/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex1;

/**
 *
 * @author aluno
 */
public class Desenhador {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[10];

        for (int i = 0; i < figuras.length; i++) {


            switch (random(4)) {

                case 0:

                    figuras[i] = new Circulo(random(10));
                    break;
                    
                case 1:
                    
                    figuras[i] = new Triangulo(random(10), random(10));
                    break;
                    
                case 2:
                    
                    figuras[i] = new Retangulo(random(10), random(10));
                    break;
                    
                case 3:
                    
                    figuras[i] = new Quadrado(random(10));
                    break;
                    
            }

        }
        
        for (int i = 0; i < figuras.length; i++) {
            
            System.out.println(figuras[i]);
            System.out.println("Area: " + figuras[i].calculaArea() + " Perimetro"
                    + ": " + figuras[i].calculaPerimetro());
            
        }

    }

    public static int random(int max) {

        return (int) (Math.random() * max);

    }

}
