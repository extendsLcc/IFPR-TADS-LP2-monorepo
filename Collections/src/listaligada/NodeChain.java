/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada;

/**
 *
 * @author aluno
 */
public class NodeChain extends Celula {
    
    private NodeChain previousNode;

    public NodeChain(Object element) {
        
        super(element);
        
    }
    
    public NodeChain getPreviousNode() {
        
        return previousNode;
        
    }

    public void setPreviousNode(NodeChain previousNode) {
        
        this.previousNode = previousNode;
        
    }

    public void setNextNode(NodeChain nextNode) {
        super.setNextNode(nextNode); 
    }

    @Override
    public NodeChain getNextNode() {
        return (NodeChain) super.getNextNode();
    }

    
    
}
