/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.Polimosfismo.exTeorico;

import java.util.Collections;

/**
 *
 * @author aluno
 */
class Produto implements Comparable<Produto>{

    private String identificação;

    private double custoDeFabricação;

    Produto(String i,double c) {

        identificação = i;
        custoDeFabricação = c;
        

    }

    @Override
    public int compareTo(Produto o) {
        if (custoDeFabricação > o.custoDeFabricação) {
            return 1;
        } else {
           if (custoDeFabricação == o.custoDeFabricação) {
               return 0;
           } else {
               return -1;
           }
        }
    }



}
