/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;
import javax.swing.JOptionPane;

public class sql_conn {
Connection cln = null;
public static Connection ConnecrDB(){
try{
     Class.forName("org.sqlite.JDBC");
     Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\TP1\\devoir_lily.db");
     return con;
} catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
}
     





}



} 
