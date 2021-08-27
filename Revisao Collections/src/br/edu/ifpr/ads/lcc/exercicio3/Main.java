/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.exercicio3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Integer option = -1;

        do {

            System.out.println(" 1 - Inserir Elemento");
            System.out.println(" 2 - Remover Elemento");
            System.out.println(" 3 - Inserir elemento na posição escolhida");
            System.out.println(" 4 - Exibir Lista");
            option = getInt("Selecione a opção:");

            switch (option) {
                case 1:

                    list.add(getInt("Digite o numero a ser adicionado a lista"));
                    break;
                case 2:

                    Integer i = getInt("Digite o elemento a ser removido");

                    for (Integer integer = 0; integer < list.size(); integer++) {

                        if ( list.get( integer ) == i) {

                            list.remove( integer );
                            break;
                        }
                    }
                    break;
                case 3:

                    Integer newPosition = getInt("Digite a posição a inserir o elemento");
                    
                    if (newPosition > list.size()) {
                        
                        System.out.println("Posição inválida");
                        break;
                    }
                    
                    Integer newEl = getInt( "Digite o elemento a ser adicionado!" );
                    list.add( newPosition , newEl);
                    
                    break;
                    
                case 4:
                    
                    for( Integer in : list ){
                    
                        System.out.println("posição: " + list.indexOf(in) + " elemento: " + in );
                        
                    }
                    break;
                default:
            }

        } while (option != -1);

    }

    static Integer getInt(String msg) {

        try {

            System.out.println(msg);
            return scan.nextInt();

        } catch (Exception e) {

            System.out.println("Valor digitado inválido");

        }

        return 0;

    }
    
    static LinkedList ordenar( LinkedList<Integer> list ){
    
        if ( list.size() > 1 ) {
             
            List lowerList = new LinkedList();
            List higherList = new LinkedList();
            int centerIndex = list.size() / 2;
            Integer center = list.get(centerIndex);
            
            for (int i = 0; i < list.size(); i++) {

                if (list.get( i ) < center ) {
                    
                    lowerList.add( list.get( i ) );
                    
                } else {
                    
                    higherList.add( list.get( i ) );
                    
                }
                
            }
            
            LinkedList newList = new LinkedList();
            newList.addAll( lowerList );
            newList.add(center);
            newList.addAll( higherList );
            return ordenar( newList );
            
        }
        
        return list;
        
    }

}
