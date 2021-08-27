/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2.atividade1;

/**
 *
 * @author aluno
 */
public class Pneu {
    
    private String marca;
    private double pressao;

    public Pneu(String marca, double pressao) {
        this.marca = marca;
        this.pressao = pressao;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    @Override
    public String toString() {
        return "Pneu{" + "marca=" + marca + ", pressao=" + pressao + '}';
    }
    
}
