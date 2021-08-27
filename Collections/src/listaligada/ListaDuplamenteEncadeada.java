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
public class ListaDuplamenteEncadeada implements Lista{

    private NodeChain first;
    private NodeChain last;
    private int ammount;
    
    @Override
    public void adicionaInicio(Object element) {
        
        if( estaVazia() ){
        
            first = new NodeChain(element);
            last = first;
        
        }else{
            
            NodeChain node = new NodeChain(element);
            first.setPreviousNode(node);
            node.setNextNode( first );
            first = node;
        
        }
        
        ammount++;
        
    }

    @Override
    public void adicionaFim(Object element) {
        
        if( estaVazia() ){
        
            last = new NodeChain(element);
            first = last;
        
        }else{
            
            NodeChain node = new NodeChain(element);
            last.setNextNode(node);
            node.setPreviousNode( last );
            last = node;
        
        }
        
        ammount++;
        
    }

    @Override
    public void adicionaIndice(Object element, int index) {
        
        if ( index >= 0 && index <= ammount ) {
            
            if ( estaVazia()) {
                
                adicionaInicio(element);
                
            }else if ( index == 0 ) {
                
                adicionaInicio(element);
                
            } else if( index ==  ammount ) {
                
                adicionaFim(element);
                
            }else {
                
                NodeChain currentNode = first;
                
                for (int i = 0; i < index - 1; i++) {

                    currentNode = currentNode.getNextNode();
                    
                }
                
                NodeChain newNode = new NodeChain(element);
                newNode.setPreviousNode( currentNode );
                newNode.setNextNode( currentNode.getNextNode() );
                currentNode.getNextNode().setPreviousNode(newNode);
                currentNode.setNextNode( newNode );
                ammount++;
                
            }
            
        }else{
        
            System.out.println("Posição inválida!");
            
        }
        
    }

    @Override
    public boolean remover(Object element) {
        
        if ( element.equals(first.getElement()) ) {
            
            first.getNextNode().setPreviousNode( null );
            first = first.getNextNode();
            ammount--;
            return true;
            
        }
        
        NodeChain curretNode = first;
        
        while ( curretNode != null ) {

            if ( curretNode.getElement().equals(element)) {
                
                if ( curretNode.equals( this.last ) ) {
                    
                    curretNode.getPreviousNode().setNextNode( null );
                    this.last = curretNode.getPreviousNode();
                    curretNode.setPreviousNode( null );
                    
                }else{
                
                    curretNode.getPreviousNode().setNextNode(curretNode.getNextNode());
                    curretNode.setNextNode( null );
                    curretNode.setPreviousNode( null );
                
                }
                
                ammount--;
                return true;
                
            }
            
            curretNode = curretNode.getNextNode();
            
        }
        
        return false;
        
    }

    @Override
    public Object encontrar(int index) {
        
        NodeChain currentNode = first;
        
        if ( index >= 0 && index < ammount ) {
            
            for (;  index > 0; index--) {

                currentNode = currentNode.getNextNode();
                
            }
            
        }else{
        
            currentNode = null;
            System.out.println("Posição inválida");
        
        }
        
        return currentNode == null ? null : currentNode.getElement();
        
    }

    @Override
    public boolean possuiElemento(Object whichElement) {
        
        NodeChain currentNode = first;
        
        while ( currentNode != null ) {

            if( currentNode.getElement().equals(whichElement) ){
            
                return true;
            
            }
            
            currentNode = currentNode.getNextNode();
            
        }
        
        return false;
        
    }

    @Override
    public boolean estaVazia() {
        
        return last == null;
        
    }

    @Override
    public String toString() {
        
        String elements = "";
        Celula currentNode = first;
        
        while ( currentNode != null ) {            
            
            elements += "[" + currentNode.getElement() + "], ";
            currentNode = currentNode.getNextNode();
            
        }
        
        elements = elements.substring( 0, Math.max( elements.length() - 2, 0 ) );
        
        return "ListaDuplamenteEncadeada{" + "first=" + first + ", last=" + last 
                + ", ammount=" + ammount + " elements= {"+ elements +"} }";
    }
    
    
    
}
