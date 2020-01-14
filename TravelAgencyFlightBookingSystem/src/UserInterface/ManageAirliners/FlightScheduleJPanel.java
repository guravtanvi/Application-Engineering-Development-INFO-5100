/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.AirlineDirectory;
import Business.Airliner;
import Business.Flight;
import Business.FlightScheduleDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Team Void
 */
public class FlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FlightScheduleJPanel
     */
 
     
    private FlightScheduleDirectory flightScheduleDirectory;
    private AirlineDirectory airlineDirectory;
    private JPanel rightPanel;

    
    public FlightScheduleJPanel(JPanel rightPanel, FlightScheduleDirectory flightScheduleDirectory,AirlineDirectory airlineDirectory) {
        
         initComponents();
         this.rightPanel =  rightPanel;
         this.flightScheduleDirectory = flightScheduleDirectory;
         this.airlineDirectory=airlineDirectory;
         populate();
         initialz();
    }
    
    private void populate() {
        
        DefaultTableModel dtm = (DefaultTableModel) tblFlights.getModel();
        dtm.setRowCount(0);
        
        for(Flight f: flightScheduleDirectory.getFlightSchedule()){
            System.out.println(flightScheduleDirectory.getFlightSchedule());
            Object[] row = new Object[9];
            row[0] = f;
            row[1] = f.getFlightNumber();
            row[2] = f.getSource();
            row[3] = f.getDepartureTime();
            row[4] = f.getDestination();
            row[5] = f.getArrivalTime();
            row[6] = f.getDuration();
            row[7] = f.getDate();
            row[8] = f.getPrice();
           

            dtm.addRow(row);
        }
    }
    
    private void initialz() {
        
        comboAirlinerName.removeAllItems();
        
        for(Airliner a: airlineDirectory.getAirlineList()){
            comboAirlinerName.addItem(a.getAirlinerName());
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlights = new javax.swing.JTable();
        btnNewFlight = new javax.swing.JButton();
        btnViewFlights = new javax.swing.JButton();
        comboAirlinerName = new javax.swing.JComboBox<>();
        btnViewAirliner = new javax.swing.JButton();
        btnAllFlights = new javax.swing.JButton();
        btnDeleteAirliner = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel1.setText("Master Flight Schedule");

        tblFlights.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        tblFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Flight Number", "Source", "Departure Time", "Destination", "Arrival Time", "Duration", "Date", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFlights);

        btnNewFlight.setBackground(new java.awt.Color(0, 0, 0));
        btnNewFlight.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnNewFlight.setForeground(new java.awt.Color(204, 153, 255));
        btnNewFlight.setText("Add New Flights");
        btnNewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewFlightActionPerformed(evt);
            }
        });

        btnViewFlights.setBackground(new java.awt.Color(0, 0, 0));
        btnViewFlights.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnViewFlights.setForeground(new java.awt.Color(204, 153, 255));
        btnViewFlights.setText("Update Flight Details");
        btnViewFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFlightsActionPerformed(evt);
            }
        });

        comboAirlinerName.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        comboAirlinerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAirlinerNameActionPerformed(evt);
            }
        });

        btnViewAirliner.setBackground(new java.awt.Color(0, 0, 0));
        btnViewAirliner.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnViewAirliner.setForeground(new java.awt.Color(204, 153, 255));
        btnViewAirliner.setText("View Schedule");
        btnViewAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAirlinerActionPerformed(evt);
            }
        });

        btnAllFlights.setBackground(new java.awt.Color(0, 0, 0));
        btnAllFlights.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnAllFlights.setForeground(new java.awt.Color(204, 153, 255));
        btnAllFlights.setText("View All Flights");
        btnAllFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllFlightsActionPerformed(evt);
            }
        });

        btnDeleteAirliner.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteAirliner.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        btnDeleteAirliner.setForeground(new java.awt.Color(204, 153, 255));
        btnDeleteAirliner.setText("Delete Flight");
        btnDeleteAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAirlinerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(comboAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNewFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAllFlights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewFlights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteAirliner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAllFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewFlightActionPerformed
       
        
        NewFlightJPanel newflightpanel = new NewFlightJPanel(rightPanel, flightScheduleDirectory, airlineDirectory);
        rightPanel.add("NewFlightJPanel",newflightpanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
        
    }//GEN-LAST:event_btnNewFlightActionPerformed

    private void btnViewFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFlightsActionPerformed
  
        
        int selectedRow = tblFlights.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select a Row from table first","warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
        Flight flight = (Flight) tblFlights.getValueAt(selectedRow,0);
        ViewFlightsJPanel viewflightspanel = new ViewFlightsJPanel(rightPanel,flight, flightScheduleDirectory, airlineDirectory);
        rightPanel.add("ViewFlightsJPanel",viewflightspanel);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);

        }
        

        
       
    }//GEN-LAST:event_btnViewFlightsActionPerformed

    private void btnViewAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAirlinerActionPerformed
        
        ArrayList<Flight> flist = new ArrayList<>(); 
      
        
        for(Flight f: flightScheduleDirectory.getFlightSchedule()){
            
            if(f.getAirlineName().equalsIgnoreCase((String)this.comboAirlinerName.getSelectedItem()))
            flist.add(f);
            
        }
        
        if (flist.isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Sorry there are no flights available for Selected Airliner");
        }
        
        DefaultTableModel dtm = (DefaultTableModel) tblFlights.getModel();
        dtm.setRowCount(0);
        
        for(Flight f: flist){
            
            Object[] row = new Object[9];
            row[0] = f;
            row[1] = f.getFlightNumber();
            row[2] = f.getSource();
            row[3] = f.getDepartureTime();
            row[4] = f.getDestination();
            row[5] = f.getArrivalTime();
            row[6] = f.getDuration();
            row[7] = f.getDate();
            row[8] = f.getPrice();

            dtm.addRow(row);
        }
        
        
        
    }//GEN-LAST:event_btnViewAirlinerActionPerformed

    private void comboAirlinerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAirlinerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAirlinerNameActionPerformed

    private void btnAllFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllFlightsActionPerformed

        populate();
    }//GEN-LAST:event_btnAllFlightsActionPerformed

    private void btnDeleteAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAirlinerActionPerformed

        int selectedRow = tblFlights.getSelectedRow();

        if(selectedRow>=0){

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the selected flight", "Warning", dialogButton);

            if(dialogResult == JOptionPane.YES_OPTION){

                Flight a = (Flight) tblFlights.getValueAt(selectedRow, 0);
                flightScheduleDirectory.deleteAirliner(a);

                populate();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a record from table", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnDeleteAirlinerActionPerformed

    
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllFlights;
    private javax.swing.JButton btnDeleteAirliner;
    private javax.swing.JButton btnNewFlight;
    private javax.swing.JButton btnViewAirliner;
    private javax.swing.JButton btnViewFlights;
    private javax.swing.JComboBox<String> comboAirlinerName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFlights;
    // End of variables declaration//GEN-END:variables

    

 
}
