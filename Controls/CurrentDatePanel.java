/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

import Utility.Errorhandler;
import com.sun.javafx.scene.control.SelectedCellsMap;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author DELL
 */
public class CurrentDatePanel extends javax.swing.JPanel implements ItemListener {
private GregorianCalendar gcal;
    /**
     * Creates new form CurrentDatePanel
     */
    public CurrentDatePanel() {
        initComponents();
        gcal= new GregorianCalendar();
        jcbYear.removeAllItems();
        jcbYear.addItem("Year");
        int Current_year =gcal.get(Calendar.YEAR);
        for(int year=Current_year;year>=2019;year--){
            jcbYear.addItem(year);
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

        jcbYear = new javax.swing.JComboBox<>();
        jcbMonth = new javax.swing.JComboBox<>();
        jcbDate = new javax.swing.JComboBox<>();

        jcbYear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jcbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbYear.addItemListener(this);

        jcbMonth.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jcbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMonth.addItemListener(this);

        jcbDate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jcbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcbYear, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
            .addComponent(jcbMonth)
            .addComponent(jcbDate)
        );
    }

    // Code for dispatching events from components to event handlers.

    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        if (evt.getSource() == jcbYear) {
            CurrentDatePanel.this.jcbYearItemStateChanged(evt);
        }
        else if (evt.getSource() == jcbMonth) {
            CurrentDatePanel.this.jcbMonthItemStateChanged(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jcbYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbYearItemStateChanged
        int Month_selected_index= jcbMonth.getSelectedIndex();
        jcbMonth.removeAllItems();
        jcbMonth.addItem("Month");
        if(jcbYear.getSelectedIndex()>0){
            int Selected_year = Integer.parseInt(jcbYear.getSelectedItem().toString());
            int Current_year = gcal.get(Calendar.YEAR);
            MonthList[] months= MonthList.values();
            int begin_index=0;
            int end_index = months.length-1;
            if(Selected_year==Current_year){
                end_index=gcal.get(Calendar.MONTH);
            }
            for(int index=begin_index;index<=end_index;index++){
                jcbMonth.addItem(months[index]);
            }
            if(Month_selected_index<jcbMonth.getItemCount()){
                jcbMonth.setSelectedIndex(Month_selected_index);
            }
        }
    }//GEN-LAST:event_jcbYearItemStateChanged

    private void jcbMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbMonthItemStateChanged
       int date_selected_index=jcbDate.getSelectedIndex();
        jcbDate.removeAllItems();
       jcbDate.addItem("Date");
       if(jcbMonth.getSelectedIndex()>0){
           int Selected_year = Integer.parseInt(jcbYear.getSelectedItem().toString());
            int Current_year = gcal.get(Calendar.YEAR);
            int Current_month =gcal.get(Calendar.MONTH);
            MonthList Selected_month =(MonthList) jcbMonth.getSelectedItem();
            int Start_date=1;
            int End_date = Selected_month.getTotal_days();
            if(Selected_year==Current_year && Current_month==Selected_month.ordinal()){
                End_date=gcal.get(Calendar.DATE);
            }else if(Selected_month == MonthList.February){
                End_date=gcal.isLeapYear(Selected_year) ? 29:28;
            }
            for(int date=Start_date;date<=End_date;date++){
                jcbDate.addItem(date);
            }
            if(date_selected_index<jcbDate.getItemCount()){
                jcbDate.setSelectedIndex(date_selected_index);
            }  
       }
    }//GEN-LAST:event_jcbMonthItemStateChanged
    public Date getSelectedDate(){
        Date selected_Date = null;
        try{
            if(jcbYear.getSelectedIndex()>0 && jcbMonth.getSelectedIndex()>0 && jcbDate.getSelectedIndex()>0){
                int Year = Integer.parseInt(jcbYear.getSelectedItem().toString());
                int Month = jcbMonth.getSelectedIndex();
                int Date = jcbDate.getSelectedIndex();
                String Date_string = Year + "-" + Month + "-" + Date; 
            }
        }catch(Exception ex){
            Errorhandler.showErrorStack(ex);
        }
        return selected_Date;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<java.lang.Object> jcbDate;
    private javax.swing.JComboBox<java.lang.Object> jcbMonth;
    private javax.swing.JComboBox<java.lang.Object> jcbYear;
    // End of variables declaration//GEN-END:variables
}
