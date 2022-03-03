
package ContainsEverything_Package;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
        ManageLabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BuyerButton = new javax.swing.JButton();
        OwnerButton = new javax.swing.JButton();
        DwellerButton = new javax.swing.JButton();
        AuthorityButton = new javax.swing.JButton();
        AdLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        BuyerButton.setBackground(new java.awt.Color(255, 255, 255));
        BuyerButton.setFont(new java.awt.Font("Tahoma", 3, 32)); // NOI18N
        BuyerButton.setText("Buyer");
        BuyerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerButtonActionPerformed(evt);
            }
        });

        OwnerButton.setBackground(new java.awt.Color(255, 255, 255));
        OwnerButton.setFont(new java.awt.Font("Tahoma", 3, 32)); // NOI18N
        OwnerButton.setText("Owner");
        OwnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnerButtonActionPerformed(evt);
            }
        });

        DwellerButton.setBackground(new java.awt.Color(255, 255, 255));
        DwellerButton.setFont(new java.awt.Font("Tahoma", 3, 32)); // NOI18N
        DwellerButton.setText("Dweller");
        DwellerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DwellerButtonActionPerformed(evt);
            }
        });

        AuthorityButton.setBackground(new java.awt.Color(255, 255, 255));
        AuthorityButton.setFont(new java.awt.Font("Tahoma", 3, 32)); // NOI18N
        AuthorityButton.setText("Authority");
        AuthorityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorityButtonActionPerformed(evt);
            }
        });

        AdLabel.setFont(new java.awt.Font("Tahoma", 3, 25)); // NOI18N
        AdLabel.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Property Management");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BuyerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OwnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DwellerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AuthorityButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(AdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BuyerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(AdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(OwnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(DwellerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(AuthorityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

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

    
    void ManageLabel()
    {
        try {
            ConnectWithDatabase obj = new ConnectWithDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            int n = 0;
            ResultSet resultset = statement.executeQuery("SELECT COUNT(Status) AS 'For Sale' FROM Apartment WHERE Status='Vacant' OR Status='For Sale' OR Status='For Rent'");
            while(resultset.next()){
                n = resultset.getInt("For Sale");
            }
         
            AdLabel.setText(n+" Apartments are available for sale/rent!! Hurry Up!");
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    private void OwnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwnerButtonActionPerformed
        // TODO add your handling code here:
        LoginPage x = new LoginPage();
        this.setVisible(false);
        x.setVisible(true);
        ConnectWithDatabase obj = new ConnectWithDatabase();
        obj.UserType="Owner";
        
    }//GEN-LAST:event_OwnerButtonActionPerformed

    private void DwellerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DwellerButtonActionPerformed
        // TODO add your handling code here:
        LoginPage x = new LoginPage();
        this.setVisible(false);
        x.setVisible(true);
        ConnectWithDatabase obj = new ConnectWithDatabase();
        obj.UserType="Dweller";
        
    }//GEN-LAST:event_DwellerButtonActionPerformed

    private void BuyerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerButtonActionPerformed
        // TODO add your handling code here:
        ConnectWithDatabase obj = new ConnectWithDatabase();
        obj.connectDB();
        IfClickBuyerPage x = new IfClickBuyerPage();
        this.setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_BuyerButtonActionPerformed

    private void AuthorityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorityButtonActionPerformed
        // TODO add your handling code here:
        LoginPage x = new LoginPage();
        this.setVisible(false);
        x.setVisible(true);
        ConnectWithDatabase obj = new ConnectWithDatabase();
        obj.UserType="Authority";
        
    }//GEN-LAST:event_AuthorityButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdLabel;
    private javax.swing.JButton AuthorityButton;
    private javax.swing.JButton BuyerButton;
    private javax.swing.JButton DwellerButton;
    private javax.swing.JButton OwnerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
