/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.prova;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author aluno
 */
public class GenericComboModel<T> extends AbstractListModel<T> implements ComboBoxModel<T> {

    private List<T> data;
    private T selectedItem;

    public GenericComboModel() {

        data = new ArrayList<>();

    }

    public GenericComboModel(List<T> data) {
        this.data = data;

        if (data.size() > 0) {

            selectedItem = data.get(0);

        }

    }

    @Override
    public int getSize() {

        return data.size();
        
    }

    @Override
    public T getElementAt(int index) {

        return data.get(index);

    }

    @Override
    public void setSelectedItem(Object anItem) {

        selectedItem = (T) anItem;

    }

    @Override
    public T getSelectedItem() {

        return selectedItem;
    }
    
    public void addElement( T el ){
    
        data.add(el);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        
    }

}
