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
public class Livro extends Publicacao{
    
    private boolean situacao;

    public Livro() {
        
        super();
        situacao = true;
        
    }

    public Livro( String titulo, int numCatalog) {
        super(titulo, numCatalog);
        this.situacao = true;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    public boolean emprestar(){
    
        if( this.situacao ){
        
            this.situacao = false;
            System.out.println( this.getTitulo() + " emprestado ");
            return true;
        
        }else{
        
            System.out.println("O " + this.getTitulo() + " já esta emprestado");
            return false;
        
        }
    
    }
    
    public boolean devolver(){
    
        if( this.situacao ){
        
            this.situacao = true;
            System.out.println("O livro foi devolvido");
            return true;
        
        }else{
        
            System.out.println("O Livro já esta disponivel");
            return false;
        
        }
    
    }
    
    @Override
    public void ler(){
    
        System.out.println("O leitor está lendo o livro " + getTitulo());
        
    }
    
}
