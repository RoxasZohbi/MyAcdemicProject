package pkgfinal.project.comprehensive.paper;

import java.awt.Color;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import sun.net.www.content.image.png;


public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        //Username.disable();
        //Password.disable();
        //button.disable();
        LoginPanel.setLocation(650,250);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UserLane = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PassLane = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LoginPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoginPanel.setForeground(new java.awt.Color(255, 255, 255));
        LoginPanel.setAlignmentX(1.0F);
        LoginPanel.setLayout(null);

        Username.setText("Username");
        Username.setBorder(null);
        Username.setOpaque(false);
        Username.setSelectionColor(new java.awt.Color(255, 255, 255));
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });
        Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameMouseClicked(evt);
            }
        });
        LoginPanel.add(Username);
        Username.setBounds(90, 170, 260, 30);

        button.setBackground(new java.awt.Color(106, 109, 102));
        button.setForeground(new java.awt.Color(255, 255, 51));
        button.setText("Log In");
        button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 153), new java.awt.Color(45, 62, 80), new java.awt.Color(45, 62, 80), new java.awt.Color(255, 255, 102)));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        LoginPanel.add(button);
        button.setBounds(280, 320, 98, 33);

        Password.setText("Password");
        Password.setBorder(null);
        Password.setOpaque(false);
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        LoginPanel.add(Password);
        Password.setBounds(90, 250, 260, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/logo3.png"))); // NOI18N
        LoginPanel.add(jLabel3);
        jLabel3.setBounds(120, 0, 150, 120);

        jLabel4.setBackground(new java.awt.Color(45, 62, 80));
        jLabel4.setForeground(new java.awt.Color(45, 62, 80));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        LoginPanel.add(jLabel4);
        jLabel4.setBounds(0, -30, 510, 180);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/user-128.png"))); // NOI18N
        LoginPanel.add(jLabel8);
        jLabel8.setBounds(70, 170, 30, 30);
        LoginPanel.add(UserLane);
        UserLane.setBounds(60, 170, 290, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Security-Password-2-icon.png"))); // NOI18N
        LoginPanel.add(jLabel5);
        jLabel5.setBounds(70, 240, 30, 50);
        LoginPanel.add(PassLane);
        PassLane.setBounds(60, 250, 290, 30);

        jLabel6.setText("Forget Your Password?");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        LoginPanel.add(jLabel6);
        jLabel6.setBounds(240, 280, 150, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        LoginPanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 420);

        getContentPane().add(LoginPanel);
        LoginPanel.setBounds(560, 190, 400, 420);

        jLabel2.setForeground(new java.awt.Color(192, 192, 192));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/b2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1638, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String username=Username.getText();
        
        
        String pass=String.valueOf(Password.getText());
        if(username.equals("Admin") && pass.equals("Admin123")){
            AdminFrame Dashboard=new AdminFrame("Admin");
            Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH); 
            Dashboard.setVisible(true);
            this.dispose();
        }
        String[] arr = username.split("-"); 
        int code=Integer.parseInt(arr[1]);
        if(arr[0].equals("t") || arr[0].equals("T")){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                    String s="select * from Faculty where FacultyId="+code+"and Userpassword='"+pass+"'";
                    Statement s1=c.createStatement();
                    ResultSet rs=s1.executeQuery(s);
                    if(rs.next()){
                        s="select FacultyName from faculty where FacultyId="+code+";";
                        s1=c.createStatement();
                        rs=s1.executeQuery(s);
                        if(rs.next()){
                            String name = rs.getString("FacultyName");
                            FacultyFrame Dashboard=new FacultyFrame(name);
                            Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH); 
                            Dashboard.setVisible(true);
                            this.dispose();
                        }
                    }
                }
                catch(Exception e)
                {
                     JOptionPane.showMessageDialog(null, e);
                }
        }
        else if(arr[0].equals("s") || arr[0].equals("S")){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                    String s="select * from Student where StudentId="+code+"and UserPassword='"+pass+"'";
                    Statement s1=c.createStatement();
                    ResultSet rs=s1.executeQuery(s);
                    if(rs.next()){
                        s="select StudentName from Student where StudentId="+code+";";
                        s1=c.createStatement();
                        rs=s1.executeQuery(s);
                        if(rs.next()){
                            String name=rs.getString("StudentName");
                            StudentFrame Dashboard=new StudentFrame(name);
                            Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH); 
                            Dashboard.setVisible(true);
                            this.dispose();
                        }
                    }
                }
                catch(Exception e)
                {
                     JOptionPane.showMessageDialog(null, e);
                }
        }
        else{JOptionPane.showMessageDialog(null, "Fail login");}
        
        
    }//GEN-LAST:event_buttonActionPerformed

    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseClicked
        Username.enable();
        button.enable();
        if(Username.getText().equals("Username")){
        Username.setText("");
        Username.setForeground(Color.white);
        }
        Border border = BorderFactory.createLineBorder(Color.yellow,1);
        UserLane.setBorder(border);

    }//GEN-LAST:event_UsernameMouseClicked

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        Password.enable();
        button.enable();
        if(Password.getText().equals("Password")){
        Password.setText("");
        Password.setForeground(Color.white);
        }
        Border border1 = BorderFactory.createLineBorder(Color.yellow,1);
        PassLane.setBorder(border1);
    }//GEN-LAST:event_PasswordMouseClicked

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        if(Username.getText().equals("")){
        Username.setText("Username");
        Username.setForeground(Color.yellow);
        }
        UserLane.setBorder(null);
    }//GEN-LAST:event_UsernameFocusLost

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
    if(Password.getText().equals("")){
        Password.setText("Password");
        Password.setForeground(Color.yellow);
        }
        Border border1 = BorderFactory.createLineBorder(Color.yellow,1);
        PassLane.setBorder(null);
    
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel PassLane;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel UserLane;
    private javax.swing.JTextField Username;
    private javax.swing.JButton button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
