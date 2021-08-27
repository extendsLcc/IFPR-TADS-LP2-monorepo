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
public abstract class Publicacao {
    
    private String titulo;
    private int numCatalog;

    public Publicacao() {
    }

    public Publicacao(String titulo, int numCatalog) {
        this.titulo = titulo;
        this.numCatalog = numCatalog;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumCatalog() {
        return numCatalog;
    }

    public void setNumCatalog(int numCatalog) {
        this.numCatalog = numCatalog;
    }
    
    public void ler(){
    
        
    }
    
    @Override
    public String toString() {
        return "Publicacao{" + "titulo=" + titulo + ", numCatalog=" + numCatalog + '}';
    }
    
}
