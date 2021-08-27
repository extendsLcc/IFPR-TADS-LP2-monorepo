/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr;

import br.edu.ifpr.file.FileControl;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aluno
 */
public class ClienteTableModel extends AbstractTableModel{

    private final String[] colunas = {"Nome", "Idade", "CPF"};
    private List<Cliente> dados;
    private FileControl fileControler = new FileControl();
    
    public ClienteTableModel() {
        this.dados = fileControler.readClientes();
    }

    /**
     * Adiciona um objeto cliente na lista dados
     * e atualiza o JTable
     * 
     * @param c 
     */
    public void addLinha(Cliente c) {
        this.dados.add(c);
        // Avisa a JTable que houve mudança
        // na estrutura de dados (variável dados)
        fileControler.updateFile( dados );
        this.fireTableDataChanged();
    }
    
    /**
     * Retorna o cliente de uma determinada linha
     * 
     * @param linha
     * @return Cliente
     */
    public Cliente getCliente(int linha) {
        return this.dados.get(linha);
    }
    
    /**
     * Remove uma determinada linha da tabela
     * 
     * @param linha 
     */
    public void removeLinha(int linha) {
        this.dados.remove(linha);
        // Avisa a JTable que houve mudança
        // na estrutra de dados (variável dados)
        fileControler.updateFile( dados );
        this.fireTableDataChanged();
    }
    
    /**
     * Retorna o nome das colunas da tabela
     * 
     * @param coluna
     * @return String
     */
    @Override
    public String getColumnName(int coluna) {
        return this.colunas[coluna];
    }
    
    /**
     * Retorna a quantidade de elementos que 
     * existe na minha tabela;
     * @return int 
     */
    @Override
    public int getRowCount() {
        return dados.size();
    }

    /**
     * Retorna a quantidade de colunas que
     * existe na minha tabela
     * @return int
     */
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    /**
     * Retorna o valor de uma determinada célula da
     * tabela de acordo com a linha e a coluna
     * passada como parâmetro
     * 
     * @param linha
     * @param coluna
     * @return Object
     */
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna) {
            case 0: return dados.get(linha).getNome();
            case 1: return dados.get(linha).getIdade();
            case 2: return dados.get(linha).getCpf();
        }
        return null;
    }

    /**
     * Atualizar valor
     * 
     * @param valor
     * @param linha
     * @param coluna 
     */
    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
        switch(coluna) {
            case 0: dados.get(linha).setNome((String) valor);
                    break;
            case 1: dados.get(linha).setIdade(Integer.parseInt((String) valor));
                    break;
            case 2: dados.get(linha).setCpf((String) valor);
                    break;
        }
        
        fileControler.updateFile( dados );
        this.fireTableRowsUpdated(linha, linha);
    }

    public FileControl getFileControler(){
        return fileControler;
    }
    
    
}
