/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import RegistryManagement.*;
import BusManagement.*;
import EmployeeManagement.*;
import LogManagement.DutyLog;
import java.util.Date;

/**
 *
 * @author windows
 */
public class ManagerMainMenu extends javax.swing.JFrame {

    private Registry registry = Registry.getInstance();
    private BusCompany busCompany = BusCompany.getInstance();
    private Employee currentlyLoggedIn = busCompany.getCurrentLoggedIn();
    private Date timeIn = new Date();
    private DutyLog dutyLog = DutyLog.getInstance();

    /**
     * Creates new form BusInformationFrame
     */
    public ManagerMainMenu() {
        initComponents();
        dutyLog.setTimeIn(timeIn);
        if (currentlyLoggedIn != null) {
            currentlyLoggedInLabel.setText(currentlyLoggedIn.getLastName() + ", "
                    + currentlyLoggedIn.getFirstName() + " " + currentlyLoggedIn.getMiddleName());
            dutyLog.setEmployee(currentlyLoggedIn);
        } else {
            currentlyLoggedInLabel.setText("Admin");
            dutyLog.setEmployee(null);
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

        manageBusButton = new javax.swing.JButton();
        manageEmployeeButton = new javax.swing.JButton();
        manageBookingButton = new javax.swing.JButton();
        viewLogsButton = new javax.swing.JButton();
        financialReportButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        currentlyLoggedInLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manageBusButton.setText("Manage Bus");
        manageBusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBusButtonActionPerformed(evt);
            }
        });

        manageEmployeeButton.setText("Manage Employee");
        manageEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeButtonActionPerformed(evt);
            }
        });

        manageBookingButton.setText("Manage Booking");
        manageBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBookingButtonActionPerformed(evt);
            }
        });

        viewLogsButton.setText("View Logs");

        financialReportButton.setText("Financial Report");

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currentlyLoggedInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageBusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewLogsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(financialReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentlyLoggedInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageBusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewLogsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(financialReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Date getTimeIn() {
        return timeIn;
    }

    private void manageBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBookingButtonActionPerformed
        AddTripFrame addTripFrame = new AddTripFrame();
        ScheduleDetailsFrame scheduleDetailsFrame = new ScheduleDetailsFrame();
        this.hide();
        addTripFrame.show();
        scheduleDetailsFrame.show();
    }//GEN-LAST:event_manageBookingButtonActionPerformed

    private void manageBusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBusButtonActionPerformed
        ManageBussesFrame manageBussesFrame=new ManageBussesFrame();
        this.hide();
        manageBussesFrame.show();
    }//GEN-LAST:event_manageBusButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        dutyLog.setTimeOut(new Date());
        registry.addDutyLog(dutyLog);
        dutyLog.resetInstance();
        this.dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.show();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        dutyLog.setTimeOut(new Date());
        registry.addDutyLog(dutyLog);
        dutyLog.resetInstance();
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void manageEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeButtonActionPerformed
        this.hide();
        EmployeeRegistrationFrame employeeRegistrationFrame=new EmployeeRegistrationFrame();
        employeeRegistrationFrame.show();
    }//GEN-LAST:event_manageEmployeeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentlyLoggedInLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton financialReportButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton manageBookingButton;
    private javax.swing.JButton manageBusButton;
    private javax.swing.JButton manageEmployeeButton;
    private javax.swing.JButton viewLogsButton;
    // End of variables declaration//GEN-END:variables
}
