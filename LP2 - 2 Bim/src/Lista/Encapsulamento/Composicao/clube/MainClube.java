/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Encapsulamento.Composicao.clube;

/**
 *
 * @author aluno
 */
public class MainClube {
    
    public static void main(String[] args) {
        
        Clube clube = new Clube(" Clube X", "Endereço Y", "XXXX-XXXX");
        
        Socio[] socios = { 
            new Socio("Socio 1", "Endereço AB", "XXX-XXX-XXX-XX", 0),
            new Socio("Socio 2", "Endereço BA", "XXX-XXX-XXX-XX", 1),
            new Socio("Socio 3", "Endereço CB", "XXX-XXX-XXX-XX", 2),
            new Socio("Socio 4", "Endereço BC", "XXX-XXX-XXX-XX", 3),
            new Socio("Socio 5", "Endereço XY", "XXX-XXX-XXX-XX", 4),
            
        };
        
        for (int i = 0; i < 3; i++) {
            
            clube.comprarAcao(socios[i]);
            
        }
        
        clube.mostrarSocios();
        clube.venderAcao(socios[1]);
        System.out.println("");
        clube.mostrarSocios();
        clube.venderAcao(socios[1]);
        clube.venderAcao(socios[2]);
        clube.venderAcao(socios[0]);
        System.out.println("");
        clube.mostrarSocios();
        clube.comprarAcao(socios[3]);
        clube.comprarAcao(socios[4]);
        System.out.println("");
        clube.mostrarSocios();
        
        
        
    }
    
}
