/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.prova;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aluno
 */
public class LivroTableModel extends AbstractTableModel{
    
    private final String[] columns = { "Código", "Data Cadastro", "Título", "Quantidade" };
    private List<Livro> livros;
    private FileController fileControler = new FileController();

    public LivroTableModel() {
        
        this.livros = fileControler.readBooks();
        
    }

    public void addRow( Livro whichLivro ){
    
        livros.add(whichLivro);
        fileControler.updateFile( livros ); 
        fireTableDataChanged();
        
    }
    
    public void removeRow( int whichRow ){
    
        livros.remove( whichRow );
        fileControler.updateFile( livros );
        fireTableDataChanged();
        
    }
    
    @Override
    public int getRowCount() {
        return livros.size();
    }

    @Override
    public int getColumnCount() {

        return columns.length;
        
    }

    public String getColumnName( int whichColumn ){
    
        return columns[whichColumn];
        
    }
    
    public Livro getItemAt( int rowIndex ){
    
        return livros.get(rowIndex);
    
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return livros.get(rowIndex).getCodigo();
            case 1:
                    return livros.get(rowIndex).getDataCadastro();
            case 2:
                return livros.get(rowIndex).getTitulo();
            case 3:
                return livros.get(rowIndex).getQuantidade();
        }
        
        return null;

    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                livros.get(rowIndex).setCodigo((String) value);
                break;
            case 1:
                livros.get(rowIndex).setDataCadastro((String) value);
                break;
            case 2:
                livros.get(rowIndex).setTitulo((String) value);
                break;
            case 3:
                livros.get(rowIndex).setQuantidade((int) value);
                break;
        }
        
        fileControler.updateFile(livros);
        fireTableDataChanged();
        
    }
    
}
