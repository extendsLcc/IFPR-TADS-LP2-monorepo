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
public class Empregado extends Pessoa{
    
    private double salario;
    private double imposto;

    public Empregado(double salario, double imposto, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.salario = salario;
        this.imposto = imposto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double getSalarioReal(){
    
        return salario - salario * ( imposto / 100 );
    
    }
    
}
