/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3bim.pkginterface.pratica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aluno
 */
public class ClienteTableModel extends AbstractTableModel{

    private final String[] COLUNAS = { "ID", "Nome", "E-mail" };
    private List<Cliente> listClientes = new ArrayList<>();

    public void addRow(Cliente client ) {
        
        this.listClientes.add( client );
        this.fireTableDataChanged();

    }
    
    public void removeRow( int rowIndex ){
    
        listClientes.remove( rowIndex );
        this.fireTableDataChanged();
        
    }
    
    public Cliente getCliente( int row ){
    
        return listClientes.get( row );
    
    }

    @Override
    public String getColumnName(int column) {

        return COLUNAS[column];
        
    }
    
    @Override
    public int getRowCount() {

        return this.listClientes.size();
        
    }

    @Override
    public int getColumnCount() {
        
        return COLUNAS.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch (columnIndex) {
            
            case 0:
                return listClientes.get(rowIndex).getId();
            case 1:
                return listClientes.get(rowIndex).getNome();
            case 2:
                return listClientes.get(rowIndex).getEmail();
            default:
                return null;

        }
        
    }
    
    public void setValueAt(Object newValue, int rowIndex, int columnIndex ) {
        
        switch (columnIndex) {
            
            case 0:
                listClientes.get(rowIndex).setId((String) newValue );
                break;
            case 1:
                listClientes.get(rowIndex).setNome( (String) newValue);
                break;
            case 2:
                listClientes.get(rowIndex).setTelResidencial((String) newValue );
                break;
            case 3:
                listClientes.get(rowIndex).setTelComercial((String) newValue );
                break;
            case 4:
                listClientes.get(rowIndex).setTelCelular((String) newValue );
                break;
            case 5:
                listClientes.get(rowIndex).setEmail((String) newValue );
                break;

        }
        
        this.fireTableRowsUpdated( columnIndex, rowIndex );
        
    }
    
}
