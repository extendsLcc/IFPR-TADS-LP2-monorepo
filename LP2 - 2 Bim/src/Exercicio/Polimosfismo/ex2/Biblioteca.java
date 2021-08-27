/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Biblioteca {
    
    public static void main(String[] args) {
        
        Publicacao[] pubs = {
            new Livro( "Livro 1", 10 ),
            new Livro( "Livro 2", 20 ),
            new Livro( "Livro 3", 30 ),
            new Periodico("Volume X", 50, "Periodico 1", 1),
            new Periodico("Volume Y", 40, "Periodico 2", 2),
            new Periodico("Volume Z", 60, "Periodico 3", 3)
        };
        publicacoes.addAll( Arrays.asList( pubs ) );
        emprestarLivro( (Livro) pubs[1]);
        emprestarLivro( (Livro) pubs[2]);
        receberLivro( (Livro) pubs[1]);
        venderPeriodico( (Periodico) pubs[3], 55 );
        pubs[1].ler();
        pubs[4].ler();
        
    }
    
    private static List<Publicacao> publicacoes = new ArrayList<>();
    
    private static void emprestarLivro(Livro livro) {
        
        livro.emprestar();
        publicacoes.remove(livro);
        
    }
    
    private static void receberLivro(Livro livro) {
        
        livro.devolver();
        publicacoes.add(livro);
        
    }
    
    private static void venderPeriodico( Periodico periodico, double valorPagamento ){
    
        periodico.venderPeriodico( valorPagamento );
        publicacoes.remove(periodico);
    
    }
    
}
