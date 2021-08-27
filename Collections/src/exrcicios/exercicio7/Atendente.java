/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrcicios.exercicio7;

import exrcicios.exercicio6.Fila;
import exrcicios.exercicio6.FilaDinamica;
import fila.FilaVaziaException;

/**
 *
 * @author aluno
 */
public class Atendente {

    private Fila filaAtendimento;
    private String nome;
    private int numeroAtendimentos;

    public Atendente(String nome) {

        this.filaAtendimento = new FilaDinamica();
        this.nome = nome;
        this.numeroAtendimentos = 0;

    }

    public Fila getFilaAtendimento() {

        return filaAtendimento;

    }

    public String getNome() {

        return nome;

    }

    public void adicionarListaEspera(Cliente cli, int chegada) {

        filaAtendimento.add(cli);
        cli.setEntrada(chegada);
        //cli.setChegada(chegada);
        System.out.println( cli.getNome()
                + " adicionado a fila do " + this.getNome());
        System.out.println(  this.getNome() + " possui "
                + this.getFilaAtendimento().size() + " clientes na fila");

    }

    public void atenderCliente( int entrada ) {

        Cliente cli = (Cliente) this.getFilaAtendimento().getFirst();
        int chegada = cli.getEntrada();
        cli.setEntrada(entrada);
        numeroAtendimentos++;
        System.out.println( cli.getNome() + " esta sendo atendido pelo " 
                + this.getNome() + " após " + ( cli.getEntrada() - chegada ) +" minutos de espera");

    }

    public void finalizarAtendimento() {

        try {
            Cliente cli = (Cliente) filaAtendimento.remove();
            System.out.println( this.getNome()
                    + " finalizou o atendimento do " + cli.getNome()
                    + " , horario de saida: " + cli.getSaida());

        } catch (FilaVaziaException ex) {

            System.out.println("Não existem clientes na fila de atendimento");

        }

    }

    @Override
    public String toString() {
        
        String str = "";
        
        for (int i = 0; i < getFilaAtendimento().size(); i++) {

            str += getFilaAtendimento().get( i ) + ", ";
            
        }
        
        return "Atendente{" + "filaAtendimento=[" + str + "], nome=" + nome 
                + ", numeroAtendimentos=" + numeroAtendimentos + '}';
    }

}
