/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author aluno
 */
public interface Pilha <E> {
    
    public void empilhar( E e );
    public E desempilhar();
    public boolean isFull();
    public boolean isEmpty();
    public int size();
    public E getTop();
    
}
