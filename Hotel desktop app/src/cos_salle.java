

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class cos_salle {
     Connection conn;
    PreparedStatement statement = null;
    ResultSet result = null;
    
    
    
    
    public cos_salle()
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
            String query = "select * from salle ";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n erreur");
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
             String deleteQuery = "delete from salle where id=" + id;
            statement = conn.prepareStatement(deleteQuery);
            statement.execute();
            JOptionPane.showMessageDialog(null, "La réservation est supprimée");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + " la supprission a echouée");
        }
        

    }
 
}
