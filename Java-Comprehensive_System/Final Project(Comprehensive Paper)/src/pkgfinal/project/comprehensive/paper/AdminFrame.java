package pkgfinal.project.comprehensive.paper;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class AdminFrame extends javax.swing.JFrame {
    String naam;
    public AdminFrame() {
        initComponents();
    }
    public AdminFrame(String Name) {
        
        initComponents();
        naam=Name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CreateF = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UpdateF = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SearchF = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SearchF1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ChangePassword = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1638, 900));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/logo3.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 0, 150, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(390, -10, 100, 130);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/logout.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20);
        jLabel20.setBounds(370, 120, 104, 40);

        jLabel4.setBackground(new java.awt.Color(45, 62, 80));
        jLabel4.setForeground(new java.awt.Color(45, 62, 80));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, -50, 480, 210);

        CreateF.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CreateFMouseMoved(evt);
            }
        });
        CreateF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CreateFFocusGained(evt);
            }
        });
        CreateF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateFMouseClicked(evt);
            }
        });
        jPanel1.add(CreateF);
        CreateF.setBounds(30, 170, 190, 170);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Admin");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(85, 120, 60, 24);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Create Faculty.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 190, 125, 125);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Create Faculty Account");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 310, 190, 30);

        UpdateF.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UpdateFMouseMoved(evt);
            }
        });
        UpdateF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateFMouseClicked(evt);
            }
        });
        jPanel1.add(UpdateF);
        UpdateF.setBounds(270, 170, 200, 170);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/update faculty.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 190, 125, 125);

        jLabel10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Update Faculty Account ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 310, 200, 30);

        SearchF.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SearchFMouseMoved(evt);
            }
        });
        SearchF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchFMouseClicked(evt);
            }
        });
        jPanel1.add(SearchF);
        SearchF.setBounds(30, 340, 190, 170);

        jLabel12.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Search Faculty Data");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 480, 190, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/search teacher.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 360, 125, 125);

        SearchF1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SearchF1MouseMoved(evt);
            }
        });
        SearchF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchF1MouseClicked(evt);
            }
        });
        jPanel1.add(SearchF1);
        SearchF1.setBounds(270, 340, 190, 170);

        jLabel14.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Search Student Data");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(270, 480, 190, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/search Student.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(300, 360, 125, 125);

        ChangePassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ChangePasswordMouseMoved(evt);
            }
        });
        ChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePasswordMouseClicked(evt);
            }
        });
        jPanel1.add(ChangePassword);
        ChangePassword.setBounds(150, 540, 190, 170);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/change.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15);
        jLabel15.setBounds(180, 560, 125, 125);

        jLabel16.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Change Your Password");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(150, 680, 190, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(0, -10, 100, 130);

        jLabel18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel18MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, 120, 490, 610);

        jLabel19.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel19.setText("Welcome");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(10, 120, 80, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 810);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(575, 50, 490, 730);

        jLabel2.setForeground(new java.awt.Color(192, 192, 192));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/b2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateFMouseClicked
        Color color=new Color(128,125,110);
        Border border1 = BorderFactory.createLineBorder(color,2);
        CreateF.setBorder(border1);
        FacultySignUp Dashboard=new FacultySignUp(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH); 
        Dashboard.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_CreateFMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void UpdateFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateFMouseClicked
        Color color=new Color(128,125,110);
        Border border1 = BorderFactory.createLineBorder(color,2);
        //FacultyUpdate.setBorder(border1);
        FacultyUpdate Dashboard=new FacultyUpdate(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH); 
        Dashboard.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_UpdateFMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void SearchFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFMouseClicked
        FacultySearch Dashboard=new FacultySearch(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH); 
        Dashboard.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_SearchFMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void SearchF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchF1MouseClicked
        StudentSearch Dashboard=new StudentSearch(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH); 
        Dashboard.setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null, "if is not working ");
    }//GEN-LAST:event_SearchF1MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void ChangePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordMouseClicked
       ChangePassword Dashboard=new ChangePassword(naam);
       Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH); 
       Dashboard.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_ChangePasswordMouseClicked

    private void CreateFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CreateFFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CreateFFocusGained

    private void CreateFMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateFMouseMoved
        // TODO add your handling code here:
        Border border1 = BorderFactory.createLineBorder(Color.yellow,2);
        CreateF.setBorder(border1);
        UpdateF.setBorder(null);
        SearchF.setBorder(null);
        SearchF1.setBorder(null);
        ChangePassword.setBorder(null);
        
    }//GEN-LAST:event_CreateFMouseMoved

    private void UpdateFMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateFMouseMoved
        Border border1 = BorderFactory.createLineBorder(Color.yellow,2);
        UpdateF.setBorder(border1);
        CreateF.setBorder(null);
        SearchF.setBorder(null);
        SearchF1.setBorder(null);
        ChangePassword.setBorder(null);    }//GEN-LAST:event_UpdateFMouseMoved

    private void SearchFMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFMouseMoved
        Border border1 = BorderFactory.createLineBorder(Color.yellow,2);
        SearchF.setBorder(border1);
        CreateF.setBorder(null);
        UpdateF.setBorder(null);
        SearchF1.setBorder(null);
        ChangePassword.setBorder(null);
    }//GEN-LAST:event_SearchFMouseMoved

    private void SearchF1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchF1MouseMoved
        Border border1 = BorderFactory.createLineBorder(Color.yellow,2);
        SearchF1.setBorder(border1);
        CreateF.setBorder(null);
        SearchF.setBorder(null);
        UpdateF.setBorder(null);
        ChangePassword.setBorder(null);
    }//GEN-LAST:event_SearchF1MouseMoved

    private void ChangePasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordMouseMoved

        Border border1 = BorderFactory.createLineBorder(Color.yellow,2);
        ChangePassword.setBorder(border1);
        CreateF.setBorder(null);
        SearchF.setBorder(null);
        SearchF1.setBorder(null);
        UpdateF.setBorder(null);
    }//GEN-LAST:event_ChangePasswordMouseMoved

    private void jLabel18MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseMoved
        //Border border1 = BorderFactory.createLineBorder(Color.yellow,2);
        ChangePassword.setBorder(null);
        CreateF.setBorder(null);
        SearchF.setBorder(null);
        SearchF1.setBorder(null);
        UpdateF.setBorder(null);
    }//GEN-LAST:event_jLabel18MouseMoved

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Login Dashboard=new Login();
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH); 
        Dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

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
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChangePassword;
    private javax.swing.JLabel CreateF;
    private javax.swing.JLabel SearchF;
    private javax.swing.JLabel SearchF1;
    private javax.swing.JLabel UpdateF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
