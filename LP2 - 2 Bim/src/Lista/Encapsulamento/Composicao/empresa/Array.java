/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Encapsulamento.Composicao.empresa;

import java.util.Arrays;

/**
 *
 * @author aluno
 */
public class Array{
    
    private Object[] list;
    private int size = 0;

    public Array( int size ) {
        
        this.list = new Object[size];
        
    }
    
    private void sizeChange(){
    
        list = Arrays.copyOf(list, size );
            
    }
    
    public void add( Object o ){
    
        size++;
        sizeChange();
        list[size - 1] = o;
        System.out.println(this);
        
    }
    
    private boolean remove( Object o ){
    
        for (int i = 0; i < size; i++) {
            
            if( list[i].equals(o) ){
            
                for (int j = i + 1; j < size; j++) {
                    
                    list[j-1] = list[j];
                    
                }
                
                size--;
                sizeChange();
                System.out.println(this);
                return true;
            
            }
            
        }
        
        return false;
    
    }
    
    public boolean remove( int index ){
    
        return remove( list[index] );
        
    }
    
    public Object get( int index ){
    
        return list[index];
        
    }
    
    public int size(){
    
        return this.size;
    
    }

    @Override
    public String toString() {
        
        String s = "";
        
        for (Object object : list) {

            s += object + ", \n";

        }
        
        System.out.println("");
        
        return "Array {" + s +'}';
    }
    
    
    
}
