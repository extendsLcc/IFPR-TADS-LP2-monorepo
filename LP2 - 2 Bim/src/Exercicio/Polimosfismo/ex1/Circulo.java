/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex1;

/**
 *
 * @author aluno
 */
public class Circulo implements Figura{
    
    private int raio;

    public Circulo() {
    }

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        
        return Math.PI * Math.pow( raio, 2);
        
    }

    @Override
    public double calculaPerimetro() {
        
        return 2 * Math.PI * raio;
    
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }    
    
}
