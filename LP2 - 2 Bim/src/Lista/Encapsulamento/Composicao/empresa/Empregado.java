/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Encapsulamento.Composicao.empresa;

/**
 *
 * @author aluno
 */
public class Empregado {
    
    private String nome;
    private double valorHora, horasTrabalhadas, horasExtras, taxaHoraExtra;

    public Empregado(String nome, double valorHora, double taxaHoraExtra) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.taxaHoraExtra = taxaHoraExtra;
    }

    public String getNome() {
        return nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getTaxaHoraExtra() {
        return taxaHoraExtra;
    }

    public void setTaxaHoraExtra(double taxaHoraExtra) {
        this.taxaHoraExtra = taxaHoraExtra;
    }
    
    public void trabalhar( double horas ){
    
        horasTrabalhadas += horas;
        System.out.println( nome + " trabalhou " + horas + " horas ");
    
    }
    
    public void trabalharHoraExtra( double horas ){
    
        horasExtras += horas;
        System.out.println( nome + " trabalhou " + horas + " de horas extras");
    
    }
    
    public double getSalario(){
    
        return ((valorHora * taxaHoraExtra ) * horasExtras ) + ( valorHora * horasTrabalhadas );
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", valorHora=" + valorHora + ", horasTrabalhadas=" + horasTrabalhadas + ", horasExtras=" + horasExtras + ", taxaHoraExtra=" + taxaHoraExtra + '}';
    }
    
}
