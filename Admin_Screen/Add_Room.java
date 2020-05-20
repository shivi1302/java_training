/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_Screen;

import Model.dao.RoomTypeDAO;
import Model.to.RoomTypeTO;
import Utility.Validations;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Add_Room extends javax.swing.JInternalFrame implements ActionListener {

    /**
     * Creates new form Add_Room
     */
    public Add_Room() {
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

        jtfRoomtypeid = new javax.swing.JTextField();
        lblRoomtypeid = new javax.swing.JLabel();
        lblRoomtypename = new javax.swing.JLabel();
        jtfRoomtypename = new javax.swing.JTextField();
        lblRoomdesc = new javax.swing.JLabel();
        jtfRoomcharges = new javax.swing.JTextField();
        lblRoomcharges1 = new javax.swing.JLabel();
        btnAdd_room = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaRoomDesc = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Add Room Type");

        jtfRoomtypeid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        lblRoomtypeid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblRoomtypeid.setText("Enter Room Type ID:");

        lblRoomtypename.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblRoomtypename.setText("Enter Room Type Name:");

        jtfRoomtypename.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        lblRoomdesc.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblRoomdesc.setText("Description:");

        jtfRoomcharges.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtfRoomcharges.addActionListener(this);

        lblRoomcharges1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblRoomcharges1.setText("Charges per day:");

        btnAdd_room.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAdd_room.setText("Add Room Type");
        btnAdd_room.addActionListener(this);

        jtaRoomDesc.setColumns(20);
        jtaRoomDesc.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtaRoomDesc.setRows(5);
        jScrollPane1.setViewportView(jtaRoomDesc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoomtypeid, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRoomtypename, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRoomdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRoomcharges1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfRoomtypeid, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addComponent(jtfRoomtypename, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addComponent(jtfRoomcharges, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(btnAdd_room, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfRoomtypeid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRoomtypeid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomtypename, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRoomtypename, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomcharges1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRoomcharges, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblRoomdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnAdd_room, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jtfRoomcharges) {
            Add_Room.this.jtfRoomchargesActionPerformed(evt);
        }
        else if (evt.getSource() == btnAdd_room) {
            Add_Room.this.btnAdd_roomActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jtfRoomchargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRoomchargesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRoomchargesActionPerformed

    private void btnAdd_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_roomActionPerformed
               String message="";
        String Roomtypeid = jtfRoomtypeid.getText().trim();
        String Roomtypename = jtfRoomtypename.getText().trim();
        String Chargesperday = jtfRoomcharges.getText().trim();
        String Description = jtaRoomDesc.getText().trim();
        if(Validations.isEmpty(Roomtypeid)||Validations.isEmpty(Roomtypename)||Validations.isEmpty(Chargesperday))
        {
            message="Please fill all boxes";
        }else{
            RoomTypeTO record =new RoomTypeTO();
            record.setTypeID(Roomtypeid);
            record.setTypename(Roomtypename);
            record.setChargesperday(Float.parseFloat(Chargesperday));
            record.setDescription(Description);
            RoomTypeDAO action = new RoomTypeDAO();
            if(action.insertRecord(record)){
                message ="Room type is inserted";
            }else{
                message="Insertion failure"+ action.getError_message();
            }
             JOptionPane.showMessageDialog(this, message);
        } // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd_roomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd_room;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaRoomDesc;
    private javax.swing.JTextField jtfRoomcharges;
    private javax.swing.JTextField jtfRoomtypeid;
    private javax.swing.JTextField jtfRoomtypename;
    private javax.swing.JLabel lblRoomcharges1;
    private javax.swing.JLabel lblRoomdesc;
    private javax.swing.JLabel lblRoomtypeid;
    private javax.swing.JLabel lblRoomtypename;
    // End of variables declaration//GEN-END:variables
}
