package pkgfinal.project.comprehensive.paper;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class FacultySignUp extends javax.swing.JFrame {
    String naam;
    public FacultySignUp() {
        initComponents();
        
    }
    
    public FacultySignUp(String Name) {
        initComponents();
        naam=Name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignupPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        GoBack = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Enrollment = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        enrollmentPre = new javax.swing.JLabel();
        passwordPre = new javax.swing.JLabel();
        FullNamePre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1638, 900));
        getContentPane().setLayout(null);

        SignupPanel.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        SignupPanel.add(jLabel5);
        jLabel5.setBounds(420, -10, 100, 130);

        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/arrow.png"))); // NOI18N
        GoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackMouseClicked(evt);
            }
        });
        SignupPanel.add(GoBack);
        GoBack.setBounds(5, 120, 50, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/logo3.png"))); // NOI18N
        SignupPanel.add(jLabel3);
        jLabel3.setBounds(170, 0, 150, 120);

        jLabel4.setBackground(new java.awt.Color(45, 62, 80));
        jLabel4.setForeground(new java.awt.Color(45, 62, 80));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        SignupPanel.add(jLabel4);
        jLabel4.setBounds(50, -40, 480, 190);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SIGN UP FORM FOR FACULTY");
        SignupPanel.add(jLabel6);
        jLabel6.setBounds(0, 120, 500, 40);

        jLabel7.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel7.setText("Full Name");
        SignupPanel.add(jLabel7);
        jLabel7.setBounds(40, 210, 90, 24);

        FullName.setBackground(new java.awt.Color(128, 125, 110));
        FullName.setForeground(new java.awt.Color(255, 255, 0));
        FullName.setOpaque(false);
        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });
        SignupPanel.add(FullName);
        FullName.setBounds(40, 240, 280, 20);

        jLabel9.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel9.setText("Enrollment");
        SignupPanel.add(jLabel9);
        jLabel9.setBounds(40, 270, 90, 24);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/textfeild.png"))); // NOI18N
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });
        SignupPanel.add(jLabel8);
        jLabel8.setBounds(30, 230, 300, 40);

        Enrollment.setBackground(new java.awt.Color(128, 125, 110));
        Enrollment.setForeground(new java.awt.Color(255, 255, 0));
        Enrollment.setOpaque(false);
        SignupPanel.add(Enrollment);
        Enrollment.setBounds(40, 300, 280, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/textfeild.png"))); // NOI18N
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        SignupPanel.add(jLabel10);
        jLabel10.setBounds(30, 290, 300, 40);

        jLabel11.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel11.setText("Password");
        SignupPanel.add(jLabel11);
        jLabel11.setBounds(40, 330, 90, 24);

        Password.setBackground(new java.awt.Color(128, 125, 110));
        Password.setForeground(new java.awt.Color(255, 255, 0));
        Password.setOpaque(false);
        SignupPanel.add(Password);
        Password.setBounds(40, 360, 280, 20);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/textfeild.png"))); // NOI18N
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel12MouseMoved(evt);
            }
        });
        SignupPanel.add(jLabel12);
        jLabel12.setBounds(30, 350, 300, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        SignupPanel.add(jLabel13);
        jLabel13.setBounds(0, -10, 100, 130);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Create An Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        SignupPanel.add(jButton1);
        jButton1.setBounds(340, 410, 150, 40);
        SignupPanel.add(enrollmentPre);
        enrollmentPre.setBounds(330, 290, 170, 40);
        SignupPanel.add(passwordPre);
        passwordPre.setBounds(330, 350, 160, 40);
        SignupPanel.add(FullNamePre);
        FullNamePre.setBounds(330, 230, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        SignupPanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 820);

        getContentPane().add(SignupPanel);
        SignupPanel.setBounds(600, 175, 500, 480);

        jLabel2.setForeground(new java.awt.Color(192, 192, 192));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/b2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1638, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameActionPerformed

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved
        FullNamePre.setForeground(Color.green);
        FullNamePre.setText("Enter Your Full name Here");
        enrollmentPre.setText("");
        passwordPre.setText(""); 
    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        enrollmentPre.setForeground(Color.green);
        enrollmentPre.setText("Enter Your Exact Enrollment No.");
        FullNamePre.setText("");
        passwordPre.setText(""); 
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseMoved
        passwordPre.setForeground(Color.green);
        passwordPre.setText("Enter Your Password For Login"); 
        FullNamePre.setText("");
        enrollmentPre.setText("");
    }//GEN-LAST:event_jLabel12MouseMoved

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        FullNamePre.setText("");
        enrollmentPre.setText("");
        passwordPre.setText("");
    }//GEN-LAST:event_jLabel1MouseMoved

    private void GoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMouseClicked
        AdminFrame Dashboard=new AdminFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        Dashboard.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_GoBackMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Full_Name=FullName.getText();
//        Pattern UserName=Pattern.compile("[\\w]{3,50}");
//        Matcher m1=UserName.matcher(Full_Name);
//        Boolean b1=m1.matches();
        
        String enrollment=Enrollment.getText();
//        Pattern enroll=Pattern.compile("[a-zA-Z][\\D][\\d]{5,20}");
//        Matcher m2=enroll.matcher(enrollment);
//        Boolean b2=m2.matches();
        
        String password=Password.getText();
//        Pattern pass=Pattern.compile("[\\w][^\\w]{5,20}");
//        Matcher m3=pass.matcher(password);
//        Boolean b3=m3.matches();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        String date=dtf.format(localDate);
        
//        if(b1==true && b2==true && b3==true){
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                String s="INSERT INTO Faculty VALUES ('"+Full_Name+"','"+enrollment+"','"+password+"','"+date+"');";
                Statement s1=c.createStatement();
                s1.execute(s);
                JOptionPane.showMessageDialog(null, "Successfully Submit Next Dialoague Box Shows Your Username/ID");
                
                String ss="Select FacultyId from Faculty where FacultyName='"+Full_Name+"'";
                Statement s2=c.createStatement();
                ResultSet rs=s2.executeQuery(ss);
                if(rs.next()){
                int id=rs.getInt("FacultyId");
                String Sentence="Here's your Username=T-"+id;
                JOptionPane.showMessageDialog(null, Sentence);
                }
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, e);
            }
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "enter Valid data");
//            if(b1==false){
//            JOptionPane.showMessageDialog(null, "Please Enter Your Name with Upcase And Lowercase Both");
//            //FullNamePre.setText("Please Enter Your Name with Upcase And Lowercase Both");
//            //FullNamePre.setForeground(Color.red);
//            }
//            else if(b2==false){
//            JOptionPane.showMessageDialog(null, "Please Enter Your Exact Enrollment Number ");
//            //FullNamePre.setText("Please Enter Your Exact Enrollment Number ");
//            //FullNamePre.setForeground(Color.red);
//            }
//            else if(b3==false){
//            JOptionPane.showMessageDialog(null, "Please Enter more than 5 Character");
//            //FullNamePre.setText("Please Enter more than 5 Character");
//            //FullNamePre.setForeground(Color.red);
//            }
        
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
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FacultySignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultySignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultySignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultySignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultySignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Enrollment;
    private javax.swing.JTextField FullName;
    private javax.swing.JLabel FullNamePre;
    private javax.swing.JLabel GoBack;
    private javax.swing.JTextField Password;
    private javax.swing.JPanel SignupPanel;
    private javax.swing.JLabel enrollmentPre;
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
    private javax.swing.JLabel passwordPre;
    // End of variables declaration//GEN-END:variables
}
