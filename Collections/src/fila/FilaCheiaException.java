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
public class FilaCheiaException extends Exception{

    public FilaCheiaException() {
        
        super("Fila Cheia.");
        
    }

    public FilaCheiaException(String message) {
        super(message);
    }
    
}
