/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tela;

import javax.swing.ImageIcon;

/**
 *
 * @author Diorgenes
 */
public class TelaPadrao extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public TelaPadrao() {
        this.setUndecorated(true);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelFavicon = new javax.swing.JLabel();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonMaximizar = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MaiaChess");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(1024, 678));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelFavicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/favicon.gif"))); // NOI18N
        jLabelFavicon.setToolTipText("");

        jButtonMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/min.png"))); // NOI18N
        jButtonMinimizar.setBorder(null);
        jButtonMinimizar.setBorderPainted(false);
        jButtonMinimizar.setContentAreaFilled(false);
        jButtonMinimizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonMinimizarFocusLost(evt);
            }
        });
        jButtonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonMinimizarMouseReleased(evt);
            }
        });
        jButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarActionPerformed(evt);
            }
        });

        jButtonMaximizar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/max.png"))); // NOI18N
        jButtonMaximizar.setBorder(null);
        jButtonMaximizar.setBorderPainted(false);
        jButtonMaximizar.setContentAreaFilled(false);
        jButtonMaximizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonMaximizarFocusLost(evt);
            }
        });
        jButtonMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMaximizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonMaximizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonMaximizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMaximizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonMaximizarMouseReleased(evt);
            }
        });
        jButtonMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaximizarActionPerformed(evt);
            }
        });

        jButtonClose.setBackground(new java.awt.Color(255, 255, 255));
        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/close.png"))); // NOI18N
        jButtonClose.setBorder(null);
        jButtonClose.setBorderPainted(false);
        jButtonClose.setContentAreaFilled(false);
        jButtonClose.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonCloseFocusLost(evt);
            }
        });
        jButtonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonCloseMouseReleased(evt);
            }
        });
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabelFavicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 762, Short.MAX_VALUE)
                .addComponent(jButtonMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jButtonMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabelFavicon))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 605, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCloseMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCloseMouseReleased

    private void jButtonCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCloseMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCloseMousePressed

    private void jButtonCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCloseMouseExited
        // TODO add your handling code here:
        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/close.png"))); // NOI18N
    }//GEN-LAST:event_jButtonCloseMouseExited

    private void jButtonCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCloseMouseEntered
        // TODO add your handling code here:
        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/close-hover.png"))); // NOI18N
    }//GEN-LAST:event_jButtonCloseMouseEntered

    private void jButtonMaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaximizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMaximizarActionPerformed

    private void jButtonMaximizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMaximizarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMaximizarMouseReleased

    private void jButtonMaximizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMaximizarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMaximizarMousePressed

    private void jButtonMaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMaximizarMouseExited
        // TODO add your handling code here:
        jButtonMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/max.png"))); // NOI18N
    }//GEN-LAST:event_jButtonMaximizarMouseExited

    private void jButtonMaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMaximizarMouseEntered
        // TODO add your handling code here:
        jButtonMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/max-hover.png"))); // NOI18N
    }//GEN-LAST:event_jButtonMaximizarMouseEntered

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonMinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMinimizarMouseReleased

    private void jButtonMinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMinimizarMousePressed

    private void jButtonMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseExited
        // TODO add your handling code here:
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/min.png"))); // NOI18N
    }//GEN-LAST:event_jButtonMinimizarMouseExited

    private void jButtonMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseEntered
        // TODO add your handling code here:
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/min-hover.png"))); // NOI18N
    }//GEN-LAST:event_jButtonMinimizarMouseEntered

    private void jButtonMinimizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonMinimizarFocusLost
        // TODO add your handling code here:
        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/min.png"))); // NOI18N
    }//GEN-LAST:event_jButtonMinimizarFocusLost

    private void jButtonMaximizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonMaximizarFocusLost
        // TODO add your handling code here:
        jButtonMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/max.png"))); // NOI18N
    }//GEN-LAST:event_jButtonMaximizarFocusLost

    private void jButtonCloseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonCloseFocusLost
        // TODO add your handling code here:
        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/buttons/close.png"))); // NOI18N
    }//GEN-LAST:event_jButtonCloseFocusLost

    private void jButtonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarMouseClicked

    private void jButtonMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMaximizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButtonMaximizarMouseClicked

    private void jButtonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCloseMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPadrao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonMaximizar;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JLabel jLabelFavicon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
