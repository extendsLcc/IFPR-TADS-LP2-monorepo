/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Encapsulamento.Composicao.figuras;

/**
 *
 * @author aluno
 */
public class Circulo {
    
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }
    
    public double getPerimetro(){
    
        return 2 * Math.PI * raio;
    
    }
    
    public double getArea(){
    
        return Math.PI * Math.pow( raio, 2);
        
    }
    
}
