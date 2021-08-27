/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.pilha;

/**
 *
 * @author aluno
 */
public interface Pilha {
    
    public void empilhar( Object e );
    public Object desempilhar();
    public boolean isFull();
    public boolean isEmpty();
    public int size();
    public Object getTop();
    
}
