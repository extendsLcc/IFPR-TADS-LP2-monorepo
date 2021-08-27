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
public class Node {
    
    private Object element;
    private Node prev;

    public Node(Object element, Node prev) {
        this.element = element;
        this.prev = prev;
    }


    public Object getElement() {
        return element;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
}
