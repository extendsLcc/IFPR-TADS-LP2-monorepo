/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.ui;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class JanelaTeste extends JFrame{
    
    public JanelaTeste() throws HeadlessException{
    
        inicializarComponentes();
    
    }

    private void inicializarComponentes() {

        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        getContentPane().setLayout( new FlowLayout() );
        JButton bt = new JButton("Sair");
        bt.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                setVisible( false );
                
            }
        });
        add( bt );
        pack();
        setVisible( true );
        

    }
    
}
