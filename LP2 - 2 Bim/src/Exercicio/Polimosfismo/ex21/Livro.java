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
public class Livro extends Produto{
    
    private String autor;
    private int paginas;

    public Livro(String autor, int paginas, String descricao, double preco) {
        super(descricao, preco);
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String getDados() {

        return "Livro {" + "autor: " + autor 
                + ", paginas: " + paginas 
                + ", descrição: "+ getDescricao() 
                +", preço: "+ getPreco() +"}";
        
    }
    
}
