/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarymgt;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Lekhana Ginjupalli
 */
public class db {
    Connection conn=null;
    public static Connection java_db(){
        try{
            
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/se_project/","lekhana","lekhana");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}

