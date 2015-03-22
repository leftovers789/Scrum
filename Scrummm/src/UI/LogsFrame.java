/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import EmployeeManagement.*;
import LogManagement.DutyLog;
import RegistryManagement.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author windows
 */
public class LogsFrame extends javax.swing.JFrame {

    private List<Date> logs = new ArrayList<>();
    private Registry registry = Registry.getInstance();
    private DefaultTableModel logsTableModel = new DefaultTableModel(new Object[]{"Date"}, 0);
    private DefaultTableModel salesLogsDataTableModel
            = new DefaultTableModel(new Object[]{"Time", "Name", "Trip Source", "Trip Location", "Price"}, 0);
    private DefaultTableModel maintenanceLogsDataTableModel
            = new DefaultTableModel(new Object[]{"Time", "Mechanic Name", "Bus Number"}, 0);
    private DefaultTableModel dutyLogsDataTableModel
            = new DefaultTableModel(new Object[]{"Employee Name", "Time In", "Time Out"}, 0);
    private DefaultTableModel noHistory
            = new DefaultTableModel(new Object[]{"Select Log Data to View History Of Actions"}, 0);
    private DefaultTableModel noData
            = new DefaultTableModel(new Object[]{"Select Date of Log to View Data"}, 0);

    /**
     * Creates new form LogsFrame
     */
    public LogsFrame() {
        initComponents();

        setTableConfiguration(logDataTable, noData);
        setTableConfiguration(logsTable, logsTableModel);
        setTableConfiguration(historyOfActionsTable, noHistory);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        logsTable = new javax.swing.JTable();
        salesLogsButton = new javax.swing.JButton();
        dutyLogsButton = new javax.swing.JButton();
        maintenanceLogsButton = new javax.swing.JButton();
        totalBookedPassengersLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        totalBookedPassengersField = new javax.swing.JTextField();
        totalSalesLabel = new javax.swing.JLabel();
        totalSalesField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        logDataTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        historyOfActionsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        logsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Date"
            }
        ));
        jScrollPane1.setViewportView(logsTable);

        salesLogsButton.setText("Sales Logs");
        salesLogsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesLogsButtonActionPerformed(evt);
            }
        });

        dutyLogsButton.setText("Duty Logs");
        dutyLogsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dutyLogsButtonActionPerformed(evt);
            }
        });

        maintenanceLogsButton.setText("Maintenance Logs");
        maintenanceLogsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceLogsButtonActionPerformed(evt);
            }
        });

        totalBookedPassengersLabel.setText("Total Booked Passengers:");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        totalBookedPassengersField.setEditable(false);

        totalSalesLabel.setText("Total Sales:");

        totalSalesField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalSalesField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(totalBookedPassengersField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalBookedPassengersLabel)
                            .addComponent(totalSalesLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(salesLogsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dutyLogsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maintenanceLogsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salesLogsButton)
                .addGap(0, 0, 0)
                .addComponent(dutyLogsButton)
                .addGap(0, 0, 0)
                .addComponent(maintenanceLogsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalBookedPassengersLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalBookedPassengersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalSalesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalSalesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addContainerGap())
        );

        logDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Select Date of Log to View"
            }
        ));
        jScrollPane2.setViewportView(logDataTable);

        historyOfActionsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(historyOfActionsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setTableConfiguration(JTable table, DefaultTableModel defaultTableModel) {
        table.setModel(defaultTableModel);
        table.getTableHeader().setReorderingAllowed(false);
        table.setRowSelectionAllowed(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setEnabled(true);
        table.setSelectionBackground(java.awt.Color.GRAY);
        for (int c = 0; c < table.getColumnCount(); c++) {
            Class<?> col_class = table.getColumnClass(c);
            table.setDefaultEditor(col_class, null);        // remove editor
        }
        table.getTableHeader().setResizingAllowed(false);
        table.setShowGrid(true);
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.hide();
        ManagerMainMenu managerMainMenu = new ManagerMainMenu();
        managerMainMenu.show();
    }//GEN-LAST:event_backButtonActionPerformed

    private void salesLogsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesLogsButtonActionPerformed
        SimpleDateFormat sdf=new SimpleDateFormat("MMMM dd,yyyy");
        setTableConfiguration(logDataTable, salesLogsDataTableModel);
        Date checkDuplicate = null;
        Date date = null;
        for (DutyLog dutyLog : registry.getDutyLogs()) {
            System.out.println("hahaha");
            if (dutyLog.getEmployee() instanceof Cashier) {
                System.out.println("1");
                if (checkDuplicate == null || checkDuplicate.after(dutyLog.getTimeIn())) {
                    System.out.println("2 setted");
                    checkDuplicate = dutyLog.getTimeIn();
                }
                date = dutyLog.getTimeIn();
                System.out.println("get");
                if (!logs.isEmpty()) {
                    if (checkDuplicate.getYear() != date.getYear() && checkDuplicate.getMonth()!=date.getMonth()
                        && checkDuplicate.getDay()!=date.getDay()) {
                    logs.add(dutyLog.getTimeIn());
                    System.out.println("added");
                }
                } else {
                    logs.add(date);
                }
                
            }
        }
       
        for (Date date1 : logs) {
            logsTableModel.addRow(new Object[]{sdf.format(date1)});
        }
        
        
        
    }//GEN-LAST:event_salesLogsButtonActionPerformed

    private void dutyLogsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dutyLogsButtonActionPerformed
        setTableConfiguration(logDataTable, dutyLogsDataTableModel);
    }//GEN-LAST:event_dutyLogsButtonActionPerformed

    private void maintenanceLogsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceLogsButtonActionPerformed
        setTableConfiguration(logDataTable, maintenanceLogsDataTableModel);
    }//GEN-LAST:event_maintenanceLogsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LogsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton dutyLogsButton;
    private javax.swing.JTable historyOfActionsTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable logDataTable;
    private javax.swing.JTable logsTable;
    private javax.swing.JButton maintenanceLogsButton;
    private javax.swing.JButton salesLogsButton;
    private javax.swing.JTextField totalBookedPassengersField;
    private javax.swing.JLabel totalBookedPassengersLabel;
    private javax.swing.JTextField totalSalesField;
    private javax.swing.JLabel totalSalesLabel;
    // End of variables declaration//GEN-END:variables
}
