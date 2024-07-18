import java.sql.*;
import javax.swing.*;
public class Emp_signup extends javax.swing.JFrame {

    public Emp_signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        UNameField = new javax.swing.JTextField();
        MobileField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Pass1 = new javax.swing.JPasswordField();
        Pass2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        EIDField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calm Darya.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(218, 218, 249));
        jLabel4.setText("Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(218, 218, 249));
        jLabel3.setText("Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(218, 218, 249));
        jLabel5.setText("Username :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(218, 218, 249));
        jLabel6.setText("Re-enter password :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(218, 218, 249));
        jLabel7.setText("Mobile No. :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        NameField.setToolTipText("Enter your name");
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 190, 30));

        UNameField.setToolTipText("Enter your username");
        UNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 190, 30));

        MobileField.setToolTipText("Enter your mobile no.");
        MobileField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileFieldActionPerformed(evt);
            }
        });
        getContentPane().add(MobileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 190, 30));

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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 120, -1));

        Pass1.setToolTipText("enter your password");
        getContentPane().add(Pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 190, 30));

        Pass2.setToolTipText("re-enter your new password");
        getContentPane().add(Pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 190, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sms reg1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(218, 218, 249));
        jLabel8.setText("Email ID :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        EmailField.setToolTipText("Enter your e-mail");
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 190, 30));

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(218, 218, 249));
        jLabel10.setText("Employee ID: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        EIDField.setToolTipText("Enter your employee ID");
        EIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIDFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 190, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calm Darya.png"))); // NOI18N
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
                String id= EIDField.getText();
                String sql = "insert into emp_data(Username,ENAME,EmailID,mobileNo,password,empid) values ('"+u+"','"+n+"','"+e+"','"+mob+"','"+p+"','"+id+"');";
                        int n1 = st.executeUpdate(sql);
                        if (n1>0){
                            System.out.print("Registered successfully");
                            JOptionPane.showMessageDialog(null,"Account created.You can now login");
                            Welcome w1 = new Welcome();
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

    private void EIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EIDFieldActionPerformed

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
    public javax.swing.JTextField EIDField;
    public javax.swing.JTextField EmailField;
    public javax.swing.JTextField MobileField;
    public javax.swing.JTextField NameField;
    public javax.swing.JPasswordField Pass1;
    public javax.swing.JPasswordField Pass2;
    public javax.swing.JTextField UNameField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
