/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestion_stock;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.awt.print.*;
import javax.swing.JPanel;
import javax.swing.JTable;
public class Facture extends javax.swing.JFrame {
connect cnx = new connect();
Statement st;
    public Facture() {
        initComponents();
        //affiche_fact();
        //affiche_tot();
        affiche_clients();
        affiche_produits();
        
        this.setLocationRelativeTo(null);
    }
    void printrecord (JPanel panel_print){
        //creat printer job 
        PrinterJob pj = PrinterJob.getPrinterJob();
        PrinterJob.getPrinterJob().setJobName("");
        PrinterJob.getPrinterJob().setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                 // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                 //check if no printable content
                 if(pageIndex>0){return Printable.NO_SUCH_PAGE;}
                 //make 2d graphics to map content
                 Graphics2D graph2d =(Graphics2D)graphics;
                 //set graphics translations 
                 graph2d.translate(pageFormat.getImageableX()*2, pageFormat.getImageableY()*2);
                 graph2d.scale(0.3, 0.3);
                 panel_print.paint(graphics);
                 return Printable.PAGE_EXISTS;
                 
            }
        });
        //store printerJob as boolean 
        boolean reuturnResult = PrinterJob.getPrinterJob().printDialog();
        //check if the dialog is showing
        if(reuturnResult){
            try{
                //call print method inside printerjob to print
                PrinterJob.getPrinterJob().print();
            }catch(PrinterException printerException ){
                JOptionPane.showMessageDialog(this,"Ereeur "+printerException.getMessage());
            }
        }
    }
    void test_fields(){
    if (text_qte_acht.getText().isEmpty()){JOptionPane.showMessageDialog(jPanel2,"Remplir lee champ quantité ");jLabel10.setBackground(Color.red);}
    else if (text_tot.getText().isEmpty()){JOptionPane.showMessageDialog(jPanel2,"Champs obligatoire ");jLabel11.setBackground(Color.red);}
    else if (jTextField2.getText().isEmpty()){JOptionPane.showMessageDialog(jPanel2,"Champs obligatoire ");jLabel4.setBackground(Color.red);}
    else if (jTextField4.getText().isEmpty()){JOptionPane.showMessageDialog(jPanel2,"Champs obligatoire ");jLabel5.setBackground(Color.red);}
     
    }
    void update_qte(){
     DefaultTableModel table=(DefaultTableModel) tab_prod.getModel();
        int qte_vendue=Integer.parseInt(text_qte_acht.getText());
        int qte=Integer.parseInt(text_qte.getText());
        int nouv_qte=qte-qte_vendue;
        try{
            st=cnx.obtenircon().createStatement();
            st.execute("update produits set qte='"+nouv_qte+"' where idproduits='"+Integer.parseInt(text_num.getText())+"'");
            JOptionPane.showMessageDialog(rootPane,"Modifié");
            table.setRowCount(0);
            affiche_fact();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }
    void affiche_clients(){
    try{
           DefaultTableModel table=(DefaultTableModel) tab_clients.getModel();
           st=cnx.obtenircon().createStatement();
           ResultSet rs = st.executeQuery("select * from clients");
           while(rs.next()){
               table.addRow(new Object[] {rs.getString("idclients"),rs.getString("nom"),rs.getString("prenom"),rs.getString("adresse"),rs.getString("tel"),rs.getString("credit")});
           }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    void affiche_produits(){
       
        try{
        st=(Statement) cnx.obtenircon().createStatement();
        ResultSet rs;
         rs = st.executeQuery("select * from produits");
        DefaultTableModel table=(DefaultTableModel) tab_prod.getModel();
        while(rs.next()){
        table.addRow(new Object[] {rs.getString("idproduits"),rs.getString("designation"),rs.getString("qte"),rs.getString("prix_vente"),rs.getString("prix_achat")});
        }
        //table.setRowCount(0);
    }catch(SQLException e){
        JOptionPane.showMessageDialog(rootPane,e);
    }}
    void affiche_fact(){
    DefaultTableModel table =(DefaultTableModel)jTable1.getModel();
    try{
    st=cnx.obtenircon().createStatement();
    ResultSet rs = st.executeQuery("select * from factures where idclients ='"+Integer.parseInt(text_num_client.getText())+"'");
    while(rs.next()){
        table.addRow(new Object[]{rs.getString("designation"),rs.getString("quantité"),rs.getString("prix"),rs.getString("prix_tot"),rs.getString("idclients")});
       
    }
    affiche_tot();
}catch(SQLException e){
    JOptionPane.showMessageDialog(rootPane, e);
}
}
void affiche_tot(){
    try{
        st=cnx.obtenircon().createStatement();
        ResultSet rs = st.executeQuery("select sum(prix_tot) from factures where idclients ='"+Integer.parseInt(text_num_client.getText())+"'");
        if(rs.next()){
            Float total=Float.parseFloat(rs.getString("sum(prix_tot)")); System.out.print(total);
           jTextField3.setText(total.toString());
        }
    }catch(SQLException e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_clients = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab_prod = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        text_num = new javax.swing.JTextField();
        text_des = new javax.swing.JTextField();
        text_prix = new javax.swing.JTextField();
        text_qte_acht = new javax.swing.JTextField();
        text_tot = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        text_num_client = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        text_nom = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        text_pren = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        text_qte = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        panel_prnt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 168, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(129, 236, 236));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Clients");

        tab_clients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Nom", "Prénom", "Adresse", "Téléphone", "Credit"
            }
        ));
        tab_clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_clientsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab_clients);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        tab_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Désignation", "Quantité", "Prix de vente", "Prix d'achat"
            }
        ));
        tab_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_prodMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tab_prod);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Produits");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Numéro");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Désignation");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Prix unitaire");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Quantité désiré");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Prix total");

        text_qte_acht.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_qte_achtFocusLost(evt);
            }
        });
        text_qte_acht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_qte_achtActionPerformed(evt);
            }
        });
        text_qte_acht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_qte_achtKeyPressed(evt);
            }
        });

        text_tot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_totMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Numéro client");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Nom");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Prénom");

        jButton1.setText("Enregistrer client");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Quantité");

        jButton2.setBackground(new java.awt.Color(46, 204, 113));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Valider");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(235, 47, 6));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Annuler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(52, 152, 219));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Consulter");
        jButton4.setMaximumSize(new java.awt.Dimension(106, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(106, 50));

        jButton5.setBackground(new java.awt.Color(0, 153, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("Valider");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.setText("Imprimer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        panel_prnt.setBackground(new java.awt.Color(129, 236, 236));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Facture");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Désignation", "Quantité", "Prix unitaire", "Prix Total", "Numero Client"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Total");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("A payer");

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Reste");

        javax.swing.GroupLayout panel_prntLayout = new javax.swing.GroupLayout(panel_prnt);
        panel_prnt.setLayout(panel_prntLayout);
        panel_prntLayout.setHorizontalGroup(
            panel_prntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_prntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(panel_prntLayout.createSequentialGroup()
                        .addGroup(panel_prntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(116, 116, 116)
                        .addGroup(panel_prntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3))))
                .addContainerGap())
        );
        panel_prntLayout.setVerticalGroup(
            panel_prntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panel_prntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panel_prntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_prntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(11, 11, 11)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel15))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_prix, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(text_des, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(text_num, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(text_qte)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(123, 123, 123))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panel_prnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_qte_acht, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(185, 185, 185))
                    .addComponent(text_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_num_client, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_pren, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(text_des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(text_prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(text_qte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(text_qte_acht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(text_tot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(text_num_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(text_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(text_pren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton7))
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel_prnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_clientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_clientsMouseClicked
        int row = tab_clients.getSelectedRow();
        String table=tab_clients.getValueAt(row,0).toString();
        try{
            st=cnx.obtenircon().createStatement();
            ResultSet rs=st.executeQuery("select * from clients where idclients='"+table+"'");
            if(rs.next()){
                String add=rs.getString("idclients");
                text_num_client.setText(add);
                String add1=rs.getString("nom");
                text_nom.setText(add1);
                String add2=rs.getString("prenom");
                text_pren.setText(add2);
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_tab_clientsMouseClicked

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        Float reste =Float.parseFloat(jTextField3.getText())-Float.parseFloat(jTextField2.getText());
        jTextField4.setText(reste.toString());
    }//GEN-LAST:event_jTextField2FocusLost

    private void tab_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_prodMouseClicked
        try{
            st = (Statement) cnx.obtenircon().createStatement();
            int row=tab_prod.getSelectedRow();
            String tab = (tab_prod.getValueAt(row, 0).toString());
            ResultSet rs =st.executeQuery("select idproduits,designation,qte,prix_vente,prix_achat from produits where idproduits='"+tab+"'");

            if(rs.next()){
                String add=rs.getString("idproduits");
                text_num.setText(add);
                String add1=rs.getString("designation");
                text_des.setText(add1);
                String add2=rs.getString("qte");
                text_qte.setText(add2);

                String add4=rs.getString("prix_vente");
                text_prix.setText(add4);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_tab_prodMouseClicked

    private void text_qte_achtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_qte_achtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_qte_achtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String designation = text_des.getText();
        int qte = Integer.parseInt(text_qte_acht.getText());
        Float price=Float.parseFloat(text_prix.getText());
        Float price_tot=Float.parseFloat(text_tot.getText());
        int id_client=Integer.parseInt(text_num_client.getText());
        try{
            DefaultTableModel tab=(DefaultTableModel) jTable1.getModel();
            DefaultTableModel tab1=(DefaultTableModel) tab_prod.getModel();
            st=cnx.obtenircon().createStatement();
            st.executeUpdate("insert into factures (designation , quantité, prix, prix_tot, idclients)values ('"+designation+"','"+qte+"','"+price+"','"+price_tot+"','"+id_client+"')");
            JOptionPane.showMessageDialog(rootPane, "Done");
            update_qte();
            tab.setRowCount(0);
            tab1.setRowCount(0);
            affiche_fact();
            affiche_produits();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void text_qte_achtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_qte_achtKeyPressed
        /*char c =evt.getKeyChar();
        int qte_stck=Integer.parseInt(text_qte.getText());
        if(c>qte_stck){JOptionPane.showMessageDialog(rootPane, "Quantité pas valide");jButton2.setEnabled(false);
        text_qte_acht.setText("");}
        else if (c<qte_stck){
            jButton2.setEnabled(true);
        } else {}*/
    }//GEN-LAST:event_text_qte_achtKeyPressed

    private void text_qte_achtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_qte_achtFocusLost
        int qte_stck=Integer.parseInt(text_qte.getText());
        int c = Integer.parseInt(text_qte_acht.getText());
        if(c>qte_stck){JOptionPane.showMessageDialog(rootPane, "Quantité pas valide");jButton2.setEnabled(false);
        text_qte_acht.setText("");}
        else if (c<qte_stck){
            jButton2.setEnabled(true);
        } else {}
    }//GEN-LAST:event_text_qte_achtFocusLost

    private void text_totMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_totMouseClicked
        Float price = Float.parseFloat(text_prix.getText());
        int qte = Integer.parseInt(text_qte_acht.getText());
        Float tot=price*qte;
        text_tot.setText(tot.toString());
    }//GEN-LAST:event_text_totMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            test_fields();
        if((text_num.getText().isEmpty())||(text_des.getText().isEmpty())||(text_prix.getText().isEmpty())||(text_qte.getText().isEmpty())||(text_qte_acht.getText().isEmpty())||(text_tot.getText().isEmpty())||(text_num_client.getText().isEmpty())||(text_nom.getText().isEmpty())||(text_pren.getText().isEmpty())||(jTextField2.getText().isEmpty())||(jTextField4.getText().isEmpty())){JOptionPane.showMessageDialog(jPanel2, "Tous les champs sont obligatoires");/*jButton2.setEnabled(false);*/}
       else{Float a_payer=Float.parseFloat(jTextField2.getText());
       Float rest = Float.parseFloat(jTextField4.getText());
       test_fields();
        try {
            DefaultTableModel tab=(DefaultTableModel)tab_clients.getModel();
            ResultSet rs = st.executeQuery("select credit from clients where idclients='"+Integer.parseInt(text_num_client.getText())+"'");
            if (rs.next()){Float credit =Float.parseFloat(rs.getString("credit"));Float nouv=credit+rest;
            
            //st.close();
           st=cnx.obtenircon().createStatement();
           st.execute("update clients set credit='"+nouv+"' where idclients='"+Integer.parseInt(text_num_client.getText())+"'");
           JOptionPane.showMessageDialog(rootPane, "Done");
           tab.setRowCount(0);
           affiche_clients();}
       }catch(SQLException e){
           JOptionPane.showMessageDialog(rootPane, e);
       }
       } 
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        DefaultTableModel tab =(DefaultTableModel)tab_prod.getModel();
       tab.setRowCount(0);
        
            if(jTextField5.getText().isEmpty()){tab.setRowCount(0);affiche_produits();
            }else{
            char c=evt.getKeyChar();System.out.println(c);
       try{
           st=cnx.obtenircon().createStatement();
           ResultSet rs=st.executeQuery("select *  from produit where designation like '%"+c+"%'");
            while(rs.next()){
            tab.addRow(new Object[] {rs.getString("idproduit"),rs.getString("designation"),rs.getString("qte"),rs.getString("prix_vente"),rs.getString("prix_achat")});}
            }
       catch(SQLException e){
           JOptionPane.showMessageDialog(rootPane, e);
       }
    }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
       DefaultTableModel tab =(DefaultTableModel)tab_clients.getModel();
       tab.setRowCount(0);
        
            if(jTextField1.getText().isEmpty()){tab.setRowCount(0);affiche_clients();
            }else{
            char c=evt.getKeyChar();System.out.println(c);
       try{
           st=cnx.obtenircon().createStatement();
           ResultSet rs=st.executeQuery("select *  from clients where nom like '%"+c+"%'");
            while(rs.next()){
            tab.addRow(new Object[] {rs.getString("idclients"),rs.getString("nom"),rs.getString("prenom"),rs.getString("adresse"),rs.getString("tel"),rs.getString("credit")});}
            }
       catch(SQLException e){
           JOptionPane.showMessageDialog(rootPane, e);
       }
    }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    JPanel panel_print = null;
       
        printrecord(panel_print);
        //immpression du tableau 
       /* MessageFormat Header = new MessageFormat ("");
       MessageFormat Footer = new MessageFormat ("");
       try{
           jTable1.print(JTable.PrintMode.NORMAL, Header, Footer);
       }catch(java.awt.print.PrinterException e){
       }*/
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                text_qte_acht.setText("");
                text_num_client.setText("");
                text_nom.setText("");
                text_pren.setText(""); 
                text_num.setText("");
                text_des.setText("");
                text_qte.setText("");
                text_prix.setText("");
                text_tot.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ajouter_clients2 ac2 = new ajouter_clients2();ac2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel panel_prnt;
    private javax.swing.JTable tab_clients;
    private javax.swing.JTable tab_prod;
    private javax.swing.JTextField text_des;
    private javax.swing.JTextField text_nom;
    private javax.swing.JTextField text_num;
    private javax.swing.JTextField text_num_client;
    private javax.swing.JTextField text_pren;
    private javax.swing.JTextField text_prix;
    private javax.swing.JTextField text_qte;
    private javax.swing.JTextField text_qte_acht;
    private javax.swing.JTextField text_tot;
    // End of variables declaration//GEN-END:variables
}
