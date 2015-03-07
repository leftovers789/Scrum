/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BusManagement.Bus;
import BusManagement.BusCompany;
import BusManagement.BusType;
import CommandPatternClasses.AddBusCommand;
import CommandPatternClasses.EditBusDataCommand;
import CommandPatternClasses.Invoker;
import EmployeeManagement.*;
import RegistryManagement.SearchEngine;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author windows
 */
public class BusRegistrationFrame extends javax.swing.JFrame {

    private Invoker invoker = new Invoker();
    private boolean hide_flag = false;
    private JTextField tf = null;
    private Vector<String> v = new Vector<String>();
    private boolean hide_flag2 = false;
    private JTextField tf2 = null;
    private Vector<String> v2 = new Vector<String>();
    private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    private int numberOfTire = 0;
    private BusCompany busCompany = BusCompany.getInstance();
    private BusType type = null;
    private Date dateAdded;
    private Employee driver;
    private Employee conductor;
    private SearchEngine searchEngine = new SearchEngine();
    private Bus bus;

    /**
     * Creates new form BusRegistrationFrame
     */
    public BusRegistrationFrame() {
        initComponents();
        setResizable(false);
        setTitle("Bus Registration");
        setLocationRelativeTo(null);

        hideTireSerialNumberFields();

        tf = (JTextField) driverComboBox.getEditor().getEditorComponent();
        tf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        String text = tf.getText();
                        if (text.length() == 0) {
                            driverComboBox.hidePopup();
                            setDriverComboBoxModel(new DefaultComboBoxModel(v), "");
                        } else {
                            DefaultComboBoxModel m = getSuggestedModel(v, text);
                            if (m.getSize() == 0 || hide_flag) {
                                driverComboBox.hidePopup();
                                hide_flag = false;
                            } else {
                                if (m.getSize() == 1) {
                                    driver = searchEngine.searchEmployeeByName(m.getSelectedItem().toString());
                                }
                                setDriverComboBoxModel(m, text);
                                driverComboBox.showPopup();
                            }
                        }
                    }
                });
            }

            public void keyPressed(KeyEvent e) {
                String text = tf.getText();
                DefaultComboBoxModel m = getSuggestedModel(v, text);
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {
                    if (!v.contains(text)) {
                        Collections.sort(v);
                        driver = searchEngine.searchEmployeeByName(m.getSelectedItem().toString());
                        setDriverComboBoxModel(getSuggestedModel(v, text), text);
                    }
                    hide_flag = true;
                } else if (code == KeyEvent.VK_ESCAPE) {
                    hide_flag = true;
                }
            }
        });
        for (Employee employee : busCompany.getEmployees()) {
            if (employee instanceof Driver) {
                String name = employee.getLastName() + "," + employee.getFirstName() + " " + employee.getMiddleName();
                v.add(name);
            }
        }
        setDriverComboBoxModel(new DefaultComboBoxModel(v), "");

        tf2 = (JTextField) conductorComboBox.getEditor().getEditorComponent();
        tf2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        String text = tf2.getText();
                        if (text.length() == 0) {
                            conductorComboBox.hidePopup();
                            setConductorComboBoxModel(new DefaultComboBoxModel(v2), "");
                        } else {
                            DefaultComboBoxModel m = getSuggestedModel(v2, text);
                            if (m.getSize() == 0 || hide_flag2) {
                                conductorComboBox.hidePopup();
                                hide_flag2 = false;
                            } else {
                                if (m.getSize() == 1) {
                                    conductor = searchEngine.searchEmployeeByName(m.getSelectedItem().toString());
                                }
                                setConductorComboBoxModel(m, text);
                                conductorComboBox.showPopup();
                            }
                        }
                    }
                });
            }

            public void keyPressed(KeyEvent e) {
                String text = tf2.getText();
                DefaultComboBoxModel m = getSuggestedModel(v2, text);
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {
                    if (!v2.contains(text)) {
                        Collections.sort(v2);
                        conductor = searchEngine.searchEmployeeByName(m.getSelectedItem().toString());
                        setConductorComboBoxModel(getSuggestedModel(v2, text), text);
                    }
                    hide_flag2 = true;
                } else if (code == KeyEvent.VK_ESCAPE) {
                    hide_flag2 = true;
                }
            }
        });
        for (Employee employee : busCompany.getEmployees()) {
            if (employee instanceof Conductor) {
                String name = employee.getLastName() + "," + employee.getFirstName() + " " + employee.getMiddleName();
                v2.add(name);
            }
        }
        setConductorComboBoxModel(new DefaultComboBoxModel(v2), "");

    }

    private void setDriverComboBoxModel(DefaultComboBoxModel mdl, String str) {
        driverComboBox.setModel(mdl);
        driverComboBox.setSelectedIndex(-1);
        tf.setText(str);
    }

    private static DefaultComboBoxModel getSuggestedModel(java.util.List<String> list, String text) {
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        for (String s : list) {
            s = s.toLowerCase();
            if (s.startsWith(text.toLowerCase())) {
                m.addElement(s);
            }
        }
        return m;
    }

    private void setConductorComboBoxModel(DefaultComboBoxModel mdl, String str) {
        conductorComboBox.setModel(mdl);
        conductorComboBox.setSelectedIndex(-1);
        tf2.setText(str);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        busNumberLabel = new javax.swing.JLabel();
        busNumberField = new javax.swing.JTextField();
        plateNumberLabel = new javax.swing.JLabel();
        plateNumberField = new javax.swing.JTextField();
        numberOfTireLabel = new javax.swing.JLabel();
        numberOfTireComboBox = new javax.swing.JComboBox();
        panel2 = new javax.swing.JPanel();
        engineSerialNumberLabel = new javax.swing.JLabel();
        engineSerialNumberField = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();
        tireSerialNumberLabel = new javax.swing.JLabel();
        tireSerialNumberField1 = new javax.swing.JTextField();
        tireSerialNumberField3 = new javax.swing.JTextField();
        tireSerialNumberField5 = new javax.swing.JTextField();
        tireSerialNumberField7 = new javax.swing.JTextField();
        tireSerialNumberField2 = new javax.swing.JTextField();
        tireSerialNumberField4 = new javax.swing.JTextField();
        tireSerialNumberField6 = new javax.swing.JTextField();
        tireSerialNumberField8 = new javax.swing.JTextField();
        tireSerialNumberField9 = new javax.swing.JTextField();
        tireSerialNumberField10 = new javax.swing.JTextField();
        capacityLabel = new javax.swing.JLabel();
        capacityField = new javax.swing.JTextField();
        crewLabel = new javax.swing.JLabel();
        driverLabel = new javax.swing.JLabel();
        conductorLabel = new javax.swing.JLabel();
        driverComboBox = new javax.swing.JComboBox();
        conductorComboBox = new javax.swing.JComboBox();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Bus Registration", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        dateLabel.setText("Date Purchased:");

        dateField.setEditable(false);
        dateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFieldActionPerformed(evt);
            }
        });
        dateField.setText(sdf.format(new Date()));

        busNumberLabel.setText("Bus Number:");

        busNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busNumberFieldActionPerformed(evt);
            }
        });

        plateNumberLabel.setText("Plate Number:");

        plateNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plateNumberFieldActionPerformed(evt);
            }
        });

        numberOfTireLabel.setText("Number Of Tire:");

        numberOfTireComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "4", "6", "8", "10" }));
        numberOfTireComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfTireComboBoxActionPerformed(evt);
            }
        });

        engineSerialNumberLabel.setText("Engine Serial Number:");

        engineSerialNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engineSerialNumberFieldActionPerformed(evt);
            }
        });

        typeLabel.setText("Type:");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Regular", "Air-Conditioned", "n/a" }));
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(engineSerialNumberField)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(engineSerialNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(typeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(engineSerialNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(engineSerialNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        tireSerialNumberLabel.setText("Tire Serial Number:");

        capacityLabel.setText("Capacity:");

        crewLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        crewLabel.setText("Crew:");

        driverLabel.setText("Driver:");

        conductorLabel.setText("Conductor:");

        driverComboBox.setEditable(true);

        conductorComboBox.setEditable(true);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(tireSerialNumberField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tireSerialNumberField4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(tireSerialNumberField5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tireSerialNumberField6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(tireSerialNumberField7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tireSerialNumberField8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(tireSerialNumberField9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tireSerialNumberField10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(tireSerialNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tireSerialNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tireSerialNumberLabel)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(busNumberLabel)
                                    .addComponent(plateNumberLabel)
                                    .addComponent(numberOfTireLabel)
                                    .addComponent(capacityLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numberOfTireComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(busNumberField)
                                    .addComponent(plateNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(capacityField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crewLabel)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conductorLabel)
                                    .addComponent(driverLabel))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conductorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(driverComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(saveButton)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backButton)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(busNumberLabel)
                        .addComponent(busNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateLabel)))
                .addGap(0, 0, 0)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plateNumberLabel)
                            .addComponent(plateNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(capacityLabel)
                            .addComponent(capacityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberOfTireLabel)
                            .addComponent(numberOfTireComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tireSerialNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tireSerialNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tireSerialNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tireSerialNumberField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tireSerialNumberField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tireSerialNumberField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tireSerialNumberField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tireSerialNumberField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tireSerialNumberField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tireSerialNumberField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tireSerialNumberField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driverLabel)
                    .addComponent(driverComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conductorLabel)
                    .addComponent(conductorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(saveButton)
                    .addComponent(backButton))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void load(Bus bus) {
        crewLabel.setVisible(true);
        driverLabel.setVisible(true);
        driverComboBox.setVisible(true);
        conductorLabel.setVisible(true);
        conductorComboBox.setVisible(true);
        engineSerialNumberField.setEnabled(false);
        busNumberField.setEnabled(false);
        capacityField.setEnabled(false);
        numberOfTireComboBox.setEnabled(false);
        busNumberField.setText(bus.getBusNumber());
        plateNumberField.setText(bus.getPlateNumber());
        capacityField.setText(Integer.toString(bus.getCapacity()));
        engineSerialNumberField.setText(bus.getEngineSerialNumber());

        String[] tireSerials = bus.getTireSerialNumbers().toArray((new String[0]));
        if (tireSerials.length >= 4) {
            tireSerialNumberField1.setText(tireSerials[0]);
            tireSerialNumberField2.setText(tireSerials[1]);
            tireSerialNumberField3.setText(tireSerials[2]);
            tireSerialNumberField4.setText(tireSerials[3]);
            numberOfTireComboBox.setSelectedIndex(1);
            if (tireSerials.length >= 6) {
                tireSerialNumberField5.setText(tireSerials[4]);
                tireSerialNumberField6.setText(tireSerials[5]);
                numberOfTireComboBox.setSelectedIndex(2);
                if (tireSerials.length >= 8) {
                    tireSerialNumberField7.setText(tireSerials[6]);
                    tireSerialNumberField8.setText(tireSerials[7]);
                    numberOfTireComboBox.setSelectedIndex(3);
                    if (tireSerials.length >= 10) {
                        tireSerialNumberField9.setText(tireSerials[8]);
                        tireSerialNumberField10.setText(tireSerials[9]);
                        numberOfTireComboBox.setSelectedIndex(4);
                    }
                }
            }
        }

        if (bus.getBusType() == BusType.ORDINARY) {
            typeComboBox.setSelectedIndex(1);
        } else if (bus.getBusType() == BusType.AIR_CONDITIONED) {
            typeComboBox.setSelectedIndex(2);
        } else {
            typeComboBox.setSelectedIndex(3);
        }

        Employee driver = bus.getDriver();
        Employee conductor = bus.getConductor();
        String driversName = null;
        String conductorsName = null;
        if (driver != null) {
            driver = bus.getDriver();
            driversName = driver.getLastName() + ", " + driver.getFirstName() + " " + driver.getMiddleName();
        }
        if (conductor != null) {
            conductor = bus.getConductor();
            conductorsName = conductor.getLastName() + ", " + conductor.getFirstName() + " " + conductor.getMiddleName();

        }

        driverComboBox.setSelectedItem(driversName);
        conductorComboBox.setSelectedItem(conductorsName);
        this.bus = bus;
    }

    private void dateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFieldActionPerformed

    private void busNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busNumberFieldActionPerformed

    private void plateNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plateNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plateNumberFieldActionPerformed

    private void engineSerialNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engineSerialNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engineSerialNumberFieldActionPerformed

    private void hideTireSerialNumberFields() {
        tireSerialNumberField1.setEnabled(false);
        tireSerialNumberField2.setEnabled(false);
        tireSerialNumberField3.setEnabled(false);
        tireSerialNumberField4.setEnabled(false);
        tireSerialNumberField5.setEnabled(false);
        tireSerialNumberField6.setEnabled(false);
        tireSerialNumberField7.setEnabled(false);
        tireSerialNumberField8.setEnabled(false);
        tireSerialNumberField9.setEnabled(false);
        tireSerialNumberField10.setEnabled(false);
    }

    private void numberOfTireComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfTireComboBoxActionPerformed
        try {
            numberOfTire = Integer.parseInt(numberOfTireComboBox.getSelectedItem().toString());
        } catch (Exception e) {
            hideTireSerialNumberFields();
            return;
        }

        hideTireSerialNumberFields();

        if (numberOfTire >= 4) {
            tireSerialNumberField1.setEnabled(true);
            tireSerialNumberField2.setEnabled(true);
            tireSerialNumberField3.setEnabled(true);
            tireSerialNumberField4.setEnabled(true);
            if (numberOfTire >= 6) {
                tireSerialNumberField5.setEnabled(true);
                tireSerialNumberField6.setEnabled(true);
                if (numberOfTire >= 8) {
                    tireSerialNumberField7.setEnabled(true);
                    tireSerialNumberField8.setEnabled(true);
                    if (numberOfTire >= 10) {
                        tireSerialNumberField9.setEnabled(true);
                        tireSerialNumberField10.setEnabled(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_numberOfTireComboBoxActionPerformed

    private void showEmptyFieldErrorDialog() {
        JOptionPane.showMessageDialog(null, "Fill all the fields properly to continue.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String busNumber = busNumberField.getText();
        int capacity = 0;
        Bus bus = null;
        try {
            capacity = Integer.parseInt(capacityField.getText());
            if (capacity <= 10) {
                showEmptyFieldErrorDialog();
                return;
            }
        } catch (Exception e) {
            showEmptyFieldErrorDialog();
            return;
        }
        if (engineSerialNumberField.getText().isEmpty() || numberOfTire == 0) {
            showEmptyFieldErrorDialog();
            return;
        }

        try {
            dateAdded = sdf.parse(dateField.getText());
        } catch (Exception e) {
            return;
        }

        if (busNumberField.isEnabled()) {
            bus = new Bus(plateNumberField.getText(), type, true, busNumber, capacity, null, null, engineSerialNumberField.getText(), dateAdded);
        } else {
            bus = this.bus;
        }

        bus.getTireSerialNumbers().removeAll(bus.getTireSerialNumbers());
        if (numberOfTire >= 4) {
            bus.addTireSerialNumber(tireSerialNumberField1.getText());
            bus.addTireSerialNumber(tireSerialNumberField2.getText());
            bus.addTireSerialNumber(tireSerialNumberField3.getText());
            bus.addTireSerialNumber(tireSerialNumberField4.getText());

            if (tireSerialNumberField1.getText().isEmpty() || tireSerialNumberField2.getText().isEmpty()
                    || tireSerialNumberField3.getText().isEmpty() || tireSerialNumberField4.getText().isEmpty()) {
                emptyTireSerialNumberPopUp();
                return;
            }

            if (numberOfTire >= 6) {
                bus.addTireSerialNumber(tireSerialNumberField5.getText());
                bus.addTireSerialNumber(tireSerialNumberField6.getText());

                if (tireSerialNumberField5.getText().isEmpty() || tireSerialNumberField6.getText().isEmpty()) {
                    emptyTireSerialNumberPopUp();
                    return;
                }

                if (numberOfTire >= 8) {
                    bus.addTireSerialNumber(tireSerialNumberField7.getText());
                    bus.addTireSerialNumber(tireSerialNumberField8.getText());

                    if (tireSerialNumberField7.getText().isEmpty() || tireSerialNumberField8.getText().isEmpty()) {
                        emptyTireSerialNumberPopUp();
                        return;
                    }

                    if (numberOfTire >= 10) {
                        bus.addTireSerialNumber(tireSerialNumberField9.getText());
                        bus.addTireSerialNumber(tireSerialNumberField10.getText());

                        if (tireSerialNumberField9.getText().isEmpty() || tireSerialNumberField10.getText().isEmpty()) {
                            emptyTireSerialNumberPopUp();
                            return;
                        }

                    }
                }
            }
        }

        bus.setConductor((Conductor) conductor);
        bus.setDriver((Driver) driver);
        String message = "";

        if (conductor == null) {
            message = "Data will be saved without Conductor!";
        }
        if (driver == null) {
            message = message + "\nData will be saved without Driver!";
        }
        if (!message.isEmpty()) {
            JOptionPane.showMessageDialog(null, message);
        }
        if (!bus.getPlateNumber().isEmpty() && bus.getConductor() != null && bus.getDriver() != null) {
            bus.setAvailability(true);
        } else {
            bus.setAvailability(false);
        }
        if (busNumberField.isEnabled()) {
            invoker.setCommand(new AddBusCommand(bus));
            invoker.executeCommand();
            clearFields();
        } else {
            invoker.setCommand(new EditBusDataCommand(bus));
            invoker.executeCommand();
            JOptionPane.showMessageDialog(null, "Data successfully saved!", "Bus Data Modified", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
            this.hide();
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void emptyTireSerialNumberPopUp() {
        JOptionPane.showMessageDialog(null, "Fill all tire serial number to continue!", "Error!", JOptionPane.ERROR_MESSAGE);
    }

    private void clearFields() {
        capacityField.setText("");
        busNumberField.setText("");
        plateNumberField.setText("");
        engineSerialNumberField.setText("");
        numberOfTireComboBox.setSelectedIndex(0);
        typeComboBox.setSelectedIndex(0);
        driverComboBox.setSelectedItem("");
        conductorComboBox.setSelectedItem("");

        tireSerialNumberField1.setText("");
        tireSerialNumberField2.setText("");
        tireSerialNumberField3.setText("");
        tireSerialNumberField4.setText("");
        tireSerialNumberField5.setText("");
        tireSerialNumberField6.setText("");
        tireSerialNumberField7.setText("");
        tireSerialNumberField8.setText("");
        tireSerialNumberField9.setText("");
        tireSerialNumberField10.setText("");
    }

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        if (typeComboBox.getSelectedIndex() == 1) {
            type = BusType.ORDINARY;
        } else if (typeComboBox.getSelectedIndex() == 2) {
            type = BusType.AIR_CONDITIONED;
        } else {
            type = null;
        }
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        clearFields();
        this.hide();
        ManagerMainMenu mainMenu = new ManagerMainMenu();
        mainMenu.show();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.hide();
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
            java.util.logging.Logger.getLogger(BusRegistrationFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusRegistrationFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusRegistrationFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusRegistrationFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusRegistrationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField busNumberField;
    private javax.swing.JLabel busNumberLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField capacityField;
    private javax.swing.JLabel capacityLabel;
    private javax.swing.JComboBox conductorComboBox;
    private javax.swing.JLabel conductorLabel;
    private javax.swing.JLabel crewLabel;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox driverComboBox;
    private javax.swing.JLabel driverLabel;
    private javax.swing.JTextField engineSerialNumberField;
    private javax.swing.JLabel engineSerialNumberLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox numberOfTireComboBox;
    private javax.swing.JLabel numberOfTireLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField plateNumberField;
    private javax.swing.JLabel plateNumberLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField tireSerialNumberField1;
    private javax.swing.JTextField tireSerialNumberField10;
    private javax.swing.JTextField tireSerialNumberField2;
    private javax.swing.JTextField tireSerialNumberField3;
    private javax.swing.JTextField tireSerialNumberField4;
    private javax.swing.JTextField tireSerialNumberField5;
    private javax.swing.JTextField tireSerialNumberField6;
    private javax.swing.JTextField tireSerialNumberField7;
    private javax.swing.JTextField tireSerialNumberField8;
    private javax.swing.JTextField tireSerialNumberField9;
    private javax.swing.JLabel tireSerialNumberLabel;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
