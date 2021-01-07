/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
public class javaConnection {
    
   
    public static Connection ConnectDB()
    {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billpayment","root","root");
             JOptionPane.showMessageDialog(null,"Connection established");
             //Statement stmt=con.createStatement();
             return con;

           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
           
        }
    }
}
