
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a
 */import java.sql.*;
import java.util.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import javax.swing.*;
public class userview extends javax.swing.JFrame {

    /**
     * Creates new form userview
     */
     Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public String s1;
    public userview() {
        initComponents();
      con=javaConnection.ConnectDB();
    }
    public void fetch()
    {
        try{
            String sql;
            
       
        s1=jcombo.getSelectedItem().toString();
        if(s1=="Mobile")
        {
            sql="call uv()";
        }
        else if(s1=="DTH")
        {
            sql="call uv2()";
        }
        else
            sql="call uv3()";
            
       // sql="select * from mobile";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery(sql);
        jtable.setModel(DbUtils.resultSetToTableModel(rs));
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jcombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(760, 450));
        setMinimumSize(new java.awt.Dimension(760, 450));
        setPreferredSize(new java.awt.Dimension(760, 450));
        getContentPane().setLayout(null);

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtable.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(jtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 280, 760, 150);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Select transaction");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 110, 120, 30);

        jcombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile", "DTH", "Electricity" }));
        jcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboActionPerformed(evt);
            }
        });
        getContentPane().add(jcombo);
        jcombo.setBounds(300, 120, 100, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 170, 110, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Home");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(640, 10, 50, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Log Out");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(700, 10, 50, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\a\\Documents\\Image\\imgonline-com-ua-resize-I1uGnIb48j.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            
           fetch();
                        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Failed\nTry Again");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        home h=new home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        login log=new login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(userview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcombo;
    private javax.swing.JTable jtable;
    // End of variables declaration//GEN-END:variables
}
