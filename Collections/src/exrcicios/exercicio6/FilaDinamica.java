/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios.exercicio6;

import fila.FilaVaziaException;
import fila.Node;

/**
 *
 * @author aluno
 */
public class FilaDinamica implements Fila {

    private Node first;
    private Node last;
    private int ammount;

    @Override
    public void add(Object e) {

        if (isEmpty()) {

            first = new Node(e);
            last = first;
            ammount++;

        } else {

            Node node = new Node(e);
            last.setNext(node);
            last = node;
            ammount++;

        }

    }

    @Override
    public Object remove() throws FilaVaziaException{

        Node node = this.first;

        if (node != null) {

            this.first = node.getNext();
            ammount--;
            return node.getElement();

        }

        throw new FilaVaziaException("Fila Dinamica.\nImpossivel remover elemento da lista vazia.");
        
    }

    @Override
    public boolean isEmpty() {

        return first == null;

    }

    @Override
    public int size() {

        return ammount;

    }

    @Override
    public String toString() {
        String nodes = "{ ";
        Object firstEl = null,
                lastEl = null;
        Node node = this.first;

        try {
            firstEl = this.first.getElement();
            lastEl = this.last.getElement();
        } catch (Exception e) {
        }

        while (node != null) {

            nodes += "[" + node.getElement() + "], ";
            node = node.getNext();

        }

        nodes = nodes.substring(0, Math.max(nodes.length() - 2, 1)) + " }";

        return "FilaDinamica{" + "first=" + firstEl + ", last=" + lastEl + ", ammount=" + ammount + ", nodes= " + nodes + "}";
    }

    @Override
    public Object getFirst() {

        return this.first.getElement();

    }

    @Override
    public Object get(int index) {

        Node node = first;

        try {

            for (int i = 0; i < index; i++) {

                node = node.getNext();

            }

        } catch (Exception e) {
            
            System.out.println("Index out of Bounds");
            
        }

        return node.getElement();

    }

}
