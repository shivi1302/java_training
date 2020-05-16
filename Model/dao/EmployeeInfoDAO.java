/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.to.BookingDetailsTO;
import Model.to.EmployeeInfoTO;
import Utility.Errorhandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class EmployeeInfoDAO extends DAO {
    public boolean insertRecord(EmployeeInfoTO record){
        try{
            String query="insert into Employee_Info";
            query +="(empName,adhaarcard,emptypeid,dateofjoining,dateofleaving)";
            query+="values(?,?,?,?,?)";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getEmpName());
            stmt.setInt(2,record.getAdhaarcard());
            stmt.setString(3,record.getEmptypeid());
            stmt.setDate(4,record.getDateofjoining());
            stmt.setDate(5,record.getDateofleaving());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
     public boolean updateRecord(EmployeeInfoTO record){
        try{
            String query="update into Employee_Info";
            query +="set empName=?,adhaarcard=?,emptypeid=?,dateofjoining=?,dateofleaving=?";
            query+="where employeeid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,record.getEmpid());
            stmt.setString(2,record.getEmpName());
            stmt.setInt(3,record.getAdhaarcard());
            stmt.setString(4,record.getEmptypeid());
            stmt.setDate(5,record.getDateofjoining());
            stmt.setDate(6,record.getDateofleaving());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public boolean deleteRecord(int empid){
        try{
            String query="delete from Employee_Info";
            query +="where empid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,empid);
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public EmployeeInfoTO getRecord(int empid){
        try{
            String query="select empid,empName,adhaarcard,emptypeid,dateofjoining,dateofleaving";
            query +="from Employee_Info";
            query +="where empid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setInt(1,empid);
            EmployeeInfoTO result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new EmployeeInfoTO();
                result.setEmpid(rs.getInt("empid"));
                result.setEmpName(rs.getString("empName"));
                result.setAdhaarcard(rs.getInt("adhaarcard"));
                result.setEmptypeid(rs.getString("emptypeid"));
                result.setDateofjoining(rs.getDate("dateofjoining"));
                result.setDateofleaving(rs.getDate("dateofleaving"));
            }
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return null;
        }
    }
       public List<EmployeeInfoTO> getallRecord(){
        try{
            String query="select empid,empName,adhaarcard,typeid,dateofjoining,dateofleaving";
            query +="from Employee_Info";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            List<EmployeeInfoTO> result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new ArrayList<>();
                do{
                    EmployeeInfoTO res = new EmployeeInfoTO();                
                   res.setEmpid(rs.getInt("empid"));
                res.setEmpName(rs.getString("empName"));
                res.setAdhaarcard(rs.getInt("adhaarcard"));
                res.setEmptypeid(rs.getString("emptypeid"));
                res.setDateofjoining(rs.getDate("dateofjoining"));
                res.setDateofleaving(rs.getDate("dateofleaving"));
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

