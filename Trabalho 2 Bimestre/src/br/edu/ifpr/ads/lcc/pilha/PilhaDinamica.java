/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.pilha;

/**
 *
 * @author aluno
 */
public class PilhaDinamica implements Pilha {

    private Node top;
    private int ammount = 0;

    @Override
    public void empilhar(Object e) {

        if (ammount == 0) {

            top = new Node(e, null);

        } else {

            Node node = top;
            top = new Node(e, node);
        }

        ammount++;

    }

    @Override
    public Object desempilhar() {

        if (!isEmpty()) {

            Object element = getTop();
            top = top.getPrev();
            ammount--;
            return element;

        } else {

            System.out.println("A pilha está vazia!");
            return null;

        }

    }

    @Override
    public boolean isFull() {

        return false;

    }

    @Override
    public boolean isEmpty() {

        return ammount > 0;

    }

    @Override
    public int size() {

        return ammount;

    }

    @Override
    public Object getTop() {

        return top.getElement();

    }

    @Override
    public String toString() {

        String str = "[";
        Node node = top;

        while (node != null) {

            str += node.getElement() + ",";
            node = node.getPrev();

        }

        str = str.substring(0, Math.max( 1, str.length() - 1 ) );

        return "PilhaDinamica{" + "top=" + top.getElement() + ", ammount=" + ammount + " elements = " + str + "] }";
    }

}
