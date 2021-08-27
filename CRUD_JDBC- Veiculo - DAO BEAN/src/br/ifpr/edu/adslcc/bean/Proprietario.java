/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpr.edu.adslcc.bean;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Proprietario {
    
    private int id = 0;
    private String nome,
            endereco,
            bairro,
            cpf,
            telefone,
            rg;
    private Date nascimento;

    public Proprietario( String nome, String endereco, String bairro, String cpf, String telefone, String rg, Date nascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cpf = cpf;
        this.telefone = telefone;
        this.rg = rg;
        this.nascimento = nascimento;
    }

    public Proprietario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    
}
