/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author aluno
 */
public interface Lista {
 
    public void addInit( Object element );
    public void addEnd( Object element );
    public void addIndex( Object element, int index );
    public boolean remove( Object element );
    public Object find( int index );
    public boolean hasElement( Object whichElement );
    public boolean isEmpty();
}
