
package ContainsEverything_Package;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubmitButton = new javax.swing.JButton();
        UserIdLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserIdField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubmitButton.setBackground(new java.awt.Color(0, 0, 0));
        SubmitButton.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 200, 70));

        UserIdLabel.setBackground(new java.awt.Color(0, 0, 0));
        UserIdLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        UserIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserIdLabel.setText("User Id");
        jPanel1.add(UserIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 200, 70));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 293, 200, 70));

        UserIdField.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        UserIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIdFieldActionPerformed(evt);
            }
        });
        jPanel1.add(UserIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 300, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Log In!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 210, 40));
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 306, 300, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        try {
            // TODO add your handling code here:
            if(UserIdField.getText().equalsIgnoreCase("Authority"))
            {
                if(PasswordField.getText().equalsIgnoreCase("123456"))
                {
                    JOptionPane.showMessageDialog(this, "Hello Authority!\nLog In Successful!\n");
                    //go to Authority page
                    AuthorityMenu x = new AuthorityMenu();
                    this.setVisible(false);
                    x.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Wrong Password! Try Again\n");
                }
            }
            else{
            ConnectWithDatabase obj = new ConnectWithDatabase();
            obj.UserId = UserIdField.getText();
            String Password = PasswordField.getText();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT "+obj.UserType+"Password FROM "+obj.UserType+"Password WHERE UserId='"+obj.UserId+"'");
            
            while(resultset.next()){
                if(Password.equalsIgnoreCase(resultset.getString(obj.UserType+"Password")))
                {
                    JOptionPane.showMessageDialog(this, "Welcome!");
                    if(obj.UserType.equalsIgnoreCase("Dweller")){
                        DwellerQueries x = new DwellerQueries();
                        this.setVisible(false);
                        x.setVisible(true);
                    
                    }
                    else if(obj.UserType.equalsIgnoreCase("Owner")){
                        OwnerQueries x = new OwnerQueries();
                        this.setVisible(false);
                        x.setVisible(true);
                    
                    }
                    // go to page
                }
                else{
                    JOptionPane.showMessageDialog(this, "Wrong Password! Try Again!");
                }
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void UserIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIdFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField UserIdField;
    private javax.swing.JLabel UserIdLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
