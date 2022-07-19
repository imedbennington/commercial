/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestion_stock;

import java.sql.*;
import javax.swing.JOptionPane;
public class acceuil_gerant extends javax.swing.JFrame {

    connect cnx=new connect();
    Statement st;
    public acceuil_gerant() {
        initComponents();
        check.setVisible(false);
        text_id.setVisible(false);
        pass.setVisible(false);
        btn_cnt.setVisible(false);
        btn_annl.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        this.setLocationRelativeTo(null);
        
    }
    void go_salary(){
    int res =check_pass();
        if (res==1){  Salaires s = new Salaires();
        s.setVisible(true);this.setVisible(false);}else{JOptionPane.showMessageDialog(rootPane,"check password");}
    }
    int  check_pass(){
        int res = 0;
        String log = text_id.getText();
        String password = pass.getText();
        try{
            st=cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select nom, password from admin");
            while(rs.next()){
                String id2=rs.getString("nom");
                String pass2=rs.getString("password");
                System.out.println(id2);
                System.out.println(pass2);
                text_id.setText(id2);
                text_id.setEditable(false);
                if((log.equals(id2))&&(pass2.equals(password))){
                    res =1;
                }else{
                res = 0;
                }
                }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
        return res;
    }
    void connectez(){
        String test=check.getText();
        String log = text_id.getText();
        String password = pass.getText();
        try{
            st=cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select nom, password from admin");
            while(rs.next()){
                String id2=rs.getString("nom");
                String pass2=rs.getString("password");
                System.out.println(id2);
                System.out.println(pass2);
                text_id.setText(id2);
                text_id.setEditable(false);
                
                   switch(test){
                       case"Salaires": 
                       if((log.equals(id2))&&(pass2.equals(password))){Salaires s = new Salaires();s.setVisible(true);this.setVisible(false);}else{JOptionPane.showMessageDialog(rootPane, "verifier ");}
                       break;    
                       case"Congés":
                       if((log.equals(id2))&&(pass2.equals(password))){congés c = new congés();c.setVisible(true);this.setVisible(false);}else{JOptionPane.showMessageDialog(rootPane, "verifier ");}
                       break;
                       case"Présence":
                       if((log.equals(id2))&&(pass2.equals(password))){attendance_table at = new attendance_table();at.setVisible(true);this.setVisible(false);}else{JOptionPane.showMessageDialog(rootPane, "verifier ");}
                       break;
                       case"ouvriers":
                       if((log.equals(id2))&&(pass2.equals(password))){ouvrier o = new ouvrier();o.setVisible(true);this.setVisible(false);}else{JOptionPane.showMessageDialog(rootPane, "verifier ");}
                   }
                }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        btn_cnt = new javax.swing.JButton();
        btn_annl = new javax.swing.JButton();
        check = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(129, 236, 236));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Identifiant administrateur");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Mot de passe");

        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });

        btn_cnt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_cnt.setText("Connecter");
        btn_cnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cntActionPerformed(evt);
            }
        });

        btn_annl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_annl.setText("Annuler");
        btn_annl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_annlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btn_cnt)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_annl, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cnt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_annl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenu3.setText("Clients");

        jMenuItem3.setText("Supprimer");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem5.setText("Modifier");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem1.setText("Ajouter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenu1.add(jMenu3);

        jMenu4.setText("Fournisseurs");

        jMenuItem8.setText("Ajouter");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem7.setText("Supprimer");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem6.setText("Modifier");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenu1.add(jMenu4);

        jMenu5.setText("Ouvriers");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem10.setText("Supprimer ouvriers");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem9.setText("Modifier ouvriers");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem11.setText("Ajouter ouvriers");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenu1.add(jMenu5);

        jMenuItem2.setText("Vente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Commande");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem13.setText("Salaires");
        jMenuItem13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem13MouseClicked(evt);
            }
        });
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem15.setText("Présence");
        jMenuItem15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem15MouseClicked(evt);
            }
        });
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        jMenuItem14.setText("Congés");
        jMenuItem14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem14MouseClicked(evt);
            }
        });
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ajouter_clients2 clients = new ajouter_clients2();
        clients.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ajouter_clients2 clients = new ajouter_clients2();
        clients.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ajouter_clients2 clients = new ajouter_clients2();
        clients.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        fournisseurs2 f = new fournisseurs2();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        fournisseurs2 f = new fournisseurs2();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        fournisseurs2 f = new fournisseurs2();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       vente v = new vente();
       v.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_cntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cntActionPerformed
        connectez();
    }//GEN-LAST:event_btn_cntActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       
       check.setText("ouvriers"); System.out.println(check.getText());
        JOptionPane.showMessageDialog(rootPane,"Vous devez avoir un compte administrateur");
        
        text_id.setVisible(true);
        pass.setVisible(true);
        btn_cnt.setVisible(true);
        btn_annl.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        String log = text_id.getText();
        String password = pass.getText();
        try{
            st=cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select nom, password from admin");
            while(rs.next()){
                String id2=rs.getString("nom");
                String pass2=rs.getString("password");
                System.out.println(id2);
                System.out.println(pass2);
                text_id.setText(id2);
                text_id.setEditable(false);
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        } 
       /*ouvrier emp = new ouvrier();
        emp.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        check.setText("ouvriers"); System.out.println(check.getText());
        JOptionPane.showMessageDialog(rootPane,"Vous devez avoir un compte administrateur");
        
        text_id.setVisible(true);
        pass.setVisible(true);
        btn_cnt.setVisible(true);
        btn_annl.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        String log = text_id.getText();
        String password = pass.getText();
        try{
            st=cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select nom, password from admin");
            while(rs.next()){
                String id2=rs.getString("nom");
                String pass2=rs.getString("password");
                System.out.println(id2);
                System.out.println(pass2);
                text_id.setText(id2);
                text_id.setEditable(false);
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        } 
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        check.setText("ouvriers"); System.out.println(check.getText());
        JOptionPane.showMessageDialog(rootPane,"Vous devez avoir un compte administrateur");
        
        text_id.setVisible(true);
        pass.setVisible(true);
        btn_cnt.setVisible(true);
        btn_annl.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        String log = text_id.getText();
        String password = pass.getText();
        try{
            st=cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select nom, password from admin");
            while(rs.next()){
                String id2=rs.getString("nom");
                String pass2=rs.getString("password");
                System.out.println(id2);
                System.out.println(pass2);
                text_id.setText(id2);
                text_id.setEditable(false);
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        } 
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        check.setText("ouvriers"); System.out.println(check.getText());
        JOptionPane.showMessageDialog(rootPane,"Vous devez avoir un compte administrateur");
        
        text_id.setVisible(true);
        pass.setVisible(true);
        btn_cnt.setVisible(true);
        btn_annl.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        String log = text_id.getText();
        String password = pass.getText();
        try{
            st=cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select nom, password from admin");
            while(rs.next()){
                String id2=rs.getString("nom");
                String pass2=rs.getString("password");
                System.out.println(id2);
                System.out.println(pass2);
                text_id.setText(id2);
                text_id.setEditable(false);
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
      check.setText("Présence");System.out.println(check.getText());
        JOptionPane.showMessageDialog(rootPane,"Vous devez avoir un compte administrateur");
        text_id.setVisible(true);
        pass.setVisible(true);
        btn_cnt.setVisible(true);
        btn_annl.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        String log = text_id.getText();
        String password = pass.getText();
        try{
            st=cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select nom, password from admin");
            while(rs.next()){
                String id2=rs.getString("nom");
                String pass2=rs.getString("password");
                System.out.println(id2);
                System.out.println(pass2);
                text_id.setText(id2);
                text_id.setEditable(false);
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
      /*int res =check_pass();
        if (res==1){  attendance_table att = new attendance_table();
        att.setVisible(true);this.setVisible(false);}else{JOptionPane.showMessageDialog(rootPane,"check password");}*/  
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        check.setText("Congés");System.out.println(check.getText());
        JOptionPane.showMessageDialog(rootPane,"Vous devez avoir un compte administrateur");
        text_id.setVisible(true);
        pass.setVisible(true);
        btn_cnt.setVisible(true);
        btn_annl.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        String log = text_id.getText();
        String password = pass.getText();
        try{
            st=cnx.obtenircon().createStatement();
            ResultSet rs = st.executeQuery("select nom, password from admin");
            while(rs.next()){
                String id2=rs.getString("nom");
                String pass2=rs.getString("password");
                System.out.println(id2);
                System.out.println(pass2);
                text_id.setText(id2);
                text_id.setEditable(false);
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        /*int res;
        res=JOptionPane.showConfirmDialog(rootPane,"Vous devez avoir un compte administrateur, Connecter?");
        if(res==0){*/
        text_id.setVisible(true);
        pass.setVisible(true);
        btn_cnt.setVisible(true);
        btn_annl.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        //}else{JOptionPane.showMessageDialog(rootPane,"Annulé");}
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        /*int res =check_pass();
        if (res==1){  attendance_table att = new attendance_table();
        att.setVisible(true);this.setVisible(false);}else{JOptionPane.showMessageDialog(rootPane,"check password");}*/
    }//GEN-LAST:event_passFocusLost

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem14MouseClicked
        
    }//GEN-LAST:event_jMenuItem14MouseClicked

    private void jMenuItem15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem15MouseClicked
        
    }//GEN-LAST:event_jMenuItem15MouseClicked

    private void jMenuItem13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem13MouseClicked
       
    }//GEN-LAST:event_jMenuItem13MouseClicked

    private void btn_annlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_annlActionPerformed
        check.setVisible(false);
        text_id.setVisible(false);
        pass.setVisible(false);
        btn_cnt.setVisible(false);
        btn_annl.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        
    }//GEN-LAST:event_btn_annlActionPerformed

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
            java.util.logging.Logger.getLogger(acceuil_gerant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceuil_gerant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceuil_gerant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceuil_gerant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acceuil_gerant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_annl;
    private javax.swing.JButton btn_cnt;
    private javax.swing.JTextField check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField text_id;
    // End of variables declaration//GEN-END:variables
}
