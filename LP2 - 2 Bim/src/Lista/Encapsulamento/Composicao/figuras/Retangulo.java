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
public class Retangulo {
    
    private double altura, largura;

    public Retangulo() {
    }

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double getPerimetro(){
    
        return altura * 2 + largura * 2;
        
    }
    
    public double getArea(){
    
        return altura * largura;
    
    }

    @Override
    public String toString() {
        return "Retangulo{" + "altura=" + altura + ", largura=" + largura + '}';
    }
    
}
