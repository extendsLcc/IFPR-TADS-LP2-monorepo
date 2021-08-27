/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class JanelaChat extends JFrame{

    public JanelaChat() {

        iniciarComponentes();
        
    }

    private void iniciarComponentes() {

        setTitle( "Char Frame" );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setSize( 600 , 500 );
        getContentPane().setLayout( new BorderLayout() );
        
        JMenuBar barraMenu = new JMenuBar();
        setJMenuBar( barraMenu );
        
        JMenu menuFile = new JMenu( "File" );
        barraMenu.add( menuFile );
        
        JMenu menuHelp = new JMenu( "Help" );
        barraMenu.add( menuHelp );
        
        JMenuItem itemMenuOpen = new JMenuItem("Open");
        JMenuItem itemMenuSave = new JMenuItem("Save as");
        
        menuFile.add( itemMenuOpen );
        menuFile.add( itemMenuSave );
        
        JTextArea taMensagens = new JTextArea();
        add( taMensagens, BorderLayout.CENTER );
        taMensagens.setEnabled( false );
        
        JPanel painelSul = new JPanel();
        JLabel lbText = new JLabel( "Enter text" );
        JTextField tfMensagem = new JTextField(15);
        JButton btnSend = new JButton( "Send" );
        JButton btnReset = new JButton( "Reset" );
        
        painelSul.add( lbText );
        painelSul.add(tfMensagem);
        painelSul.add(btnSend);
        painelSul.add(btnReset);
        
        add( painelSul, BorderLayout.SOUTH );
        
    }

    public static void main(String[] args) {

        JanelaChat chat = new JanelaChat();
        chat.setVisible( true );

    }
    
}
