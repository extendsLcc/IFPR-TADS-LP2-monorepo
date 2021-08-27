/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex2;

/**
 *
 * @author aluno
 */
public class Periodico extends Publicacao {
    
    private String volume;
    private double preco;

    public Periodico() {
        
        super();
        this.volume = "Sem Volume";
        this.preco = 0.0;
        
    }

    public Periodico(String volume, double preco, String titulo, int numCatalog) {
        super(titulo, numCatalog);
        this.volume = volume;
        this.preco = preco;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double venderPeriodico( double valorPagamento ){
        
        double troco = 0;
        
        if( valorPagamento >= getPreco() ){
        
            troco = valorPagamento - this.getPreco();
            System.out.println(this.getTitulo() + " vendido, valor recebido "+ valorPagamento +" Troco : " + troco);
            
        }else{
        
            System.out.println("Valor insuficiente");
        
        }
    
        return troco;
    
    }
    
    @Override
    public void ler(){
    
        System.out.println("O leitor está lendo o periodico " + getTitulo());
        
    }
    
}
