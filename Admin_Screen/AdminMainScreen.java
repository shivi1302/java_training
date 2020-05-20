/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_Screen;

import Model.dao.DataConnection;
import Utility.Errorhandler;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import static Utility.Operations.openInternalFrame;
import static Utility.Operations.setApplicationIcon;

/**
 *
 * @author DELL
 */
public class AdminMainScreen extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form AdminMainScreen
     */
    public AdminMainScreen() {
        
        setApplicationIcon(this);
        initComponents();
        setSize(1000,650);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Deskpane = new javax.swing.JDesktopPane();
        Admin_menu_bar = new javax.swing.JMenuBar();
        Menu_Employee = new javax.swing.JMenu();
        Add_Employee = new javax.swing.JMenuItem();
        newEmployeeType = new javax.swing.JMenuItem();
        jmbViewEmployee = new javax.swing.JMenuItem();
        Menu_Rooms = new javax.swing.JMenu();
        Add_Room = new javax.swing.JMenuItem();
        View_Rooms = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DeskpaneLayout = new javax.swing.GroupLayout(Deskpane);
        Deskpane.setLayout(DeskpaneLayout);
        DeskpaneLayout.setHorizontalGroup(
            DeskpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1196, Short.MAX_VALUE)
        );
        DeskpaneLayout.setVerticalGroup(
            DeskpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );

        getContentPane().add(Deskpane, java.awt.BorderLayout.CENTER);

        Menu_Employee.setText("Employee");
        Menu_Employee.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        Add_Employee.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        Add_Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        Add_Employee.setText("New Employee");
        Add_Employee.addActionListener(this);
        Menu_Employee.add(Add_Employee);

        newEmployeeType.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        newEmployeeType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/registration.png"))); // NOI18N
        newEmployeeType.setText("New Employee type");
        newEmployeeType.addActionListener(this);
        Menu_Employee.add(newEmployeeType);

        jmbViewEmployee.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jmbViewEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/show.png"))); // NOI18N
        jmbViewEmployee.setText("View Employees");
        jmbViewEmployee.addActionListener(this);
        Menu_Employee.add(jmbViewEmployee);

        Admin_menu_bar.add(Menu_Employee);

        Menu_Rooms.setText("Rooms");
        Menu_Rooms.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N

        Add_Room.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        Add_Room.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        Add_Room.setText("New Room");
        Add_Room.addActionListener(this);
        Menu_Rooms.add(Add_Room);

        View_Rooms.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        View_Rooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/show.png"))); // NOI18N
        View_Rooms.setText("View Room Type");
        View_Rooms.addActionListener(this);
        Menu_Rooms.add(View_Rooms);

        Admin_menu_bar.add(Menu_Rooms);

        setJMenuBar(Admin_menu_bar);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == Add_Employee) {
            AdminMainScreen.this.Add_EmployeeActionPerformed(evt);
        }
        else if (evt.getSource() == newEmployeeType) {
            AdminMainScreen.this.newEmployeeTypeActionPerformed(evt);
        }
        else if (evt.getSource() == jmbViewEmployee) {
            AdminMainScreen.this.jmbViewEmployeeActionPerformed(evt);
        }
        else if (evt.getSource() == Add_Room) {
            AdminMainScreen.this.Add_RoomActionPerformed(evt);
        }
        else if (evt.getSource() == View_Rooms) {
            AdminMainScreen.this.View_RoomsActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void Add_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_EmployeeActionPerformed
        openInternalFrame(Deskpane, new Add_Employee_Detail());
    }//GEN-LAST:event_Add_EmployeeActionPerformed

    private void newEmployeeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployeeTypeActionPerformed
        openInternalFrame(Deskpane, new Add_Employee_Type());// TODO add your handling code here:
    }//GEN-LAST:event_newEmployeeTypeActionPerformed

    private void jmbViewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbViewEmployeeActionPerformed
        openInternalFrame(Deskpane, new ViewEmployee());// TODO add your handling code here:
    }//GEN-LAST:event_jmbViewEmployeeActionPerformed

    private void Add_RoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_RoomActionPerformed
        openInternalFrame(Deskpane, new Add_Room());// TODO add your handling code here:
    }//GEN-LAST:event_Add_RoomActionPerformed

    private void View_RoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_RoomsActionPerformed
        openInternalFrame(Deskpane, new View_Rooms());// TODO add your handling code here:
    }//GEN-LAST:event_View_RoomsActionPerformed
    private void formWindowClosing(java.awt.event.WindowEvent evt){
        try{
        DataConnection.closeConnection();
        }catch(Exception ex){Errorhandler.showErrorStack(ex);}
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
            java.util.logging.Logger.getLogger(AdminMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Add_Employee;
    private javax.swing.JMenuItem Add_Room;
    private javax.swing.JMenuBar Admin_menu_bar;
    private javax.swing.JDesktopPane Deskpane;
    private javax.swing.JMenu Menu_Employee;
    private javax.swing.JMenu Menu_Rooms;
    private javax.swing.JMenuItem View_Rooms;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmbViewEmployee;
    private javax.swing.JMenuItem newEmployeeType;
    // End of variables declaration//GEN-END:variables
}
