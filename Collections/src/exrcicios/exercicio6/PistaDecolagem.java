/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios.exercicio6;

import fila.FilaVaziaException;

/**
 *
 * @author aluno
 */
public class PistaDecolagem {

    Fila filaDecolagem = new FilaDinamica();

    // A)
    public void listarAvioesEmEspera() {

        System.out.println("Numero de aviões em espera: " + filaDecolagem.size());

    }

    // B)
    public void autorizarVoo() {

        try {

            System.out.println(filaDecolagem.remove() + " Foi autorizado para decolagem");

        } catch (FilaVaziaException ex) {

            System.out.println("Não existe nenhum avião na fila de decolagem!");

        }

    }

    // C)
    public void adicionarAviao(Aviao aviao) {

        filaDecolagem.add(aviao);
        System.out.println(aviao + " adicionado a fila");

    }

    // D)
    public void listarFilaDecolagem() {

        for (int i = 0; i < filaDecolagem.size(); i++) {

            System.out.println("Posição na fila: " + (i + 1) + " caracteristicas: " + filaDecolagem.get(i));

        }

    }

    public void listarPrimeiroFila() {

        if (!filaDecolagem.isEmpty()) {

            System.out.println(filaDecolagem.getFirst());

        }else{
        
            System.out.println("Não existe nenhum avião na fila de decolagem!");
        
        }

    }

}
