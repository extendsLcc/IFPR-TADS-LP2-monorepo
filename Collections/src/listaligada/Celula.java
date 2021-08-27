/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada;

/**
 *
 * @author aluno
 */
public class Celula {
    
    private Object elemento;
    private Celula proxima;

    public Celula(Object element) {
        this.elemento = element;
        this.proxima = null;
    }

    public Object getElemento() {
        return elemento;
    }
    
    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula nextNode) {
        this.proxima = nextNode;
    }
    
}
