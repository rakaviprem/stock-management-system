import java.awt.Font;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class restock extends javax.swing.JFrame {
    public restock() {
        initComponents();
        JTableHeader Theader=jTable1.getTableHeader();
        //Theader.setForeground(Color.BLACK);
        Theader.setFont(new Font("Bodoni MT",Font.BOLD,16));
        ((DefaultTableCellRenderer)Theader.getDefaultRenderer())
                .setHorizontalAlignment(JLabel.CENTER);    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ProductIDField = new javax.swing.JTextField();
        QtyField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(218, 218, 249));
        jLabel4.setText("Enter Product ID : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));
        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(218, 218, 249));
        jLabel5.setText("Enter restock quantity : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        jLabel2.setText("UPDATE STOCK");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));
        ProductIDField.setToolTipText("Enter Product ID");
        ProductIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductIDFieldActionPerformed(evt);
            }        });
        getContentPane().add(ProductIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 190, 30));

        QtyField.setToolTipText("Enter amount to be added");
        QtyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyFieldActionPerformed(evt);
            }        });
        getContentPane().add(QtyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 190, 30));
        jButton3.setBackground(new java.awt.Color(218, 218, 249));
        jButton3.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(107, 107, 221));
        jButton3.setText("Update Stock");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 130, -1));
        jScrollPane1.setBackground(new java.awt.Color(190, 220, 220));
        jTable1.setBackground(new java.awt.Color(229, 223, 248));
        jTable1.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {            },
            new String [] {    "Product ID", "Product Name", "Price", "Quantity"       }        ));
        jScrollPane1.setViewportView(jTable1);
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, 240));
        jButton4.setBackground(new java.awt.Color(218, 218, 249));
        jButton4.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(107, 107, 221));
        jButton4.setText("Display Current Stock");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 200, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Purple Paradise.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void QtyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyFieldActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //add stock 
         Connection con = null;
        Statement st = null;
        try{
                Class.forName("java.sql.DriverManager");
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/SMS","root","sql@123");
                st = con.createStatement();
                String pid = ProductIDField.getText();
                String q = QtyField.getText();
                String sql = ("UPDATE inven SET Qty=Qty+'"+q+"'where PID='"+pid+"';");
                int n1 = st.executeUpdate(sql);
                        if (n1>0){    JOptionPane.showMessageDialog(null,"Updated Stock Successfully");          }
                con.close();
                        st.close();
        }         catch (Exception e){        }     
    }//GEN-LAST:event_jButton3ActionPerformed
    private void ProductIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductIDFieldActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            Connection con = null;
     Statement st = null;
        try{
                Class.forName("java.sql.DriverManager");
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/SMS","root","sql@123");
                st = con.createStatement();
                String pid = ProductIDField.getText();
                String q = QtyField.getText();
                String sql = "select * from inven where PID='"+pid+"';";
                  ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                String ProdID = String.valueOf(rs.getInt("PID"));
                String ProdName = rs.getString("PNAME");
                String Price = String.valueOf(rs.getFloat("Price"));
                String PQty = String.valueOf(rs.getInt("Qty"));   
                String tbData[]={ProdID,ProdName,Price,PQty};
                DefaultTableModel tb1Model = (DefaultTableModel)jTable1.getModel();
                tb1Model.addRow(tbData);     
              con.close();
                        st.close(); }       }       
        catch (Exception e){   }    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
                    break;                }            }
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
            }        });   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ProductIDField;
    public javax.swing.JTextField QtyField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
