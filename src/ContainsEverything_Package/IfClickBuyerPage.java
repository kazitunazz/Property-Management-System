
package ContainsEverything_Package;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IfClickBuyerPage extends javax.swing.JFrame {
    
    public IfClickBuyerPage() {
        initComponents();
        ManageLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        WannaBuyButton = new javax.swing.JButton();
        WannaRentButton = new javax.swing.JButton();
        AdForSaleLabel = new javax.swing.JLabel();
        AdForRentLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        WannaBuyButton.setBackground(new java.awt.Color(0, 0, 0));
        WannaBuyButton.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        WannaBuyButton.setForeground(new java.awt.Color(255, 255, 255));
        WannaBuyButton.setText("Wanna Buy??");
        WannaBuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WannaBuyButtonActionPerformed(evt);
            }
        });

        WannaRentButton.setBackground(new java.awt.Color(0, 0, 0));
        WannaRentButton.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        WannaRentButton.setForeground(new java.awt.Color(255, 255, 255));
        WannaRentButton.setText("Wanna Rent??");
        WannaRentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WannaRentButtonActionPerformed(evt);
            }
        });

        AdForSaleLabel.setFont(new java.awt.Font("Tahoma", 3, 28)); // NOI18N
        AdForSaleLabel.setForeground(new java.awt.Color(255, 0, 0));

        AdForRentLabel.setFont(new java.awt.Font("Tahoma", 3, 28)); // NOI18N
        AdForRentLabel.setForeground(new java.awt.Color(255, 0, 0));

        BackButton.setBackground(new java.awt.Color(0, 0, 0));
        BackButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(WannaBuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(WannaRentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdForRentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(AdForSaleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(WannaBuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AdForSaleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(WannaRentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(AdForRentLabel)
                .addGap(31, 31, 31)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    
    void ManageLabels()
    {
        try {
            ConnectWithDatabase obj = new ConnectWithDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            int n = 0;
            ResultSet resultset = statement.executeQuery("SELECT COUNT(Status) AS 'For Sale' FROM Apartment WHERE Status='Vacant' OR Status='For Sale'");
            while(resultset.next()){
                n = resultset.getInt("For Sale");
            }
         
            AdForSaleLabel.setText(n+" Apartments are available for sale!! Hurry Up!");
            
            resultset = statement.executeQuery("SELECT COUNT(Status) AS 'To-Let' FROM Apartment WHERE Status='Vacant' OR Status='For Rent'");
            while(resultset.next()){
                n = resultset.getInt("To-Let");
            }
            
            AdForRentLabel.setText(n+" Apartments are available for rent!! Hurry!");
            
        } catch (SQLException ex) {
            System.out.println("!!!!!!!!!!!");
        }
    }
    
    private void WannaBuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WannaBuyButtonActionPerformed
        // TODO add your handling code here:
        WantToBuy x = new WantToBuy();
        this.setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_WannaBuyButtonActionPerformed

    private void WannaRentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WannaRentButtonActionPerformed
        // TODO add your handling code here:
        WantToRent x = new WantToRent();
        this.setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_WannaRentButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        HomePage x = new HomePage();
        this.setVisible(false);
        x.setVisible(true);

    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(IfClickBuyerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IfClickBuyerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IfClickBuyerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IfClickBuyerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IfClickBuyerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdForRentLabel;
    private javax.swing.JLabel AdForSaleLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton WannaBuyButton;
    private javax.swing.JButton WannaRentButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
