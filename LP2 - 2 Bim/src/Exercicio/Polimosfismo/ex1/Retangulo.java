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
public class Retangulo implements Figura{
    
    private double altura;
    private double base;

    public Retangulo() {
    }

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculaArea() {
     
        return altura * base;
        
    }

    @Override
    public double calculaPerimetro() {
    
        return 2 * ( altura + base );
        
    }

    @Override
    public String toString() {
        return "Retangulo{" + "altura=" + altura + ", base=" + base + '}';
    }
    
}
