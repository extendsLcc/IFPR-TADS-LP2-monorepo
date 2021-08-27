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
public interface Lista {
 
    public void adicionaInicio( Object element );
    public void adicionaFim( Object element );
    public void adicionaIndice( Object element, int index );
    public boolean remover( Object element );
    public boolean remover( int index );
    public Object encontrar( int index );
    public boolean possuiElemento( Object whichElement );
    public boolean estaVazia();
    public void limparLista();
    public int tamanho();
}
