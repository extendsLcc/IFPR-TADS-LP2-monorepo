/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2.atividade2;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Televisao tv = new Televisao( 10, 5 );
        ControleRemoto ctrl = new ControleRemoto(tv);
        
        ctrl.aumentarCanal();
        System.out.println(tv);
        
        for (int i = 0; i < 3; i++) {
            
            ctrl.aumentarVolume();        
            ctrl.aumentarCanal();
            
        }
        
        System.out.println(tv);
        
        for (int i = 0; i < 5; i++) {
            
            ctrl.diminuirCanal();
            ctrl.diminuirVolume();
            
        }
        
        System.out.println(tv);
        
    }
    
}
