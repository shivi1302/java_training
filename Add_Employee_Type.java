/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_Screen;

import Model.dao.EmployeeInfoDAO;
import Model.dao.EmployeeTypeDAO;
import Model.to.EmployeeInfoTO;
import Model.to.EmployeeTypeTO;
import Utility.Validations;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Add_Employee_Type extends javax.swing.JInternalFrame implements ActionListener {

    /**
     * Creates new form Add_Employee_Type
     */
    public Add_Employee_Type() {
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

        lblTypename = new javax.swing.JLabel();
        jtftypename = new javax.swing.JTextField();
        lblTypeid = new javax.swing.JLabel();
        jtftypeid = new javax.swing.JTextField();
        lblbasicsalary = new javax.swing.JLabel();
        jtfbasicsalary = new javax.swing.JTextField();
        jbtnAddtype = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Add new type of Employee");

        lblTypename.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTypename.setText("Enter Type Name:");

        jtftypename.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        lblTypeid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTypeid.setText("Enter Employee Type id:");

        jtftypeid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        lblbasicsalary.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblbasicsalary.setText("Basic salary:");

        jtfbasicsalary.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jbtnAddtype.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnAddtype.setText("Add Employee Type");
        jbtnAddtype.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTypename, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbasicsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtftypename, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfbasicsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jbtnAddtype, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(lblTypeid, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(611, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(468, Short.MAX_VALUE)
                    .addComponent(jtftypeid, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypename, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftypename, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbasicsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfbasicsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jbtnAddtype, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(lblTypeid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(382, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jtftypeid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(382, Short.MAX_VALUE)))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jbtnAddtype) {
            Add_Employee_Type.this.jbtnAddtypeActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddtypeActionPerformed
        String message="";
        String Employeetypeid = jtftypeid.getText().trim();
        String Employeetypename = jtftypename.getText().trim();
        String Basicsalary = jtfbasicsalary.getText().trim();
        if(Validations.isEmpty(Employeetypeid)||Validations.isEmpty(Employeetypename)||Validations.isEmpty(Basicsalary))
        {
            message="Please fill all boxes";
        }else{
            EmployeeTypeTO record =new EmployeeTypeTO();
            record.setEmptypeid(Employeetypeid);
            record.setEmptypename(Employeetypename);
            record.setBasicsalary(Float.parseFloat(Basicsalary));
            EmployeeTypeDAO action = new EmployeeTypeDAO();
            if(action.insertRecord(record)){
                message ="Employee type is inserted";
            }else{
                message="Insertion failure"+ action.getError_message();
            }
             JOptionPane.showMessageDialog(this, message);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jbtnAddtypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnAddtype;
    private javax.swing.JTextField jtfbasicsalary;
    private javax.swing.JTextField jtftypeid;
    private javax.swing.JTextField jtftypename;
    private javax.swing.JLabel lblTypeid;
    private javax.swing.JLabel lblTypename;
    private javax.swing.JLabel lblbasicsalary;
    // End of variables declaration//GEN-END:variables
}
