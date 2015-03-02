/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BusManagement.*;
import EmployeeManagement.*;
import LogManagement.MaintenanceReport;
import RegistryManagement.*;
import java.nio.charset.Charset;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SingleSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author windows
 */
public class MaintenanceFrame extends javax.swing.JFrame {

    private Mechanic mechanic;
    private int issueComboBoxSelectedIndex;
    private boolean issue;
    private boolean busAvailability;
    private boolean issueFixed;
    private Bus bus;
    private BusCompany busCompany = BusCompany.getInstance();
    private DefaultTableModel bussesForStateCheckTableModel
            = new DefaultTableModel(new String[]{"Bus #", "Bus Plate #"}, 0);
    private DefaultTableModel bussesForRepairTableModel
            = new DefaultTableModel(new String[]{"Bus #", "Bus Plate #"}, 0);

    /**
     * Creates new form MaintenanceFrame
     */
    public MaintenanceFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
        disableFields();

        setTableConfiguration(bussesForStateCheckTable, bussesForStateCheckTableModel);
        setTableConfiguration(bussesForRepairTable, bussesForRepairTableModel);

        updateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        saveReportButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        busNumberLabel = new javax.swing.JLabel();
        busNumberField = new javax.swing.JTextField();
        busPlateNumberLabel = new javax.swing.JLabel();
        busPlateNumberField = new javax.swing.JTextField();
        issueLabel = new javax.swing.JLabel();
        issueComboBox = new javax.swing.JComboBox();
        issueDescriptionLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        issueDescriptionTextArea = new javax.swing.JTextArea();
        issueFixedLabel = new javax.swing.JLabel();
        issueFixedComboBox = new javax.swing.JComboBox();
        issueEstimatedCostLabel = new javax.swing.JLabel();
        issueEstimatedCostField = new javax.swing.JTextField();
        timeLabel = new javax.swing.JLabel();
        busStateLabel = new javax.swing.JLabel();
        busStateComboBox = new javax.swing.JComboBox();
        logOutButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        currentlyLoggedInLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bussesForStateCheckTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bussesForRepairTable = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true), "Maintenance Report", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        saveReportButton.setText("Save Report");
        saveReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveReportButtonActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true), "Selected Row", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        busNumberLabel.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        busNumberLabel.setText("Bus # :");

        busNumberField.setEditable(false);

        busPlateNumberLabel.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        busPlateNumberLabel.setText("Plate Number:");

        busPlateNumberField.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(busNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(busNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(busPlateNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(busPlateNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busPlateNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busPlateNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        issueLabel.setText("Issue:");

        issueComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Problem Found", "None" }));
        issueComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueComboBoxActionPerformed(evt);
            }
        });

        issueDescriptionLabel.setText("Issue Description:");

        issueDescriptionTextArea.setColumns(20);
        issueDescriptionTextArea.setLineWrap(true);
        issueDescriptionTextArea.setRows(5);
        issueDescriptionTextArea.setWrapStyleWord(true);
        jScrollPane4.setViewportView(issueDescriptionTextArea);

        issueFixedLabel.setText("Issue Fixed:");

        issueFixedComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Yes", "No" }));
        issueFixedComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueFixedComboBoxActionPerformed(evt);
            }
        });

        issueEstimatedCostLabel.setText("Issue Estimated Cost:");

        busStateLabel.setText("Bus State:");

        busStateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Serviceable", "Unserviceable" }));
        busStateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busStateComboBoxActionPerformed(evt);
            }
        });

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(issueLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(issueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(issueDescriptionLabel))
                                .addGap(88, 88, 88)
                                .addComponent(issueEstimatedCostField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(issueEstimatedCostLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(busStateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(busStateLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(issueFixedLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(issueFixedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(issueLabel)
                            .addComponent(issueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(issueEstimatedCostLabel))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(issueDescriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(issueEstimatedCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(issueFixedLabel)
                                    .addComponent(issueFixedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busStateLabel)
                                .addGap(0, 0, 0)
                                .addComponent(busStateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bussesForStateCheckTable.setModel(new javax.swing.table.DefaultTableModel(
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
        bussesForStateCheckTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bussesForStateCheckTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(bussesForStateCheckTable);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Busses Pending to be Checked");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Busses Pending to be Repaired");

        bussesForRepairTable.setModel(new javax.swing.table.DefaultTableModel(
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
        bussesForRepairTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bussesForRepairTableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(bussesForRepairTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(currentlyLoggedInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(currentlyLoggedInLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
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

    private void enableFields() {
        saveReportButton.setEnabled(true);
        issueDescriptionTextArea.setEnabled(true);
        issueEstimatedCostField.setEnabled(true);
        issueFixedComboBox.setEnabled(true);
        busStateComboBox.setEnabled(true);
    }

    private void disableFields() {
        saveReportButton.setEnabled(false);
        issueComboBox.setEnabled(false);
        issueDescriptionTextArea.setEnabled(false);
        issueEstimatedCostField.setEnabled(false);
        issueFixedComboBox.setEnabled(false);
        busStateComboBox.setEnabled(false);
    }

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        MainMenu mainMenu = new MainMenu();
        //logging for duty will be inserted here
        mainMenu.show();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void issueFixedComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueFixedComboBoxActionPerformed
        if (issueFixedComboBox.getSelectedIndex() == 1) {
            issueFixed = true;
            busStateComboBox.setSelectedIndex(1);
            busAvailability = true;
        }

        if (issueFixedComboBox.getSelectedIndex() == 2) {
            issueFixed = false;
            busStateComboBox.setSelectedIndex(0);
            busAvailability = false;
        }
    }//GEN-LAST:event_issueFixedComboBoxActionPerformed

    private void emptyFieldNotification() {
        JOptionPane.showMessageDialog(null, "Fill fields properly to save the report!",
                "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void saveReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveReportButtonActionPerformed
        double issueEstimatedCost = 0;

        if (!issueEstimatedCostField.getText().isEmpty()) {
            try {
                issueEstimatedCost = Double.parseDouble(issueEstimatedCostField.getText());
            } catch (NumberFormatException e) {
                emptyFieldNotification();
                return;
            }

        } else {
            if (!issueFixed && issue) {
                if (issueEstimatedCost == 0) {
                    emptyFieldNotification();
                    return;
                }
            }
        }
        if (issue) {
            if (issueDescriptionTextArea.getText().isEmpty() || issueFixedComboBox.getSelectedIndex() == 0
                    || busStateComboBox.getSelectedIndex() == 0) {
                emptyFieldNotification();
                return;
            }
        }

        mechanic.addMaintenanceReport(new MaintenanceReport(bus, new Date(), issue,
                issueDescriptionTextArea.getText(), issueEstimatedCost, issueFixed));
        mechanic.getBussesForMaintenance().remove(bus);
        
        busCompany.getBusses().remove(bus);
        busCompany.addBus(bus);
        
        issue = false;
        issueFixed = false;
        bus = null;
        busAvailability = false;
        clearFields();
        disableFields();
        updateTable();
    }//GEN-LAST:event_saveReportButtonActionPerformed

    private void bussesForStateCheckTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bussesForStateCheckTableMousePressed
        SearchEngine searchEngine = new SearchEngine();
        clearFields();
        int selectedRow = bussesForStateCheckTable.getSelectedRow();
        if (selectedRow >= 0) {
            String busNumber = (String) bussesForStateCheckTable.getValueAt(selectedRow, 0);
            System.out.println(busNumber);
            bus = searchEngine.searchBusByBusNo(busNumber);
            busNumberField.setText(bus.getBusNumber());
            busPlateNumberField.setText(bus.getPlateNumber());
            issueComboBox.setEnabled(true);
            bussesForRepairTable.getSelectionModel().clearSelection();
        } else {
            disableFields();
        }
    }//GEN-LAST:event_bussesForStateCheckTableMousePressed

    private void bussesForRepairTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bussesForRepairTableMousePressed
        SearchEngine searchEngine = new SearchEngine();
        clearFields();
        int selectedRow = bussesForRepairTable.getSelectedRow();
        if (selectedRow >= 0) {
            String busNumber = (String) bussesForRepairTable.getValueAt(selectedRow, 0);
            bus = searchEngine.searchBusByBusNo(busNumber);
            busNumberField.setText(bus.getBusNumber());
            busPlateNumberField.setText(bus.getPlateNumber());
            issueComboBox.setEnabled(true);
            bussesForStateCheckTable.getSelectionModel().clearSelection();
        } else {
            disableFields();
        }
    }//GEN-LAST:event_bussesForRepairTableMousePressed

    private void issueComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueComboBoxActionPerformed
        issueComboBoxSelectedIndex = issueComboBox.getSelectedIndex();
        if (issueComboBoxSelectedIndex == 1) {
            issue = true;
            enableFields();
        }

        if (issueComboBoxSelectedIndex == 2) {
            issue = false;
            disableFields();
            busAvailability = true;
            issueComboBox.setEnabled(true);
            saveReportButton.setEnabled(true);
        }
    }//GEN-LAST:event_issueComboBoxActionPerformed

    private void busStateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busStateComboBoxActionPerformed
        if (busStateComboBox.getSelectedIndex() == 1) {
            busAvailability = true;
            bus.setAvailability(busAvailability);
        }

        if (busStateComboBox.getSelectedIndex() == 2) {
            busAvailability = false;
            bus.setAvailability(busAvailability);
        }
    }//GEN-LAST:event_busStateComboBoxActionPerformed

    private void updateTable() {
        removeTableData();
        mechanic = (Mechanic) busCompany.getCurrentLoggedIn();
        for (Bus bus : mechanic.getBussesForMaintenance()) {
            bussesForStateCheckTableModel.addRow(new Object[]{bus.getBusNumber(), bus.getPlateNumber()});
        }
        for (Bus bus : mechanic.getBussesForRepair()) {
            bussesForRepairTableModel.addRow(new Object[]{bus.getBusNumber(), bus.getPlateNumber()});
        }
      
    }

    public void clearFields() {
        issueComboBox.setSelectedIndex(0);
        busNumberField.setText("");
        busPlateNumberField.setText("");
        issueDescriptionTextArea.setText("");
        issueEstimatedCostField.setText("");
        busStateComboBox.setSelectedIndex(0);
        issueFixedComboBox.setSelectedIndex(0);
    }

    public void removeTableData() {
        while (bussesForRepairTable.getRowCount() > 0) {
            bussesForRepairTableModel.removeRow(0);
        }
        while (bussesForStateCheckTable.getRowCount() > 0) {
            bussesForStateCheckTableModel.removeRow(0);
        }
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
            java.util.logging.Logger.getLogger(MaintenanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaintenanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaintenanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaintenanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaintenanceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busNumberField;
    private javax.swing.JLabel busNumberLabel;
    private javax.swing.JTextField busPlateNumberField;
    private javax.swing.JLabel busPlateNumberLabel;
    private javax.swing.JComboBox busStateComboBox;
    private javax.swing.JLabel busStateLabel;
    private javax.swing.JTable bussesForRepairTable;
    private javax.swing.JTable bussesForStateCheckTable;
    private javax.swing.JLabel currentlyLoggedInLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox issueComboBox;
    private javax.swing.JLabel issueDescriptionLabel;
    private javax.swing.JTextArea issueDescriptionTextArea;
    private javax.swing.JTextField issueEstimatedCostField;
    private javax.swing.JLabel issueEstimatedCostLabel;
    private javax.swing.JComboBox issueFixedComboBox;
    private javax.swing.JLabel issueFixedLabel;
    private javax.swing.JLabel issueLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton saveReportButton;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}