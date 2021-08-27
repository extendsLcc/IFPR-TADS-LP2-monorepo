/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2.atividade1;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Automovel c1 = new Automovel( "BMW", 5000.);
        Pneu[] pneus = { new Pneu( "pirelli", 27.), new Pneu( "pirelli", 26.), 
            new Pneu( "pirelli", 24.), new Pneu( "pirelli", 25.) }; 
        c1.setPneu( pneus );
        c1.setMotor( new Motor( 50., 300.) );
        
        System.out.println(c1);
        
        c1.getPneu()[2] = new Pneu("goodyear", 30);
        
        System.out.println(c1);
        
    }
    
}
