/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.to.BookingDetailsTO;
import Utility.Errorhandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BookingDetailsDAO extends DAO {
    public boolean insertRecord(BookingDetailsTO record){
        try{
            String query="insert into Booking_details";
            query +="(detailid,bookingid,roomid)";
            query+="values(?,?,?)";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,record.getDetailid());
            stmt.setInt(2,record.getBookingid());
            stmt.setInt(3,record.getRoomid());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
     public boolean updateRecord(BookingDetailsTO record){
        try{
            String query="update into Booking_details";
            query +="set detailid=?,roomid=?";
            query+="where bookingid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,record.getDetailid());
            stmt.setInt(2,record.getBookingid());
            stmt.setInt(2,record.getRoomid());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public boolean deleteRecord(int detailid){
        try{
            String query="delete from Booking_details";
            query +="where detailid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,detailid);
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public BookingDetailsTO getRecord(int detailid){
        try{
            String query="select detailid,bookingid,roomid";
            query +="from Booking_details";
            query +="where detailid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,detailid);
            BookingDetailsTO result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new BookingDetailsTO();
                result.setDetailid(rs.getInt("detailid"));
                result.setBookingid(rs.getInt("bookingid"));
                result.setRoomid(rs.getInt("roomid"));
            }
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return null;
        }
    }
       public List<BookingDetailsTO> getallRecord(){
        try{
            String query="select detailid,bookingid,roomid";
            query +="from Booking_details";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            List<BookingDetailsTO> result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new ArrayList<>();
                do{
                    BookingDetailsTO res = new BookingDetailsTO();                
                    res.setDetailid(rs.getInt("detailid"));
                    res.setBookingid(rs.getInt("bookingid"));
                    res.setRoomid(rs.getInt("roomid"));
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
