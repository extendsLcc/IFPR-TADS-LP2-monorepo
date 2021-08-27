/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex21;

/**
 *
 * @author aluno
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Loja loja = new Loja("Loja XYZ", "00000/000");
        
        Livro[] livros = {
            new Livro("Autor 1", 20, "Livro 1", 90),
            new Livro("Autor 2", 30, "Livro 2", 80),
            new Livro("Autor 3", 40, "Livro 3", 70),
            new Livro("Autor 4", 50, "Livro 4", 60)
        };
        Dvd[] dvds = {
            new Dvd("Artista 1", 440, "", 990),
            new Dvd("Artista 2", 660, "", 880),
            new Dvd("Artista 3", 330, "", 770)
        };
        
        Pedido[] pedidos = {
            new Pedido(0, new Produto[]{ 
                    livros[1], 
                    livros[3],
                    dvds[2]
                    }),
            new Pedido(1, new Produto[]{ 
                    dvds[1], 
                    dvds[2],
                    dvds[0]
                    }),
            new Pedido(2, new Produto[]{ 
                    livros[0], 
                    dvds[0] 
                    }),
            new Pedido(3, new Produto[]{ 
                    livros[0], 
                    livros[1], 
                    livros[2], 
                    livros[3],
                    dvds[0],
                    dvds[1],
                    dvds[2], 
                    }),
        };
        
        for (Pedido pedido : pedidos) {
            
            loja.addPedido(pedido);
            
        }
        
        loja.gerarRelatorio();
        
        loja.removePedido( pedidos[3] );
        System.out.println("");
        loja.gerarRelatorio();
        
        
    }
    
}
