/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.jtable.jcombobox;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aluno
 */
public class ClienteTableModel extends AbstractTableModel{

    private final String[] COLUNAS = { "Nome", "Idade", "CPF", "Endereço" };
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
                return listClientes.get(rowIndex).getNome();
            case 1:
                return listClientes.get(rowIndex).getIdade();
            case 2:
                return listClientes.get(rowIndex).getCpf();
            case 3:
                return listClientes.get(rowIndex).getEndereco();
            default:
                return null;

        }
        
    }
    
    public void setValueAt(Object newValue, int rowIndex, int columnIndex ) {
        
        switch (columnIndex) {
            
            case 0:
                listClientes.get(rowIndex).setNome( (String) newValue );
                break;
            case 1:
                listClientes.get(rowIndex).setIdade(
                        Integer.parseInt( (String) newValue ) );
                break;
            case 2:
                listClientes.get(rowIndex).setCpf( (String) newValue );
                break;
            case 3:
                listClientes.get(rowIndex).setEndereco((String) newValue );
                break;

        }
        
        this.fireTableRowsUpdated( columnIndex, rowIndex );
        
    }
    
}
