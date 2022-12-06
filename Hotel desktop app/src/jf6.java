

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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class jf6 extends javax.swing.JFrame {

   
  CustomerDb db = new CustomerDb();
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null; 
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
           
           
    
    
    
    public jf6() {
        con = sql_conn.ConnecrDB();
        initComponents();
        
          nbr_ch.addItem("1");
          nbr_ch.addItem("2");
          
           nbr_lit2.addItem("");
          nbr_lit2.addItem("1");
          nbr_lit2.addItem("2");
          
          nbr_lit1.addItem("");
          nbr_lit1.addItem("1");
          nbr_lit1.addItem("2");     
           date_fin.setDate(null);
 date_debut.setDate(new Date());
    }
    
    public Connection getConnection(){
        Connection con = null; 
        try{
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
       
        table1.setModel(DbUtils.resultSetToTableModel(result));
        
        
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        carte_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        num_ch1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        num_ch2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        versement = new javax.swing.JTextField();
        nbr_lit1 = new javax.swing.JComboBox<>();
        date_debut = new com.toedter.calendar.JDateChooser();
        date_fin = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        nbr_lit2 = new javax.swing.JComboBox<>();
        nbr_ch = new javax.swing.JComboBox<>();
        tf5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Acceuil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 30, 100, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Les Réservations");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 430, 70));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        carte_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carte_idActionPerformed(evt);
            }
        });
        carte_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                carte_idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                carte_idKeyTyped(evt);
            }
        });
        getContentPane().add(carte_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 160, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setText("numero_carte:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setText("num_ch1:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        num_ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_ch1ActionPerformed(evt);
            }
        });
        getContentPane().add(num_ch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 160, 30));

        jButton2.setText("envoyer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setText("date fin:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 930, 110));

        edit.setText("editer");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 130, 40));

        delete.setText("suprimer");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 130, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel14.setText("date_debut:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("nbr_ch:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel15.setText("num_ch2:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        num_ch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_ch2ActionPerformed(evt);
            }
        });
        getContentPane().add(num_ch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 160, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel16.setText("nbr_lit1:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel17.setText("nbr_lit2:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel18.setText("versement:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        versement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versementActionPerformed(evt);
            }
        });
        getContentPane().add(versement, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 160, 30));

        nbr_lit1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nbr_lit1ItemStateChanged(evt);
            }
        });
        nbr_lit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbr_lit1ActionPerformed(evt);
            }
        });
        getContentPane().add(nbr_lit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 160, 30));

        date_debut.setIcon(null);
        date_debut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_debutPropertyChange(evt);
            }
        });
        getContentPane().add(date_debut, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 160, -1));
        getContentPane().add(date_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 160, -1));

        jButton3.setText("disponibilité");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 230, -1));

        nbr_lit2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nbr_lit2ItemStateChanged(evt);
            }
        });
        nbr_lit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbr_lit2ActionPerformed(evt);
            }
        });
        getContentPane().add(nbr_lit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 160, 30));

        nbr_ch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nbr_chItemStateChanged(evt);
            }
        });
        nbr_ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbr_chActionPerformed(evt);
            }
        });
        getContentPane().add(nbr_ch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 160, 30));
        getContentPane().add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 490, 30));

        jButton4.setText("rechercher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 180, -1, -1));

        jButton5.setText("MAJ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 470, 110, 40));

        jButton6.setText("Client");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 70, 90, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        reception f963=new reception();
f963.show();
dispose();// TOD
// your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
          
       if (!isAnyRequiredFieldEmpty()) {
       bookingObjectCreation();
       }else
        {
            JOptionPane.showMessageDialog(null, "Veuillez saisir tous les champs.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

 private void bookingObjectCreation() {


try {  String insertQuery;
           Connection con = getConnection();
           DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
           String dd = df.format(date_debut.getDate());
           String dff = df.format(date_fin.getDate());
           
            
           
           Instant start = date_debut.getDate().toInstant() ;
           Instant end = date_fin.getDate().toInstant();
           long daysBetween = Duration.between(start, end).toDays();
           System.out.println (daysBetween);


           insertQuery = "insert into formulaire( 'carte_id','nbr_ch','num_ch1','num_ch2','nbr_lit1','nbr_lit2','date_debut','date_fin','versement')" + 
                   " values('" + carte_id.getText() +"','"   +
                   nbr_ch.getSelectedItem().toString()+ "'" + ",'" + num_ch1.getText() + "'" + ",'"  + num_ch2.getText() 
                   + "'" + ",'"  + nbr_lit1.getSelectedItem().toString()+ "'" + ",'" + nbr_lit2.getSelectedItem().toString() +
                   "'" + ",'" + dd+ "'" + ",'" + dff + "'" + ",'"  + versement.getText() +  "'" + ")";
                 PreparedStatement ps =con.prepareStatement(insertQuery);    
                 ps.execute();

                 JOptionPane.showMessageDialog(null, "La réservation est ajoutée");
                
                  
                Statement state= null;
                
                 
           state = con.createStatement();
           ResultSet result =state.executeQuery("SELECT  * FROM `formulaire`"); 
                 
       
               
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("c_id");
        model.addColumn("nbr_ch");
        model.addColumn("num_ch1");
        model.addColumn("num_ch2");
        model.addColumn("nbr_lit1");
        model.addColumn("nbr_lit2");
        model.addColumn("date_debut");
        model.addColumn("date_fin");
        model.addColumn("versement");

        table1.setModel(model);
        try {
            while (result.next()) {
                 String id = result.getInt("id")+"";
               
                String carte_id = result.getInt("carte_id")+"";
               
                String nbr_ch = result.getString("nbr_ch")+"";
                String num_ch1 = result.getInt("num_ch1")+"";
                String num_ch2 = result.getString("num_ch2")+"";
                String nbr_lit1 = result.getString("nbr_lit1")+"";
                String nbr_lit2 = result.getString("nbr_lit2")+"";
                String date_debut = result.getString("date_debut")+"";
                String date_fin = result.getString("date_fin")+"";
                String versement = result.getString("versement")+"";
                
                
                
                model.insertRow(0, new Object[] { id,carte_id,nbr_ch,num_ch1,num_ch2,nbr_lit1,nbr_lit2,date_debut,date_fin,versement});
               emptyField(); 
            }
            
            // TODO add your handling code here:
        }
             catch (SQLException ex) {
               // Logger.getLogger(Main_window.class.getName()).log(level.SEVERE, null, ex); }
               JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "La réservation a echouée");
            
            }
        con.close();
                 
        }
             catch (SQLException ex) {
               // Logger.getLogger(Main_window.class.getName()).log(level.SEVERE, null, ex); }
               JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "La réservation a echouée");
            
            }}
    private void num_ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_ch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_ch1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
         int row  = table1.getSelectedRow();
        String selectedUserId =  table1.getModel().getValueAt(row, 0).toString();
         System.out.println("selectedUserId");
        int b = Integer.parseInt(selectedUserId);
        
        try {
            String updateQuery ="update formulaire set nbr_ch = '"  +  nbr_ch.getSelectedItem().toString()
                    + "',"  + "num_ch1 = '" +  num_ch1.getText() + "'," + "num_ch2 = '" + num_ch2.getText() + "'," + "nbr_lit1 = '" +  
                    nbr_lit1.getSelectedItem().toString() + "',"  + "nbr_lit2 = '" + nbr_lit2.getSelectedItem().toString() + "',"  +
                    "date_debut = '" +   new SimpleDateFormat("yyyy-MM-dd").format(date_debut.getDate())+ "'," 
                    + "date_fin = '" +   new SimpleDateFormat("yyyy-MM-dd").format(date_fin.getDate())  + "',"  + "versement = '" +  versement.getText()  + "',"  + "carte_id = '" +  carte_id.getText()  + "' where id= "
                    + b;

            statement = con.prepareStatement(updateQuery);

            statement.execute();
             JOptionPane.showMessageDialog(null, "La reservation est bien modifié");
              populateWithCustomerData();
              emptyField();
              con.close();
        }
           
         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "modification echoué");
        }
        
      
    }//GEN-LAST:event_editActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int row = table1.getSelectedRow();
        displayToTextField(row);
        //ObjectCreation();
        edit.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_table1MouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        int row  = table1.getSelectedRow();
        String selectedUserId =  table1.getModel().getValueAt(row, 0).toString();
         System.out.println("selectedUserId");
        int b = Integer.parseInt(selectedUserId);
        try{
     Class.forName("org.sqlite.JDBC");
     Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
    
} catch (Exception e){
    JOptionPane.showMessageDialog(null, e);    
}
        try {
            db.deleteCustomer(b);
            String transferQuery = "insert into remboursement ( 'carte_id','versement')" + 
                   " values('" + carte_id.getText() +"','"  +  versement.getText() +  "'" + ")"; 
            PreparedStatement ps =con.prepareStatement(transferQuery);    
                 ps.execute();
                
            String deleteQuer = "delete from client where n_id=" + b;
            statement = con.prepareStatement(deleteQuer);
            statement.execute();
            
       
           
        } catch (SQLException ex) {
            Logger.getLogger(jf6.class.getName()).log(Level.SEVERE, null, ex);
        }
          
   
            
        
        populateWithCustomerData();
        emptyField();
        
    }//GEN-LAST:event_deleteActionPerformed

    private void num_ch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_ch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_ch2ActionPerformed

    private void versementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_versementActionPerformed

    private void nbr_lit1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nbr_lit1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_nbr_lit1ItemStateChanged

    private void nbr_lit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbr_lit1ActionPerformed
     
        
        
             
    }//GEN-LAST:event_nbr_lit1ActionPerformed

    private void date_debutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_debutPropertyChange
         
    }//GEN-LAST:event_date_debutPropertyChange

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispo f63 =new dispo ();
       f63.show();
       dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nbr_lit2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nbr_lit2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_nbr_lit2ItemStateChanged

    private void nbr_lit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbr_lit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbr_lit2ActionPerformed

    private void nbr_chItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nbr_chItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_nbr_chItemStateChanged

    private void nbr_chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbr_chActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbr_chActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {  
            
            
            Connection  con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            PreparedStatement st = con.prepareStatement("select * from formulaire where carte_id='"+tf5.getText()+"'");  
            
            //Excuting Query  
            ResultSet rs = st.executeQuery();  
           
                
                  
        DefaultTableModel model = new DefaultTableModel();
         model.addColumn("id");
        model.addColumn("c_id");
        model.addColumn("nbr_ch");
        model.addColumn("num_ch1");
        model.addColumn("num_ch2");
        model.addColumn("nbr_lit1");
        model.addColumn("nbr_lit2");
        model.addColumn("date_debut");
        model.addColumn("date_fin");
        model.addColumn("versement");

        table1.setModel(model);
        try {
            while (rs.next()) {  String id = rs.getInt("id")+"";
                String carte_id = rs.getInt("carte_id")+"";
                String nbr_ch = rs.getString("nbr_ch")+"";
                String num_ch1 = rs.getInt("num_ch1")+"";
                String num_ch2 = rs.getString("num_ch2")+"";
                String nbr_lit1 = rs.getString("nbr_lit1")+"";
                String nbr_lit2 = rs.getString("nbr_lit2")+"";
                String date_debut = rs.getString("date_debut")+"";
                String date_fin = rs.getString("date_fin")+"";
                String versement = rs.getString("versement")+"";
                
                
                
                model.insertRow(0, new Object[] { id,carte_id,nbr_ch,num_ch1,num_ch2,nbr_lit1,nbr_lit2,date_debut,date_fin,versement});
                
                
                
                
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

    private void carte_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carte_idActionPerformed

    }//GEN-LAST:event_carte_idActionPerformed

    private void carte_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carte_idKeyPressed
        // TODO add your handling code here:
       


    

    }//GEN-LAST:event_carte_idKeyPressed

    private void carte_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carte_idKeyTyped
       
    }//GEN-LAST:event_carte_idKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 
        try {  
            
            
            Connection  con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            PreparedStatement st = con.prepareStatement("select * from formulaire");  
            
            //Excuting Query  
            ResultSet rs = st.executeQuery();  
           
                
                  
        DefaultTableModel model = new DefaultTableModel();
         model.addColumn("id");
        model.addColumn("c_id");
        
        model.addColumn("nbr_ch");
        model.addColumn("num_ch1");
        model.addColumn("num_ch2");
        model.addColumn("nbr_lit1");
        model.addColumn("nbr_lit2");
        model.addColumn("date_debut");
        model.addColumn("date_fin");
        model.addColumn("versement");

        table1.setModel(model);
        try {
            while (rs.next()) {
                String id = rs.getInt("id")+"";
                String carte_id = rs.getInt("carte_id")+"";
                
                String nbr_ch = rs.getString("nbr_ch")+"";
                String num_ch1 = rs.getInt("num_ch1")+"";
                String num_ch2 = rs.getString("num_ch2")+"";
                String nbr_lit1 = rs.getString("nbr_lit1")+"";
                String nbr_lit2 = rs.getString("nbr_lit2")+"";
                String date_debut = rs.getString("date_debut")+"";
                String date_fin = rs.getString("date_fin")+"";
                String versement = rs.getString("versement")+"";
                
                
                
                model.insertRow(0, new Object[] { id,carte_id,nbr_ch,num_ch1,num_ch2,nbr_lit1,nbr_lit2,date_debut,date_fin,versement});
                
                
                
                
            } 
            //Create Exception Handler  
        } catch (Exception ex) {  
            System.out.println(ex);  
        }}  
    
catch (Exception ex) {  
            System.out.println(ex);  
        }  








        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    client f963=new client();
f963.show();
dispose();// TOD
// your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

 private boolean isAnyRequiredFieldEmpty() {
     String dd = df.format(date_debut.getDate());
           String dff = df.format(date_fin.getDate());
        return carte_id.getText().equals("") || 
                
                num_ch1.getText().equals("") || 
               
                versement.getText().equals("") ||
                
                nbr_ch.getSelectedItem().toString().equals("") ||
                nbr_lit1.getSelectedItem().toString().equals("")
               ;
               
        
                
    }
 
     private void emptyField()
    {
         
        edit.setEnabled(false);
        delete.setEnabled(false);
        
        carte_id.setText("");
       
       num_ch1.setText("");
       num_ch2.setText("");
        nbr_lit1.setSelectedIndex(0);
       nbr_lit2.setSelectedIndex(0);
       date_debut.setDate(new Date());
        date_fin.setDate(null);
        versement.setText("");
        
        table1.clearSelection();
    }
    
    private void displayToTextField(int row)
{
    //System.out.println(table_customer.getModel().getValueAt(row, 0)+ " >>>>>>>>> ");
    carte_id.setText(table1.getModel().getValueAt(row, 1)+"");
    
   nbr_ch.getEditor().setItem(table1.getModel().getValueAt(row, 2)+"");
    num_ch1.setText( table1.getModel().getValueAt(row, 3)+"");
    num_ch2.setText( table1.getModel().getValueAt(row, 4)+"");
    nbr_lit1.getEditor().setItem(table1.getModel().getValueAt(row, 5)+"");
    
    nbr_lit2.getEditor().setItem(table1.getModel().getValueAt(row, 6)+"");
    
    versement.setText( table1.getModel().getValueAt(row, 9)+"");
}
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf6().setVisible(true);
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
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nbr_ch;
    private javax.swing.JComboBox<String> nbr_lit1;
    private javax.swing.JComboBox<String> nbr_lit2;
    private javax.swing.JTextField num_ch1;
    private javax.swing.JTextField num_ch2;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField versement;
    // End of variables declaration//GEN-END:variables
}
