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
public class Professor extends Pessoa{
    
    private double salario;
    private int siape;

    public Professor(String nome, String email, String genero, int salario, int siape ) {
        super(nome, email, genero);
        this.salario = salario;
        this.siape = siape;
    }

    @Override
    public String getDados() {
        
        return "Professor{ nome: "+ getNome() +", email: "+ getEmail() +", genero: "
                + getGenero() +", salario: "+ getSalario() +", siape: "+ getSiape() +" }";
    }
    
    public double getSalario() {
        return salario;
    }

    public int getSiape() {
        return siape;
    }

}
