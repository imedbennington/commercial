/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestion_stock;

import javax.swing.JOptionPane;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class ouvrier extends javax.swing.JFrame {

      connect cnx =new connect();
        Statement st;
    public ouvrier() {
        initComponents();
        num.setVisible(false);
        affiche();
        this.setLocationRelativeTo(null);
      
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text_nom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        text_pren = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_tel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        text_salaire = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        num = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(15, 10, 222));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(129, 236, 236));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Nom");

        text_nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_nomKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_nomKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Prenom");

        text_pren.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_prenKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Telephone");

        text_tel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_telFocusLost(evt);
            }
        });
        text_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_telKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Salaire");

        text_salaire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_salaireKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Fonction");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sélectionner", "Chauffeur", "Vendeur", "Gérant" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Date de début");

        jButton1.setBackground(new java.awt.Color(45, 85, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(45, 85, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(242, 38, 19));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(46, 204, 113));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Modifier");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        num.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nuuméro", "Nom", "prenom", "Téléphone", "Salaire", "Date de début", "fonction"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(195, 195, 195))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(234, 234, 234)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(text_pren)
                                    .addComponent(text_nom)
                                    .addComponent(text_tel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_salaire))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(text_pren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(text_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(text_salaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)))
                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void supp_gerant(){
        String fct ="Gérant";
    try{
        st=cnx.obtenircon().createStatement();
        st.execute("delete from ouvriers where fonction ='"+fct+"'");
        JOptionPane.showMessageDialog(rootPane, "Supprimé");
    }catch(SQLException e){
        JOptionPane.showMessageDialog(rootPane, "erreur suppression");
    }
    }
    boolean chek_fct(){
    boolean test=false;
    try{
        st=cnx.obtenircon().createStatement();
        ResultSet rs =st.executeQuery("select fonction from ouvriers where fonction='Gérant'");
        while(rs.next()){
            String fct  =rs.getString("fonction");
            if(fct.isEmpty()){test=false;}else{test=true;}  System.out.println(fct);System.out.println(test);
        }
        
    }catch(SQLException e){
        JOptionPane.showMessageDialog(rootPane,e);
    }
    return test;
    }
    void affiche(){
    DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
        try{
    st=cnx.obtenircon().createStatement();
    ResultSet rs = st.executeQuery("select * from ouvriers");
    while(rs.next()){
        table.addRow(new Object[] {rs.getString("idouvriers"),rs.getString("nom"),rs.getString("prenom"),rs.getString("telephone"),rs.getString("salaire"),rs.getString("date_deb"),rs.getString("fonction")});
    }
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean test=chek_fct();System.out.print(test);
        DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
        //boolean test=false;
        if(jComboBox1.getSelectedIndex()==3){test=chek_fct();}
        if(test==true){
            int res = JOptionPane.showConfirmDialog(rootPane,"Un gérant eiste déja, vouler le supprimer?");
                if(res==0){
                    supp_gerant();
                    table.setRowCount(0);
                    affiche();
                    affect_a_password aap = new affect_a_password(); aap.setVisible(true);
                }else{JOptionPane.showMessageDialog(rootPane,"annulé");}
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
        java.util.Date dn =jDateChooser1.getDate();
        String dc = sdf.format(dn);
        String fct=jComboBox1.getSelectedItem().toString();
        Double s =Double.parseDouble(text_salaire.getText());
        int tel = Integer.parseInt(text_tel.getText());
        try{
            st=cnx.obtenircon().createStatement();
            st.executeUpdate("insert into ouvriers (nom, prenom, telephone, date_deb, fonction ,salaire ) values ('"+text_nom.getText()+"','"+text_pren.getText()+"','"+tel+"','"+dc+"','"+fct+"','"+s+"')");
            JOptionPane.showMessageDialog(rootPane,"Done");
            table.setRowCount(0);
            affiche();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
        boolean test=false;
        if(jComboBox1.getSelectedIndex()==3){test=chek_fct();}
        if(test==true){
            int res = JOptionPane.showConfirmDialog(rootPane,"Un gérant eiste déja, vouler le supprimer?");
                if(res==0){
                    supp_gerant();
                    table.setRowCount(0);
                    affiche();
                    affect_a_password aap = new affect_a_password(); aap.setVisible(true);
                }else{JOptionPane.showMessageDialog(rootPane,"annulé");}
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        try{
         st=cnx.obtenircon().createStatement();
         int row=jTable1.getSelectedRow();
         String tab =jTable1.getValueAt(row,0).toString();
         ResultSet rs = st.executeQuery("select * from ouvriers where idouvriers='"+tab+"'");
         if(rs.next()){
                String add0=rs.getString("idouvriers");
                num.setText(add0);
                String add=rs.getString("nom");
                text_nom.setText(add);
                String add1=rs.getString("prenom");
                text_pren.setText(add1);
                String add2=rs.getString("telephone");
                text_tel.setText(add2);
                String add3=rs.getString("fonction");
                jComboBox1.setSelectedItem(add3);
                String add5=rs.getString("salaire");
                text_salaire.setText(add5);
                String add4=rs.getString("date_deb");
                jDateChooser1.setDate(Date.valueOf(add4));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
        java.util.Date dn =jDateChooser1.getDate();
        String dc = sdf.format(dn);
       int id = Integer.parseInt(num.getText());
        try{
            String str = jDateChooser1.getDate().toString();
            Date date = null;
            /*try {
                date = (Date) new SimpleDateFormat("yyyy,MM,dd").parse(str);
            } catch (ParseException ex) {
                Logger.getLogger(ouvrier.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
            st=cnx.obtenircon().createStatement();
            st.execute("update ouvriers set nom='"+text_nom.getText()+"', prenom='"+text_pren.getText()+"', telephone='"+Integer.parseInt(text_tel.getText())+"', fonction='"+jComboBox1.getSelectedItem()+"',salaire ='"+Double.parseDouble(text_salaire.getText())+"', date_deb='"+dc+"' where idouvriers='"+id+"'");
            JOptionPane.showMessageDialog(rootPane, "Done");
            table.setRowCount(0);
            affiche();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
        int numero=Integer.parseInt(num.getText());
        int res =JOptionPane.showConfirmDialog(rootPane, "Voulez vous supprimer?");
        if(res==0){
        try{
            st=(Statement) cnx.obtenircon().createStatement();
            st.execute("delete from ouvriers where idouvriers='"+numero+"'");
            table.setRowCount(0);
            affiche();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);}
        
        }else{JOptionPane.showMessageDialog(null, "annulÃ©");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        acceuil_gerant ag = new acceuil_gerant();
        ag.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void text_nomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nomKeyTyped
        
    }//GEN-LAST:event_text_nomKeyTyped

    private void text_nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nomKeyPressed
       char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            JOptionPane.showMessageDialog(rootPane,"enter a valid name");
            StringBuffer sb= new StringBuffer(text_nom.getText());System.out.println("sub1"+sb);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
        text_nom.setText(sb.toString());
        }
        
    }//GEN-LAST:event_text_nomKeyPressed

    private void text_prenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_prenKeyPressed
       char c = evt.getKeyChar();
        if(Character.isDigit(c)){
            JOptionPane.showMessageDialog(rootPane,"enter a valid name");
            StringBuffer sb= new StringBuffer(text_pren.getText());System.out.println(sb);
        sb.deleteCharAt(sb.length()-1);
        text_pren.setText(sb.toString());
        }
    }//GEN-LAST:event_text_prenKeyPressed

    private void text_telKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_telKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            JOptionPane.showMessageDialog(rootPane,"enter a valid number");
            StringBuffer sb= new StringBuffer(text_tel.getText());System.out.println(sb);
        sb.deleteCharAt(sb.length()-1);
        text_tel.setText(sb.toString());
        }
    }//GEN-LAST:event_text_telKeyPressed

    private void text_salaireKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_salaireKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            JOptionPane.showMessageDialog(rootPane,"enter a valid number");
            StringBuffer sb= new StringBuffer(text_salaire.getText());System.out.println(sb);
        sb.deleteCharAt(sb.length()-1);
        text_salaire.setText(sb.toString());
        }
    }//GEN-LAST:event_text_salaireKeyPressed

    private void text_telFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_telFocusLost
        String phone_num=text_tel.getText();
        if(phone_num.length()!=8){JOptionPane.showMessageDialog(rootPane,"enter a valid number");}
    }//GEN-LAST:event_text_telFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        text_nom.setText("");
        text_pren.setText("");
        text_tel.setText("");
        text_salaire.setText("");
        jComboBox1.setSelectedIndex(0);
        jDateChooser1.setToolTipText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ouvrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ouvrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ouvrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ouvrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ouvrier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField num;
    private javax.swing.JTextField text_nom;
    private javax.swing.JTextField text_pren;
    private javax.swing.JTextField text_salaire;
    private javax.swing.JTextField text_tel;
    // End of variables declaration//GEN-END:variables
}
