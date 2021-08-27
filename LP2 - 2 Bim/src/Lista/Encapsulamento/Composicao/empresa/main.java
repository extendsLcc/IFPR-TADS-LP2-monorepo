/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Encapsulamento.Composicao.empresa;

/**
 *
 * @author aluno
 */
public class main {
    
    public static void main(String[] args) {
        
        Array l = new Array( 10 );
        String s2 = "2";
        l.add( "1" );
        l.add( "3" );
        l.add( "4" );
        l.add( "5" );
        l.add( "6" );
        System.out.println("#"+ l.size());
        l.remove( 1 );
        System.out.println("#"+ l.size());
        
    }
    
}
