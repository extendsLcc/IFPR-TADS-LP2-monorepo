/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.edu.adslcc.bean;

/**
 *
 * @author aluno
 */
public class Marca {
    
    private int id = 0;
    private String descricao;

    public Marca( String descricao) {
        this.descricao = descricao;
    }

    public Marca() {
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

}
