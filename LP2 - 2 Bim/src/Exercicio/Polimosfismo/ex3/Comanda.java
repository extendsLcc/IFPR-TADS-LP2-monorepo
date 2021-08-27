/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Comanda {

    private double valorTotal = 0;
    //private List<Produto> produtos = new ArrayList<>();

    public Comanda() {
        
        System.out.println("Comanda aberta");
        
    }
    
    public void adiquirirProduto( Produto produto ){
    
        this.valorTotal += produto.getPreco();
        System.out.println(" Produto adicionado, valor: " + produto.getPreco());
        System.out.println("Valor Total : " + this.valorTotal );
    
    }
    
    public void adiquirirProduto( Produto produto, double quantidade ){
    
        this.valorTotal += produto.getPreco() * quantidade;
        System.out.println(" Produtos adicionados, valor: " + (produto.getPreco() * quantidade ));
        System.out.println("Valor Total : " + this.valorTotal );
    
    }
    
    public void devolverProduto( Produto produto ){
    
        this.valorTotal -= produto.getPreco();
        System.out.println(" Produto devolvido, valor: " + produto.getPreco());
        System.out.println("Valor Total : " + this.valorTotal );
    
    }
    
    public void devolverProduto( Produto produto, double quantidade ){
    
        this.valorTotal -= produto.getPreco() * quantidade;
        System.out.println(" Produtos adicionados, valor: " + (produto.getPreco() * quantidade ));
        System.out.println("Valor Total : " + this.valorTotal );
    
    }
    
    public void concultarValorTotal(){
    
        System.out.println("Valor total: R$" + this.valorTotal   );
    
    }
    
    public void pagar(){
    
        System.out.println("Valor pago: R$" + this.valorTotal );
    
    }

}
