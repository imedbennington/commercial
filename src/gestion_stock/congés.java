/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestion_stock;

import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class congés extends javax.swing.JFrame {
connect cnx = new connect();
Statement st;
    public congés() {
        initComponents();
        jDateChooser1.setEnabled(false);
        this.setLocationRelativeTo(null);
        affiche();
    }

    void affiche(){
    DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
        try{
    st=cnx.obtenircon().createStatement();
    ResultSet rs = st.executeQuery("select * from ouvriers");
    while(rs.next()){
        table.addRow(new Object[] {rs.getString("idouvriers"),rs.getString("nom"),rs.getString("prenom"),rs.getString("telephone"),rs.getString("salaire"),rs.getString("date_deb"),rs.getString("fonction"),rs.getString("nbr_jours_congés")});
    }
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(rootPane, e);
    }     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_num = new javax.swing.JTextField();
        text_nom = new javax.swing.JTextField();
        text_prenom = new javax.swing.JTextField();
        text_solde = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        text_periode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 168, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(129, 236, 236));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Chercher");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nuuméro", "Nom", "prenom", "Téléphone", "Salaire", "Date de début", "fonction", "Solde"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Numéro");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Prénom");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Solde");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Date");

        jButton1.setBackground(new java.awt.Color(46, 204, 113));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(231, 76, 60));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Annuler");

        text_periode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_periodeMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Début de congé");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Fin du congé");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Période");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_nom)
                                    .addComponent(text_num)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_periode)
                                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(text_prenom)
                                    .addComponent(text_solde)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(text_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(text_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(text_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(text_solde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_periode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        try{
            st=cnx.obtenircon().createStatement();
            int row=jTable1.getSelectedRow();
            String tab =jTable1.getValueAt(row,0).toString();
            ResultSet rs = st.executeQuery("select * from ouvriers where idouvriers='"+tab+"'");
            if(rs.next()){
                String add0=rs.getString("idouvriers");
                text_num.setText(add0);
                String add=rs.getString("nom");
                text_nom.setText(add);
                String add1=rs.getString("prenom");
                text_prenom.setText(add1);
                String add2=rs.getString("nbr_jours_congés");
                text_solde.setText(add2);
                String add3=rs.getString("date_deb");
                jDateChooser1.setDate(Date.valueOf(add3));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //if ((text_num.getText().isEmpty())||()text_num.getText().isEmpty()){}
        DefaultTableModel tab =(DefaultTableModel)jTable1.getModel();
    int old_num=Integer.parseInt(text_periode.getText());
    int new_num=old_num+Integer.parseInt(text_periode.getText());
    try{
        st=cnx.obtenircon().createStatement();
        st.execute("update ouvriers set nbr_jours_congés='"+new_num+"' where idouvriers='"+Integer.parseInt(text_num.getText())+"'");
        JOptionPane.showMessageDialog(rootPane, "Done");
    }catch(SQLException e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
        tab.setRowCount(0);
        affiche();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void text_periodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_periodeMouseClicked
        check_date();
    }//GEN-LAST:event_text_periodeMouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
       DefaultTableModel tab =(DefaultTableModel)jTable1.getModel();
       tab.setRowCount(0);
        
            if(jTextField1.getText().isEmpty()){tab.setRowCount(0);affiche();
            }else{
            char c=evt.getKeyChar();System.out.println(c);
       try{
           st=cnx.obtenircon().createStatement();
           ResultSet rs=st.executeQuery("select *  from ouvriers where nom like '%"+c+"%'");
            while(rs.next()){
            tab.addRow(new Object [] {rs.getString("idouvriers"),rs.getString("nom"),rs.getString("prenom"),rs.getString("telephone"),rs.getString("salaire"),rs.getString("date_deb"),rs.getString("fonction"),rs.getString("nbr_jours_congés")});}
            }
       catch(SQLException e){
           JOptionPane.showMessageDialog(rootPane, e);
       }
    }//GEN-LAST:event_jTextField1KeyPressed
    }
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
    }//GEN-LAST:event_jTextField1KeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        acceuil_gerant ag = new acceuil_gerant();
        ag.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing
    void check_date(){
     //get system date
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now)); 
   
   SimpleDateFormat dsf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dn = jDateChooser1.getDate();    
         int current_year = now.getYear();//currents date's year
         int current_day = now.getDayOfMonth();
         int current_month  = now.getMonthValue();
                 System.out.println("current day ='"+current_day+"'");
         //datechooser picking year
        Calendar c=Calendar.getInstance();
        int year = c.get(Calendar.YEAR);System.out.println(year);
        //comparing two years 
        int p = Integer.parseInt(text_solde.getText());
       if((year==current_year)&&(p>30)){JOptionPane.showMessageDialog(rootPane,"vous ne pouvez pas passer un congé");}
       else{
           //comparing two dates with day instance
       var ddc = jDateChooser2.getDate();
        java.util.Date dfc = jDateChooser3.getDate();
        Calendar c1=Calendar.getInstance();
         Calendar c2=Calendar.getInstance();
        c1.setTime(ddc);
        c2.setTime(dfc);
        int day = c1.get(Calendar.DAY_OF_MONTH);System.out.println(day);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);System.out.println(day2);
        
        int mon = c1.get(Calendar.MONTH);
        int mon2 = c2.get(Calendar.MONTH);
        int periode;
        String periode2;
        //needs more testing days
        if((year%4==0)&&(day2<day)&&(mon2-mon==1)){
        switch(mon2){
            case 1  :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 2  :periode = (29-day)+day2/*29-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 3  :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 5  :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 7  :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 9  :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 11 :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 12 :periode = (30-day)+day2/*30-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 4  :periode = (30-day)+day2/*30-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 6  :periode = (30-day)+day2/*30-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 8  :periode = (30-day)+day2/*30-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 10 :periode = (30-day)+day2/*30-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
        }
        }else if((year%4!=0)&&(day2<day)&&(mon2-mon==1)){
            switch(mon2){
            case 1  :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 2  :periode = (38-day)+day2/*28-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 3  :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 5  :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 7  :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 9  :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 11 :periode = (31-day)+day2/*31-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 12 :periode = (30-day)+day2/*30-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 4  :periode = (30-day)+day2/*30-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 6  :periode = (30-day)+day2/*30-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 8  :periode = (30-day)+day2/*30-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
            case 10 :periode = (30-day)+day2/*30-day2+day*/;periode2 =String.valueOf(periode);text_periode.setText(periode2);
        }
        }
        //if(mon2-mon==1){periode = 30-(day2+day);periode2 =String.valueOf(periode);text_periode.setText(periode2);}
            
        else if((mon==mon2)&&(day2<day)){JOptionPane.showMessageDialog(rootPane,"check mistake");}
        /*else if(mon2>mon){JOptionPane.showMessageDialog(rootPane,"check mistake");}
        else if((mon!=current_month)&&(current_day>day)){JOptionPane.showMessageDialog(rootPane,"check mistake");}*/
        else{
        periode=day2-day;
        periode2 =String.valueOf(periode);
        text_periode.setText(periode2);}
        
        }
       //else{JOptionPane.showMessageDialog(rootPane,"mistake");}
    }
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
            java.util.logging.Logger.getLogger(congés.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(congés.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(congés.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(congés.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new congés().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField text_nom;
    private javax.swing.JTextField text_num;
    private javax.swing.JTextField text_periode;
    private javax.swing.JTextField text_prenom;
    private javax.swing.JTextField text_solde;
    // End of variables declaration//GEN-END:variables
}
