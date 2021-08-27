/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex20;

/**
 *
 * @author aluno
 */
public abstract class Pessoa {
    
    private String nome;
    private String email;
    private String genero;

    public Pessoa(String nome, String email, String genero) {
        this.nome = nome;
        this.email = email;
        this.genero = genero;
    }

    public abstract String getDados();
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", genero=" + genero + '}';
    }
    
}
