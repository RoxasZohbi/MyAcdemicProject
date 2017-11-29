package pkgfinal.project.comprehensive.paper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Result extends javax.swing.JFrame {
    String naam;
    public Result() {
        initComponents();
    }
    public Result(String Name) {
        initComponents();
        naam=Name;
         try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                String ss="SELECT Student.StudentName, Student.Enrollment, Faculty.FacultyName, result.ObtainedNumber, result.TotalNumber FROM Student INNER JOIN result ON Student.StudentId=result.StudentId INNER JOIN Faculty ON Student.FacultyId=Faculty.FacultyId where StudentName='"+naam+"';";
                Statement s2=c.createStatement();
                ResultSet rs=s2.executeQuery(ss);
                if(rs.next()){
                String Full_Name=rs.getString(1);
                FullName.setText(Full_Name);
                String enrollment=rs.getString(2);
                Enrollment.setText(enrollment);
                String Faculty_Name=rs.getString(3);
                FacultyName.setText(Faculty_Name);
                int obt=rs.getInt(4);
                ObtNo.setText(""+obt);
                int tot=rs.getInt(5);
                TotNo.setText(""+tot);
                }
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, e);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        GoBack = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FacultyName = new javax.swing.JLabel();
        FullName = new javax.swing.JLabel();
        Enrollment = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ObtNo = new javax.swing.JLabel();
        TotNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1638, 900));
        setPreferredSize(new java.awt.Dimension(1638, 900));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/logo3.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 0, 150, 120);

        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/arrow.png"))); // NOI18N
        GoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackMouseClicked(evt);
            }
        });
        jPanel1.add(GoBack);
        GoBack.setBounds(5, 120, 50, 50);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RESULT");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 120, 480, 40);

        jLabel4.setBackground(new java.awt.Color(45, 62, 80));
        jLabel4.setForeground(new java.awt.Color(45, 62, 80));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, -40, 480, 190);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, -10, 100, 130);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, -10, 100, 130);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 190, 60, 30);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setText("Faculty Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 340, 160, 30);

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setText("Enrollment");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 260, 120, 30);

        FacultyName.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        FacultyName.setForeground(new java.awt.Color(153, 153, 0));
        jPanel1.add(FacultyName);
        FacultyName.setBounds(160, 340, 320, 30);

        FullName.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        FullName.setForeground(new java.awt.Color(153, 153, 0));
        jPanel1.add(FullName);
        FullName.setBounds(160, 190, 320, 30);

        Enrollment.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        Enrollment.setForeground(new java.awt.Color(153, 153, 0));
        jPanel1.add(Enrollment);
        Enrollment.setBounds(160, 260, 320, 30);

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setText("Total Number");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(280, 410, 110, 40);

        jLabel10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel10.setText("Obtained Number");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 410, 140, 40);

        ObtNo.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        ObtNo.setForeground(new java.awt.Color(153, 153, 0));
        ObtNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ObtNo);
        ObtNo.setBounds(110, 450, 100, 50);

        TotNo.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        TotNo.setForeground(new java.awt.Color(153, 153, 0));
        TotNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(TotNo);
        TotNo.setBounds(290, 450, 90, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(520, 200, 480, 540);

        jLabel2.setForeground(new java.awt.Color(192, 192, 192));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/b2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1638, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMouseClicked
        StudentFrame Dashboard=new StudentFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        Dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GoBackMouseClicked

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enrollment;
    private javax.swing.JLabel FacultyName;
    private javax.swing.JLabel FullName;
    private javax.swing.JLabel GoBack;
    private javax.swing.JLabel ObtNo;
    private javax.swing.JLabel TotNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    // End of variables declaration//GEN-END:variables
}
