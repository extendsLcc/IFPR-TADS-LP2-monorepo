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
public class Building implements CarbonFootprint{
    
    private double energia;
    private double gas;
    private int pessoas;

    @Override
    public double getCarbonFootprint() {
        return 0;
    }
    
}
