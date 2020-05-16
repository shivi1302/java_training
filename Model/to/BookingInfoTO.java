/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.to;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author DELL
 */
public class BookingInfoTO {
       private int bookingid;
       private int customerid;
       private Timestamp bookingdate;
       private Date staydate;
       private String typeID;
       private int noofdays;
       private int totalrooms;
       private int noofpeople;

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public int getBookingid() {
        return bookingid;
    }

    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public Timestamp getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(Timestamp bookingdate) {
        this.bookingdate = bookingdate;
    }

    public Date getStaydate() {
        return staydate;
    }

    public void setStaydate(Date staydate) {
        this.staydate = staydate;
    }

   

    public int getNoofdays() {
        return noofdays;
    }

    public void setNoofdays(int noofdays) {
        this.noofdays = noofdays;
    }

    public int getTotalrooms() {
        return totalrooms;
    }

    public void setTotalrooms(int totalrooms) {
        this.totalrooms = totalrooms;
    }

    public int getNoofpeople() {
        return noofpeople;
    }

    public void setNoofpeople(int noofpeople) {
        this.noofpeople = noofpeople;
    }
}
