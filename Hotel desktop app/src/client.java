

import java.awt.FlowLayout;
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
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class client extends javax.swing.JFrame {
 
  CustomerDb db = new CustomerDb();
     Connection con = null;
    public client() {
        initComponents();
        con = sql_conn.ConnecrDB();
         Country[] listCountry = createCountryList();
         nat.setModel(new DefaultComboBoxModel(listCountry));
         
          
       type.addItem("");
        type.addItem("carte identite");
         type.addItem("permis");
          type.addItem("passport");
        
        
    }
       
    PreparedStatement statement = null;
    ResultSet result = null; 
    
    
 private void populateWithCustomerData()
    {
        result = db.getAllCustomerr();
       
        t.setModel(DbUtils.resultSetToTableModel(result));
        
        
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

      private Country[] createCountryList() {
        String[] countryCodes = Locale.getISOCountries();
        Country[] listCountry = new Country[countryCodes.length];
 
        for (int i = 0; i < countryCodes.length; i++) {
            Locale locale = new Locale("", countryCodes[i]);
            String code = locale.getCountry();
            String name = locale.getDisplayCountry();
 
            listCountry[i] = new Country(code, name);
        }
 
        Arrays.sort(listCountry);
 
        return listCountry;
    }
     
 private boolean isAnyRequiredFieldEmpty() {
  
        return  
                nom.getText().equals("") || 
                prenom.getText().equals("") || 
                adr.getText().equals("") || 
               
                // d_n.getText().equals("") ||
                l_n.getText().equals("") || 
                prof.getText().equals("") || 
                n_id.getText().equals("") || 
               
                
                type.getSelectedItem().toString().equals("") ||
                nat.getSelectedItem().toString().equals("")
               ;
                
    }
 
     private void emptyField()
    {
         
        edit.setEnabled(false);
        delete.setEnabled(false);
        
       
        nom.setText("");
        prenom.setText("");
        adr.setText("");
      date_fin.setDate(null);
       l_n.setText("");
       prof.setText("");
        nat.setSelectedIndex(0);
          n_id.setText("");
        type.setSelectedIndex(0);
      
        table1.clearSelection();
    }
    
    private void displayToTextField(int row)
{
    nom.setText( t.getModel().getValueAt(row, 1)+"");
    prenom.setText( t.getModel().getValueAt(row, 2)+"");
  
    adr.setText( t.getModel().getValueAt(row, 3)+"");
   // d_n.setText( t.getModel().getValueAt(row, 4)+"");
    l_n.setText( t.getModel().getValueAt(row, 5)+"");
    prof.setText( t.getModel().getValueAt(row, 6)+"");
    nat.getEditor().setItem(t.getModel().getValueAt(row, 7)+"");
    n_id.setText( t.getModel().getValueAt(row, 8)+"");
   type.getEditor().setItem(t.getModel().getValueAt(row, 9)+"");
    
   }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tf5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();
        edit1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        tf6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        l_n = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        prof = new javax.swing.JTextField();
        nat = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        n_id = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        adr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        date_fin = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("envoyer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        edit.setText("editer");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setText("suprimer");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Acceuil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(t);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 870, 180));

        edit1.setText("editer");
        edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit1ActionPerformed(evt);
            }
        });
        getContentPane().add(edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 130, 40));

        delete1.setText("suprimer");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 130, 40));

        jButton6.setText("MAJ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 470, 110, 40));

        jButton7.setText("chrecher");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1143, 170, 120, -1));
        getContentPane().add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 580, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setText("Nom:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 160, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("Prenom:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        getContentPane().add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel12.setText("Date Naissance:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setText("Lieux de Naissance:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 170, 30));
        getContentPane().add(l_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 160, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setText("Nationalité:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));
        getContentPane().add(prof, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 160, 30));

        getContentPane().add(nat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 160, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setText("Proffession:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel13.setText("type d'identité:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 160, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel14.setText("Num Piece d'identite:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));
        getContentPane().add(n_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 160, -1));

        jButton3.setText("envoyer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel15.setText("Adresse:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        adr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adrActionPerformed(evt);
            }
        });
        getContentPane().add(adr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 160, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Clients");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 470, 60));

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton8.setText("Acceuil");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 80, 30));
        getContentPane().add(date_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cli.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
    }//GEN-LAST:event_jButton2ActionPerformed
    
      
    
    
    
    
  


    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

        int row = table1.getSelectedRow();
        displayToTextField(row);
        //ObjectCreation();
        edit.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_table1MouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
     
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

             
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        reception f963=new reception();
        f963.show();
        dispose();// TOD
        // your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked

        int row = t.getSelectedRow();
        displayToTextField(row);
        //ObjectCreation();
        edit.setEnabled(true);
        delete.setEnabled(true);
    }//GEN-LAST:event_tMouseClicked

    private void edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit1ActionPerformed
         

      
           int row  = t.getSelectedRow();
        String selectedUserId =  t.getModel().getValueAt(row, 0).toString();
         System.out.println("selectedUserId");
        int b = Integer.parseInt(selectedUserId);
         try {
            String updateQuery ="update client set prenom = '" + prenom.getText() + "',"
                    + "nom = '" +  nom.getText()  + "'," +"adr = '" +  adr.getText()
                    
                    + "',"  + "d_n = '" +   new SimpleDateFormat("yyyy-MM-dd").format(date_fin.getDate()) + "'," + "l_n = '" + l_n.getText() + "'," + "prof = '" +  
                    prof.getText() + "',"  + "nat = '" +  
                    nat.getSelectedItem().toString() + "',"  +"n_id = '" +  n_id.getText() + "'," 
                    + "type = '" +  type.getSelectedItem().toString()  + "' where id="
                    +b;

           statement = con.prepareStatement(updateQuery);

            statement.execute();
             JOptionPane.showMessageDialog(null, "La ligne client est bien modifié");
              populateWithCustomerData();
              emptyField();
        }
           
         catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "modification echoué");
        }
        
      
                                        

        
        
        
    
    }//GEN-LAST:event_edit1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
                                                 
        int row  = t.getSelectedRow();
        String selectedUserId =  t.getModel().getValueAt(row, 0).toString();
        int b = Integer.parseInt(selectedUserId);
        
        try {
            db.deleteCustomerr(b);
            populateWithCustomerData();
        emptyField();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(jf6.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
       

    }//GEN-LAST:event_delete1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  try {  
            
            
            Connection  con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            PreparedStatement st = con.prepareStatement("select * from client");  
            
            //Excuting Query  
            ResultSet rs = st.executeQuery();  
           
                
                  
            DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("nom");
        model.addColumn("prenom");
        model.addColumn("adresse");
        model.addColumn("d_naiss");
        model.addColumn("l_naiss");
        model.addColumn("prof");
        model.addColumn("nat");
        model.addColumn("n_id");
        model.addColumn("type");
        

        t.setModel(model);
        try {
            while (rs.next()) {
                String carte_id = rs.getInt("id")+"";
                String nom = rs.getString("nom")+"";
                String prenom = rs.getString("prenom")+"";
                String nbr_ch = rs.getString("adr")+"";
                String num_ch1 = rs.getInt("d_n")+"";
                String num_ch2 = rs.getString("l_n")+"";
                String nbr_lit1 = rs.getString("prof")+"";
                String nbr_lit2 = rs.getString("nat")+"";
                String date_debut = rs.getString("n_id")+"";
                String date_fin = rs.getString("type")+"";
            
                
                
                
                model.insertRow(0, new Object[] { carte_id,nom,prenom,nbr_ch,num_ch1,num_ch2,nbr_lit1,nbr_lit2,date_debut,date_fin});
                
                
            } 
            //Create Exception Handler  
        } catch (Exception ex) {  
            System.out.println(ex);  
        }}  
    
catch (Exception ex) {  
            System.out.println(ex);  
        }  

    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 try {  
            
            
            Connection  con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\uml\\test.db");
            PreparedStatement st = con.prepareStatement("select * from client where n_id='"+tf6.getText()+"'");  
            
            //Excuting Query  
            ResultSet rs = st.executeQuery();  
           
                
                  
      DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("nom");
        model.addColumn("prenom");
        model.addColumn("adresse");
        model.addColumn("d_naiss");
        model.addColumn("l_naiss");
        model.addColumn("prof");
        model.addColumn("nat");
        model.addColumn("n_id");
        model.addColumn("type");
        

        t.setModel(model);
        try {
            while (rs.next()) {
                String carte_id = rs.getInt("id")+"";
                String nom = rs.getString("nom")+"";
                String prenom = rs.getString("prenom")+"";
                String nbr_ch = rs.getString("adr")+"";
                String num_ch1 = rs.getInt("d_n")+"";
                String num_ch2 = rs.getString("l_n")+"";
                String nbr_lit1 = rs.getString("prof")+"";
                String nbr_lit2 = rs.getString("nat")+"";
                String date_debut = rs.getString("n_id")+"";
                String date_fin = rs.getString("type")+"";
            
                
                
                
                model.insertRow(0, new Object[] { carte_id,nom,prenom,nbr_ch,num_ch1,num_ch2,nbr_lit1,nbr_lit2,date_debut,date_fin});
                
                
                
            } 
            //Create Exception Handler  
        } catch (Exception ex) {  
            System.out.println(ex);  
        }}  
    
catch (Exception ex) {  
            System.out.println(ex);  
        }  




       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 if (!isAnyRequiredFieldEmpty()) {
       bookingObjectCreation();
       }else
        {
            JOptionPane.showMessageDialog(null, "Veuillez saisir tous les champs.");
        }





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        reception f963=new reception();
        f963.show();
        dispose();// TOD
        // your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void adrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adrActionPerformed
private void bookingObjectCreation() {


try {  String insertQuery;
           Connection con = getConnection();
          

 
           insertQuery = "insert into client( 'nom','prenom','adr','d_n','l_n','prof','nat','n_id','type')" + 
                   " values('" + nom.getText() + "'"+ ",'" + prenom.getText()+ "'" + ",'" +
                  adr.getText() + "'" + ",'" +  new SimpleDateFormat("yyyy-MM-dd").format(date_fin.getDate()) + "'" + ",'"  + l_n.getText() 
                   + "'" + ",'"  + prof.getText()+ "'" + ",'" + nat.getSelectedItem().toString() +
                   "'" + ",'" + n_id.getText()+ "'" + ",'" + type.getSelectedItem().toString() + "'" + ")";
                 PreparedStatement ps =con.prepareStatement(insertQuery);    
                 ps.execute();

                 JOptionPane.showMessageDialog(null, "Le client est ajouté");
                
                  
                Statement state= null;
                
                 
           state = con.createStatement();
           ResultSet result =state.executeQuery("SELECT  * FROM `client`"); 
                 
       
               
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("id");
        model.addColumn("nom");
        model.addColumn("prenom");
        model.addColumn("adresse");
        model.addColumn("d_naiss");
        model.addColumn("l_naiss");
        model.addColumn("prof");
        model.addColumn("nat");
        model.addColumn("n_id");
        model.addColumn("type");
        

        t.setModel(model);
        try {
            while (result.next()) {
                String carte_id = result.getInt("id")+"";
                String nom = result.getString("nom")+"";
                String prenom = result.getString("prenom")+"";
                String nbr_ch = result.getString("adr")+"";
                String num_ch1 = result.getInt("d_n")+"";
                String num_ch2 = result.getString("l_n")+"";
                String nbr_lit1 = result.getString("prof")+"";
                String nbr_lit2 = result.getString("nat")+"";
                String date_debut = result.getString("n_id")+"";
                String date_fin = result.getString("type")+"";
            
                
                
                
                model.insertRow(0, new Object[] { carte_id,nom,prenom,nbr_ch,num_ch1,num_ch2,nbr_lit1,nbr_lit2,date_debut,date_fin});
               emptyField(); 
            }
            
            // TODO add your handling code here:
        }
             catch (SQLException ex) {
               // Logger.getLogger(Main_window.class.getName()).log(level.SEVERE, null, ex); }
               JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "insertion echoué");
            
            }
                 
        }
             catch (SQLException ex) {
               // Logger.getLogger(Main_window.class.getName()).log(level.SEVERE, null, ex); }
               JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "insertion echoué");
            
            }}
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adr;
    private com.toedter.calendar.JDateChooser date_fin;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JButton edit;
    private javax.swing.JButton edit1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField l_n;
    private javax.swing.JTextField n_id;
    private javax.swing.JComboBox<String> nat;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField prof;
    private javax.swing.JTable t;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
