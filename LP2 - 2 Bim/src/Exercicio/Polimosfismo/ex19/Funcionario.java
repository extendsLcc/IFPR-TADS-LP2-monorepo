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
public class Funcionario extends Pessoa{
    
    private double salario;

    public Funcionario(double salario, String nome, Data nascimento) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double  calculaImposto(){
    
        return this.salario * 0.03;
    
    }
    
    @Override
    public void imprimeDados() {
        
        System.out.println(this.toString());
        
    }

    @Override
    public String toString() {
        return "Funcionario{ salario=" + salario + ", nome=" + getNome() + ", nascimento=" + getNascimento() + '}';
    }
    
    
    
}
