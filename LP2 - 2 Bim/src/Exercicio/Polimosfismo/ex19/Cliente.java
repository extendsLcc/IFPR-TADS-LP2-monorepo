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
public class Cliente extends Pessoa {
    
    private int codigo;

    public Cliente(int codigo, String nome, Data nascimento) {
        super(nome, nascimento);
        this.codigo = codigo;
    }
    
    @Override
    public void imprimeDados() {
        
        System.out.println(this.toString());
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + getNome() + ", nascimento=" + getNascimento() + '}';
    }

}
