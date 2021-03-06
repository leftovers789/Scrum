package UI;

import RegistryManagement.*;
import BookingManagement.*;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author james
 */
public class ViewTripSchedulesFrame extends javax.swing.JFrame {

    private Registry reg = Registry.getInstance();
    private List<Trip> tripList;
    private Trip trip;
    private DefaultTableModel tripsTableModel = new DefaultTableModel(new String[]{"Reference No.", "Route", "Schedule", "Bus No.", "Status"}, 0);
    private SearchEngine search = new SearchEngine();
    private SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    private TripStatus oldTripStatus;
    private TripStatus statusArrays[] = {TripStatus.READY, TripStatus.NOT_READY, TripStatus.DELAYED, TripStatus.CANCELLED, TripStatus.TRAVELING,};
    /**
     * Creates new form ViewTripMenu
     */
    public ViewTripSchedulesFrame() {
        initComponents();
        statusComboBox.disable();
        changeStatusButton.disable();
        tripListTable.setModel(tripsTableModel);
        tripList = (List<Trip>) search.searchAvailableTrips();
        for (Trip trip1 : tripList) {
            String route = trip1.getTripFrom()+" to "+trip1.getTripTo();
            tripsTableModel.addRow(new Object[]{ trip1.getReferenceNo(), route, df.format(trip1.getSchedule()),  trip1.getBus().getBusNumber(), trip1.getStatus()});
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

        editTripButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tripListTable = new javax.swing.JTable();
        removeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        statusComboBox = new javax.swing.JComboBox();
        changeStatusButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editTripButton.setText("Edit...");
        editTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTripButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        tripListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        tripListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tripListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tripListTable);
        DefaultTableCellRenderer centerRenderer= new DefaultTableCellRenderer();
        DefaultTableCellRenderer leftRenderer= new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer= new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        leftRenderer.setHorizontalAlignment (SwingConstants.LEFT);
        rightRenderer.setHorizontalAlignment (SwingConstants.RIGHT);
        tripListTable.setRowSelectionAllowed (true);
        tripListTable.setSelectionMode (ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tripListTable.setEnabled (true);
        tripListTable.setSelectionBackground (java.awt.Color.GRAY);
        tripListTable.setModel(new DefaultTableModel());
        tripList = (List<Trip>)search.searchAvailableTrips();
        for (int c = 0; c < tripListTable.getColumnCount(); c++)
        {
            Class<?> col_class = tripListTable.getColumnClass(c);
            tripListTable.setDefaultEditor(col_class, null);        // remove editor
        }

        removeButton.setText("Remove...");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Trip Schedules");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Change selectrip trip schedule status"));

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select-", "Ready", "Not Ready", "Delayed", "Cancelled", "Traveling" }));

        changeStatusButton.setText("Change Status");
        changeStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeStatusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeStatusButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeStatusButton))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editTripButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BackButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editTripButton)
                        .addComponent(BackButton)
                        .addComponent(removeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void editTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTripButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = tripListTable.getSelectedRow();
        AddTripFrame editTrip = new AddTripFrame();
        if (tripListTable.getSelectedRow() >= 0) {
            String refNo = (String) tripListTable.getValueAt(selectedRow, 0);
            trip = (Trip) search.searchByRefNo(refNo);
            editTrip.loadData(trip);
            editTrip.show();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row before!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editTripButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        tripsTableModel = new DefaultTableModel(new String[]{"Reference No.", "Route", "Schedule", "Bus No.", "Status"}, 0);
        int selectedRow = tripListTable.getSelectedRow();
        if (tripListTable.getSelectedRow() >= 0) {
            JOptionPane.showMessageDialog(null, "The trip has been removed.", "Information", JOptionPane.INFORMATION_MESSAGE);
            tripListTable.setModel(tripsTableModel);
            for (Trip trip1 : tripList) {
                String route = trip1.getTripFrom()+" to "+trip1.getTripTo();
                tripsTableModel.addRow(new Object[]{ trip1.getReferenceNo(), route, df.format(trip1.getSchedule()),  trip1.getBus().getBusNumber(), trip1.getStatus()});
            }
            int reply = JOptionPane.showConfirmDialog(null, "Remove this trip schedule?", "Confirm removing", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                String refNo = (String) tripListTable.getValueAt(selectedRow, 0);
                trip = (Trip) search.searchByRefNo(refNo);
                reg.removeTrip(trip);
                int reply2 = JOptionPane.showConfirmDialog(null, "Inform the driver and conductor of this trip?", "Notify crew", JOptionPane.YES_NO_OPTION);
                if (reply2 == JOptionPane.YES_OPTION){
                    new SmsChangeInScheduleFrame().showRemovedScheduleNotificationSms(trip);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row before!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void tripListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tripListTableMouseClicked
        // TODO add your handling code here:
        statusComboBox.enable();
        changeStatusButton.setEnabled(statusComboBox.isEnabled());
    }//GEN-LAST:event_tripListTableMouseClicked

    private void changeStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeStatusButtonActionPerformed
        // TODO add your handling code here:
        TripStatus newTripStatus = null;
        int selectedRow = tripListTable.getSelectedRow();
        oldTripStatus = (TripStatus) tripListTable.getValueAt(selectedRow, 4);
        if(statusComboBox.getSelectedIndex() == 1){
            newTripStatus = TripStatus.READY;
        }else if(statusComboBox.getSelectedIndex() == 2){
            newTripStatus = TripStatus.NOT_READY;
        }else if(statusComboBox.getSelectedIndex() == 3){
            newTripStatus = TripStatus.DELAYED;
        }else if(statusComboBox.getSelectedIndex() == 4){
            newTripStatus = TripStatus.CANCELLED;
        }else if(statusComboBox.getSelectedIndex() == 5){
            newTripStatus = TripStatus.TRAVELING;
        }
        if(oldTripStatus != newTripStatus && statusComboBox.getSelectedIndex() != 0){
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure to change this selected trip status?", "Confirm change status", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                String refNo = (String) tripListTable.getValueAt(selectedRow, 0);
                trip = (Trip) search.searchByRefNo(refNo);
                trip.setStatus(newTripStatus);
                reg.removeTrip(trip);
                reg.addTrip(trip);
                if(newTripStatus == TripStatus.CANCELLED){
                    int reply2 = JOptionPane.showConfirmDialog(null, "Notify driver and conductor of that trip?", "Notify crews", JOptionPane.YES_NO_OPTION);
                    if (reply2 == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Loading device... Please wait...", "Loading", JOptionPane.INFORMATION_MESSAGE);
                        new SmsChangeInScheduleFrame().showCanceledTripNotificationSms(trip);
                    }       
                } else if(newTripStatus == TripStatus.DELAYED){
                    int reply2 = JOptionPane.showConfirmDialog(null, "Notify driver and conductor of that trip?", "Notify crews", JOptionPane.YES_NO_OPTION);
                    if (reply2 == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, "Loading device... Please wait...", "Loading", JOptionPane.INFORMATION_MESSAGE);
                        new SmsChangeInScheduleFrame().showDelayedTripNotificationSms(trip);
                    }
                }
                JOptionPane.showMessageDialog(null, "The trip status has been changed", "Done", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_changeStatusButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewTripSchedulesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTripSchedulesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTripSchedulesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTripSchedulesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTripSchedulesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton changeStatusButton;
    private javax.swing.JButton editTripButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeButton;
    private javax.swing.JComboBox statusComboBox;
    private javax.swing.JTable tripListTable;
    // End of variables declaration//GEN-END:variables
}
