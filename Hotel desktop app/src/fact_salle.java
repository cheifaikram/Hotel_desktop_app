

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class fact_salle extends javax.swing.JFrame {

   
     Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null; 
    public fact_salle() {
        initComponents();
        con = sql_conn.ConnecrDB();
        
          mode.addItem("cash");
          mode.addItem("carte credit");
         
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
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        carte_id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        date_fin = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        date_debut = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        mode = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        tf5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 340, 30));

        jButton1.setText("acceuil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("La Facturation Des Salles");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel4.setText("carte ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 30));

        carte_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte_idActionPerformed(evt);
            }
        });
        getContentPane().add(carte_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 160, 30));

        jButton2.setText("Valider");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel5.setText("Date Fin:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 20));
        getContentPane().add(date_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 160, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel6.setText("Date Debut:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 20));
        getContentPane().add(date_debut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 160, -1));

        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(t);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 550, 130));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel8.setText("mode payement :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 20));

        getContentPane().add(mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 160, -1));

        jButton4.setText("rechercher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, -1, -1));

        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });
        getContentPane().add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 310, 30));

        jButton5.setText("MAJ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fact.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reception f63=new reception ();
        f63.show();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void carte_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carte_idActionPerformed
   private boolean isAnyRequiredFieldEmpty() {
     
        return carte_id.getText().equals("") || 
                
                mode.getSelectedItem().toString().equals("") 
               ;
               
        
                
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       if (!isAnyRequiredFieldEmpty()) {
        
        try { 
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String dd = df.format(date_debut.getDate());
                   String dff = df.format(date_fin.getDate());
                   
                   
                   Statement state= null;
                 state = con.createStatement();
                  ResultSet result =state.executeQuery( "select nbr_table from salle where  carte_id='"+ carte_id.getText()+ "' AND date_fin = '"+ dff+"'" ); 
                  
                  
              Instant start= date_debut.getDate().toInstant();
             Instant end = date_fin.getDate().toInstant();
            
             
             long daysBetween = Duration.between(start , end).toDays();
             System.out.println ("Days: " + daysBetween);
             
             String nbr_salle = result.getInt("nbr_table")+"";
             
               
               long nbr_sallee= Integer.valueOf(nbr_salle);
                
               Statement state2= null;
                 state2 = con.createStatement();
                 ResultSet result2 =state2.executeQuery( "select versement  from salle where carte_id ='"+ carte_id.getText()+ "' AND date_fin = '"+ dff+"'" ); 
             
                
                int verse = result2.getInt("versement");
                
               
                
               long t1=0;
               
               
              if (nbr_salle.equals("congres")) t1 =  10000*daysBetween-verse; else t1 =  5000*daysBetween-verse;
              
               L.setText("la somme totale est :"+t1);
              
             String insertQuery = "insert into fact_salle( 'carte_id','date_debut','date_fin','fact','mode')" + 
                   " values('" + carte_id.getText() +"','"  
                   + dd+ "'" + ",'" + dff + "'" + ",'"  + t1 +  "'" + ",'"  + mode.getSelectedItem().toString() + "'" +")";
                 PreparedStatement ps =con.prepareStatement(insertQuery);    
                 ps.execute();

              
                
                  
                Statement statee= null;
                
                 
           statee = con.createStatement();
           ResultSet resulttt =statee.executeQuery("SELECT  * FROM `fact_salle`"); 
                 
       
               
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("carte id");
        model.addColumn("date_debut");
        model.addColumn("date_fin");
        model.addColumn("prix total");
         model.addColumn("mode de payment");
        

        t.setModel(model);
        try {
            while (resulttt.next()) {
                String carte_id = resulttt.getInt("carte_id")+"";
                String date_debut = resulttt.getString("date_debut")+"";
                String date_fin = resulttt.getString("date_fin")+"";
                String prixxx = resulttt.getString("fact")+"";
                String mode = resulttt.getString("mode")+"";
                
                
                
                model.insertRow(0, new Object[] {carte_id,date_debut,date_fin,prixxx,mode});}
            
        }  catch (SQLException ex) {
            Logger.getLogger(jf6.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning AN user function");
        }
            }else
        {
            JOptionPane.showMessageDialog(null, "Veuillez saisir tous les champs.");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {

            
            Connection  con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            PreparedStatement st = con.prepareStatement("select * from fact_salle where carte_id='"+tf5.getText()+"'");

            ResultSet rs = st.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
             model.addColumn("id");
            model.addColumn("carte_id");
            
            
            model.addColumn("date_debut");
            model.addColumn("date_fin");
            model.addColumn("facture");
            model.addColumn("mode payment");

            t.setModel(model);
            try {
                while (rs.next()) {String id = rs.getInt("id")+"";
                    String carte_id = rs.getInt("carte_id")+"";
                   
                    String date_debut = rs.getString("date_debut")+"";
                    String date_fin = rs.getString("date_fin")+"";
                    String fact = rs.getString("fact")+"";
                    String mode = rs.getString("mode")+"";
                    

                    model.insertRow(0, new Object[] { carte_id,date_debut,date_fin,fact,mode});

                }
                //Create Exception Handler
            } catch (Exception ex) {
                System.out.println(ex);
            }}

            catch (Exception ex) {
                System.out.println(ex);
            }

            // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {

            Connection  con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            Statement statee= null;

            statee = con.createStatement();
            ResultSet resulttt =statee.executeQuery("SELECT  * FROM `fact_salle`");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("carte id");
            model.addColumn("date_debut");
            model.addColumn("date_fin");
            model.addColumn("prix total");
            model.addColumn("mode de payment");

            t.setModel(model);
            try {
                while (resulttt.next()) {
                    String carte_id = resulttt.getInt("carte_id")+"";
                    String date_debut = resulttt.getString("date_debut")+"";
                    String date_fin = resulttt.getString("date_fin")+"";
                    String prixxx = resulttt.getString("fact")+"";
                    String mode = resulttt.getString("mode")+"";

                    model.insertRow(0, new Object[] { carte_id,date_debut,date_fin,prixxx,mode});}

            }  catch (SQLException ex) {
                Logger.getLogger(fact_salle.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch (SQLException ex) {
            Logger.getLogger(fact_salle.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
PreparedStatement statement = null;
    ResultSet result = null;
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
            java.util.logging.Logger.getLogger(fact_salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fact_salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fact_salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fact_salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fact_salle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L;
    private javax.swing.JTextField carte_id;
    private com.toedter.calendar.JDateChooser date_debut;
    private com.toedter.calendar.JDateChooser date_fin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> mode;
    private javax.swing.JTable t;
    private javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables
}
