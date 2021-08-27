/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3bim.pkginterface.pratica;

/**
 *
 * @author aluno
 */
public class Cliente {
    
    private String id;
    private String nome;
    private String telResidencial;
    private String telComercial;
    private String telCelular;
    private String email;

    public Cliente(String id, String nome, String telResidencial, String telComercial, String telCelular, String email) {
        this.id = id;
        this.nome = nome;
        this.telResidencial = telResidencial;
        this.telComercial = telComercial;
        this.telCelular = telCelular;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelResidencial() {
        return telResidencial;
    }

    public void setTelResidencial(String telResidencial) {
        this.telResidencial = telResidencial;
    }

    public String getTelComercial() {
        return telComercial;
    }

    public void setTelComercial(String telComercial) {
        this.telComercial = telComercial;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
