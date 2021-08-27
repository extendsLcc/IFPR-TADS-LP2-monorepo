/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.interna;

/**
 *
 * @author aluno
 */
public class FabricaLampada {
    
    public static Lampada construir( Class lampada ) throws InstantiationException, IllegalAccessException{
    
        return (Lampada) lampada.newInstance();
    
    }
    
    static class Incandescente implements Lampada{

        @Override
        public void ligar() {
            System.out.println("Lampada Incandescente ligada");
        }

        @Override
        public void desligar() {
            System.out.println("Lampada Incandescente desligada");
        }
   
    }
    
    static class Fluorescente implements Lampada{

        @Override
        public void ligar() {
            System.out.println("Lampada Fluorescente ligada");
        }

        @Override
        public void desligar() {
            System.out.println("Lampada Fluorescente desligada");

        }
    
    }
    
}
