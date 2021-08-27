/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex21;

/**
 *
 * @author aluno
 */
public class Dvd extends Produto{

    private String artista;
    private int duracao;

    public Dvd(String artista, int duracao, String descricao, double preco) {
        super(descricao, preco);
        this.artista = artista;
        this.duracao = duracao;
    }

    @Override
    public String getDados() {

        return "Livro {" + "artista: " + artista 
                + ", duração: " + duracao 
                + ", descrição: "+ getDescricao() 
                +", preço: "+ getPreco() +"}";
        
    }
    
}
