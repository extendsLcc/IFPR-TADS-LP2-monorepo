/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex21;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 */
public class Pedido {
    
    private int codigo;
    private Produto[] itens;

    public Pedido(int codigo, Produto[] itens) {
        this.codigo = codigo;
        this.itens = itens;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public double getValorTotal(){
    /*
        double total = 0;
        
        for (Produto iten : itens) {
            
            total += iten.getPreco();
            
        }
        
        return total;*/
        
        return Arrays.asList(itens).stream()
                .mapToDouble(Produto::getPreco)
                .sum();
    
    }

    @Override
    public String toString() {
        
        String produtos = Arrays.asList(itens).stream()
                    .map( Produto::getDados )
                    .collect( Collectors.joining(", ") );
        
        return "Pedido { codigo: " + codigo 
                + ", itens: " + produtos + ", valorTotal: " 
                + this.getValorTotal() +"}";
    }
    
}
