/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Utility.ConfigurationDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author DELL
 */
public class DataConnection {
    private DataConnection(){
    
     }
    private static Connection con=null;
    private static Connection getconnection()throws Exception{
        if(con==null){
            Class.forName(ConfigurationDetails.DRIVER_NAME);
            con=DriverManager.getConnection(ConfigurationDetails.CONNECTION_URL, ConfigurationDetails.USER_NAME,ConfigurationDetails.USER_PASSWORD);
        }
            return con;
    }
    public static void closeConnection() throws Exception{
        if(con!=null){
            con.close();
        }
        con=null;
    }
    public static PreparedStatement prepareStatement(String query) throws Exception{
        return getconnection().prepareStatement(query);
    }
}
