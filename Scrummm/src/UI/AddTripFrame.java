/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import BookingManagement.*;
import BusManagement.*;
import RegistryManagement.*;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sourceforge.jcalendarbutton.JCalendarButton;
import net.sourceforge.jcalendarbutton.JTimeButton;
/**
 *
 * @author Sian Paul Lasaga
 */
public class AddTripFrame extends javax.swing.JFrame {

    private BusCompany busCo = BusCompany.getInstance();
    private Trip trip = new Trip();
    private Trip oldTrip;
    private List<Trip> tripList;
    private SearchEngine search = new SearchEngine();
    private Registry reg = Registry.getInstance();
    private static CodeGenerator gen = CodeGenerator.getInstance();
    private Vector<String> v = new Vector<>();
    private Vector<String> v2 = new Vector<>();
    private boolean hide_flag = false;
    private JTextField locationFromText;
    private JTextField locationToText;
    private JTextField venueText;
    private Vector<String> busNumbers=new Vector<String>();
    private FlowLayout flMain = new FlowLayout();
    private SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    private SimpleDateFormat df1 = new SimpleDateFormat("hh:mm a");
    private JCalendarButton jCalendar = new JCalendarButton();
    private JTimeButton jTime = new JTimeButton();
    private Date today = new Date();
    /**
     * Creates new form AddTripFrame
     */
    public AddTripFrame() {
        initComponents();
        for (Bus bus : busCo.getBusses()) {
            busNumbers.add(bus.getBusNumber());
        }
        busNoCBox.setModel(new DefaultComboBoxModel(busNumbers));
        updateTripButton.setEnabled(false);
        busNoCBox.setModel(new DefaultComboBoxModel());
        for (Bus bus : busCo.getBusses()) {
            busNoCBox.addItem(bus.getBusNumber());
        }
        ReferenceNoLabel.setText(gen.generateReferenceNumber());
        locationFromText = (JTextField) locationFromComboBox.getEditor().getEditorComponent();
        locationToText = (JTextField) locationToComboBox.getEditor().getEditorComponent();
        venueText = (JTextField) tripVenueComboBox.getEditor().getEditorComponent();
        datePanel.setLayout(flMain);
        datePanel.add(jCalendar);
        jCalendar.addPropertyChangeListener(new PropertyChangeListener(){
            @Override
            public void propertyChange(PropertyChangeEvent evt){
                if(evt.getNewValue() instanceof Date){
                    dateTextField.setText(df.format(evt.getNewValue()));
                }
            }
        });
        timePanel.setLayout(flMain);
        timePanel.add(jTime);
        jTime.addPropertyChangeListener(new PropertyChangeListener(){
            @Override
            public void propertyChange(PropertyChangeEvent evt){
                if(evt.getNewValue() instanceof Date){
                    timeTextField.setText(df1.format(evt.getNewValue()));
                }
            }
        });
        locationFromSuggestionBox();
        locationToSuggestionBox();
        venueSuggestionBox();
        for (Trip trip1 : reg.getTrips()) {
            String loc = trip1.getTripFrom();
            String loc2 = trip1.getTripTo();
            String ven = trip1.getVenue();
            v.add(loc);
            v.add(loc2);
            v2.add(ven);
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

        ViewTripsButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        AddTripButton = new javax.swing.JButton();
        busNoCBox = new javax.swing.JComboBox();
        timeTextField = new javax.swing.JFormattedTextField();
        backButton = new javax.swing.JButton();
        ReferenceNoLabel = new javax.swing.JLabel();
        updateTripButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        locationFromComboBox = new javax.swing.JComboBox();
        locationToComboBox = new javax.swing.JComboBox();
        tripVenueComboBox = new javax.swing.JComboBox();
        dateTextField = new javax.swing.JFormattedTextField();
        datePanel = new javax.swing.JPanel();
        timePanel = new javax.swing.JPanel();

        ViewTripsButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ViewTripsButton1.setText("View Trips");
        ViewTripsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTripsButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Trip Menu"));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Date:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Bus:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Time:");

        jLabel3.setText("Reference No.");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Price:");

        AddTripButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        AddTripButton.setText("Add Trip Schedule");
        AddTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTripButtonActionPerformed(evt);
            }
        });

        busNoCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select-" }));
        busNoCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busNoCBoxActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ReferenceNoLabel.setText("#######");

        updateTripButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        updateTripButton.setText("Update Trip Schedule");
        updateTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTripButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Venue:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Route"));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("From:");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("To:");

        locationFromComboBox.setEditable(true);

        locationToComboBox.setEditable(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationFromComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationToComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(locationFromComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationToComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tripVenueComboBox.setEditable(true);

        dateTextField.setEditable(false);

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout timePanelLayout = new javax.swing.GroupLayout(timePanel);
        timePanel.setLayout(timePanelLayout);
        timePanelLayout.setHorizontalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        timePanelLayout.setVerticalGroup(
            timePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ReferenceNoLabel))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(backButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateTripButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddTripButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(52, 52, 52))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(busNoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tripVenueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ReferenceNoLabel))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel6)
                                .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(timePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(busNoCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(tripVenueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(AddTripButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateTripButton)
                .addGap(11, 11, 11)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public void locationFromSuggestionBox(){
        locationFromText.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                EventQueue.invokeLater(new Runnable(){
                    @Override
                    public void run() {
                        String text = locationFromText.getText();
                        if(text.length() == 0){
                            locationFromComboBox.hidePopup();
                            locationFromComboBox.setModel(new DefaultComboBoxModel(v));
                            locationFromComboBox.setSelectedIndex(-1);
                            locationFromText.setText("");
                        } else{
                            DefaultComboBoxModel m = getSuggestedModel(v, text);
                            if(m.getSize() == 0 || hide_flag){
                                locationFromComboBox.hidePopup();
                                hide_flag = false;
                            } else{
                                if(m.getSize()==1){
                                    tripList = search.searchTripFromAndTo(m.getSelectedItem().toString());
                                }
                                locationFromComboBox.setModel(m);
                                locationFromComboBox.setSelectedIndex(-1);
                                locationFromText.setText(text);
                                locationFromComboBox.showPopup();
                            }
                        }
                    }
                    
                });
            }
            
            public void keyPressed(KeyEvent e){
                String text = locationFromText.getText();
                DefaultComboBoxModel m = getSuggestedModel(v, text);
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {
                    if (!v.contains(text)) {
                        Collections.sort(v);
                        tripList = search.searchTripFromAndTo(m.getSelectedItem().toString());
                        locationFromComboBox.setModel(getSuggestedModel(v, text));
                        locationFromComboBox.setSelectedIndex(-1);
                        locationFromText.setText(text);
                    }
                    hide_flag = true;
                }else if(code == KeyEvent.VK_ESCAPE){
                    hide_flag = true;
                }else if(code == KeyEvent.VK_RIGHT){
                    for (int i = 0; i < v.size(); i++) {
                        String str = v.elementAt(i);
                        if(str.startsWith(text)){
                            locationFromComboBox.setSelectedIndex(-1);
                            locationFromText.setText(str);
                            return;
                        }
                    }
                }
            }
        });
    }
    
    public void locationToSuggestionBox(){
        locationToText.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                EventQueue.invokeLater(new Runnable(){
                    @Override
                    public void run() {
                        String text = locationToText.getText();
                        if(text.length() == 0){
                            locationToComboBox.hidePopup();
                            locationToComboBox.setModel(new DefaultComboBoxModel(v));
                            locationToComboBox.setSelectedIndex(-1);
                            locationToText.setText("");
                        } else{
                            DefaultComboBoxModel m = getSuggestedModel(v, text);
                            if(m.getSize() == 0 || hide_flag){
                                locationToComboBox.hidePopup();
                                hide_flag = false;
                            } else{
                                if(m.getSize()==1){
                                    tripList = search.searchTripFromAndTo(m.getSelectedItem().toString());
                                }
                                locationToComboBox.setModel(m);
                                locationToComboBox.setSelectedIndex(-1);
                                locationToText.setText(text);
                                locationToComboBox.showPopup();
                            }
                        }
                    }
                    
                });
            }
            
            public void keyPressed(KeyEvent e){
                String text = locationToText.getText();
                DefaultComboBoxModel m = getSuggestedModel(v, text);
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {
                    if (!v.contains(text)) {
                        Collections.sort(v);
                        tripList = search.searchTripFromAndTo(m.getSelectedItem().toString());
                        locationToComboBox.setModel(getSuggestedModel(v, text));
                        locationToComboBox.setSelectedIndex(-1);
                        locationToText.setText(text);
                    }
                    hide_flag = true;
                }else if(code == KeyEvent.VK_ESCAPE){
                    hide_flag = true;
                }else if(code == KeyEvent.VK_RIGHT){
                    for (int i = 0; i < v.size(); i++) {
                        String str = v.elementAt(i);
                        if(str.startsWith(text)){
                            locationToComboBox.setSelectedIndex(-1);
                            locationToText.setText(str);
                            return;
                        }
                    }
                }
            }
        });
    }
    
    public void venueSuggestionBox(){
        venueText.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
                EventQueue.invokeLater(new Runnable(){
                    @Override
                    public void run() {
                        String text = venueText.getText();
                        if(text.length() == 0){
                            tripVenueComboBox.hidePopup();
                            tripVenueComboBox.setModel(new DefaultComboBoxModel(v2));
                            tripVenueComboBox.setSelectedIndex(-1);
                            venueText.setText("");
                        } else{
                            DefaultComboBoxModel m = getSuggestedModel(v2, text);
                            if(m.getSize() == 0 || hide_flag){
                                locationToComboBox.hidePopup();
                                hide_flag = false;
                            } else{
                                if(m.getSize()==1){
                                    tripList = search.searchTripFromAndTo(m.getSelectedItem().toString());
                                }
                                tripVenueComboBox.setModel(m);
                                tripVenueComboBox.setSelectedIndex(-1);
                                venueText.setText(text);
                                tripVenueComboBox.showPopup();
                            }
                        }
                    }
                    
                });
            }
            
            public void keyPressed(KeyEvent e){
                String text = venueText.getText();
                DefaultComboBoxModel m = getSuggestedModel(v2, text);
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {
                    if (!v2.contains(text)) {
                        Collections.sort(v2);
                        tripList = search.searchTripFromAndTo(m.getSelectedItem().toString());
                        tripVenueComboBox.setModel(getSuggestedModel(v2, text));
                        tripVenueComboBox.setSelectedIndex(-1);
                        venueText.setText(text);
                    }
                    hide_flag = true;
                }else if(code == KeyEvent.VK_ESCAPE){
                    hide_flag = true;
                }else if(code == KeyEvent.VK_RIGHT){
                    for (int i = 0; i < v2.size(); i++) {
                        String str = v2.elementAt(i);
                        if(str.startsWith(text)){
                            tripVenueComboBox.setSelectedIndex(-1);
                            venueText.setText(str);
                            return;
                        }
                    }
                }
            }
        });
    }
    
    private static DefaultComboBoxModel getSuggestedModel(java.util.List<String> list, String text){
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        for (String s : list) {
            s = s.toUpperCase();
            if (s.startsWith(text.toUpperCase())) {
                m.addElement(s);
            }
        }
        return m;
    }
    
    public void loadData(Trip trip){
        updateTripButton.setEnabled(true);
        AddTripButton.setEnabled(false);
        ReferenceNoLabel.setText(trip.getReferenceNo());
        locationFromText.setText(trip.getTripFrom());
        locationToText.setText(trip.getTripTo());
        busNoCBox.setSelectedItem(trip.getBus().getBusNumber());
        dateTextField.setText(df.format(trip.getSchedule()));
        timeTextField.setText(df1.format(trip.getSchedule()));
        venueText.setText(trip.getVenue());
        priceText.setText(trip.getPrice()+"");
        this.trip = trip;
        this.oldTrip = trip;
    }
    
    private void ViewTripsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTripsButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewTripsButton1ActionPerformed

    private void updateTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTripButtonActionPerformed
        // TODO add your handling code here:
        if(locationFromText.getText().isEmpty() || locationToText.getText().isEmpty() || busNoCBox.getSelectedItem().toString().isEmpty() 
            || timeTextField.getText().isEmpty() || priceText.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the data.", "Not complete!", JOptionPane.ERROR_MESSAGE);
        }
        else if(new Date(dateTextField.getText()+" "+timeTextField.getText()).compareTo(today) < 0){
            JOptionPane.showMessageDialog(null, "Date must not be before today's date.", "Invalid date!", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            String locationFrom = locationFromText.getText();
            String locationTo = locationToText.getText();
            String time = timeTextField.getText();
            String date = dateTextField.getText();
            String busNo = busNoCBox.getSelectedItem().toString();
            Bus bus = search.searchBusByBusNo(busNo);      
            String venue = venueText.getText();
            String referenceNo = ReferenceNoLabel.getText();
            double price = Double.parseDouble(priceText.getText());
            trip.setTripFrom(locationFrom);
            trip.setTripTo(locationTo);
            trip.setBus(bus);
            trip.setSchedule(new Date(date+" "+time));
            trip.setVenue(venue);
            trip.setReferenceNo(referenceNo);
            trip.setPrice(price);
            reg.addTrip(trip);
            reg.removeTrip(trip);
            reg.addTrip(trip);
            int reply = JOptionPane.showConfirmDialog(null, "Notify driver and conductor for this trip?", "Notify crews", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Loading device... Please wait...", "Loading", JOptionPane.INFORMATION_MESSAGE);
                new SmsChangeInScheduleFrame().showChangedInTripScheduleNotificationSms1(oldTrip, trip);
                new SmsChangeInScheduleFrame().showChangedInTripScheduleNotificationSms2(oldTrip, trip);
            }
            JOptionPane.showMessageDialog(null, "The trip has been updated", "Finished", JOptionPane.INFORMATION_MESSAGE);
            this.hide();
            new ViewTripSchedulesFrame().show();
        }
    }//GEN-LAST:event_updateTripButtonActionPerformed

    private void busNoCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busNoCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busNoCBoxActionPerformed

    private void AddTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTripButtonActionPerformed
        // TODO add your handling code here:
        if(locationFromText.getText().isEmpty() || locationToText.getText().isEmpty() || busNoCBox.getSelectedItem().toString().isEmpty()
            || timeTextField.getText().isEmpty() || priceText.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the data.", "Not complete!", JOptionPane.ERROR_MESSAGE);
        }
        
        else if(new Date(dateTextField.getText()+" "+timeTextField.getText()).compareTo(today) < 0){
            JOptionPane.showMessageDialog(null, "Date must not be before today's date.", "Invalid date!", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            String locationFrom = locationFromText.getText();
            String locationTo = locationToText.getText();
            String time = timeTextField.getText();
            String date = dateTextField.getText();
            String busNo = busNoCBox.getSelectedItem().toString();
            Bus bus = search.searchBusByBusNo(busNo);      
            String venue = venueText.getText();
            String referenceNo = ReferenceNoLabel.getText();
            double price = Double.parseDouble(priceText.getText());  
            trip = new Trip(TripStatus.READY, price, locationFrom, locationTo, bus, new Date(date+" "+time), referenceNo, venue);
            reg.addTrip(trip);
            int reply = JOptionPane.showConfirmDialog(null, "Notify driver and conductor for this trip?", "Notify crews", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Loading device... Please wait...", "Loading", JOptionPane.INFORMATION_MESSAGE);
                new SmsChangeInScheduleFrame().showAddTripNotificationSms(trip);
            }
            JOptionPane.showMessageDialog(null, "The trip has been added", "Finished", JOptionPane.INFORMATION_MESSAGE);
            this.hide();
        }
    }//GEN-LAST:event_AddTripButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddTripFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTripFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTripFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTripFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTripFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTripButton;
    private javax.swing.JLabel ReferenceNoLabel;
    private javax.swing.JButton ViewTripsButton1;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox busNoCBox;
    private javax.swing.JPanel datePanel;
    private javax.swing.JFormattedTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox locationFromComboBox;
    private javax.swing.JComboBox locationToComboBox;
    private javax.swing.JTextField priceText;
    private javax.swing.JPanel timePanel;
    private javax.swing.JFormattedTextField timeTextField;
    private javax.swing.JComboBox tripVenueComboBox;
    private javax.swing.JButton updateTripButton;
    // End of variables declaration//GEN-END:variables
}
