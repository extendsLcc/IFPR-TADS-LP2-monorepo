/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.pkg3bim.interfaces;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class GridLayoutMain {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Teste BorderLayout");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.getContentPane().setLayout(new GridLayout( 2, 3, 5, 5 ));
        janela.setSize(400, 400);
        
        JButton btn01 = new JButton( "01" );
        JButton btn02 = new JButton( "02" );
        JButton btn03 = new JButton( "03" );
        JButton btn04 = new JButton( "04" );
        JButton btn05 = new JButton( "05" );
        
        janela.add(btn01);
        janela.add(btn02);
        janela.add(btn03);
        janela.add(btn04);
        janela.add(btn05);
        
        janela.setVisible(true);

    }

}
