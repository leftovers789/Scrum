/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import BusCrewNotificationSystem.Sms;
import BusManagement.*;
import EmployeeManagement.*;
import RegistryManagement.SearchEngine;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sian Paul Lasaga
 */
public class SmsNotificationSystemForBusCrewsFrame extends javax.swing.JFrame {

    private DefaultTableModel crewsTableModel = new DefaultTableModel(new String[]{"Name", "Position", "Bus no.", "Contact no."}, 0);
    private List<Employee> crews = new ArrayList<>();
    private SearchEngine search = new SearchEngine();
    private BusCompany busCo = BusCompany.getInstance();
    private List<String> contactNumbers = new ArrayList<>();
    private Sms sms = new Sms();
    /**
     * Creates new form SmsNotificationSystemForBusCrewsFrame
     */
    public SmsNotificationSystemForBusCrewsFrame() {
        initComponents();
        try {
            sms.startService();
        } catch (Exception ex) {
            Logger.getLogger(SmsNotificationSystemForBusCrewsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        contactNumberTextField2.disable();
        contactNumberTextField3.disable();
        contactNumberTextField4.disable();
        busCrewsTable.setModel(crewsTableModel);
        for (Bus bus : busCo.getBusses()) {
            String busNo = bus.getBusNumber();
            String driverName = bus.getDriver().getLastName()+", "+bus.getDriver().getFirstName();
            String condutorName = bus.getConductor().getLastName()+", "+bus.getConductor().getFirstName();
            String driverContactNo = bus.getDriver().getCellphoneNumber();
            String conductorContactNo = bus.getConductor().getCellphoneNumber();
            crewsTableModel.addRow(new Object[]{ driverName, "Driver", busNo,  driverContactNo});
            crewsTableModel.addRow(new Object[]{ condutorName, "Conductor", busNo,  conductorContactNo});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contactNumberTextField1 = new javax.swing.JTextField();
        contactNumberTextField2 = new javax.swing.JTextField();
        contactNumberTextField3 = new javax.swing.JTextField();
        contactNumberTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        busCrewsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("To:");

        contactNumberTextField1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        contactNumberTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactNumberTextField1MouseClicked(evt);
            }
        });
        contactNumberTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberTextField1ActionPerformed(evt);
            }
        });

        contactNumberTextField2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        contactNumberTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactNumberTextField2MouseClicked(evt);
            }
        });

        contactNumberTextField3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        contactNumberTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactNumberTextField3MouseClicked(evt);
            }
        });

        contactNumberTextField4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        contactNumberTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactNumberTextField4MouseClicked(evt);
            }
        });

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane2.setViewportView(messageTextArea);

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendButton))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(contactNumberTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(contactNumberTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(contactNumberTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(contactNumberTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(contactNumberTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNumberTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNumberTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNumberTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendButton)
                    .addComponent(backButton)))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("SMS Notification");

        busCrewsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(busCrewsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactNumberTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactNumberTextField1MouseClicked
        // TODO add your handling code here:
        contactNumberTextField1.enable();
    }//GEN-LAST:event_contactNumberTextField1MouseClicked

    private void contactNumberTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactNumberTextField2MouseClicked
        // TODO add your handling code here:
        contactNumberTextField2.enable();
    }//GEN-LAST:event_contactNumberTextField2MouseClicked

    private void contactNumberTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactNumberTextField3MouseClicked
        // TODO add your handling code here:
        contactNumberTextField3.enable();
    }//GEN-LAST:event_contactNumberTextField3MouseClicked

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // TODO add your handling code here:
        contactNumbers.add(contactNumberTextField1.getText());
        contactNumbers.add(contactNumberTextField2.getText());
        contactNumbers.add(contactNumberTextField3.getText());
        contactNumbers.add(contactNumberTextField4.getText());
        for (String string : contactNumbers) {
            if(string.length() == 11){
                try {
                    sms.sendSms(string, messageTextArea.getText());
                } catch (Exception ex) {
                    Logger.getLogger(SmsNotificationSystemForBusCrewsFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void contactNumberTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberTextField1ActionPerformed

    private void contactNumberTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactNumberTextField4MouseClicked
        // TODO add your handling code here:
        contactNumberTextField4.enable();
    }//GEN-LAST:event_contactNumberTextField4MouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.hide();
        try {
            sms.stopService();
        } catch(Exception ex){
            
        }
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SmsNotificationSystemForBusCrewsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmsNotificationSystemForBusCrewsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmsNotificationSystemForBusCrewsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmsNotificationSystemForBusCrewsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmsNotificationSystemForBusCrewsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable busCrewsTable;
    private javax.swing.JTextField contactNumberTextField1;
    private javax.swing.JTextField contactNumberTextField2;
    private javax.swing.JTextField contactNumberTextField3;
    private javax.swing.JTextField contactNumberTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JButton sendButton;
    // End of variables declaration//GEN-END:variables
}
