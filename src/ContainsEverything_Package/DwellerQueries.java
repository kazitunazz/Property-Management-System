
package ContainsEverything_Package;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DwellerQueries extends javax.swing.JFrame {

    public DwellerQueries() {
        initComponents();
        //ConnectWithDatabase obj = new ConnectWithDatabase();
        //obj.UserId="1B";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ShowAllTenantOwnerButton = new javax.swing.JButton();
        ShowMyOwnerButton = new javax.swing.JButton();
        ViewMyInfoButton = new javax.swing.JButton();
        BillQueriesButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        ShowAllTenantOwnerButton.setBackground(new java.awt.Color(0, 0, 0));
        ShowAllTenantOwnerButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ShowAllTenantOwnerButton.setForeground(new java.awt.Color(255, 255, 255));
        ShowAllTenantOwnerButton.setText("Show All Dwellers & Owners");
        ShowAllTenantOwnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAllTenantOwnerButtonActionPerformed(evt);
            }
        });

        ShowMyOwnerButton.setBackground(new java.awt.Color(0, 0, 0));
        ShowMyOwnerButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ShowMyOwnerButton.setForeground(new java.awt.Color(255, 255, 255));
        ShowMyOwnerButton.setText("View My Apartment's Owner");
        ShowMyOwnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMyOwnerButtonActionPerformed(evt);
            }
        });

        ViewMyInfoButton.setBackground(new java.awt.Color(0, 0, 0));
        ViewMyInfoButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ViewMyInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewMyInfoButton.setText("View My Info");
        ViewMyInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMyInfoButtonActionPerformed(evt);
            }
        });

        BillQueriesButton.setBackground(new java.awt.Color(0, 0, 0));
        BillQueriesButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        BillQueriesButton.setForeground(new java.awt.Color(255, 255, 255));
        BillQueriesButton.setText("Bill Queries");
        BillQueriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillQueriesButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Insert Payment Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ShowMyOwnerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BillQueriesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShowAllTenantOwnerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewMyInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(391, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShowMyOwnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BillQueriesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShowAllTenantOwnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewMyInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowAllTenantOwnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAllTenantOwnerButtonActionPerformed
        try {
            // TODO add your handling code here:
            ConnectWithDatabase obj = new ConnectWithDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT Owner.OwnerId, Owner.Name AS 'Owner Name', Dweller.Name AS 'Dweller Name', Dweller.ContactNo, Dweller.DwellerType " +
                "FROM Owner LEFT JOIN Dweller " +
                "ON Owner.OwnerId = Dweller.DwellerId");
            ArrayList<Owner>ar1 = new ArrayList<Owner>();
            ArrayList<Dweller>ar2 = new ArrayList<Dweller>();
            Owner x;
            Dweller y;
            while(resultset.next())
            {
                x= new Owner(resultset.getString("OwnerId"), resultset.getString("Owner Name"));
                y= new Dweller(resultset.getString("Dweller Name"), resultset.getString("ContactNo"), resultset.getString("DwellerType"));
                ar1.add(x);
                ar2.add(y);
            }
            int sz= ar1.size();
            for(int i=0;i<sz;i++)
            {
                System.out.println(ar1.get(i).OwnerId);
                System.out.println(ar1.get(i).Name);
                System.out.println(ar2.get(i).Name);
                System.out.println(ar2.get(i).ContactNo);
                System.out.println(ar2.get(i).DwellerType);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DwellerQueries.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ShowAllTenantOwnerButtonActionPerformed

    private void ShowMyOwnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowMyOwnerButtonActionPerformed
        // TODO add your handling code here:
        ViewMyInfoOwner x = new ViewMyInfoOwner();
        this.setVisible(false);
        x.setVisible(true);
        /*try {
            // TODO add your handling code here:
            ConnectWithDatabase obj = new ConnectWithDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM Owner WHERE OwnerId='"+obj.UserId+"'");
            while(resultset.next())
            {
                System.out.println(resultset.getString("Name"));
                System.out.println(resultset.getString("Address"));
                System.out.println(resultset.getString("ContactNo"));
                System.out.println(resultset.getString("emailId"));
                
            }
        } catch (SQLException ex) {
            
        }
        */
    }//GEN-LAST:event_ShowMyOwnerButtonActionPerformed

    private void ViewMyInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMyInfoButtonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ConnectWithDatabase obj = new ConnectWithDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM Dweller WHERE DwellerId='"+obj.UserId+"'");
            while(resultset.next())
            {
                System.out.println(resultset.getString("Name"));
                System.out.println(resultset.getString("NoOfPeopleLiving"));
                System.out.println(resultset.getString("BackUpAddress"));
                System.out.println(resultset.getString("NoOfPeopleLiving"));
                System.out.println(resultset.getString("ContactNo"));
                
                System.out.println(resultset.getString("emailId"));
                System.out.println(resultset.getString("RentingDate"));
                System.out.println(resultset.getString("DwellerType"));
                
            }
        } catch (SQLException ex) {
            System.out.print("EWWWW");
        }
    }//GEN-LAST:event_ViewMyInfoButtonActionPerformed

    private void BillQueriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillQueriesButtonActionPerformed
        // TODO add your handling code here:
        DwellerBillQueries x = new DwellerBillQueries();
        this.setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_BillQueriesButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DwellerInsertPaymentDetails x = new DwellerInsertPaymentDetails();
        this.setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        HomePage x = new HomePage();
        this.setVisible(false);
        x.setVisible(false);
        
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
            java.util.logging.Logger.getLogger(DwellerQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DwellerQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DwellerQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DwellerQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DwellerQueries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BillQueriesButton;
    private javax.swing.JButton ShowAllTenantOwnerButton;
    private javax.swing.JButton ShowMyOwnerButton;
    private javax.swing.JButton ViewMyInfoButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
