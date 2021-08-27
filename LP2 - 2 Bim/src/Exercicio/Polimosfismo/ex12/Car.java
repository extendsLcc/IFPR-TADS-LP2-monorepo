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
public class Car implements CarbonFootprint{
    
    private String modelo;
    private String placa;

    @Override
    public double getCarbonFootprint() {
        return 0;
    }
    
}
