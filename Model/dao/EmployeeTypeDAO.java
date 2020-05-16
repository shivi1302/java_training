/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.to.EmployeeTypeTO;
import Utility.Errorhandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class EmployeeTypeDAO extends DAO {
    public boolean insertRecord(EmployeeTypeTO record){
        try{
            String query="insert into Employee_Type";
            query +="(emptypeid,emptypename,basicsalary)";
            query+="values(?,?,?)";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getEmptypeid());
            stmt.setString(2,record.getEmptypename());
            stmt.setFloat(3,record.getBasicsalary());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
     public boolean updateRecord(EmployeeTypeTO record){
        try{
            String query="update into employee_type";
            query +="set emptypename=?,basicsalary=?";
            query+="where emptypeid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getEmptypeid());
            stmt.setString(2,record.getEmptypename());
            stmt.setFloat(3,record.getBasicsalary());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public boolean deleteRecord(String emptypeid){
        try{
            String query="delete from employee_type";
            query +="where emptypeid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,emptypeid);
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public EmployeeTypeTO getRecord(String emptypeid){
        try{
            String query="select emptypeid,emptypename,basicsalary";
            query +="from Employee_Type";
            query +="where emptypeid=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,emptypeid);
            EmployeeTypeTO result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new EmployeeTypeTO();
                result.setEmptypeid(rs.getString("emptypeid"));
                result.setEmptypename(rs.getString("emptypename"));
                result.setBasicsalary(rs.getFloat("basicsalary"));
            }
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return null;
        }
    }
       public List<EmployeeTypeTO> getallRecord(){
        try{
            String query=" select emptypeid , emptypename , basicsalary ";
            query += "from employee_type" ;
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            List<EmployeeTypeTO> result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new ArrayList<>();
                do{
                    EmployeeTypeTO res = new EmployeeTypeTO();                
                    res.setEmptypeid(rs.getString("emptypeid"));
                    res.setEmptypename(rs.getString("emptypename"));
                    res.setBasicsalary(rs.getFloat("basicsalary"));
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

