/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee_Screen;

import Model.dao.CustomerInfoDAO;
import Model.to.CustomerInfoTO;
import Utility.Validations;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Add_Customer extends javax.swing.JInternalFrame implements ActionListener {

    /**
     * Creates new form Add_Customer
     */
    public Add_Customer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfCustomerName = new javax.swing.JTextField();
        lblCustomerName = new javax.swing.JLabel();
        lblCustomerAdhaarcard = new javax.swing.JLabel();
        jtfCustomerAdhaarcard = new javax.swing.JTextField();
        btnNewcus = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Add new customer!!!");

        jtfCustomerName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        lblCustomerName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblCustomerName.setText("Enter Customer Name:");

        lblCustomerAdhaarcard.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblCustomerAdhaarcard.setText("Enter Customer Adhaarcard:");

        jtfCustomerAdhaarcard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btnNewcus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnNewcus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/registration.png"))); // NOI18N
        btnNewcus.setText("Add New Customer");
        btnNewcus.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCustomerAdhaarcard, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCustomerAdhaarcard, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(btnNewcus, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCustomerAdhaarcard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerAdhaarcard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addComponent(btnNewcus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == btnNewcus) {
            Add_Customer.this.btnNewcusActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewcusActionPerformed
        String message="";
        String CustomerName = jtfCustomerName.getText().trim();
        String Customeradhaar = jtfCustomerAdhaarcard.getText().trim();  
        if(Validations.isEmpty(CustomerName)||Validations.isEmpty(Customeradhaar)){
            message = "Please fill all boxes";
        }else if(!Validations.onlyLetterAndSpace(CustomerName)){
            message += "please enter only alphabets in Employee Name\n\n";
        }else{
        CustomerInfoTO record =new CustomerInfoTO();
            record.setCustomername(CustomerName);
            record.setAdhaarcard(Integer.parseInt(Customeradhaar));
            CustomerInfoDAO action = new CustomerInfoDAO();
            if(action.insertRecord(record)){
                message ="Employee is inserted";
            }else{
                message="Insertion failure"+ action.getError_message();
            }
        }
            JOptionPane.showMessageDialog(this, message);
    }//GEN-LAST:event_btnNewcusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewcus;
    private javax.swing.JTextField jtfCustomerAdhaarcard;
    private javax.swing.JTextField jtfCustomerName;
    private javax.swing.JLabel lblCustomerAdhaarcard;
    private javax.swing.JLabel lblCustomerName;
    // End of variables declaration//GEN-END:variables
}
