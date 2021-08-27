/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import listaligada.Celula;

/**
 *
 * @author aluno
 */
public class Node {
    
    private Object element;
    private Node nextNode;

    public Node(Object element) {
        
        this.element = element;
        this.nextNode = null;
        
    }

    public Object getElement() {
        
        return element;
        
    }
    
    public Node getNextNode() {
        
        return nextNode;
        
    }

    public void setNextNode(Node nextNode) {
        
        this.nextNode = nextNode;
        
    }
    
}
