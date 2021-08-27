/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios.exercicio6;

import fila.FilaVaziaException;


/**
 *
 * @author aluno
 */
public interface Fila /*<E>*/{
    
    public void add( Object e );
    public Object remove() throws FilaVaziaException;
    public Object getFirst();
    public Object get( int index );
    public boolean isEmpty();
    public int size();
    
}
