/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemabookingsystemnea;

/**
 *
 * @author OB200404
 */
public class logInScreen extends javax.swing.JFrame {

    /**
     * Creates new form logInScreen
     */
    public logInScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailAddressLabel = new javax.swing.JLabel();
        emailAddressTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        signInLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        signInButton = new javax.swing.JButton();
        backgroundPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(200, 10, 10));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        emailAddressLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        emailAddressLabel.setText("Email Address");
        getContentPane().add(emailAddressLabel);
        emailAddressLabel.setBounds(49, 133, 159, 30);

        emailAddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddressTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailAddressTextField);
        emailAddressTextField.setBounds(49, 174, 423, 32);

        passwordLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        passwordLabel.setText("Password");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(49, 224, 104, 34);

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordTextField);
        passwordTextField.setBounds(49, 269, 423, 32);

        signInLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        signInLabel.setText("Sign in");
        getContentPane().add(signInLabel);
        signInLabel.setBounds(237, 47, 80, 34);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton);
        exitButton.setBounds(531, 15, 51, 23);

        signInButton.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        signInButton.setText("Sign in");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signInButton);
        signInButton.setBounds(189, 502, 200, 50);

        backgroundPanel.setBackground(new java.awt.Color(59, 221, 197));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(backgroundPanel);
        backgroundPanel.setBounds(0, -6, 600, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailAddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAddressTextFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        String emailAddress = emailAddressTextField.getText();
        String password = emailAddressTextField.getText();
    }//GEN-LAST:event_signInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(logInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logInScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logInScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JTextField emailAddressTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton signInButton;
    private javax.swing.JLabel signInLabel;
    // End of variables declaration//GEN-END:variables
}
