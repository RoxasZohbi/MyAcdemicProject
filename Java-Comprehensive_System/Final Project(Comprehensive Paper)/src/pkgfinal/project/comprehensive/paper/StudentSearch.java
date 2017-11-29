package pkgfinal.project.comprehensive.paper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentSearch extends javax.swing.JFrame {
    String naam;
    int id;
    DefaultTableModel df;
        
    
    public StudentSearch() {
        initComponents();
    }
    
    public StudentSearch(String Name) {
        initComponents();
        df = (DefaultTableModel)StudentData.getModel();
        naam=Name;
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                String s="Select FacultyId from Faculty where FacultyName='"+naam+"';";
                Statement s2=c.createStatement();
                ResultSet rs=s2.executeQuery(s);
                if(rs.next()){
                    id=rs.getInt("FacultyId");
                }
                
                if(naam.equals("Admin")){
                    String ss="SELECT result.StudentId,Student.StudentName, Student.Enrollment, Student.UserPassword, Faculty.FacultyName, result.ObtainedNumber, result.TotalNumber FROM Student INNER JOIN result ON Student.StudentId=result.StudentId INNER JOIN Faculty ON Student.FacultyId=Faculty.FacultyId";
                    Statement s1=c.createStatement();
                    ResultSet rs2=s1.executeQuery(ss);
                    df.setRowCount(0);
                    while(rs2.next()){
                        Object[] o1={rs2.getString("StudentId"),rs2.getString("StudentName"),rs2.getString("Enrollment"),rs2.getString("UserPassword"),rs2.getString("FacultyName"),rs2.getString("ObtainedNumber"),rs2.getString("TotalNumber")};
                        df.addRow(o1);
                        }        
                
                }
                else{
                    String ss="SELECT result.StudentId,Student.StudentName, Student.Enrollment, Student.UserPassword, Faculty.FacultyName, result.ObtainedNumber, result.TotalNumber FROM Student INNER JOIN result ON Student.StudentId=result.StudentId INNER JOIN Faculty ON Student.FacultyId=Faculty.FacultyId where FacultyName='"+naam+"';";
                    Statement s1=c.createStatement();
                    ResultSet rs2=s1.executeQuery(ss);
                    df.setRowCount(0);
                    while(rs2.next()){
                        Object[] o1={rs2.getString("StudentId"),rs2.getString("StudentName"),rs2.getString("Enrollment"),rs2.getString("UserPassword"),rs2.getString("FacultyName"),rs2.getString("ObtainedNumber"),rs2.getString("TotalNumber")};
                        df.addRow(o1);
                        }        
                }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "not working "+e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        GoBack = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentData = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Choices = new javax.swing.JComboBox<>();
        DataField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, -10, 100, 130);

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
        jLabel3.setBounds(230, 0, 150, 120);

        jLabel4.setBackground(new java.awt.Color(45, 62, 80));
        jLabel4.setForeground(new java.awt.Color(45, 62, 80));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, -40, 480, 190);

        jLabel6.setBackground(new java.awt.Color(45, 62, 80));
        jLabel6.setForeground(new java.awt.Color(45, 62, 80));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, -40, 480, 190);

        StudentData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Enrollment", "Password", "Faculty Name", "Obtained Number", "Total Number"
            }
        ));
        jScrollPane1.setViewportView(StudentData);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 300, 630, 402);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("STUDENT SEARCH DATA ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 120, 600, 40);

        jLabel8.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel8.setText("Select & Enter Your Column Detail to Search It");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 170, 390, 30);

        Choices.setBackground(new java.awt.Color(87, 113, 141));
        Choices.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Choices.setForeground(new java.awt.Color(255, 255, 0));
        Choices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------", "Full Name", "abc", "Faculty Name" }));
        jPanel1.add(Choices);
        Choices.setBounds(20, 200, 140, 30);

        DataField.setBackground(new java.awt.Color(45, 62, 78));
        DataField.setForeground(new java.awt.Color(255, 255, 0));
        DataField.setOpaque(false);
        DataField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataFieldActionPerformed(evt);
            }
        });
        jPanel1.add(DataField);
        DataField.setBounds(170, 200, 400, 30);

        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/search btn.png"))); // NOI18N
        SearchBtn.setPreferredSize(new java.awt.Dimension(110, 45));
        SearchBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SearchBtnMouseMoved(evt);
            }
        });
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnMouseClicked(evt);
            }
        });
        jPanel1.add(SearchBtn);
        SearchBtn.setBounds(390, 240, 110, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 0, 500, 820);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(170, 200, 400, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 820);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(575, 75, 650, 730);

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        //        Precaution.setText("");
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseMoved

    private void DataFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataFieldActionPerformed

    private void SearchBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseMoved
        //        Precaution.setForeground(Color.green/*"[4,128,18]"*/);
        //        Precaution.setText("This Selection Goning To be Update Only Selection Column");
    }//GEN-LAST:event_SearchBtnMouseMoved

    private void GoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMouseClicked
        if(naam.equals("Admin")){
        AdminFrame Dashboard=new AdminFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        Dashboard.setVisible(true);
        this.dispose();
        }
        else{
        FacultyFrame Dashboard=new FacultyFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        Dashboard.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_GoBackMouseClicked

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseClicked
        String Data=DataField.getText();
        String Selection=(String)Choices.getSelectedItem();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
            switch (Selection) {
            case "Full Name":
                    String s="SELECT result.StudentId,Student.StudentName, Student.Enrollment, Student.UserPassword, Faculty.FacultyName, result.ObtainedNumber, result.TotalNumber FROM Student INNER JOIN result ON Student.StudentId=result.StudentId INNER JOIN Faculty ON Student.FacultyId=Faculty.FacultyId where StudentName='"+Data+"';";
                    Statement s1=c.createStatement();
                    ResultSet rs=s1.executeQuery(s);
                    df.setRowCount(0);
                    while(rs.next()){
                        Object[] o1={rs.getString("StudentId"),rs.getString("StudentName"),rs.getString("Enrollment"),rs.getString("UserPassword"),rs.getString("FacultyName"),rs.getString("ObtainedNumber"),rs.getString("TotalNumber")};
                        df.addRow(o1);
                        }
                   break;
            case "Enrollment":
                    String statement="SELECT result.StudentId,Student.StudentName, Student.Enrollment, Student.UserPassword, Faculty.FacultyName, result.ObtainedNumber, result.TotalNumber FROM Student INNER JOIN result ON Student.StudentId=result.StudentId INNER JOIN Faculty ON Student.FacultyId=Faculty.FacultyId where Student.Enrollment='"+Data+"';";
                    Statement s2=c.createStatement();
                    ResultSet rs1=s2.executeQuery(statement);
                    df.setRowCount(0);
                    while(rs1.next()){
                        Object[] o1={rs1.getString("StudentId"),rs1.getString("StudentName"),rs1.getString("Enrollment"),rs1.getString("UserPassword"),rs1.getString("FacultyName"),rs1.getString("ObtainedNumber"),rs1.getString("TotalNumber")};
                        df.addRow(o1);
                        }                   
                   break;
            case "Faculty Name":
                    String Statement="SELECT result.StudentId,Student.StudentName, Student.Enrollment, Student.UserPassword, Faculty.FacultyName, result.ObtainedNumber, result.TotalNumber FROM Student INNER JOIN result ON Student.StudentId=result.StudentId INNER JOIN Faculty ON Student.FacultyId=Faculty.FacultyId where FacultyName='"+Data+"';";
                    Statement s3=c.createStatement();
                    ResultSet rs2=s3.executeQuery(Statement);
                    df.setRowCount(0);
                    while(rs2.next()){
                        Object[] o1={rs2.getString("StudentId"),rs2.getString("StudentName"),rs2.getString("Enrollment"),rs2.getString("UserPassword"),rs2.getString("FacultyName"),rs2.getString("ObtainedNumber"),rs2.getString("TotalNumber")};
                        df.addRow(o1);
                        }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Plz Enter Valid Data");
                break;
        }        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Plz Enter Valid Data");
                
        }
    }//GEN-LAST:event_SearchBtnMouseClicked

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
            java.util.logging.Logger.getLogger(StudentSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Choices;
    private javax.swing.JTextField DataField;
    private javax.swing.JLabel GoBack;
    private javax.swing.JLabel SearchBtn;
    private javax.swing.JTable StudentData;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
