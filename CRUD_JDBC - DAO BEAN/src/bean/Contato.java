/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * 
    CREATE TABLE contato (
        id INT NOT NULL AUTO_INCREMENT,
        nome VARCHAR(40) NOT NULL,
        idade INT,
        dataCadastro DATE
        PRIMARY KEY( id )
    );
 * 
 * @author aluno
 */
public class Contato {
    
    private int id;
    private String nome;
    private int idade;
    private Date dataCadastro;

    public Contato() {
    }

    public Contato(int id, String nome, int idade, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.dataCadastro = dataCadastro;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", nome=" + nome + ", idade=" + idade + ", dataCadastro=" + dataCadastro + '}';
    }
    
}
