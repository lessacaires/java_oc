/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.telas;

import java.sql.*;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menuCad = new javax.swing.JMenu();
        menCadCli = new javax.swing.JMenuItem();
        menCadOs = new javax.swing.JMenuItem();
        menCadUsu = new javax.swing.JMenuItem();
        menRel = new javax.swing.JMenu();
        menRelServ = new javax.swing.JMenuItem();
        menAju = new javax.swing.JMenu();
        menAjuSob = new javax.swing.JMenuItem();
        menOpc = new javax.swing.JMenu();
        menOpcSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X - Tela para o controle de os");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/x.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblData.setText("Data");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome do usuário logado:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Data do sistema:");

        menuCad.setText("Cadastro");

        menCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menCadCli.setText("Cliente");
        menCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadCliActionPerformed(evt);
            }
        });
        menuCad.add(menCadCli);

        menCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menCadOs.setText("OS");
        menuCad.add(menCadOs);

        menCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menCadUsu.setText("Usuários");
        menCadUsu.setEnabled(false);
        menCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUsuActionPerformed(evt);
            }
        });
        menuCad.add(menCadUsu);

        Menu.add(menuCad);

        menRel.setText("Relatório");
        menRel.setEnabled(false);

        menRelServ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menRelServ.setText("Serviços");
        menRel.add(menRelServ);

        Menu.add(menRel);

        menAju.setText("Ajuda");

        menAjuSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        menAjuSob.setText("Sobre");
        menAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAjuSobActionPerformed(evt);
            }
        });
        menAju.add(menAjuSob);

        Menu.add(menAju);

        menOpc.setText("Opções");

        menOpcSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menOpcSair.setText("Sair");
        menOpcSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpcSairActionPerformed(evt);
            }
        });
        menOpc.add(menOpcSair);

        Menu.add(menOpc);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblData))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(desktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(947, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // as linhas abaixo substituem a label lblData pela data atual do
        //sistema ao inicias o form
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
        
        
    }//GEN-LAST:event_formWindowActivated

    private void menOpcSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcSairActionPerformed
        // exibe uma caixa de dialogo
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menOpcSairActionPerformed

    private void menAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAjuSobActionPerformed
        // Chamando a tela sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
        desktop.add(sobre);
    }//GEN-LAST:event_menAjuSobActionPerformed

    private void menCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUsuActionPerformed
        // as linhas abaixo vão abrir o form TelaUsuario dentro do DesktopPane
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_menCadUsuActionPerformed

    private void menCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadCliActionPerformed
        // As linhas abaixo chama a tela de cliente
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_menCadCliActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menAju;
    private javax.swing.JMenuItem menAjuSob;
    private javax.swing.JMenuItem menCadCli;
    private javax.swing.JMenuItem menCadOs;
    public static javax.swing.JMenuItem menCadUsu;
    private javax.swing.JMenu menOpc;
    private javax.swing.JMenuItem menOpcSair;
    public static javax.swing.JMenu menRel;
    private javax.swing.JMenuItem menRelServ;
    private javax.swing.JMenu menuCad;
    // End of variables declaration//GEN-END:variables
}
