/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.pkg3bim.interfaces;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class FlowLayoutMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        JFrame janela = new JFrame("Carregador de arquivo.");
        
        janela.setSize( 500, 300);
        janela.setLayout( new FlowLayout() );
        
        /*FlowLayout flowLayout = new FlowLayout();
        painel.setLayout( flowLayout );*/
        JPanel painelNome = new JPanel();
        JLabel lbNome = new JLabel("Nome");
        JTextField tfNome = new JTextField( 15 );
        painelNome.add( lbNome );
        painelNome.add( tfNome );
        janela.add(painelNome);
        
        JPanel painelEndereço = new JPanel();
        JLabel lbEndereço = new JLabel("Endereço");
        JTextField tfEndereço = new JTextField( 15 );
        painelNome.add( lbEndereço );
        painelNome.add( tfEndereço );
        janela.add(painelEndereço);
        
        JPanel painelCidade = new JPanel();
        JLabel lbCidade = new JLabel("Cidade");
        JComboBox cbCidade = new JComboBox( new String[]{
            "Umuarama do leste",
            "Nova York",
            "Londres"
        });
        painelNome.add( lbCidade );
        painelNome.add( cbCidade );
        janela.add(painelCidade);
        
        JButton btnCadastrar = new JButton( "Cadastrar" );
        janela.add(btnCadastrar);
        
        JButton btnLimpar = new JButton( "Limpar" );
        janela.add(btnLimpar);
        
        
        /*
        JButton botao01 = new JButton( "Botão 1" ),
                botao02 = new JButton( "Botão 2" ),
                botao03 = new JButton( "Botão 3" );
        
        painel.add(botao01);
        painel.add(botao02);
        painel.add(botao03);
        */
        
        janela.pack();
        janela.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        janela.setVisible(true);
        
    }
    
}
