/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
        bgroup.add(rb1);
        bgroup.add(rb2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroup = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        pass1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(654, 426));
        setMinimumSize(new java.awt.Dimension(654, 426));
        setPreferredSize(new java.awt.Dimension(654, 426));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 150, 80, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Mobile Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 240, 100, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Username");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 300, 70, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 330, 70, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 270, 70, 20);

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1);
        txt1.setBounds(330, 150, 110, 20);

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt2);
        txt2.setBounds(330, 240, 110, 20);
        getContentPane().add(txt3);
        txt3.setBounds(330, 270, 110, 20);

        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        getContentPane().add(txt4);
        txt4.setBounds(330, 300, 110, 20);
        getContentPane().add(pass1);
        pass1.setBounds(330, 330, 110, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 200, 70, 20);

        rb1.setText("Male");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rb1);
        rb1.setBounds(330, 180, 110, 20);

        rb2.setText("Female");
        getContentPane().add(rb2);
        rb2.setBounds(330, 210, 110, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Enter the below details to Register");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 10, 250, 40);

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 360, 80, 23);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(365, 360, 80, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Admin");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(580, 10, 60, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\a\\Documents\\Image\\ecommerce-2140603_960_720.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Connection con=null;
            con=javaConnection.ConnectDB();
            
            /*Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billpayment","root","root");
            System.out.println("Success");
            */
            Statement stmt=con.createStatement();
            
           
            String s1=txt1.getText();
            String s2=txt2.getText();
            String s3=txt3.getText();
            String s4=txt4.getText();
            String s5=pass1.getText();
            String s6="";
            if(rb1.isSelected())
            {
                s6="Male";
            }
            else
            {
                s6="Female";
            }
            String query="insert into register values('"+s1+"','"+s6+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
            stmt.execute(query);
            login obj=new login();
            obj.setVisible(true);
            this.dispose();
            //con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        adminlogin alog=new adminlogin();
        alog.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        login log=new login();
        log.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
}
