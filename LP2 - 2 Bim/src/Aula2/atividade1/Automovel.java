/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2.atividade1;

import java.util.Arrays;

/**
 *
 * @author aluno
 */
public class Automovel {
    
    private String marca;
    private double kms;
    private Pneu[] pneu = new Pneu[4];
    private Motor motor;

    public Automovel(String marca, double kms, Motor motor) {
        this.marca = marca;
        this.kms = kms;
        this.motor = motor;
    }

    public Automovel(String marca, double kms) {
        this.marca = marca;
        this.kms = kms;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public Pneu[] getPneu() {
        return pneu;
    }

    public void setPneu(Pneu[] pneu) {
        this.pneu = pneu;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        
        String str = "";
        
        for( Pneu pn : pneu ){
        
            str += pn.toString();
        
        }
        
        return "Automovel{" + "marca=" + marca + ", kms=" + kms + ", pneus=" + str + ", motor=" + motor + '}';
        
    }


}
