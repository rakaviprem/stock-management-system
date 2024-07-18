import java.sql.*;
import javax.swing.*;
public class signup extends javax.swing.JFrame {

    public signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        UNameField = new javax.swing.JTextField();
        MobileField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Pass1 = new javax.swing.JPasswordField();
        Pass2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(218, 218, 249));
        jLabel4.setText("Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(218, 218, 249));
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(218, 218, 249));
        jLabel5.setText("Username :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(218, 218, 249));
        jLabel6.setText("Re-enter password :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel10.setText("Enter Customer Details");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 350, -1));

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(218, 218, 249));
        jLabel7.setText("Mobile No. :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        NameField.setToolTipText("enter your name");
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 190, 30));

        UNameField.setToolTipText("enter your username");
        UNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 190, 30));

        MobileField.setToolTipText("enter your e-mail");
        MobileField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileFieldActionPerformed(evt);
            }
        });
        getContentPane().add(MobileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 190, 30));

        jButton3.setBackground(new java.awt.Color(218, 218, 249));
        jButton3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(107, 107, 221));
        jButton3.setText("SUBMIT");
        jButton3.setToolTipText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 120, -1));

        Pass1.setToolTipText("enter your password");
        getContentPane().add(Pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 190, 30));

        Pass2.setToolTipText("re-enter your new password");
        getContentPane().add(Pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 190, 30));

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(218, 218, 249));
        jLabel8.setText("Email ID :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        EmailField.setToolTipText("enter your e-mail");
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cust_data.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Grapefruit Sunset.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UNameFieldActionPerformed

    private void MobileFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

     Connection con = null;
     Statement st = null;
        try{
                Class.forName("java.sql.DriverManager");
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/SMS","root","sql@123");
                st = con.createStatement();
                String n = NameField.getText();
                String u = UNameField.getText();
                String e = EmailField.getText();
                String mob = MobileField.getText();
                String p = Pass1.getText();
                String sql = "insert into cust_data(Username,CNAME,EmailID,mobileNo,password) values ('"+u+"','"+n+"','"+e+"','"+mob+"','"+p+"');";
                        int n1 = st.executeUpdate(sql);
                        if (n1>0){
                            JOptionPane.showMessageDialog(null,"Record added successfully");
                            mainmenu w1 = new mainmenu();
                         w1.setVisible(true);
                         this.setVisible(false);
                        }
                        else{
                            System.out.print("error"); }
                        con.close();
                        st.close();
                }
                
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: back button
        mainmenu h2 = new mainmenu();
        h2.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField EmailField;
    public javax.swing.JTextField MobileField;
    public javax.swing.JTextField NameField;
    public javax.swing.JPasswordField Pass1;
    public javax.swing.JPasswordField Pass2;
    public javax.swing.JTextField UNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
