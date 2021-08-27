/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpr;

import javax.swing.JFileChooser;

/**
 *
 * @author aluno
 */
public class JanelaTabela extends javax.swing.JFrame {

    /**
     * Creates new form JanelaTabela
     */
    public JanelaTabela() {
        initComponents();
        
        ClienteTableModel modelo = new ClienteTableModel();
        tbCliente.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        tfIdade = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        btApagar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        lblNome.setText("Nome");

        lblIdade.setText("Idade");

        lblCpf.setText("CPF");

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btApagar.setText("Apagar");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCliente);

        btApagar1.setText("Arquivo");
        btApagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCpf))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btApagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btApagar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdade)
                    .addComponent(lblCpf)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionar)
                    .addComponent(btAlterar)
                    .addComponent(btApagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        String nome = tfNome.getText();
        int idade = Integer.valueOf(tfIdade.getText());
        String cpf = tfCpf.getText();
        
        // Cria um objeto de cliente a partir dos dados
        // do formulário
        Cliente c = new Cliente(nome, idade, cpf);
        
        // Recupera o modelo da tbCliente
        ClienteTableModel tbmCliente = (ClienteTableModel) tbCliente.getModel();
        
        tbmCliente.addLinha(c);
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
        // Busca a linha selecionada da tabela
        int linhaSelecionada = tbCliente.getSelectedRow();
        // Verifica se existe uma linha selecionada
        if (linhaSelecionada != -1) {
            // Recupera o modelo da tbCliente
            ClienteTableModel tbmCliente = (ClienteTableModel) tbCliente.getModel();
            tbmCliente.removeLinha(linhaSelecionada);
        }
    }//GEN-LAST:event_btApagarActionPerformed

    private void tbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteMouseClicked
        int linhaSelecionada = tbCliente.getSelectedRow();
        if (linhaSelecionada != -1) {
            // Recupera o modelo da tbCliente
            ClienteTableModel tbmCliente = (ClienteTableModel) tbCliente.getModel();
            Cliente c = tbmCliente.getCliente(linhaSelecionada);
            
            // Adicionar os dados do cliente no formulário
            tfNome.setText(c.getNome());
            tfIdade.setText(String.valueOf(c.getIdade()));
            tfCpf.setText(c.getCpf());
        }
    }//GEN-LAST:event_tbClienteMouseClicked

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int linhaSelecionada = tbCliente.getSelectedRow();
        
        if (linhaSelecionada != -1) {
            // Recupera o modelo da tbCliente
            ClienteTableModel tbmCliente = (ClienteTableModel) tbCliente.getModel();
            
            tbmCliente.setValueAt(tfNome.getText(), linhaSelecionada, 0);
            tbmCliente.setValueAt(tfIdade.getText(), linhaSelecionada, 1);
            tbmCliente.setValueAt(tfCpf.getText(), linhaSelecionada, 2);
            
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btApagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagar1ActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();
       
        fileChooser.setFileSelectionMode( JFileChooser.FILES_ONLY);
        int returnValue = fileChooser.showOpenDialog( this );
        
        if( returnValue == JFileChooser.APPROVE_OPTION ){
            
            ClienteTableModel modelCliente = (ClienteTableModel) tbCliente.getModel();
            modelCliente.getFileControler().setFilePath( fileChooser.getSelectedFile().getAbsolutePath() );
            modelCliente.getFileControler().readClientes();
            
        }
        
    }//GEN-LAST:event_btApagar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaTabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btApagar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}