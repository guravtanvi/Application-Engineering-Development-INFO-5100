/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Logic.Car;
import Logic.CarInformationList;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tanvi Gurav
 */
public class ViewCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCarJPanel
     */
    private JPanel displayContainer;
    private List<Car> carList;
    

    public ViewCarJPanel(JPanel displayContainer, List<Car> carList) {
        initComponents();
        this.displayContainer = displayContainer;
        this.carList = carList;
        lblLastUpdateDate.setText(String.valueOf(CarInformationList.getDate()));
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewCarDetails = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDeleteDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        lblLastUpdateDate = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 0));

        tblViewCarDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Availability", "Manufactured Year", "Minimum Seats", "Maximum Seats", "Serial Number", "Model Number", "Available City", "Maintainence Certificate Validity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewCarDetails);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("VIEW CAR DETAILS");

        btnUpdate.setBackground(new java.awt.Color(255, 204, 0));
        btnUpdate.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnUpdate.setText("Edit Record");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDeleteDetails.setBackground(new java.awt.Color(255, 204, 0));
        btnDeleteDetails.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnDeleteDetails.setText("Delete Record");
        btnDeleteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDetailsActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 204, 0));
        btnBack.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(255, 204, 0));
        btnRefresh.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnRefresh.setText("View Updated Record");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblLastUpdateDate.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        lblLastUpdateDate.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLastUpdateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLastUpdateDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(202, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblViewCarDetails.getModel();
        dtm.setRowCount(0);
        
        //CarInformationList carin = new CarInformationList();
        for(Car car: carList){
            
            Object[] row = new Object[9];
            row[0] = car;
            row[1] = car.isAvailable();//car.getBrand();
            row[2] = car.getManufactured_year();
            row[3] = car.getMin_seats();
            row[4] = car.getMax_seats();
            row[5] = car.getSerial_num();
            row[6] = car.getModel_num();
            row[7] = car.getAvailble_city();
            row[8] = car.isMaintenance_certificate();

            dtm.addRow(row);
          
         
        }
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
       // populateTable();
        displayContainer.remove(this);
        CardLayout layout = (CardLayout) displayContainer.getLayout();
        layout.previous(displayContainer);
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        int selectedRow = tblViewCarDetails.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a record from table", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Car car = (Car) tblViewCarDetails.getValueAt(selectedRow, 0);
            //populateTable(); //temp
            
            UpdateAccountJPanel updatepanel = new UpdateAccountJPanel(displayContainer, car);
            
            CardLayout layout = (CardLayout) displayContainer.getLayout();
            displayContainer.add("UpdateAccountJPanel", updatepanel);
            layout.next(displayContainer);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDetailsActionPerformed
        
        int selectedRow = tblViewCarDetails.getSelectedRow();
        
        if(selectedRow>=0){
            
            int dialogButton = JOptionPane.YES_NO_OPTION;     
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the acount details", "Warning", dialogButton);
            
            if(dialogResult == JOptionPane.YES_OPTION){
                
                Car car = (Car) tblViewCarDetails.getValueAt(selectedRow, 0);
                CarInformationList.deleteCar(car);
              //  accountDirectory.deleteAccount(account);
                populateTable();
            } 
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from table", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteDetailsActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
        JOptionPane.showMessageDialog(null, "Table is up to date");
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteDetails;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLastUpdateDate;
    private javax.swing.JTable tblViewCarDetails;
    // End of variables declaration//GEN-END:variables
}
