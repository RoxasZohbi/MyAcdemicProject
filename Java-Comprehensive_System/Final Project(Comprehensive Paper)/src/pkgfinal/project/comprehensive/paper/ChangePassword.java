package pkgfinal.project.comprehensive.paper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ChangePassword extends javax.swing.JFrame {
    String naam;
    String nature;
    public ChangePassword() {
        initComponents();
    }
    
    public ChangePassword(String Name) {
        initComponents();
        naam=Name;
    }
    public ChangePassword(String Name, String x) {
        initComponents();
        naam=Name;
        nature=x;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        GoBack = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Cpass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Enrollment = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        passwordPre = new javax.swing.JLabel();
        FullNamePre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, -10, 100, 130);

        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/arrow.png"))); // NOI18N
        GoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackMouseClicked(evt);
            }
        });
        jPanel1.add(GoBack);
        GoBack.setBounds(5, 120, 50, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/logo3.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 0, 150, 120);

        jLabel4.setBackground(new java.awt.Color(45, 62, 80));
        jLabel4.setForeground(new java.awt.Color(45, 62, 80));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, -40, 480, 190);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SIGN UP FORM FOR FACULTY");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 120, 500, 40);

        jLabel7.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel7.setText("Confirm Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 340, 150, 24);

        Cpass.setBackground(new java.awt.Color(128, 125, 110));
        Cpass.setForeground(new java.awt.Color(255, 255, 0));
        Cpass.setOpaque(false);
        Cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpassActionPerformed(evt);
            }
        });
        jPanel1.add(Cpass);
        Cpass.setBounds(40, 370, 280, 20);

        jLabel9.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel9.setText("Enrollment");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 220, 90, 24);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/textfeild.png"))); // NOI18N
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 360, 300, 40);

        Enrollment.setBackground(new java.awt.Color(128, 125, 110));
        Enrollment.setForeground(new java.awt.Color(255, 255, 0));
        Enrollment.setOpaque(false);
        jPanel1.add(Enrollment);
        Enrollment.setBounds(40, 250, 280, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/textfeild.png"))); // NOI18N
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 240, 300, 40);

        jLabel11.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel11.setText("Password");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 280, 90, 24);

        Password.setBackground(new java.awt.Color(128, 125, 110));
        Password.setForeground(new java.awt.Color(255, 255, 0));
        Password.setOpaque(false);
        jPanel1.add(Password);
        Password.setBounds(40, 310, 280, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/textfeild.png"))); // NOI18N
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel12MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 300, 300, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, -10, 100, 130);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("CHANGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 410, 150, 40);
        jPanel1.add(passwordPre);
        passwordPre.setBounds(330, 360, 160, 40);
        jPanel1.add(FullNamePre);
        FullNamePre.setBounds(330, 240, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 820);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(500, 175, 500, 480);

        jLabel2.setForeground(new java.awt.Color(192, 192, 192));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/b2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1638, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMouseClicked
        if(naam.equals("Admin")){
        AdminFrame Dashboard=new AdminFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        Dashboard.setVisible(true);
        this.dispose();
        }
        else if(nature.equals("Teacher")){
        FacultyFrame Dashboard=new FacultyFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        Dashboard.setVisible(true);
        this.dispose();
        }
        else{
        StudentFrame Dashboard=new StudentFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        Dashboard.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_GoBackMouseClicked

    private void CpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpassActionPerformed

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved

    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved

    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseMoved

    }//GEN-LAST:event_jLabel12MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Confirm=Cpass.getText();
        //String pass
        if(nature.equals("Teacher")){
//            try {
//                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//                    Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
//                    //String s="UPDATE Faculty SET UserPassword='"+Data+"' WHERE FacultyId="+Id+";";
//                    Statement s1=c.createStatement();
//                    s1.executeUpdate(s);
//                    JOptionPane.showMessageDialog(null, "Sucessfully Update");
//                    
//                }
//                catch(Exception e)
//                {
//                    JOptionPane.showMessageDialog(null, e);
//                }
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        FullNamePre.setText("");
        //enrollmentPre.setText("");
        passwordPre.setText("");
    }//GEN-LAST:event_jLabel1MouseMoved

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cpass;
    private javax.swing.JTextField Enrollment;
    private javax.swing.JLabel FullNamePre;
    private javax.swing.JLabel GoBack;
    private javax.swing.JTextField Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordPre;
    // End of variables declaration//GEN-END:variables
}
