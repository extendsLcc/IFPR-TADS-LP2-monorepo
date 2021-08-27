/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 * @param <E>
 */
public class PilhaEstatica<E> implements Pilha<E> {

    public E[] elements;
    public int top = -1;

    public PilhaEstatica(int capacity) {

        elements = new Object[capacity];

    }


    @Override
    public void empilhar(E e) {
        
        if (!isFull()) {

            elements[top + 1] = e;
            top++;

        } else {

            System.out.println("A Pilha esta cheia!");

        }

    }
    
    @Override
    public E desempilhar() {

        if (!isEmpty()) {

            E element = getTop();
            elements[top] = null;
            top--;
            return element;

        } else {

            System.out.println("A pilha esta vazia!");
            return null;

        }

    }

    @Override
    public boolean isEmpty() {

        return top == -1;

    }

    @Override
    public int size() {

        return elements.length;

    }

    @Override
    public boolean isFull() {

        return elements.length - 1 == top;

    }

    @Override
    public E getTop() {

        return elements[top];

    }

    @Override
    public String toString() {
        
        String str = Arrays.asList(elements).stream()
                .filter( e -> Objects.nonNull( e ) )
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        
        return "PilhaEstatica{ top=" + top + " elements = [" + str + "]}";
    }
    
}
