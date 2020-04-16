/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi.visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalhoJanelaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemMenuCadastroEmpresa = new javax.swing.JMenuItem();
        itemMenuCadastroFornecedor = new javax.swing.JMenuItem();
        itemMenuCadastroProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemMenuCadastroEntrada = new javax.swing.JMenuItem();
        itemMenuCadastroSaida = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemMenuCadastroUsuario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemMenuCadastroVersao = new javax.swing.JMenuItem();
        itemMenuCadastroAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaTrabalhoJanelaPrincipal.setBackground(new java.awt.Color(0, 102, 153));
        areaTrabalhoJanelaPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout areaTrabalhoJanelaPrincipalLayout = new javax.swing.GroupLayout(areaTrabalhoJanelaPrincipal);
        areaTrabalhoJanelaPrincipal.setLayout(areaTrabalhoJanelaPrincipalLayout);
        areaTrabalhoJanelaPrincipalLayout.setHorizontalGroup(
            areaTrabalhoJanelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1273, Short.MAX_VALUE)
        );
        areaTrabalhoJanelaPrincipalLayout.setVerticalGroup(
            areaTrabalhoJanelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 255), null, null));

        jMenu1.setForeground(new java.awt.Color(255, 0, 0));
        jMenu1.setText("Cadastro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        itemMenuCadastroEmpresa.setBackground(new java.awt.Color(204, 0, 0));
        itemMenuCadastroEmpresa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemMenuCadastroEmpresa.setForeground(new java.awt.Color(255, 0, 0));
        itemMenuCadastroEmpresa.setText("Empresa");
        itemMenuCadastroEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastroEmpresaActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuCadastroEmpresa);

        itemMenuCadastroFornecedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemMenuCadastroFornecedor.setForeground(new java.awt.Color(255, 0, 0));
        itemMenuCadastroFornecedor.setText("Fornecedor");
        itemMenuCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastroFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuCadastroFornecedor);

        itemMenuCadastroProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemMenuCadastroProduto.setForeground(new java.awt.Color(255, 0, 0));
        itemMenuCadastroProduto.setText("Produto");
        itemMenuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastroProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuCadastroProduto);

        jMenuBar1.add(jMenu1);
        jMenu1.getAccessibleContext().setAccessibleDescription("");

        jMenu2.setForeground(new java.awt.Color(102, 102, 255));
        jMenu2.setText("Movimentações");

        itemMenuCadastroEntrada.setBackground(new java.awt.Color(102, 102, 255));
        itemMenuCadastroEntrada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemMenuCadastroEntrada.setForeground(new java.awt.Color(102, 102, 255));
        itemMenuCadastroEntrada.setText("Entrada");
        itemMenuCadastroEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastroEntradaActionPerformed(evt);
            }
        });
        jMenu2.add(itemMenuCadastroEntrada);

        itemMenuCadastroSaida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemMenuCadastroSaida.setForeground(new java.awt.Color(102, 102, 255));
        itemMenuCadastroSaida.setText("Saida");
        itemMenuCadastroSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastroSaidaActionPerformed(evt);
            }
        });
        jMenu2.add(itemMenuCadastroSaida);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(204, 0, 204));
        jMenu3.setText("Configurações");

        itemMenuCadastroUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemMenuCadastroUsuario.setForeground(new java.awt.Color(153, 0, 153));
        itemMenuCadastroUsuario.setText("Cadastro de Usuário");
        itemMenuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastroUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(itemMenuCadastroUsuario);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(51, 204, 0));
        jMenu4.setText("Sobre");

        itemMenuCadastroVersao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemMenuCadastroVersao.setForeground(new java.awt.Color(51, 204, 0));
        itemMenuCadastroVersao.setText("Versão");
        itemMenuCadastroVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastroVersaoActionPerformed(evt);
            }
        });
        jMenu4.add(itemMenuCadastroVersao);

        itemMenuCadastroAjuda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemMenuCadastroAjuda.setForeground(new java.awt.Color(51, 204, 0));
        itemMenuCadastroAjuda.setText("Ajuda");
        itemMenuCadastroAjuda.setAutoscrolls(true);
        itemMenuCadastroAjuda.setBorderPainted(true);
        itemMenuCadastroAjuda.setDoubleBuffered(true);
        itemMenuCadastroAjuda.setFocusCycleRoot(true);
        itemMenuCadastroAjuda.setFocusPainted(true);
        itemMenuCadastroAjuda.setFocusTraversalPolicyProvider(true);
        itemMenuCadastroAjuda.setFocusable(true);
        itemMenuCadastroAjuda.setHideActionText(true);
        itemMenuCadastroAjuda.setInheritsPopupMenu(true);
        itemMenuCadastroAjuda.setOpaque(true);
        itemMenuCadastroAjuda.setRolloverEnabled(true);
        itemMenuCadastroAjuda.setSelected(true);
        itemMenuCadastroAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastroAjudaActionPerformed(evt);
            }
        });
        jMenu4.add(itemMenuCadastroAjuda);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalhoJanelaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalhoJanelaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuCadastroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastroEmpresaActionPerformed
        // TODO add your handling code here:
        TelaCadastroEmpresa telaCadastroEmpresa = new TelaCadastroEmpresa();
        areaTrabalhoJanelaPrincipal.add(telaCadastroEmpresa);
        telaCadastroEmpresa.setVisible(true);
    }//GEN-LAST:event_itemMenuCadastroEmpresaActionPerformed

    private void itemMenuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastroProdutoActionPerformed
        // TODO add your handling code here:
        TelaCadastroProduto telaCadastroProduto;
        try {
            telaCadastroProduto = new TelaCadastroProduto();
            areaTrabalhoJanelaPrincipal.add(telaCadastroProduto);
            telaCadastroProduto.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_itemMenuCadastroProdutoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void itemMenuCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastroFornecedorActionPerformed
        // TODO add your handling code here:
        TelaCadastroFornecedor telaCadastroFornecedor = new TelaCadastroFornecedor();
        areaTrabalhoJanelaPrincipal.add(telaCadastroFornecedor);
        telaCadastroFornecedor.setVisible(true);
    }//GEN-LAST:event_itemMenuCadastroFornecedorActionPerformed

    private void itemMenuCadastroSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastroSaidaActionPerformed
        // TODO add your handling code here:
        TelaCadastroSaida telaCadastroSaida = new TelaCadastroSaida();
        areaTrabalhoJanelaPrincipal.add(telaCadastroSaida);
        telaCadastroSaida.setVisible(true);        
    }//GEN-LAST:event_itemMenuCadastroSaidaActionPerformed

    private void itemMenuCadastroEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastroEntradaActionPerformed
        // TODO add your handling code here:
        TelaCadastroEntrada telaCadastroEntrada = new TelaCadastroEntrada();
        areaTrabalhoJanelaPrincipal.add(telaCadastroEntrada);
        telaCadastroEntrada.setVisible(true);
    }//GEN-LAST:event_itemMenuCadastroEntradaActionPerformed

    private void itemMenuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastroUsuarioActionPerformed
        // TODO add your handling code here:
        TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
        areaTrabalhoJanelaPrincipal.add(telaCadastroUsuario);
        telaCadastroUsuario.setVisible(true);
    }//GEN-LAST:event_itemMenuCadastroUsuarioActionPerformed

    private void itemMenuCadastroVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastroVersaoActionPerformed
        // TODO add your handling code here:
        TelaCadastroVersao telaCadastroVersao = new TelaCadastroVersao();
        areaTrabalhoJanelaPrincipal.add(telaCadastroVersao);
        telaCadastroVersao.setVisible(true);
    }//GEN-LAST:event_itemMenuCadastroVersaoActionPerformed

    private void itemMenuCadastroAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastroAjudaActionPerformed
        // TODO add your handling code here:
        TelaCadastroAjuda telaCadastroAjuda = new TelaCadastroAjuda();
        areaTrabalhoJanelaPrincipal.add(telaCadastroAjuda);
        telaCadastroAjuda.setVisible(true);
    }//GEN-LAST:event_itemMenuCadastroAjudaActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalhoJanelaPrincipal;
    private javax.swing.JMenuItem itemMenuCadastroAjuda;
    private javax.swing.JMenuItem itemMenuCadastroEmpresa;
    private javax.swing.JMenuItem itemMenuCadastroEntrada;
    private javax.swing.JMenuItem itemMenuCadastroFornecedor;
    private javax.swing.JMenuItem itemMenuCadastroProduto;
    private javax.swing.JMenuItem itemMenuCadastroSaida;
    private javax.swing.JMenuItem itemMenuCadastroUsuario;
    private javax.swing.JMenuItem itemMenuCadastroVersao;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}