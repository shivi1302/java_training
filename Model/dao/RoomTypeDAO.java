/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.to.BookingDetailsTO;
import Model.to.RoomTypeTO;
import Utility.Errorhandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class RoomTypeDAO extends DAO {
    public boolean insertRecord(RoomTypeTO record){
        try{
            String query="insert into Room_Type";
            query +="(typeID,typename,chargesperday,description)";
            query+="values(?,?,?,?)";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getTypeID());
            stmt.setString(2,record.getTypename());
            stmt.setFloat(3,record.getChargesperday());
            stmt.setString(4,record.getDescription());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
     public boolean updateRecord(RoomTypeTO record){
        try{
            String query="update into Room_Type";
            query +="set typename=?,chargesperday=?,description=?";
            query+="where typeID=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getTypeID());
            stmt.setString(2,record.getTypename());
            stmt.setFloat(3,record.getChargesperday());
            stmt.setString(4,record.getDescription());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public boolean deleteRecord(String typeID){
        try{
            String query="delete from Room_type";
            query +="where typeID=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,typeID);
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public RoomTypeTO getRecord(String typeID){
        try{
            String query="select typeID,typename,chargesperday,description";
            query +="from Room_Type";
            query +="where typeID=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,typeID);
            RoomTypeTO result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new RoomTypeTO();
                result.setTypeID(rs.getString("typeID"));
                result.setTypename(rs.getString("typename"));
                result.setChargesperday(rs.getFloat("chargesperday"));
                result.setDescription(rs.getString("description"));
            }
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return null;
        }
    }
       public List<RoomTypeTO> getallRecord(){
        try{
            String query="select typeID,typename,chargesperday,description";
            query +="from Room_Info";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            List<RoomTypeTO> result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new ArrayList<>();
                do{
                    RoomTypeTO res = new RoomTypeTO();                
                res.setTypeID(rs.getString("typeID"));
                res.setTypename(rs.getString("typename"));
                res.setChargesperday(rs.getFloat("chargesperday"));
                res.setDescription(rs.getString("description"));
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

