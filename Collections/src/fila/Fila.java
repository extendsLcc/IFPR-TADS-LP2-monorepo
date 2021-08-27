/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author aluno
 */
public interface Fila /*<E>*/{
    
    public void add( Object e ) throws FilaCheiaException;
    public Object remove() throws FilaVaziaException;
    public boolean isEmpty();
    public int size();
    
}
