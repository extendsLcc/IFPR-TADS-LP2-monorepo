/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex19;

/**
 *
 * @author aluno
 */
public class TesteCadastro {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente(0, "cliente 1", new Data(14, 9, 1994));
        Funcionario f1 = new Funcionario(500, "Funcionario 1", new Data( 1, 1, 1999));
        Gerente g1 = new Gerente("Area 51", 3000, "Gerente 1", new Data(30, 02, 1992));
        
        CadastroPessoas cadastro = new CadastroPessoas();
        cadastro.cadastraPessoa(c1);
        cadastro.cadastraPessoa(f1);
        cadastro.cadastraPessoa(g1);
        cadastro.imprimeCadastro();
        
    }
    
}
