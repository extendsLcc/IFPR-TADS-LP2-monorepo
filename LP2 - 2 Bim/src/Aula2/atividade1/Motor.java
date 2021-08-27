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
public class Motor {
    
    private double qtdCombustivel;
    private double hp;

    public Motor(double qtdCombustivel, double hp) {
        this.qtdCombustivel = qtdCombustivel;
        this.hp = hp;
    }

    public double getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Motor{" + "qtdCombustivel=" + qtdCombustivel + ", hp=" + hp + '}';
    }
    
}
