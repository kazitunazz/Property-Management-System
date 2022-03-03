package ContainsEverything_Package;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class WantToBuy extends javax.swing.JFrame {

    public WantToBuy() {
        initComponents();
        //jPanel2.setVisible(false);
        AddRowToTable();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        ContactButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BudgetField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apartments For Sale!");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apartment No", "No of Rooms", "Bedroom", "Washroom", "Apartment Size (sq ft)", "Price (Lacs)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        BackButton.setBackground(new java.awt.Color(0, 0, 0));
        BackButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ContactButton.setBackground(new java.awt.Color(0, 0, 0));
        ContactButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ContactButton.setForeground(new java.awt.Color(255, 255, 255));
        ContactButton.setText("Contact");
        ContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Your Max Budget (Lacs)");

        SearchButton.setBackground(new java.awt.Color(51, 51, 51));
        SearchButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(255, 255, 255));
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(803, 803, 803)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ContactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(BudgetField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BudgetField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContactButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        IfClickBuyerPage x = new IfClickBuyerPage();
        this.setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        //jPanel2.setVisible(true);
        //AddRowToTable();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {

            ConnectWithDatabase obj = new ConnectWithDatabase();
            obj.connectDB();

            Statement statement = obj.connection.createStatement();
            ResultSet resultset;
            String budget = (BudgetField.getText());
            //if(budget=="hello")

            resultset = statement.executeQuery("SELECT ApartmentNo, NoOfRooms, Bedroom, "
                    + "Washroom, ApartmentSize,PriceInLacs "
                    + "FROM Apartment "
                    + "WHERE (Status='Vacant' OR Status='For Sale') AND PriceInLacs<=" + budget);

            ArrayList<Apartment> ar = new ArrayList<Apartment>();
            Apartment x;
            //System.out.println(resultset.getString("ApartmentNo"));
            while (resultset.next()) {

                x = new Apartment(resultset.getString("ApartmentNo"), resultset.getInt("NoOfRooms"),
                        resultset.getInt("Bedroom"), resultset.getInt("Washroom"),
                        resultset.getDouble("ApartmentSize"), resultset.getDouble("PriceInLacs"));
                ar.add(x);
                //System.out.println(x.PriceInLacs);
            }
            int sz = ar.size();
            System.out.println(sz);
            // DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            //model.setRowCount(0);
            Object rowData[] = new Object[6];
            for (int i = 0; i < sz; i++) {
                rowData[0] = ar.get(i).ApartmentNo;
                rowData[1] = ar.get(i).NoOfRooms;
                rowData[2] = ar.get(i).Bedroom;
                rowData[3] = ar.get(i).Washroom;
                rowData[4] = ar.get(i).ApartmentSize;
                rowData[5] = ar.get(i).PriceInLacs;
                model.addRow(rowData);
            }

        } catch (SQLException ex) {
            System.out.println("-_-");
        }


    }//GEN-LAST:event_SearchButtonActionPerformed

    void AddRowToTable() {
        try {
            ConnectWithDatabase obj = new ConnectWithDatabase();
            obj.connectDB();

            Statement statement = obj.connection.createStatement();
            ResultSet resultset;
            //String budget = BudgetField.getText();
            //if(budget=="hello")

            resultset = statement.executeQuery("SELECT ApartmentNo, NoOfRooms, Bedroom, "
                    + "Washroom, ApartmentSize,PriceInLacs "
                    + "FROM Apartment "
                    + "WHERE Status='Vacant' OR Status='For Sale'");

            ArrayList<Apartment> ar = new ArrayList<Apartment>();
            Apartment x;
            //System.out.println(resultset.getString("ApartmentNo"));
            while (resultset.next()) {

                x = new Apartment(resultset.getString("ApartmentNo"), resultset.getInt("NoOfRooms"),
                        resultset.getInt("Bedroom"), resultset.getInt("Washroom"),
                        resultset.getDouble("ApartmentSize"), resultset.getDouble("PriceInLacs"));
                ar.add(x);
                //System.out.println(x.PriceInLacs);
            }
            int sz = ar.size();
            System.out.println(sz);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            Object rowData[] = new Object[6];
            for (int i = 0; i < sz; i++) {
                rowData[0] = ar.get(i).ApartmentNo;
                rowData[1] = ar.get(i).NoOfRooms;
                rowData[2] = ar.get(i).Bedroom;
                rowData[3] = ar.get(i).Washroom;
                rowData[4] = ar.get(i).ApartmentSize;
                rowData[5] = ar.get(i).PriceInLacs;
                model.addRow(rowData);
            }

        } catch (SQLException ex) {
            System.out.println("-_-");
        }

    }

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
            java.util.logging.Logger.getLogger(WantToBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WantToBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WantToBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WantToBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WantToBuy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField BudgetField;
    private javax.swing.JButton ContactButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
