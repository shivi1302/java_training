/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.to.BookingDetailsTO;
import Model.to.RoomInfoTO;
import Utility.Errorhandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class RoomInfoDAO extends DAO {
    public boolean insertRecord(RoomInfoTO record){
        try{
            String query="insert into Room_Info";
            query +="(typeID,roomid)";
            query+="values(?,?)";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getTypeID());
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
     public boolean updateRecord(RoomInfoTO record){
        try{
            String query="update into Room_Info";
            query +="set typeID=?";
            query+="where roomid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getTypeID());
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
       public boolean deleteRecord(int roomid){
        try{
            String query="delete from Room_Info";
            query +="where roomid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,roomid);
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public RoomInfoTO getRecord(int roomid){
        try{
            String query="select typeID,roomid";
            query +="from Room_Info";
            query +="where roomid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,roomid);
            RoomInfoTO result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new RoomInfoTO();
                result.setTypeID(rs.getString("typeID"));
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
       public List<RoomInfoTO> getallRecord(){
        try{
            String query="select typeID,roomid";
            query +="from Room_Info";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            List<RoomInfoTO> result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new ArrayList<>();
                do{
                    RoomInfoTO res = new RoomInfoTO();                
                    res.setTypeID(rs.getString("typeID"));
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
