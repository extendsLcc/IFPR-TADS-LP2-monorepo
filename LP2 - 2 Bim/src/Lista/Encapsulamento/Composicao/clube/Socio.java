/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Encapsulamento.Composicao.clube;

/**
 *
 * @author aluno
 */
public class Socio {
    
    private String nome;
    private String endereco;
    private String cpf;
    private int cota;

    public Socio(String nome, String endereco, String cpf, int cota) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.cota = cota;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCota() {
        return cota;
    }

    public void setCota(int cota) {
        this.cota = cota;
    }

    @Override
    public String toString() {
        return "Socio{" + "nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", cota=" + cota + '}';
    }
    
}
