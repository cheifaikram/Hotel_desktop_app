

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.println;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nour
 */
public class jf3 extends javax.swing.JFrame {

    
     Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null; 
    public jf3() {
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        carte_id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        date_fin = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        date_debut = new com.toedter.calendar.JDateChooser();
        L = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        mode = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        o = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fact.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("acceuil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("La Facturation Des Chambres");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel4.setText("carte ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 30));

        carte_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte_idActionPerformed(evt);
            }
        });
        getContentPane().add(carte_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, 30));

        jButton2.setText("Valider");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel5.setText("Date Fin:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 20));
        getContentPane().add(date_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 160, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel6.setText("Date Debut:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 20));
        getContentPane().add(date_debut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 160, -1));
        getContentPane().add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 340, 30));

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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 540, 120));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel8.setText("mode payement :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, 20));

        getContentPane().add(mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 160, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });
        getContentPane().add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 260, 30));

        jButton4.setText("rechercher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, -1, -1));

        jButton6.setText("MAJ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 80, 30));

        o.setText("supprimer");
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });
        getContentPane().add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, -1, -1));

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
                  ResultSet result =state.executeQuery( "select nbr_lit1, nbr_lit2 from formulaire where  carte_id='"+ carte_id.getText()+ "' AND date_fin = '"+ dff+"'" ); 
                  
                  
              Instant start= date_debut.getDate().toInstant();
             Instant end = date_fin.getDate().toInstant();
            
             
             long daysBetween = Duration.between(start , end).toDays();
             System.out.println ("Days: " + daysBetween);
             
             String nbr_lit1 = result.getInt("nbr_lit1")+"";
              String nbr_lit2 = result.getInt("nbr_lit2")+"";
              
               
               long nbr_lit11= Integer.valueOf(nbr_lit1);
                long nbr_lit22= Integer.valueOf(nbr_lit2);
              
                
              
                  
                  Statement state1= null;
                 state1 = con.createStatement();
                 ResultSet result1 =state1.executeQuery( "select sum(prix)  as sumprice  from produit ,consommation,formulaire where consommation.carte_id =formulaire.carte_id AND consommation.carte_id='"+ carte_id.getText()+ "' AND produit.nom_prod=consommation.nom_prod AND formulaire.date_fin = '"+ dff+"'" ); 
          //  
               Statement state2= null;
                 state2 = con.createStatement();
                 ResultSet result2 =state2.executeQuery( "select versement  from formulaire where carte_id ='"+ carte_id.getText()+ "' AND date_fin = '"+ dff+"'" ); 
             
                
                int verse = result2.getInt("versement");
                
                int prix = result1.getInt("sumprice");
              
               
               
                
               long t1=0,t2=0, total=0;
               
               if (daysBetween== 0) {
                if (nbr_lit11 == 1) t1 =  (1700+prix)-verse; else t1 =  (2200+prix)-verse;
              if (nbr_lit22 == 1) t2 =  (1700+prix)-verse; else t2 =  (2200+prix)-verse;
              
              if (nbr_lit11 ==0) total =t2;
              else  if (nbr_lit22 ==0) total =t1;
              else total =t1+t2+verse;

                 } else {
               
              if (nbr_lit11 == 1) t1 =  (1700*daysBetween+prix)-verse; else t1 =  (2200*daysBetween+prix)-verse;
              if (nbr_lit22 == 1) t2 =  (1700*daysBetween+prix)-verse; else t2 =  (2200*daysBetween+prix)-verse;
              
              if (nbr_lit11 ==0) total =t2;
              else  if (nbr_lit22 ==0) total =t1;
              else total =t1+t2+verse-prix;
                        }
                
               System.out.println("l prix :"+prix);
               System.out.println("l verse :"+verse);
                System.out.println("l  daysBetween:"+daysBetween);
               
                
               L.setText("la somme totale est :"+total);
              
             String insertQuery = "insert into fact_ch( 'carte_id','date_debut','date_fin','fact','mode')" + 
                   " values('" + carte_id.getText() +"','"  
                   + dd+ "'" + ",'" + dff + "'" + ",'"  + total +  "'" + ",'"  + mode.getSelectedItem().toString() + "'" +")";
                 PreparedStatement ps =con.prepareStatement(insertQuery);    
                 ps.execute();

                Statement statee= null;
                
                 
           statee = con.createStatement();
           ResultSet resulttt =statee.executeQuery("SELECT  * FROM `fact_ch`"); 
                 
       
               
        
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
                String prixxx = resulttt.getString("fact")+" DA";
                String mode = resulttt.getString("mode")+"";
                
                
                
                model.insertRow(0, new Object[] { carte_id,date_debut,date_fin,prixxx,mode});}
            
        }  catch (SQLException ex) {
            Logger.getLogger(jf6.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning AN user function");
        }
            //System.out.println("fetching something");
       
    
}else
        {
            JOptionPane.showMessageDialog(null, "Veuillez saisir tous les champs.");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {

            Connection  con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            PreparedStatement st = con.prepareStatement("select * from fact_ch where carte_id='"+tf5.getText()+"'");

            //Excuting Query
            ResultSet rs = st.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("carte_id");

            model.addColumn("date_debut");
            model.addColumn("date_fin");
            model.addColumn("facture");
            model.addColumn("mode payment");

            t.setModel(model);
            try {
                while (rs.next()) {
                    String carte_id = rs.getInt("carte_id")+"";

                    String date_debut = rs.getString("date_debut")+"";
                    String date_fin = rs.getString("date_fin")+"";
                    String fact = rs.getString("fact")+" DA";
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 try {

            Connection  con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            Statement statee= null;

            statee = con.createStatement();
            ResultSet resulttt =statee.executeQuery("SELECT  * FROM `fact_ch`");

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
    }//GEN-LAST:event_jButton6ActionPerformed
 PreparedStatement statement = null;
    ResultSet result = null;
    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
 int row  = t.getSelectedRow();
        String selectedUserId =  t.getModel().getValueAt(row, 0).toString();
         
        int b = Integer.parseInt(selectedUserId);
         try{
     Class.forName("org.sqlite.JDBC");
     Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
    
} catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}
   try {String deleteQuery = "delete from formulaire where carte_id=" + b;
            statement = con.prepareStatement(deleteQuery);
            statement.execute();
          
            
              String deleteQuer = "delete from client where n_id=" + b;
            statement = con.prepareStatement(deleteQuer);
            statement.execute();
            
            JOptionPane.showMessageDialog(null, "la reservation est supprim??e");
            
            
                 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "echou??");
        }
   
        
    }//GEN-LAST:event_oActionPerformed

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
            java.util.logging.Logger.getLogger(jf3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jf3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jf3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf3().setVisible(true);
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
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> mode;
    private javax.swing.JButton o;
    private javax.swing.JTable t;
    private javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables
}
