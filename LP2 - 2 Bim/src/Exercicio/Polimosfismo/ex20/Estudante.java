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
public class Estudante extends Pessoa{
    
    private boolean bolsista;
    private int matricula;
    
    public Estudante(String nome, String email, String genero, boolean bolsista, int matricula ) {
        super(nome, email, genero);
        this.bolsista = bolsista;
        this.matricula = matricula;
    }

    @Override
    public String getDados() {

        return "Estudante { nome: "+ getNome() +", email: "+ getEmail() +", genero: "
                + getGenero() +", bolsista: "+ isBolsista() +", matricula: "+ getMatricula() +" }";
        
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public int getMatricula() {
        return matricula;
    }
    
}
