/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import listaligada.Lista;
import listaligada.Celula;

/**
 *
 * @author aluno
 */
public class ListaEncadeada implements Lista {

    private Celula first;
    private Celula last;
    private int ammount;

    @Override
    public void adicionaInicio(Object element) {

        if (estaVazia()) {

            first = new Celula(element);
            last = first;

        } else {

            Celula node = new Celula(element);
            node.setNextNode(first);
            first = node;

        }

        ammount++;

    }

    @Override
    public void adicionaFim(Object element) {

        if (estaVazia()) {

            first = new Celula(element);
            last = first;

        } else {

            Celula node = new Celula(element);
            last.setNextNode(node);
            last = node;

        }

        ammount++;

    }

    @Override
    public void adicionaIndice(Object element, int index) {

        if (index > 0 || index <= ammount) {

            if ( estaVazia() ){

                adicionaInicio(element);
                
            } else if( index == 0 ){
             
                adicionaInicio(element);
                
            }else if( index == ammount ){
            
                adicionaFim(element);
            
            }else {

                Celula nextNode = first;

                for (int i = 0; i < index - 1; i++) {

                    nextNode = nextNode.getNextNode();

                }

                Celula newNode = new Celula(element);
                newNode.setNextNode(nextNode.getNextNode());
                nextNode.setNextNode(newNode);
                ammount++;
                
            }
            

        } else {

            System.out.println("Posição inexistente!");

        }

    }

    @Override
    public boolean remover(Object element) {

        if ( first.getElement().equals(element) ) {
            
            first = first.getNextNode();
            ammount--;
            return true;
            
        }
        
        Celula currentNode = first.getNextNode();
        Celula previous = first;

        while (currentNode != null ) {
            
            if ( currentNode.getElement().equals(element) ) {
                
                if ( currentNode.getNextNode() == null ) {
                    
                    last = previous;
                    
                }else{
                
                    previous.setNextNode(currentNode.getNextNode());
                    
                }
                
                ammount--;
                return true;
                
            }
            
            previous = currentNode;
            currentNode = currentNode.getNextNode();

        }

        return false;

    }

    @Override
    public Object encontrar(int index) {

        Celula currentNode = first;
        
        if ( !estaVazia() && index >= 0 && index < ammount ) {

            for (; index > 0; index--) {

                currentNode = currentNode.getNextNode();

            }
        
        }else{
        
            System.out.println("Posição invalida!");
            currentNode = null;
        
        }
        
        return currentNode == null ? null : currentNode.getElement();

    }

    @Override
    public boolean possuiElemento(Object whichElement) {
        
        Celula currentNode = first;
        
        while ( currentNode != null ) {            
            
            if ( currentNode.getElement().equals(whichElement) ) {
                
                return true;
                
            }
            
            currentNode.setNextNode( currentNode );
            
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
        
        return "ListaEncadeada{" + "first=" + first + ", last=" + last + ", ammount=" + ammount + " elementos= " +elements+ '}';
    
    }
    
}
