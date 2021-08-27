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
public class Node <E> {
    
    public E element;
    private Node next;

    public Node(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
