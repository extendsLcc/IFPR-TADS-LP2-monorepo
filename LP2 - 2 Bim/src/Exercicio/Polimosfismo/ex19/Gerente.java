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
public class Gerente extends Funcionario{
    
    private String area;

    public Gerente(String area, double salario, String nome, Data nascimento) {
        super(salario, nome, nascimento);
        this.area = area;
    }

    @Override
    public void imprimeDados() {
            
        System.out.println(this.toString());
        
    }

    @Override
    public double calculaImposto() {

        return this.getSalario() * 0.05;

    }

    @Override
    public String toString() {
        return "Gerente{ salario=" + getSalario() + ", nome=" + getNome() + ", nascimento=" + getNascimento() + "area=" + area + '}';
    }
    
    
    
}
