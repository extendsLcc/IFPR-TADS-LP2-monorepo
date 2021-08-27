/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex20;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 */
public class Livraria {
    
    private ArrayList<Livro> livros;
    private String nome;
    private String cnpj;

    public Livraria(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        livros = new ArrayList<Livro>();
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    
    public void addLivro( Livro whichLivro ){
    
        livros.add(whichLivro);
        
    }
    
    public void removeLivro( Livro whichLivro ){
    
        livros.remove(whichLivro);
        
    }
    
    public Livro removeLivro( int index ){
    
        return livros.remove( index );
    
    }
    
    public void imprimeDadosLivros(){
    
        String s = livros.stream()
                .map( e -> e.toString() )
                .collect( Collectors.joining( "\n" ) );
                
        
        System.out.println( s);
        
    }
    
}
