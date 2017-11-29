package pkgfinal.project.comprehensive.paper;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FacultyUpdate extends javax.swing.JFrame {
    String naam;
    public FacultyUpdate(){
        initComponents();
    }
    
    public FacultyUpdate(String Name){
        initComponents();
        naam=Name;
        
        DefaultTableModel df=(DefaultTableModel)FacultyDb.getModel();
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                String s="Select*from Faculty;";
                Statement s1=c.createStatement();
                ResultSet rs=s1.executeQuery(s);
                df.setRowCount(0);
                while(rs.next()){
                    Object[] o1={rs.getString("FacultyId"),rs.getString("FacultyName"),rs.getString("Enrollment"),rs.getString("UserPassword"),rs.getString("RegisteredDate")};
                    df.addRow(o1);
                        }
            }
        catch(Exception e){
        }
    }
      

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        GoBack = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        choices = new javax.swing.JComboBox<>();
        data = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FacultyDb = new javax.swing.JTable();
        Precaution = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1900, 900));
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

        jLabel4.setBackground(new java.awt.Color(45, 62, 80));
        jLabel4.setForeground(new java.awt.Color(45, 62, 80));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, -40, 480, 190);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("UPDATE FORM FOR FACULTY");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 120, 500, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, -10, 100, 130);

        jLabel7.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel7.setText("Select Your Column to Update/Delete");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 240, 380, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, -10, 100, 130);

        choices.setBackground(new java.awt.Color(87, 113, 141));
        choices.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        choices.setForeground(new java.awt.Color(255, 255, 0));
        choices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------", "Full Name", "Enrollment Number", "Password" }));
        jPanel1.add(choices);
        choices.setBounds(20, 270, 140, 30);

        data.setBackground(new java.awt.Color(45, 62, 78));
        data.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 0));
        data.setBorder(null);
        data.setOpaque(false);
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        jPanel1.add(data);
        data.setBounds(180, 270, 300, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 270, 320, 30);

        FacultyDb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Enrollment", "Password"
            }
        ));
        jScrollPane1.setViewportView(FacultyDb);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 380, 470, 340);

        Precaution.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Precaution.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Precaution);
        Precaution.setBounds(10, 350, 470, 30);

        UpdateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/update btn.png"))); // NOI18N
        UpdateBtn.setPreferredSize(new java.awt.Dimension(110, 45));
        UpdateBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseMoved(evt);
            }
        });
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        jPanel1.add(UpdateBtn);
        UpdateBtn.setBounds(170, 310, 103, 40);

        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/delete btn.png"))); // NOI18N
        DeleteBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseMoved(evt);
            }
        });
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        jPanel1.add(DeleteBtn);
        DeleteBtn.setBounds(290, 310, 103, 40);

        jLabel9.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("User Name:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 184, 140, 40);

        ID.setBackground(new java.awt.Color(45, 62, 78));
        ID.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 0));
        ID.setBorder(null);
        ID.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                IDMouseMoved(evt);
            }
        });
        ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDMouseClicked(evt);
            }
        });
        jPanel1.add(ID);
        ID.setBounds(180, 190, 300, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(170, 190, 320, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/refresh.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 310, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 490, 820);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(575, 75, 490, 730);

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/b2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1638, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
       Precaution.setText("");
       
    }//GEN-LAST:event_jLabel1MouseMoved

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void DeleteBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseMoved
        Precaution.setForeground(Color.red);
        Precaution.setText("This Selection Goning To be Delete Entire Data");
    }//GEN-LAST:event_DeleteBtnMouseMoved

    private void UpdateBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseMoved
        Precaution.setForeground(Color.green/*"[4,128,18]"*/);
        Precaution.setText("This Selection Goning To be Update Only Selection Column");
    
    }//GEN-LAST:event_UpdateBtnMouseMoved

    private void IDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseMoved
        Precaution.setForeground(Color.white/*"[4,128,18]"*/);
        Precaution.setText("This User Name Goning To be like T-(ID)");

        
    }//GEN-LAST:event_IDMouseMoved

    private void IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseClicked
        Precaution.setForeground(Color.white/*"[4,128,18]"*/);
        Precaution.setText("This User Name Goning To be like T-(ID)");
    }//GEN-LAST:event_IDMouseClicked

    private void GoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMouseClicked
        AdminFrame Dashboard=new AdminFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        Dashboard.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_GoBackMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        String selection=(String)choices.getSelectedItem();
        String Id=ID.getText();
        String Data=data.getText();
        switch (selection) {
            case "Full Name":
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                    String s="UPDATE Faculty SET FacultyName='"+Data+"' WHERE FacultyId="+Id+";";
                    Statement s1=c.createStatement();
                    s1.executeUpdate(s);
                    ID.setText("");
                    data.setText("");
                    JOptionPane.showMessageDialog(null, "Sucessfully Update");
                    
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }   break;
            case "Enrollment Number":
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                    String s="UPDATE Faculty SET Enrollment='"+Data+"' WHERE FacultyId="+Id+";";
                    Statement s1=c.createStatement();
                    s1.executeUpdate(s);
                    ID.setText("");
                    data.setText("");
                    JOptionPane.showMessageDialog(null, "Sucessfully Update");
                                        
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);        
                }   break;
            case "Password":
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                    String s="UPDATE Faculty SET UserPassword='"+Data+"' WHERE FacultyId="+Id+";";
                    Statement s1=c.createStatement();
                    s1.executeUpdate(s);
                    ID.setText("");
                    data.setText("");
                    JOptionPane.showMessageDialog(null, "Sucessfully Update");
                    
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Plz Enter Valid Data");
                break;
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked

        String selection=(String)choices.getSelectedItem();
        String Id=ID.getText();
        String Data=data.getText();
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                    String s="DELETE FROM Faculty WHERE FacultyId="+Id+";";
                    Statement s1=c.createStatement();
                    s1.executeUpdate(s);
                    JOptionPane.showMessageDialog(null, "Sucessfully Delete");
                    
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }

    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

         DefaultTableModel df=(DefaultTableModel)FacultyDb.getModel();
        try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                String s="Select*from Faculty;";
                Statement s1=c.createStatement();
                ResultSet rs=s1.executeQuery(s);
                df.setRowCount(0);
                while(rs.next()){
                    Object[] o1={rs.getString("FacultyId"),rs.getString("FacultyName"),rs.getString("Enrollment"),rs.getString("UserPassword"),rs.getString("RegisteredDate")};
                    df.addRow(o1);
                        }
            }
        catch(Exception e){
        }
        
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(FacultyUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new FacultyUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeleteBtn;
    private javax.swing.JTable FacultyDb;
    private javax.swing.JLabel GoBack;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel Precaution;
    private javax.swing.JLabel UpdateBtn;
    private javax.swing.JComboBox<String> choices;
    private javax.swing.JTextField data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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