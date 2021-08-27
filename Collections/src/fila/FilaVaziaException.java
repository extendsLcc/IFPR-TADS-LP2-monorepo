/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author aluno
 */
public class FilaVaziaException extends Exception{

    public FilaVaziaException() {

        super("Fila Vazia.");

    }

    public FilaVaziaException(String message) {
        super(message);
    }
    
}
