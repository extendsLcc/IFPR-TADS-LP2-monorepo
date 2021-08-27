/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hierarquia;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Claire", "0000000", "Rua X"),
        p2 = new Cliente(100., 50, "Leon", "111111", "Rua Y"),
        p3 = new Empregado(1000, 10, "Sherry", "333333", "Rua Z");
        
        System.out.println(" Nome pessoa: " + p1.getNome());
        System.out.println(" Nome cliente: " + p2.getNome());
        System.out.println(" Nome empregado: " + p3.getNome());
        
        Cliente c = (Cliente) p2;
        Empregado e = (Empregado) p3;
        
        System.out.println("Cliente :" + p2.getNome() + " saldo : " + c.getSaldo() );
        System.out.println("Empregado :" + p2.getNome() + " salario Ream : " + e.getSalarioReal() );

    }

}
