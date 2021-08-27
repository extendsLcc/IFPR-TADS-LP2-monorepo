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
public class Veiculo {
    
    private int id = 0;
    private String placa;
    private Date ano;
    private Proprietario proprietario;
    private Marca marca;
    private Municipio municipio;
    private Categoria categoria;

    public Veiculo( String placa, Date ano, Proprietario proprietario, Marca marca, Municipio municipio, Categoria categoria) {
        this.placa = placa;
        this.ano = ano;
        this.proprietario = proprietario;
        this.marca = marca;
        this.municipio = municipio;
        this.categoria = categoria;
        
    }

    public Veiculo() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", placa=" + placa + ", ano=" + ano + ", proprietario=" + proprietario + ", marca=" + marca + ", municipio=" + municipio + ", categoria=" + categoria + '}';
    }
    
}
