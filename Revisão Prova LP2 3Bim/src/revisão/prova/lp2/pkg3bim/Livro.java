/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisão.prova.lp2.pkg3bim;

/**
 *
 * @author LCC
 */
public class Livro{
    
    private String codigo,
                dataCadastro,
                autor,
                titulo,
                edicao,
                editora;
    private int ano,
                quantidade;

    public Livro( String codigo, String dataCadastro, String autor, String titulo, String edicao, int ano, int quantidade, String editora ){
        this.codigo = codigo;
        this.dataCadastro = dataCadastro;
        this.autor = autor;
        this.titulo = titulo;
        this.edicao = edicao;
        this.ano = ano;
        this.quantidade = quantidade;
        this.editora = editora;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo( String codigo ){
        this.codigo = codigo;
    }

    public String getDataCadastro(){
        return dataCadastro;
    }

    public void setDataCadastro( String dataCadastro ){
        this.dataCadastro = dataCadastro;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor( String autor ){
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo( String titulo ){
        this.titulo = titulo;
    }

    public String getEdicao(){
        return edicao;
    }

    public void setEdicao( String edicao ){
        this.edicao = edicao;
    }

    public int getAno(){
        return ano;
    }

    public void setAno( int ano ){
        this.ano = ano;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade( int quantidade ){
        this.quantidade = quantidade;
    }

    public String getEditora(){
        return editora;
    }

    public void setEditora( String editora ){
        this.editora = editora;
    }
    
}
