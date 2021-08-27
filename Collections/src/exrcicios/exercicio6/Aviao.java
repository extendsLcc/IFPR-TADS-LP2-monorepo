/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios.exercicio6;

/**
 *
 * @author aluno
 */
public class Aviao {
    
    private String nome;
    private int identificador;
    private String modelo;

    public Aviao(String nome, int identificador, String modelo) {
        this.nome = nome;
        this.identificador = identificador;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Aviao{" + "nome=" + nome + ", identificador=" + identificador + ", modelo=" + modelo + '}';
    }

}
