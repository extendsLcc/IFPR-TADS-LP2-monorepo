/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex3;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
        
        Comanda[] comandas = {
            new Comanda(),
            new Comanda(),
            new Comanda()
        };
        
        Produto[] produtos = {
            new Produto("X", 10),
            new Produto("Y", 20),
            new Produto("Z", 30),
            new Produto("B", 40),
            new Produto("N", 50),
            new Produto("M", 60),
            new Produto("Ç", 70),
            new Produto("P", 80),
        };
        
        comandas[0].adiquirirProduto(produtos[0]);
        comandas[0].adiquirirProduto(produtos[1], 5);
        comandas[0].adiquirirProduto(produtos[5]);
        comandas[0].devolverProduto(produtos[1], 3);
        comandas[0].concultarValorTotal();
        comandas[0].pagar();
        
        comandas[1].adiquirirProduto(produtos[4], 6);
        comandas[1].adiquirirProduto(produtos[6], 5);
        comandas[1].adiquirirProduto(produtos[5]);
        comandas[1].devolverProduto(produtos[6], 5);
        comandas[1].concultarValorTotal();
        comandas[1].pagar();
        
        
        comandas[2].adiquirirProduto(produtos[0]);
        comandas[2].adiquirirProduto(produtos[1], 5);
        comandas[2].adiquirirProduto(produtos[5]);
        comandas[2].devolverProduto(produtos[1], 3);
        comandas[2].concultarValorTotal();
        comandas[2].pagar();
        
    }
    
}
