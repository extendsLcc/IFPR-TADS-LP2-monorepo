/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios.exercicio7;

/**
 *
 * @author aluno
 */
public class Cliente {
    
    //private int chegada;
    private int entrada;
    private int saida;
    private String nome;

    public String getNome() {
        return nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
        this.saida = Loja.randomBetween(5, 15);

    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
        this.saida = entrada + saida;
    }

    public int getSaida() {
        return saida;
    }

    /*public int getChegada() {
        return chegada;
    }

    public void setChegada(int chegada) {
        this.chegada = chegada;
    }

    public int getEspera(){
    
        return this.entrada - this.chegada;
    
    }*/
    
    @Override
    public String toString() {
        return "Cliente{" + "entrada=" + entrada + ", saida=" + saida + ", nome=" + nome + '}';
    }

}
