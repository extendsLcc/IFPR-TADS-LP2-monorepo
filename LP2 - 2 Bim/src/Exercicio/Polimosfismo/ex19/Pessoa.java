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
public abstract class Pessoa {
    
    private String nome;
    private Data nascimento;

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    public abstract void imprimeDados();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", nascimento=" + nascimento + '}';
    }
    
}
