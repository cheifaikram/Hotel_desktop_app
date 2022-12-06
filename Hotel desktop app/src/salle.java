

import java.sql.Connection;
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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class salle extends javax.swing.JFrame {

   
   
 cos_salle db = new cos_salle();
     Connection con = null;
    
    
      
   
    
    public salle() {
         con = sql_conn.ConnecrDB();
        initComponents();
        nbr_salle.addItem("");
         nbr_salle.addItem("fete");
          nbr_salle.addItem("congres");
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

      PreparedStatement statement = null;
    ResultSet result = null; 
    
    
 private void populateWithCustomerData()
    {
        result = db.getAllCustomer();
       
        table.setModel(DbUtils.resultSetToTableModel(result));
        
        
    }
 
  private boolean isAnyRequiredFieldEmpty() {
     
        return carte_id.getText().equals("") || 
               
                num_salle.getText().equals("") || 
               
                versement.getText().equals("") ||
                nbr_salle.getSelectedItem().toString().equals("");
              
    }
  
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carte_id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        num_salle = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        date_debut = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        date_fin = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        versement = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        nbr_salle = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(carte_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 130, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("numero_carte:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("nombre de tables:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        num_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_salleActionPerformed(evt);
            }
        });
        getContentPane().add(num_salle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("date_debut:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        date_debut.setIcon(null);
        date_debut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_debutPropertyChange(evt);
            }
        });
        getContentPane().add(date_debut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 130, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("date fin:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        getContentPane().add(date_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 130, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("versement:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        versement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versementActionPerformed(evt);
            }
        });
        getContentPane().add(versement, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 130, 30));

        jButton2.setText("envoyer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 600, 230));

        edit.setText("editer");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 110, 30));

        delete.setText("suprimer");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 120, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Candara", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Les Réservations des Salles");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 470, 60));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Acceuil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        jButton3.setText("disponibilité");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, 30));

        nbr_salle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nbr_salleItemStateChanged(evt);
            }
        });
        nbr_salle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbr_salleActionPerformed(evt);
            }
        });
        getContentPane().add(nbr_salle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 130, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("numero de salle:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 260, 30));

        jButton4.setText("rechercher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, -1, -1));

        jButton5.setText("MAJ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salle.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num_salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_salleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_salleActionPerformed

    private void date_debutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_debutPropertyChange

    }//GEN-LAST:event_date_debutPropertyChange

    private void versementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_versementActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if (!isAnyRequiredFieldEmpty()) {     
       try {String insertQuery;
           Connection con = getConnection();
           DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
           String dd = df.format(date_debut.getDate());
           String dff = df.format(date_fin.getDate());
           
           Instant start = date_debut.getDate().toInstant() ;
           Instant end = date_fin.getDate().toInstant();
           long daysBetween = Duration.between(start, end).toDays();
           System.out.println (daysBetween);
            insertQuery = "insert into salle( 'carte_id','num_salle','date_debut','date_fin','versement','nbr_table') "
                    + "values('" + carte_id.getText() +"','"  + num_salle.getText() + "'" + ",'" + dd+ "'" + ",'" + dff + "'" + ",'"  + versement.getText()  + "'" + ",'" + nbr_salle.getSelectedItem().toString() + "'" + ")";
             
        
            PreparedStatement ps =con.prepareStatement(insertQuery);
            ps.execute();

            JOptionPane.showMessageDialog(null, "La réservation est ajoutée");

            Statement state= null;

            state = con.createStatement();
            ResultSet result =state.executeQuery("SELECT  * FROM `salle`");

            DefaultTableModel model = new DefaultTableModel();
             model.addColumn("id");
            model.addColumn("c_id");
            model.addColumn("numero salle");
            model.addColumn("nombre table");
            model.addColumn("date_debut");
            model.addColumn("date_fin");
           
            model.addColumn("versement");

            table.setModel(model);
            try {
                while (result.next()) {
                    
                    String id = result.getInt("id")+"";
                  
                    String carte_id = result.getInt("carte_id")+"";
                    
                    String nbr_salle = result.getString("nbr_table")+"";
                    String num_salle = result.getInt("num_salle")+"";
                   
                    String date_debut = result.getString("date_debut")+"";
                    String date_fin = result.getString("date_fin")+"";
                    String versement = result.getString("versement")+"";
                    
                    model.insertRow(0, new Object[] { id,carte_id,num_salle,nbr_salle,date_debut,date_fin,versement});
                    emptyField();
                }

                // TODO add your handling code here:
            } catch (SQLException ex) {
                Logger.getLogger(jf6.class.getName()).log(Level.SEVERE, null, ex);
            }
            con.close();

        }catch (SQLException ex) {
            // Logger.getLogger(Main_window.class.getName()).log(level.SEVERE, null, ex); }
        JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "La réservation a échoué");

        }}
       else
        {
            JOptionPane.showMessageDialog(null, "Veuillez saisir tous les champs.");
        }
   
    }//GEN-LAST:event_jButton2ActionPerformed

 
    
    
    
    
    private void displayToTextField(int row)
{
    //System.out.println(table_customer.getModel().getValueAt(row, 0)+ " >>>>>>>>> ");
    carte_id.setText(table.getModel().getValueAt(row, 1)+"");
   
    num_salle.setText( table.getModel().getValueAt(row, 2)+"");
    nbr_salle.getEditor().setItem(table.getModel().getValueAt(row, 3)+"");
    
    versement.setText( table.getModel().getValueAt(row, 6)+"");
}
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        int row = table.getSelectedRow();
        displayToTextField(row);
        //ObjectCreation();
        edit.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_tableMouseClicked
  
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
         int row  = table.getSelectedRow();
        String selectedUserId =  table.getModel().getValueAt(row, 0).toString();
         System.out.println("selectedUserId");
        int b = Integer.parseInt(selectedUserId);
        
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dd = df.format(date_debut.getDate());
String dff = df.format(date_fin.getDate());
        
        try {
            String updateQuery ="update salle set num_salle = '" + num_salle.getText() + "'," + "nbr_table = '" +  
                    nbr_salle.getSelectedItem().toString() +"',"+
            "date_debut = '" +  dd + "',"
            + "date_fin = '" +  dff  + "',"  + "carte_id = '" +  carte_id.getText() + "',"   + "versement = '" +  versement.getText()  + "' where id= "
            + b;

            statement = con.prepareStatement(updateQuery);

             statement.execute();
            populateWithCustomerData();
             emptyField();
            JOptionPane.showMessageDialog(null, "La réservation est modifiée");
             con.close();
        }

        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "La modification a echouée ");
        }

    }//GEN-LAST:event_editActionPerformed
private void emptyField()
    {
         
        edit.setEnabled(false);
        delete.setEnabled(false);
        
        carte_id.setText("");
        
       num_salle.setText("");
       nbr_salle.setSelectedIndex(0);
       
        versement.setText("");
        
        table.clearSelection();
    }
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
                                                        
        int row  = table.getSelectedRow();
        String selectedUserId =  table.getModel().getValueAt(row, 0).toString();
        int b = Integer.parseInt(selectedUserId);
        
        try {
            db.deleteCustomer(b);
            String transferQuery = "insert into remboursement ( 'carte_id','versement')" + 
                   " values('" + carte_id.getText() +"','"  +  versement.getText() +  "'" + ")"; 
            
            
            PreparedStatement ps =con.prepareStatement(transferQuery);    
                 ps.execute();
                 con.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(jf6.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        populateWithCustomerData();
        emptyField();
        
        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        reception f963=new reception();
        f963.show();
        dispose();// TOD
        // your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispo_salle f63 =new dispo_salle ();
        f63.show();
        dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nbr_salleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nbr_salleItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_nbr_salleItemStateChanged

    private void nbr_salleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbr_salleActionPerformed

    }//GEN-LAST:event_nbr_salleActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {

            Connection  con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            PreparedStatement st = con.prepareStatement("select * from salle where carte_id='"+tf5.getText()+"'");

            //Excuting Query
            ResultSet rs = st.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("id");
            model.addColumn("c_id");
            model.addColumn("numero salle");
            model.addColumn("nombre table");
            model.addColumn("date_debut");
            model.addColumn("date_fin");
           
            model.addColumn("versement");

            table.setModel(model);
            try {
                while (rs.next()) {
                     String id = rs.getInt("id")+"";
                    String carte_id = rs.getInt("carte_id")+"";
                  
                    String nbr_salle = rs.getString("nbr_table")+"";
                    String num_salle = rs.getInt("num_salle")+"";
                   
                    String date_debut = rs.getString("date_debut")+"";
                    String date_fin = rs.getString("date_fin")+"";
                    String versement =rs.getString("versement")+"";
                    
                    model.insertRow(0, new Object[] { id,carte_id,num_salle,nbr_salle,date_debut,date_fin,versement});

                }
                //Create Exception Handler
            } catch (Exception ex) {
                System.out.println(ex);
            }
        con.close();}

            catch (Exception ex) {
                System.out.println(ex);
            }

            // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {

            Connection  con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            PreparedStatement st = con.prepareStatement("select * from salle");

            //Excuting Query
            ResultSet rs = st.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
              model.addColumn("id");
            model.addColumn("c_id");
            model.addColumn("numero salle");
            model.addColumn("nombre table");
            model.addColumn("date_debut");
            model.addColumn("date_fin");
           
            model.addColumn("versement");

            table.setModel(model);
            try {
                while (rs.next()) { String id = rs.getInt("id")+"";
                    String carte_id = rs.getInt("carte_id")+"";
                  
                    String nbr_salle = rs.getString("nbr_table")+"";
                    String num_salle =rs.getInt("num_salle")+"";
                   
                    String date_debut = rs.getString("date_debut")+"";
                    String date_fin = rs.getString("date_fin")+"";
                    String versement = rs.getString("versement")+"";
                    
                    model.insertRow(0, new Object[] {id,carte_id,num_salle,nbr_salle,date_debut,date_fin,versement});


                }
                //Create Exception Handler
            } catch (Exception ex) {
                System.out.println(ex);
            }
            con.close();
        }

            catch (Exception ex) {
                System.out.println(ex);
            }

            // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField carte_id;
    private com.toedter.calendar.JDateChooser date_debut;
    private com.toedter.calendar.JDateChooser date_fin;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nbr_salle;
    private javax.swing.JTextField num_salle;
    private javax.swing.JTable table;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField versement;
    // End of variables declaration//GEN-END:variables
}
