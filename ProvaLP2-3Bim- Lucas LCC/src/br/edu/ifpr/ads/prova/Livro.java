/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.prova;

/**
 *
 * @author aluno
 */
public class Livro {
    
    private String codigo;
    private String dataCadastro;
    private String autor;
    private String titulo;
    private String edicao;
    private int ano;
    private int quantidade;
    private Editora editora;

    public Livro(String codigo, String dataCadastro, String autor, String titulo, String edição, int ano, int quantidade, Editora editora) {
        this.codigo = codigo;
        this.dataCadastro = dataCadastro;
        this.autor = autor;
        this.titulo = titulo;
        this.edicao = edição;
        this.ano = ano;
        this.quantidade = quantidade;
        this.editora = editora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edição) {
        this.edicao = edição;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return  codigo + ", " + dataCadastro + ", " + autor + ", " + titulo + 
                ", " + edicao + ", " + ano + ", " + quantidade + ", " + editora;
    }
    
    
    
}
