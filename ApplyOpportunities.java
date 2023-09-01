/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.vms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indrajeet
 */
public class ApplyOpportunities extends javax.swing.JFrame {

    /**
     * Creates new form ApplyOpportunities
     */
    String vid="";
    public String aouserEmail="";
    public ApplyOpportunities() {
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

        experience = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        skills = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        registerbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contribution = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        experience.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        experience.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        getContentPane().add(experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, -1));

        skills.setColumns(20);
        skills.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        skills.setRows(5);
        jScrollPane3.setViewportView(skills);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 490, 140));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Skills:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Any Past Experience :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("How did you contribute there?");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        registerbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registerbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\login.png")); // NOI18N
        registerbtn.setText("APPLY");
        registerbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 600, 120, 30));

        contribution.setColumns(20);
        contribution.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contribution.setRows(5);
        jScrollPane1.setViewportView(contribution);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 590, 180));

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\mobile-interface-icons-2021-10-21-02-36-44-utc\\png\\48\\05 - Arrow Left.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\panel transparency new add diagnosis.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 710, 560));

        logoutbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\user-interface-2022-07-07-00-57-15-utc\\PNG\\24px\\exit.png")); // NOI18N
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, 50, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\indrajeet\\Documents\\NetBeansProjects\\VMS\\VMS ICON\\admin dahsboard.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        UserLogin l=new UserLogin();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ApplicationApply aa=new ApplicationApply();
        aa.setVisible(true);
        aa.aouserEmail=aouserEmail;
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtnActionPerformed
        // TODO add your handling code here:
        String mo=contribution.getText();
        String skill=skills.getText();
        String exp=experience.getSelectedItem().toString();
        String idtype="APPLIED";
        
        if(mo.isEmpty() || skill.isEmpty() || exp.isEmpty())
        JOptionPane.showMessageDialog(this, "All Fields are mandatory.", "Error", JOptionPane.ERROR_MESSAGE);
        try{
            Connection conn=DBConnection.connectDB();
            PreparedStatement st=(PreparedStatement)
            conn.prepareStatement("select name, roll, email from users where email=?");
            st.setString(1,aouserEmail);
            //            st.setString(1, usernameData);
            ResultSet rs=st.executeQuery();
            
            PreparedStatement st1=(PreparedStatement)
                conn.prepareStatement("select * from apply where email=? and vid =?  and (idtype='APPLIED' or idtype='ACCEPTED' or idtype='REJECTED')");
            st1.setString(1,aouserEmail);  
            st1.setString(2,vid);
            ResultSet rs1=st1.executeQuery();
            
            if(rs1.isBeforeFirst())
                JOptionPane.showMessageDialog(this, "You have already applied for it!!!", "Don't Spam Please!!", JOptionPane.ERROR_MESSAGE);
         
            else
                while(rs.next() && rs1.next()==false)
                {
                    String stName=rs.getString("name"), stEmail= rs.getString("email");
                    String stRoll=rs.getString("roll");
                    userApply(stName, stEmail, stRoll, mo, vid, skill, exp, idtype);

                }
            
        }
        catch(SQLException sqle)
        {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, sqle);
        }
        

    }//GEN-LAST:event_registerbtnActionPerformed

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
            java.util.logging.Logger.getLogger(ApplyOpportunities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplyOpportunities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplyOpportunities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplyOpportunities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplyOpportunities().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea contribution;
    private javax.swing.JComboBox<String> experience;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton registerbtn;
    private javax.swing.JTextArea skills;
    // End of variables declaration//GEN-END:variables

    private void userApply(String stName, String stEmail, String stRoll, String mo, String volid, String skill, String exp, String idtype) {
         
    Connection loginConn=DBConnection.connectDB();  
        if(loginConn!=null)
        {
            try{
                PreparedStatement st=(PreparedStatement)
                        loginConn.prepareStatement("insert into apply(name, roll, email, vid, skills, experience, contribute, idtype) values(?,?,?,?,?,?,?,?)");
                st.setString(1, stName);
                st.setString(2,stRoll);
                st.setString(3, stEmail);
                st.setString(4, volid);
                st.setString(5,skill);
                st.setString(6,exp);
                st.setString(7,mo);
                st.setString(8, idtype);
                int rs=st.executeUpdate();
                
                PreparedStatement st1=(PreparedStatement) 
                    loginConn.prepareStatement("update opportunities set studentsapplied=studentsapplied+1 where code=? ");
                st1.setString(1, volid);
                st1.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Applied Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                UserDashboard ud=new UserDashboard();
                ud.setVisible(true);
                ud.userEmail=aouserEmail;
            } 
            catch(SQLException se)
            {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, se);
                
            }
        }
        else
        {
            System.out.println("Database Not Available");
        }


//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}