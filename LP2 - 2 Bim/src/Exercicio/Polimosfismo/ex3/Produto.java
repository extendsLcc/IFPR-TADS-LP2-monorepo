/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex3;

/**
 *
 * @author aluno
 */
public class Produto {
    
    private String descricao;
    private double preco;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", preco=" + preco + '}';
    }
    
}
