/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vms;

import javax.swing.JOptionPane;

/**
 *
 * @author indrajeet
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jButton1 = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        registerbtn = new javax.swing.JButton();
        loginbtn1 = new javax.swing.JButton();
        adminbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\Close.png")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 40, 40));

        loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\agenda.png")); // NOI18N
        loginbtn.setText("OPPORTUNITIES");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 230, 46));

        registerbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registerbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\login-rounded-right.png")); // NOI18N
        registerbtn.setText("REGISTER");
        registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 182, 45));

        loginbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginbtn1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\enter-2.png")); // NOI18N
        loginbtn1.setText("LOGIN");
        loginbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 182, 46));

        adminbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\user-menu-male.png")); // NOI18N
        adminbtn.setText("ADMIN");
        adminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtnActionPerformed(evt);
            }
        });
        getContentPane().add(adminbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 182, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\homescreen.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtnActionPerformed
        // TODO add your handling code here:
        AdminLogin adminlogin=new AdminLogin();
        adminlogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_adminbtnActionPerformed

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtnActionPerformed
        // TODO add your handling code here:
        UserSignup reg =new UserSignup();
        reg.setVisible(true);
        dispose();
    }//GEN-LAST:event_registerbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close the application?","Select", JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
        
        Opportunities op=new Opportunities();
        op.setVisible(true);
        dispose();
    }//GEN-LAST:event_loginbtnActionPerformed

    private void loginbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtn1ActionPerformed
        // TODO add your handling code here:
        UserLogin login=new UserLogin();
        login.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_loginbtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JButton loginbtn1;
    private javax.swing.JButton registerbtn;
    // End of variables declaration//GEN-END:variables
}