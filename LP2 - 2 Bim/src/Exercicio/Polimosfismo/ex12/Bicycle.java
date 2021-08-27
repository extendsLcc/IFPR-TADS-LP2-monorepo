/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.ex12;

/**
 *
 * @author aluno
 */
public class Bicycle implements CarbonFootprint{
    
    private int marcha;
    private String marca;

    @Override
    public double getCarbonFootprint() {
        return 0;
    }
    
}
