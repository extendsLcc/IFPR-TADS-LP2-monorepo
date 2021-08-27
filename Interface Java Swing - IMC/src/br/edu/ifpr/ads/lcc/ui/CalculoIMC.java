/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr.ads.lcc.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class CalculoIMC extends JFrame {

    public CalculoIMC() throws HeadlessException {
    
        super();
        init();
        
    }
    

    private void init(){
    
        this.setTitle( "Calculo do IMC" );
        this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        this.setSize( 400, 400 );
        this.setLocationRelativeTo( null );
        this.getContentPane().setLayout(new FlowLayout() );
        
        //========
        
        JPanel panelPeso = new JPanel( new FlowLayout() );
        //panelPeso.setBorder( BorderFactory.createLineBorder(Color.BLACK, 2) );
        panelPeso.setPreferredSize(new Dimension(350, 30));
        
        JLabel lblPeso = new JLabel( "Peso" );
        JTextField tfPeso = new JTextField( 25 );
        
        panelPeso.add( lblPeso );
        panelPeso.add( tfPeso );
        
        this.getContentPane().add( panelPeso );
        
        //========
        
        JPanel panelAltura = new JPanel( new FlowLayout());
        //panelAltura.setBorder( BorderFactory.createLineBorder(Color.BLACK, 2) );
        panelAltura.setPreferredSize(new Dimension(350, 30));
        
        JLabel lblAltura = new JLabel( "Altura" );
        JTextField tfAltura = new JTextField( 25 );
        
        panelAltura.add( lblAltura );
        panelAltura.add( tfAltura );
        
        this.getContentPane().add( panelAltura );
        
        //========
        
        JPanel panelButton = new JPanel( new GridLayout( 1, 2, 5, 5 ));
        //panelButton.setBorder( BorderFactory.createLineBorder(Color.BLACK, 2) );
        panelButton.setPreferredSize(new Dimension(350, 25));
        
        JButton btnLimpar = new JButton( "Limpar" );
        JButton btnCalcular = new JButton( "Calcular" );
        
        panelButton.add( btnLimpar );
        panelButton.add( btnCalcular );
        
        this.getContentPane().add( panelButton );
        
        //========
        
        JPanel panelResult = new JPanel( new FlowLayout( FlowLayout.LEFT ));
        //panelResult.setBorder( BorderFactory.createLineBorder(Color.BLACK, 2) );
        panelResult.setPreferredSize(new Dimension(350, 20));
        
        JLabel lblResult = new JLabel( "Resultado" );
        
        panelResult.add( lblResult );
        
        this.getContentPane().add( panelResult );
        
        //========

        JPanel panelTextAreaResult = new JPanel( new FlowLayout( ));
        //panelTextAreaResult.setBorder( BorderFactory.createLineBorder(Color.BLACK, 2) );
        panelTextAreaResult.setPreferredSize(new Dimension(350, 180));
        
        JTextArea txtAreaResult = new JTextArea( 10, 35 );
        
        panelTextAreaResult.add( txtAreaResult );
        
        this.getContentPane().add( panelTextAreaResult );
        
        btnLimpar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tfAltura.setText( "" );
                tfPeso.setText( "" );
                
            }
        } );
        
        final JFrame thisFrame = this;
        btnCalcular.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ( tfAltura.getText().length() > 0 && tfPeso.getText().length() > 0 ) {
                    
                    double altura = Double.parseDouble( tfAltura.getText() );
                    double peso = Double.parseDouble( tfPeso.getText() );
                    
                    System.out.println("#" + peso );
                    System.out.println("$" + Math.pow( altura, 2 ) );
                    
                    txtAreaResult.setText( "\t" + ( peso / Math.pow( altura, 2 ) ) );
                    
                }else{
                
                    JOptionPane.showMessageDialog( thisFrame, "Preencha os campos de altura e peso" );
                    
                }
                
            }
        } );
        
        //pack();
        this.setVisible( true );
    
    }
    
}
