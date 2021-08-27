/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex20;

/**
 *
 * @author aluno
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Livraria livraria = new Livraria("Livraria XYZ", "000000/000");
        
        Pessoa[] autores = {
        
            new Professor("Professor Malaquias", "mail@c", "only2genders", 500, 789),
            new Estudante("Aluno ZZZ", "GHF@YH", "XX", true, 463),
            new Estudante("Aluno YYY", "aaaF@YH", "XY", false, 4654),
            new Professor("Professor João", "XX@c", "XX", 600, 769),
            new Professor("Professor hueheueheu", "YY@c", "YY", 700, 189),
            new Estudante("Aluno HHH", "ASdF@YH", "XY", true, 7864),
            
        };
        
        Livro[] livros = {
        
            new Livro("Livro X", new Pessoa[] { autores[0], autores[5] }, 100, 10),
            new Livro("Livro Y", new Pessoa[] { autores[1], autores[4] }, 200, 20),
            new Livro("Livro Z", new Pessoa[] { autores[2], autores[3] }, 300, 30)
            
        };
     
        livraria.addLivro( livros[0] );
        livraria.addLivro( livros[1] );
        livraria.addLivro( livros[2] );
        
        livraria.imprimeDadosLivros();
        
        livraria.removeLivro( 1 );
        System.out.println("");
        
        livraria.imprimeDadosLivros();
        livraria.removeLivro( 1 );
        System.out.println("");
        
        livraria.imprimeDadosLivros();
        livraria.addLivro( livros[1] );
        livraria.addLivro( livros[2] );
        System.out.println("");
        livraria.imprimeDadosLivros();
        
        
    }
    
}
