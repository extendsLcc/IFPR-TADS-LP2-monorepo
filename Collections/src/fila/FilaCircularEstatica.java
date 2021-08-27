/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 */
public class FilaCircularEstatica implements Fila{
    
    private Object[] data;
    private int amount,
            capacity,
            start,
            end;

    public FilaCircularEstatica(int capacity) {
        this.data = new Object[capacity];
        this.capacity = capacity;
        this.amount = 0;
        this.start = 0;
        this.end = 0;
    }
    
    @Override
    public void add(Object e) throws FilaCheiaException {
    
        if( isFull() ){
        
            throw new FilaCheiaException("Fila Circular Estatica.\n"
                    + "Inserção impossivel. capacidade máxima: " + capacity +".");
            
        }else{
        
            data[end] = e;
            end = ++end % capacity;
            amount++;
            
        }
        
    }

    @Override
    public Object remove() throws FilaVaziaException{
        
        if( isEmpty() ){
        
            throw new FilaVaziaException("Lista Vazia!");
            //return null;
        
        }else{
        
            Object o = data[start];
            data[start] = null;
            start = ++start % capacity;
            amount--;
            return o;
            
        }
        
    }

    @Override
    public boolean isEmpty() {
    
        return amount == 0;
    
    }
    
    private  boolean isFull(){
        
        return capacity == amount;
        
    }

    @Override
    public int size() {
        return capacity;
    }

    @Override
    public String toString() {
        String values = "";

        
        values = Arrays.asList(data).stream()
                .map((e) -> {
                    return "[" + e + "]";
                })
                .collect(Collectors.joining(", "));

        return "FilaCircularEstatica{" + "data={ " + values + " }, amount=" + amount + ", capacity=" + capacity + ", start=" + start + ", end=" + end + '}';
    }

    
    
}
