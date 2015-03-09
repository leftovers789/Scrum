/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

/**
 *
 * @author Sian Paul Lasaga
 */
public class OperatorMainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form OperatorMainFrame
     */
    public OperatorMainMenuFrame() {
        initComponents();
        addFixedTripScheduleButton.setText("<html>Add Fixed Trip<br/> Schedule</html>");
        addSingleTripSchedule.setText("<html>Add Single Trip<br/> Schedule</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addFixedTripScheduleButton = new javax.swing.JButton();
        addSingleTripSchedule = new javax.swing.JButton();
        viewTripSchedulesButton = new javax.swing.JButton();
        addBusButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        smsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addFixedTripScheduleButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addFixedTripScheduleButton.setText("Add Fixed Trip Schedule");
        addFixedTripScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFixedTripScheduleButtonActionPerformed(evt);
            }
        });

        addSingleTripSchedule.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addSingleTripSchedule.setText("Add Trip Schedule");
        addSingleTripSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSingleTripScheduleActionPerformed(evt);
            }
        });

        viewTripSchedulesButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        viewTripSchedulesButton.setText("View Trip Schedules");
        viewTripSchedulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTripSchedulesButtonActionPerformed(evt);
            }
        });

        addBusButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addBusButton.setText("Add Bus");
        addBusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBusButtonActionPerformed(evt);
            }
        });

        logOutButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        smsButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        smsButton.setText("SMS");
        smsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewTripSchedulesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addBusButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addSingleTripSchedule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logOutButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addFixedTripScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(smsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSingleTripSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFixedTripScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(viewTripSchedulesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFixedTripScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFixedTripScheduleButtonActionPerformed
        AddFixedTripScheduleFrame addFixed = new AddFixedTripScheduleFrame();
        addFixed.show();
    }//GEN-LAST:event_addFixedTripScheduleButtonActionPerformed

    private void addSingleTripScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSingleTripScheduleActionPerformed
        AddTripFrame add = new AddTripFrame();
        add.show();

    }//GEN-LAST:event_addSingleTripScheduleActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed

    }//GEN-LAST:event_logOutButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

    }//GEN-LAST:event_exitButtonActionPerformed

    private void addBusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBusButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBusButtonActionPerformed

    private void viewTripSchedulesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTripSchedulesButtonActionPerformed
        // TODO add your handling code here:
        ViewTripSchedulesFrame view = new ViewTripSchedulesFrame();
        view.show();

    }//GEN-LAST:event_viewTripSchedulesButtonActionPerformed

    private void smsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OperatorMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperatorMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperatorMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperatorMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperatorMainMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBusButton;
    private javax.swing.JButton addFixedTripScheduleButton;
    private javax.swing.JButton addSingleTripSchedule;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton smsButton;
    private javax.swing.JButton viewTripSchedulesButton;
    // End of variables declaration//GEN-END:variables
}
