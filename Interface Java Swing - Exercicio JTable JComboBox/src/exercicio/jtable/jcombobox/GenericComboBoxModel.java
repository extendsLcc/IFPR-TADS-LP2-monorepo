/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.jtable.jcombobox;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class GenericComboBoxModel<T> extends AbstractListModel<T> implements ComboBoxModel<T>{
 
    private List<T> dados;
    private T itemSelecionado;
 
    public GenericComboBoxModel() {
        this.dados = new ArrayList<>();
    }
     
    public GenericComboBoxModel(List<T> listaDados) {
        this.dados = listaDados;
        if (this.dados.size() > 0) {
            itemSelecionado = dados.get(0);
        }
    }
     
    @Override
    public int getSize() {
        return this.dados.size();
    }
 
    @Override
    public T getElementAt(int index) {
        return this.dados.get(index);
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
       this.itemSelecionado = (T) anItem;
    }
 
    @Override
    public T getSelectedItem() {
        return this.itemSelecionado;
    }
     
    public void addElement(T element) {
        dados.add(element);
        fireIntervalAdded(this, getSize()-1, getSize() - 1);       
    }
     
    public void addListElements(List<T> elements) {
        int primeiraLinha = getSize();
        dados.addAll(elements);
        fireIntervalAdded(this, primeiraLinha, dados.size());
        itemSelecionado = null;
    }
     
    public void clear() {
        this.dados.clear();
        fireContentsChanged(this, 0, getSize() - 1);
    }
}