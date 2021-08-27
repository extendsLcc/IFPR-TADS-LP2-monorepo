/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios.exercicio7;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Loja {

    public static void main(String[] args) throws InterruptedException {

        int tempo;
        int fim = 2;//(int) randomBetween(50, 100);
        int atendimentosFinalizados = 0;
        
        int numeroAtendimentos = 0;
        int tempoEmEspera = 0;

        Atendente[] atendentes = {
            new Atendente("Atendente X"),
            new Atendente("Atendente Y"),
            new Atendente("Atendente Z"),
            new Atendente("Atendente W")

        };

        for (tempo = 0; atendimentosFinalizados != 4 || tempo < fim; tempo++) {

            atendimentosFinalizados = 0;
            System.out.println("------   Minuto " + tempo + " --------");

            if (tempo < fim) {

                for (int i = 0; i < randomBetween(3, 11); i++) {

                    Cliente cli = generateCliente();

                    // Identificar qual Atendente disponivel possui menor fila
                    Atendente atendenteMenorFila = atendentes[0];

                    for (Atendente atendentesDisponiveis : atendentes) {

                        if (atendentesDisponiveis.getFilaAtendimento().size()
                                < atendenteMenorFila.getFilaAtendimento().size()) {

                            atendenteMenorFila = atendentesDisponiveis;

                        }

                    }

                    atendenteMenorFila.adicionarListaEspera(cli, tempo);

                }

            }

            for (Atendente atendente : atendentes) {

                if (atendente.getFilaAtendimento().isEmpty()) {

                    atendimentosFinalizados++;
                    continue;

                }

                Cliente cli = (Cliente) atendente.getFilaAtendimento().getFirst();

                if (tempo >= cli.getSaida()) {

                    atendente.finalizarAtendimento();

                    if (!atendente.getFilaAtendimento().isEmpty()) {

                        numeroAtendimentos++;
                        tempoEmEspera += tempo - cli.getEntrada();
                        atendente.atenderCliente( tempo );

                    }else{
                    
                        atendimentosFinalizados++;
                    
                    }

                }

            }

            System.out.println("------------------------------------");
            Thread.sleep(1000);

        }

        for (Atendente atendente : atendentes) {
            
            System.out.println( atendente.getFilaAtendimento() );
            
        }
        
        System.out.println("Clientes atendidos: " + numeroAtendimentos + 
                "\n Média do tempo de espera por atendimento: " + ( tempoEmEspera / numeroAtendimentos ));
        
    }

    private static String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static Cliente generateCliente() {

        return new Cliente("Cliente " + character.charAt(random(character.length() - 1)));

    }

    public static int random(int max) {

        return randomBetween(0, max);

    }

    public static int randomBetween(int min, int max) {

        return new Random().nextInt((max - min) + 1) + min;

    }

}
