/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class CustomerDb {
    Connection conn;
    PreparedStatement statement = null;
    ResultSet result = null;
    public CustomerDb()
    {
         conn = sql_conn.ConnecrDB();
        
    }
    
            public ResultSet getAllCustomer() {
        
        try{
     Class.forName("org.sqlite.JDBC");
     Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
    
} catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
        try {
            String query = "select * from formulaire";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        }
        

        return result;
    }



    public void deleteCustomer(int id) throws SQLException {
        try{
     Class.forName("org.sqlite.JDBC");
     Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
    
} catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
        try {
            String deleteQuery = "delete from formulaire where id=" + id;
            statement = conn.prepareStatement(deleteQuery);
            statement.execute();
            JOptionPane.showMessageDialog(null, "la reservation est supprimée");
            
            
                 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "echoué");
        }
        

    }
    public ResultSet getAllCustomerr() {
        
        try{
     Class.forName("org.sqlite.JDBC");
     Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
    
} catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
        try {
            String query = "select * from client";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        }
        

        return result;
    }


    
    public void deleteCustomerr(int id) throws SQLException {
        try{
     Class.forName("org.sqlite.JDBC");
     Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
    
} catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
        try {
            String deleteQuery = "delete from client where id=" + id;
            statement = conn.prepareStatement(deleteQuery);
            statement.execute();
            JOptionPane.showMessageDialog(null, "Le client est supprimé");
            
            
                 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "suppression echouée");
        }
        

    }
       
            
                 
       

    

    
}
