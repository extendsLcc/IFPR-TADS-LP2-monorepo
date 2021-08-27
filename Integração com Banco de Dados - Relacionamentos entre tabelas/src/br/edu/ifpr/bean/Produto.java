/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.bean;

/**
 *
 * @author aluno
 */
public class Produto {
    
    private int id;
    private String descricao;
    private Categoria categoria;

    public Produto(int id, String descricao, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", categoria=" + categoria + '}';
    }
    
}
