/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex20;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 */
public class Livro {
    
    private String titulo;
    private Pessoa[] autores;
    private double preco;
    private int qtde;


    public Livro(String titulo, Pessoa[] autores, double preco, int qtde) {
        this.titulo = titulo;
        this.autores = autores;
        this.preco = preco;
        this.qtde = qtde;
    }

    public String getTitulo() {
        return titulo;
    }

    public Pessoa[] getAutores() {
        return autores;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        /*
        String nomeAutores = "";
        
        for (Pessoa autor : getAutores() ) {
            
            nomeAutores += autor.getNome() + ", ";
            
        }
        
        nomeAutores = nomeAutores.substring( 0, nomeAutores.length() - 2 );*/
        String nomeAutores =  Arrays.asList(autores).stream()
                                    .map( e -> e.getDados())
                                    .collect(Collectors.joining( ", "));
        
        return "Livro {" + "titulo=" + titulo + ", autores=" + nomeAutores 
                + ", preco=" + preco + ", qtde=" + qtde + '}';
    }
    
    
    
}
