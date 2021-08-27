/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisão.prova.lp2.pkg3bim;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author LCC
 */
public class LivroTableModel extends AbstractTableModel{
    
    private final String[] COLUMNS = { "Código", "Data Cadastro", "Título", "Quantidade" };
    private List<Livro> livros = new ArrayList<>();

    public LivroTableModel( List<Livro> livros ){
        
        this.livros.addAll( livros );
        
    }
    
    public void addLivro( Livro livro ){
    
        livros.add( livro );
        
        fireTableDataChanged();
        
    }
    
    public Livro  getLivro( int row ){
    
        return livros.get( row );
        
    }
    
    public void removeLivro( Livro livro ){
    
        livros.add( livro );
        
        fireTableDataChanged();
        
    }

    @Override
    public String getColumnName( int column ){
        return COLUMNS[column];
    }

    
    
    @Override
    public int getRowCount(){

        return livros.size();

    }

    @Override
    public int getColumnCount(){

        return COLUMNS.length;

    }

    @Override
    public Object getValueAt( int rowIndex, int columnIndex ){
        
        switch(columnIndex) {
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
    
}
