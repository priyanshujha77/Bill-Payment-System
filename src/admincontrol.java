/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a
 */
import java.sql.*;
import java.util.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableColumnModel;
public class admincontrol extends javax.swing.JFrame {

    /**
     * Creates new form admincontrol
     */
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public admincontrol() {
        initComponents();
        con=javaConnection.ConnectDB();
        update();
    }
     
    private void update()
    {
        try{
        String sql="select * from mobile";
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

        table1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 450));
        setMinimumSize(new java.awt.Dimension(750, 450));
        setPreferredSize(new java.awt.Dimension(750, 450));
        getContentPane().setLayout(null);

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMouseClicked(evt);
            }
        });
        table1.setViewportView(jtable);

        getContentPane().add(table1);
        table1.setBounds(270, 0, 452, 240);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Mobile Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 50, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Operator");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 90, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Recharge Type");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 170, 90, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Amount");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 130, 60, 20);
        getContentPane().add(txt1);
        txt1.setBounds(150, 50, 80, 20);
        getContentPane().add(txt2);
        txt2.setBounds(150, 90, 80, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 220, 80, 23);
        getContentPane().add(txt3);
        txt3.setBounds(150, 130, 80, 20);
        getContentPane().add(txt4);
        txt4.setBounds(150, 170, 80, 20);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 220, 73, 23);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(180, 220, 80, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Home");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 340, 50, 20);

        jlabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\a\\Documents\\Image\\890250_windows-caution-wallpaper-cautionwindows_1920x1200_h.jpg")); // NOI18N
        jlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelMouseClicked(evt);
            }
        });
        getContentPane().add(jlabel);
        jlabel.setBounds(0, 0, 720, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jlabelMouseClicked

    private void jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableMouseClicked
        // TODO add your handling code here:
        try{
        int row=jtable.getSelectedRow();
        String tc=(jtable.getModel().getValueAt(row,0).toString());
        String sql="select * from mobile where mobile='"+tc+"'";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        if(rs.next()){
            String mobile=rs.getString("mobile");
            txt1.setText(mobile);
            String operator=rs.getString("operator");
            txt2.setText(operator);
            String amount=rs.getString("amount");
            txt3.setText(amount);
            String recharge=rs.getString("recharge");
            txt4.setText(recharge);
            
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jtableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String query="update mobile set operator=?,amount=?,recharge=? where mobile="+txt1.getText()+"";
            pst=con.prepareStatement(query);
            pst.setString(1,txt2.getText());
             pst.setString(2,txt3.getText());
              pst.setString(3,txt4.getText());
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null,"Successfully Updated");
              update();
              txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            String query="insert into mobile values(?,?,?,?)";
            pst=con.prepareStatement(query);
             pst=con.prepareStatement(query);
            pst.setString(1,txt1.getText());
             pst.setString(2,txt2.getText());
              pst.setString(3,txt3.getText());
              pst.setString(4,txt4.getText());
              pst.execute();
              JOptionPane.showMessageDialog(null,"Successfully Inserted");
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        update();
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
            String query="delete from mobile where mobile="+txt1.getText()+"";
            pst=con.prepareStatement(query);
             pst.execute();
             JOptionPane.showMessageDialog(null,"Successfully Deleted");
           update();
              txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        adminhome h=new adminhome();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(admincontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admincontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admincontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admincontrol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admincontrol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTable jtable;
    private javax.swing.JScrollPane table1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
}
