

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class dispo_salle extends javax.swing.JFrame {

     Connection con = null;
    public dispo_salle() {
        initComponents();
         con = sql_conn.ConnecrDB();
         nbr_table.addItem("");
           nbr_table.addItem("fete");
          nbr_table.addItem("congres");
           date_fin.setDate(null);
 date_debut.setDate(new Date());
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

        jLabel16 = new javax.swing.JLabel();
        date_debut = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        date_fin = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        nbr_table = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel16.setText("nombre des tables :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        date_debut.setIcon(null);
        date_debut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_debutPropertyChange(evt);
            }
        });
        getContentPane().add(date_debut, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 170, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel14.setText("date_debut:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel13.setText("date fin:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));
        getContentPane().add(date_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 170, 30));

        jButton1.setText("valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 100, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("La Disponibilité Des Salles");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        l1.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 390, 50));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 90, 30));

        nbr_table.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nbr_tableItemStateChanged(evt);
            }
        });
        nbr_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbr_tableActionPerformed(evt);
            }
        });
        getContentPane().add(nbr_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 170, 30));

        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 180, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel17.setText("numero de salle disponible:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dispo salle.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void date_debutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_debutPropertyChange

    }//GEN-LAST:event_date_debutPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                   String dateD = df.format(date_debut.getDate());
                    String dateF = df.format(date_fin.getDate());
                String b = nbr_table.getSelectedItem().toString();
        date_fin.setDate(null);
 date_debut.setDate(new Date());
           ResultSet rs = null;
  
           try{
           
   Connection cnx =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            Statement st =cnx.createStatement();
            String SQL="SELECT num_salle FROM salles WHERE salles.nbr_table='"+ b +
                    "' AND num_salle not IN(SELECT num_salle FROM salle WHERE date_debut <= '"+dateF+
                    "' \n" + " AND date_fin >= '" +dateD+"')";
       
             rs= st.executeQuery(SQL);
            if(!rs.isBeforeFirst()){   JOptionPane.showMessageDialog(null, "impossible de faire une reservation");  }
            while(rs.next()){
                String s= rs.getString("num_salle");
                
              jComboBox2.addItem(s);
              
            
            } 
            

            cnx.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
        /*
        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String dd = df.format(date_debut.getDate());
            String dff = df.format(date_fin.getDate());
            Statement state1= null;
            state1 = con.createStatement();

            ResultSet result1 =state1.executeQuery("select num_chambre from chambre where nbr_lit='"+nbr_lit1.getText()+"'AND dispo = 0");
            String res = result1.getInt("num_chambre")+"";
            if (!result1.isBeforeFirst()) {
                l1.setText(res);
                ResultSet result2 =state1.executeQuery("update chambre SET dispo= 1 where num_chambre='"+ res);
            }

            if (result1.isBeforeFirst()) {

                ResultSet result3 =state1.executeQuery("select num_ch1, num_ch2 from formulaire where"
                    + " num_ch1 not IN(select num_ch1 from formulaire where date_debut<='"+ dd+"or date_fin>='"+df+
                    ") AND num_ch2 not IN(select num_ch2 from formulaire where date_debut<='"+ dd+"or date_fin>='"+df+
                    ") AND nbr_lit1='"+nbr_lit1.getText()+"'or nbr_lit2='"+nbr_lit1.getText());

                String res1 = result3.getInt("num_ch1")+"";
                String res2 = result3.getInt("num_ch2")+"";

                if (!result3.isBeforeFirst()) {
                    l1.setText(res1);
                    l2.setText(res2);
                    ResultSet result4 =state1.executeQuery("update chambre SET dispo= 1 where num_chambre='"+ res1);
                    ResultSet result5 =state1.executeQuery("update chambre SET dispo= 1 where num_chambre='"+ res2);

                }
                if (result3.isBeforeFirst()){ l1.setText("cantt do it ");}
            }

        }catch (SQLException ex) {  JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Update query Failed"); Logger.getLogger(dispo.class.getName()).log(Level.SEVERE, null, ex);

        }

        */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        salle f963=new salle();
        f963.show();
        dispose();// TOD
        // your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nbr_tableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nbr_tableItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_nbr_tableItemStateChanged

    private void nbr_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbr_tableActionPerformed

    }//GEN-LAST:event_nbr_tableActionPerformed

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
            java.util.logging.Logger.getLogger(dispo_salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dispo_salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dispo_salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dispo_salle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dispo_salle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date_debut;
    private com.toedter.calendar.JDateChooser date_fin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JComboBox<String> nbr_table;
    // End of variables declaration//GEN-END:variables
}
