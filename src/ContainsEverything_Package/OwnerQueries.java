
package ContainsEverything_Package;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class OwnerQueries extends javax.swing.JFrame {

    public OwnerQueries() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ApartmentTenantViewButton = new javax.swing.JButton();
        ViewAllTenantOwner = new javax.swing.JButton();
        ViewBillButton = new javax.swing.JButton();
        ViewMyInfoButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        ApartmentTenantViewButton.setBackground(new java.awt.Color(0, 0, 0));
        ApartmentTenantViewButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ApartmentTenantViewButton.setForeground(new java.awt.Color(255, 255, 255));
        ApartmentTenantViewButton.setText("View My Tenant & Apartment Details");
        ApartmentTenantViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApartmentTenantViewButtonActionPerformed(evt);
            }
        });

        ViewAllTenantOwner.setBackground(new java.awt.Color(0, 0, 0));
        ViewAllTenantOwner.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ViewAllTenantOwner.setForeground(new java.awt.Color(255, 255, 255));
        ViewAllTenantOwner.setText("View All Dwellers & Owners");
        ViewAllTenantOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllTenantOwnerActionPerformed(evt);
            }
        });

        ViewBillButton.setBackground(new java.awt.Color(0, 0, 0));
        ViewBillButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ViewBillButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewBillButton.setText("View My Apartment's Bills' Status");
        ViewBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBillButtonActionPerformed(evt);
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

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.setActionCommand("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ViewAllTenantOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApartmentTenantViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addComponent(ViewBillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewMyInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(ApartmentTenantViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(ViewAllTenantOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(ViewBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ViewMyInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(42, 42, 42))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApartmentTenantViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApartmentTenantViewButtonActionPerformed
        ViewMyTenantApartmentDetails x = new ViewMyTenantApartmentDetails();
        this.setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_ApartmentTenantViewButtonActionPerformed

    private void ViewAllTenantOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllTenantOwnerActionPerformed
        ShowAllToOwner x = new ShowAllToOwner();
        this.setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_ViewAllTenantOwnerActionPerformed

    private void ViewBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBillButtonActionPerformed
        // TODO add your handling code here:
        ShowBillToOwner x =new ShowBillToOwner();
        this.setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_ViewBillButtonActionPerformed

    private void ViewMyInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMyInfoButtonActionPerformed
        // TODO add your handling code here:
        ViewMyInfoOwner x = new ViewMyInfoOwner();
        this.setVisible(false);
        x.setVisible(true);
    }//GEN-LAST:event_ViewMyInfoButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HomePage x = new HomePage();
        this.setVisible(false);
        x.setVisible(true);
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
            java.util.logging.Logger.getLogger(OwnerQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerQueries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerQueries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApartmentTenantViewButton;
    private javax.swing.JButton ViewAllTenantOwner;
    private javax.swing.JButton ViewBillButton;
    private javax.swing.JButton ViewMyInfoButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
