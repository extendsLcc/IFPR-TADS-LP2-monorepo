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
public class Quadrado {
    
    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "lado=" + lado + '}';
    }
    
    public  double getPerimetro(){
    
        return lado * 4;
    
    }
    
    public double getArea(){
    
        return lado * lado;
    
    }
    
}
