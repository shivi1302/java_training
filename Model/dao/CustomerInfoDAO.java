/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.to.BookingDetailsTO;
import Model.to.CustomerInfoTO;
import Utility.Errorhandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class CustomerInfoDAO extends DAO {
    public boolean insertRecord(CustomerInfoTO record){
        try{
            String query="insert into Customer_Info";
            query +="(customername,adhaarcard)";
            query+="values(?,?)";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getCustomername());
            stmt.setInt(2,record.getAdhaarcard());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
     public boolean updateRecord(CustomerInfoTO record){
        try{
            String query="update into Customer_Info";
            query +="set customername=?,adhaarcard=?";
            query+="where customerid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getCustomername());
            stmt.setInt(2,record.getCustomerid());
            stmt.setInt(3,record.getAdhaarcard());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public boolean deleteRecord(int customerid){
        try{
            String query="delete from Customer_Info";
            query +="where customerid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,customerid);
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public CustomerInfoTO getRecord(int customerid){
        try{
            String query="select customerid,customername,adhaarcard";
            query +="from Customer_Info";
            query +="where customerid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,customerid);
            CustomerInfoTO result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new CustomerInfoTO();
                result.setCustomerid(rs.getInt("customerid"));
                result.setCustomername(rs.getString("customername"));
                result.setAdhaarcard(rs.getInt("adhaarcard"));
            }
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return null;
        }
    }
       public List<CustomerInfoTO> getallRecord(){
        try{
            String query="select customerid , customername ,adhaarcard ";
            query +=" from Customer_Info";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            List<CustomerInfoTO> result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new ArrayList<>();
                do{
                    CustomerInfoTO res = new CustomerInfoTO();                
                    res.setCustomerid(rs.getInt("customerid"));
                res.setCustomername(rs.getString("customername"));
                res.setAdhaarcard(rs.getInt("adhaarcard"));
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

