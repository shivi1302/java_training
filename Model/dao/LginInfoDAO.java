/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.to.BookingDetailsTO;
import Model.to.LoginInfoTO;
import Utility.Errorhandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class LginInfoDAO extends DAO {
    public boolean insertRecord(LoginInfoTO record){
        try{
            String query="insert into Login_Info";
            query +="(rolename,username,password)";
            query+="values(?,?,?)";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getRolename());
            stmt.setString(2,record.getUsername());
            stmt.setString(3,record.getPassword());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
     public boolean updateRecord(LoginInfoTO record){
        try{
            String query="update into Login_Info";
            query +="set rolename=?,pasword=?,lastlogin=?";
            query+="where username=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,record.getRolename());
            stmt.setString(2,record.getUsername());
            stmt.setString(3,record.getPassword());
            stmt.setTimestamp(4,record.getLastlogin());
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public boolean deleteRecord(String username){
        try{
            String query="delete from Login_Info";
            query +="where username=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,username);
            boolean result=stmt.executeUpdate()>0;
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return false;
        }
    }
       public LoginInfoTO getRecord(String username){
        try{
            String query="select username,rolename,password,lastlogin";
            query +="from Login_Info";
            query +="where username=?";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            stmt.setString(1,username);
            LoginInfoTO result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new LoginInfoTO();
                result.setUsername(rs.getString("username"));
                result.setRolename(rs.getString("rolename"));
                result.setPassword(rs.getString("password"));
                result.setLastlogin(rs.getTimestamp("lastlogin"));
            }
            stmt.close();
            return result;
        }catch(Exception ex){
            error_message =ex.getMessage();
            Errorhandler.showErrorStack(ex);
            return null;
        }
    }
       public List<LoginInfoTO> getallRecord(){
        try{
            String query="select username,rolename,password,lastlogin";
            query +="from Login_Info";
            PreparedStatement stmt = DataConnection.prepareStatement(query);
            List<LoginInfoTO> result = null;
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                result = new ArrayList<>();
                do{
                    LoginInfoTO res = new LoginInfoTO();                
                res.setUsername(rs.getString("username"));
                res.setRolename(rs.getString("rolename"));
                res.setPassword(rs.getString("password"));
                res.setLastlogin(rs.getTimestamp("lastlogin"));
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

