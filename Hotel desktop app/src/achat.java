

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 
    
public class achat extends javax.swing.JFrame {

     Connection con = null;
    
     
    public achat() {
         con = sql_conn.ConnecrDB();
        initComponents();
        produit_id.addItem("");
        produit_id.addItem("pizza");
        produit_id.addItem("panini");
        produit_id.addItem("shawarma");
         produit_id.addItem("coke");
        produit_id.addItem("pepsi");
        produit_id.addItem("eau_miniral");
         produit_id.addItem("ruiba");
        
       
    }
    
    public Connection getConnection(){
        Connection con = null; 
        try{
            
            //Class.forName("org.sqlite.JDBC");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:test.sqlite");
            
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
             
             return con;
        } catch(SQLException ex) {
            
            
        }
        return null;
    }
/*   try {
              
        String insertQuery;
           Connection con = getConnection();
            insertQuery = "insert into consommation ( 'carte_id','id_prod') "
                    + "values('" + carte_id.getText() +"','"  + p.getText() +"'" + ")";
             
        
            PreparedStatement ps =con.prepareStatement(insertQuery);
            ps.execute();

            JOptionPane.showMessageDialog(null, "successfully inserted "); } 
         catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "InsertQuery  Failed");*/
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        carte_id = new javax.swing.JTextField();
        produit_id = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel5.setText("carte ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 140, 30));

        jButton1.setText("valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 120, 40));

        jButton2.setText("acceuil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("La Achats");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel8.setText("produit :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 140, 30));

        carte_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte_idActionPerformed(evt);
            }
        });
        getContentPane().add(carte_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 160, 30));

        getContentPane().add(produit_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Capture_1.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean isAnyRequiredFieldEmpty() {
     
        return carte_id.getText().equals("") || 
                
                produit_id.getSelectedItem().toString().equals("") 
               ;
               
        
                
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
            
       if (!isAnyRequiredFieldEmpty()) {
       
        
        try {
              
        String insertQuery;
           Connection con = getConnection();
            insertQuery = "insert into consommation ( 'carte_id','nom_prod') "
                    + "values('" + carte_id.getText() +"','"  +  produit_id.getSelectedItem().toString() +"'" + ")";
             
        
            PreparedStatement ps =con.prepareStatement(insertQuery);
            ps.execute();

            JOptionPane.showMessageDialog(null, "Les achats sont bien saisis."); } 
         catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Les achats n'ont pas été saisis");
            }
       
       }else
        {
            JOptionPane.showMessageDialog(null, "Veuillez saisir tous les champs.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reception f63=new reception ();
        f63.show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void carte_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carte_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(achat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new achat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carte_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> produit_id;
    // End of variables declaration//GEN-END:variables
}
