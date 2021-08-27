/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex21;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 */
public class Loja {
    
    private String nome;
    private String cnpj;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Loja(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    
    public void addPedido( Pedido whichPedido ){
    
        pedidos.add(whichPedido);
        
    }
    
    public Pedido removePedido( Pedido whichPedido ){
    
        return pedidos.remove( pedidos.indexOf( whichPedido ) );
        
    }
    
    public Pedido removePedido( int whichIndex ){
    
        return pedidos.remove( whichIndex );
        
    }
    
    public void gerarRelatorio(){
    
        String relatorio = pedidos.stream()
                                .map(Pedido::toString)
                                .collect(Collectors.joining( "\n" ));
        
        System.out.println(relatorio);
    
    }
    
}
