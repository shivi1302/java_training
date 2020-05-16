/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.to.BookingDetailsTO;
import Model.to.BookingInfoTO;
import Utility.Errorhandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BookingInfoDAO extends DAO {
    public boolean insertRecord(BookingInfoTO record){
        try{
            String query="insert into Booking_Info";
            query +="(bookingid,customerid,bookingdate,staydate,typeID,noofdays,totalrooms,noofpeople)";
            query+="values(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,record.getBookingid());
             stmt.setInt(2,record.getCustomerid());
            stmt.setTimestamp(3,record.getBookingdate());
            stmt.setDate(4,record.getStaydate());
            stmt.setString(5,record.getTypeID());
            stmt.setInt(6,record.getNoofdays());
            stmt.setInt(7,record.getTotalrooms());
            stmt.setInt(8,record.getNoofpeople());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
     public boolean updateRecord(BookingInfoTO record){
        try{
            String query="update into Booking_Info";
            query +="set customerid=?,bookingdate=?,staydate=?,typeID=?,noofdays=?,totalrooms=?,noofpeople=?";
            query+="where bookingid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,record.getBookingid());
            stmt.setInt(2,record.getCustomerid());
            stmt.setTimestamp(3,record.getBookingdate());
            stmt.setDate(4,record.getStaydate());
            stmt.setString(5,record.getTypeID());
            stmt.setInt(6,record.getNoofdays());
            stmt.setInt(7,record.getTotalrooms());
            stmt.setInt(8,record.getNoofpeople());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public boolean deleteRecord(int bookingid){
        try{
            String query="delete from Booking_Info";
            query +="where bookingid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,bookingid);
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public BookingInfoTO getRecord(int bookingid){
        try{
            String query="select bookingid,customerid,bookingdate,staydate,typeID,noofdays,totalrooms,noofpeople";
            query +="from Booking_Info";
            query +="where bookingid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,bookingid);
            BookingInfoTO result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new BookingInfoTO();
                result.setBookingid(rs.getInt("bookingid"));
                result.setCustomerid(rs.getInt("customerid"));
                result.setBookingdate(rs.getTimestamp("bookingdate"));
                result.setStaydate(rs.getDate("staydate"));
                result.setTypeID(rs.getString("typeID"));
                result.setNoofdays(rs.getInt("noofdays"));
                result.setTotalrooms(rs.getInt("totalrooms"));
                result.setNoofpeople(rs.getInt("noofpeople"));
            }
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return null;
        }
    }
       public List<BookingInfoTO> getallRecord(){
        try{
            String query="select bookingid,customerid,bookingdate,staydate,typeID,noofdays,totalrooms,noofpeople";
            query +="from Booking_Info";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            List<BookingInfoTO> result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new ArrayList<>();
                do{
                    BookingInfoTO res = new BookingInfoTO(); 
                     res.setBookingid(rs.getInt("bookingid"));
                     res.setCustomerid(rs.getInt("customerid"));
                     res.setBookingdate(rs.getTimestamp("bookingdate"));
                     res.setStaydate(rs.getDate("staydate"));
                     res.setTypeID(rs.getString("typeID"));
                     res.setNoofdays(rs.getInt("noofdays"));
                     res.setTotalrooms(rs.getInt("totalrooms"));
                     res.setNoofpeople(rs.getInt("noofpeople"));
                      result.add(res);}
                    while(rs.next());
            }
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return null;
        }
    }
}

