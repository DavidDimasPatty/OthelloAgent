/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tac;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class TacAgentGUIImpl extends javax.swing.JFrame implements TacAgentGUI{
    private TacAgent myAgent;   

    /**
     * Creates new form TacAgentGUIImpl
     */
    public TacAgentGUIImpl() {
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

        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        B23 = new javax.swing.JButton();
        B32 = new javax.swing.JButton();
        B33 = new javax.swing.JButton();
        B31 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        B11.setBackground(new java.awt.Color(255, 255, 255));
        B11.setForeground(new java.awt.Color(255, 255, 255));
        B11.setEnabled(false);
        B11.setName("B11"); // NOI18N
        B11.setPreferredSize(new java.awt.Dimension(33, 33));
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        B12.setBackground(java.awt.Color.white);
        B12.setForeground(java.awt.Color.white);
        B12.setEnabled(false);
        B12.setName("B12"); // NOI18N
        B12.setPreferredSize(new java.awt.Dimension(33, 33));
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });

        B13.setBackground(java.awt.Color.white);
        B13.setForeground(java.awt.Color.white);
        B13.setEnabled(false);
        B13.setName("B13"); // NOI18N
        B13.setPreferredSize(new java.awt.Dimension(33, 33));
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });

        B21.setBackground(java.awt.Color.white);
        B21.setForeground(java.awt.Color.white);
        B21.setEnabled(false);
        B21.setName("B21"); // NOI18N
        B21.setPreferredSize(new java.awt.Dimension(33, 33));
        B21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B21ActionPerformed(evt);
            }
        });

        B22.setBackground(java.awt.Color.white);
        B22.setForeground(java.awt.Color.white);
        B22.setEnabled(false);
        B22.setName("B22"); // NOI18N
        B22.setPreferredSize(new java.awt.Dimension(33, 33));
        B22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B22ActionPerformed(evt);
            }
        });

        B23.setBackground(java.awt.Color.white);
        B23.setForeground(java.awt.Color.white);
        B23.setEnabled(false);
        B23.setName("B23"); // NOI18N
        B23.setPreferredSize(new java.awt.Dimension(33, 33));
        B23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B23ActionPerformed(evt);
            }
        });

        B32.setBackground(java.awt.Color.white);
        B32.setForeground(java.awt.Color.white);
        B32.setEnabled(false);
        B32.setName("B32"); // NOI18N
        B32.setPreferredSize(new java.awt.Dimension(33, 33));
        B32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B32ActionPerformed(evt);
            }
        });

        B33.setBackground(java.awt.Color.white);
        B33.setForeground(java.awt.Color.white);
        B33.setEnabled(false);
        B33.setName("B33"); // NOI18N
        B33.setPreferredSize(new java.awt.Dimension(33, 33));
        B33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B33ActionPerformed(evt);
            }
        });

        B31.setBackground(java.awt.Color.white);
        B31.setForeground(java.awt.Color.white);
        B31.setEnabled(false);
        B31.setName("B31"); // NOI18N
        B31.setPreferredSize(new java.awt.Dimension(33, 33));
        B31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(B31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        // TODO add your handling code here:
        btnActionPerformed(B11);
    }//GEN-LAST:event_B11ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        // TODO add your handling code here:
        btnActionPerformed(B12);
    }//GEN-LAST:event_B12ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
        // TODO add your handling code here:
        btnActionPerformed(B13);

    }//GEN-LAST:event_B13ActionPerformed

    private void B21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B21ActionPerformed
        // TODO add your handling code here:
        btnActionPerformed(B21);
    }//GEN-LAST:event_B21ActionPerformed

    private void B22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B22ActionPerformed
        // TODO add your handling code here:
        btnActionPerformed(B22);
    }//GEN-LAST:event_B22ActionPerformed

    private void B23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B23ActionPerformed
        // TODO add your handling code here:
        btnActionPerformed(B23);
    }//GEN-LAST:event_B23ActionPerformed

    private void B31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B31ActionPerformed
        // TODO add your handling code here:
        btnActionPerformed(B31);
    }//GEN-LAST:event_B31ActionPerformed

    private void B32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B32ActionPerformed
        // TODO add your handling code here:
        btnActionPerformed(B32);
    }//GEN-LAST:event_B32ActionPerformed

    private void B33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B33ActionPerformed
        // TODO add your handling code here:
        btnActionPerformed(B33);
    }//GEN-LAST:event_B33ActionPerformed

    private void btnActionPerformed(javax.swing.JButton btn){
        if (btn.isEnabled() && myAgent.isTurn()) {
            btn.setBackground(Color.green);
            deactivateButton();
            myAgent.updateBoard(btn.getName());
            notifyUser(btn.getName()+" is pressed.");
        } 
    }
    
    public void activateButton(){
        for (int i=0; i<3; i++) {
            for (int j=0; j<3;j++) {
                if (myAgent.tictactoe[i][j] == -1) {
                    getButton(i*3+j).setEnabled(true);
                }
            }
        }
    }
    
    public void deactivateButton(){
        for (int i=0; i<3; i++) {
            for (int j=0; j<3;j++) {
                getButton(i*3+j).setEnabled(false);
            }
        }
    }
    
    public javax.swing.JButton getButton(int btn){
        javax.swing.JButton b = null;
        switch (btn) {
            case 0: b = B11; break;
            case 1: b = B12; break;    
            case 2: b = B13; break;
            case 3: b = B21; break;    
            case 4: b = B22; break;
            case 5: b = B23; break;    
            case 6: b = B31; break;
            case 7: b = B32; break;    
            case 8: b = B33; break;
        }
        return b;
    }    
    
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
            java.util.logging.Logger.getLogger(TacAgentGUIImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TacAgentGUIImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TacAgentGUIImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TacAgentGUIImpl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TacAgentGUIImpl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B13;
    private javax.swing.JButton B21;
    private javax.swing.JButton B22;
    private javax.swing.JButton B23;
    private javax.swing.JButton B31;
    private javax.swing.JButton B32;
    private javax.swing.JButton B33;
    // End of variables declaration//GEN-END:variables
    public void setAgent(TacAgent a) {   
        myAgent = a;   
        setTitle(myAgent.getName());   
    }   
    
    public void notifyUser(String message) {  
        System.out.println("Tac : "+message);
        //logTA.append(message+"\n");   
    } 
        
}

