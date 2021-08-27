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
public class Quadrado extends Retangulo{

    public Quadrado() {
    }

    public Quadrado(double lado ) {
        
        super( lado, lado );
        
    }
    
    public void setLado( double lado ){
    
        super.setAltura(lado);
        super.setBase(lado);
        
    }
    
    public double getLado(){
    
        return super.getBase();
    
    }

    @Override
    public double calculaPerimetro() {
        
        return getBase() * 4;
        
    }

    @Override
    public double calculaArea() {
        
        return getBase() * getBase();
        
    }

    @Override
    public String toString() {
        return "Quadrado{ lado: " + getBase() + '}';
    }
    
}
