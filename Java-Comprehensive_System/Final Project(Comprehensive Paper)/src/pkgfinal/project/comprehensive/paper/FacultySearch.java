package pkgfinal.project.comprehensive.paper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FacultySearch extends javax.swing.JFrame {
    String naam;
    public FacultySearch() {
        initComponents();
    }
    
    public FacultySearch(String Name) {
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
        GoBack = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FacultyDb = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Selection = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/arrow.png"))); // NOI18N
        GoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackMouseClicked(evt);
            }
        });
        jPanel1.add(GoBack);
        GoBack.setBounds(5, 120, 50, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, -10, 100, 130);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/logo3.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 0, 150, 120);

        jLabel4.setBackground(new java.awt.Color(45, 62, 80));
        jLabel4.setForeground(new java.awt.Color(45, 62, 80));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, -40, 480, 190);

        FacultyDb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Enrollment", "Password"
            }
        ));
        jScrollPane1.setViewportView(FacultyDb);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 470, 440);

        jLabel7.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel7.setText("Select & Enter Your Column Detail to Search It");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 170, 390, 30);

        data.setBackground(new java.awt.Color(45, 62, 78));
        data.setForeground(new java.awt.Color(255, 255, 0));
        data.setOpaque(false);
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        jPanel1.add(data);
        data.setBounds(180, 200, 310, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 200, 320, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, -10, 100, 130);

        Selection.setBackground(new java.awt.Color(87, 113, 141));
        Selection.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Selection.setForeground(new java.awt.Color(255, 255, 0));
        Selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------", "Full Name", "Enrollment Number", "Password" }));
        jPanel1.add(Selection);
        Selection.setBounds(20, 200, 140, 30);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FACULTY SEARCH DATA ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 120, 500, 40);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 820);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(575, 75, 500, 730);

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
//        Precaution.setText("");
    }//GEN-LAST:event_jLabel1MouseMoved

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void SearchBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseMoved
//        Precaution.setForeground(Color.green/*"[4,128,18]"*/);
//        Precaution.setText("This Selection Goning To be Update Only Selection Column");
    }//GEN-LAST:event_SearchBtnMouseMoved

    private void GoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMouseClicked
        AdminFrame Dashboard=new AdminFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH); 
        Dashboard.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_GoBackMouseClicked

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseClicked
        DefaultTableModel df=(DefaultTableModel)FacultyDb.getModel();
        String selection=(String)Selection.getSelectedItem();
        String Data=data.getText();
        switch (selection) {
            case "Full Name":
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                    String s="SELECT * FROM Faculty WHERE FacultyName ='"+Data+"';";
                    Statement s1=c.createStatement();
                    ResultSet rs=s1.executeQuery(s);
                    df.setRowCount(0);
                    while(rs.next()){
                        Object[] o1={rs.getString("FacultyId"),rs.getString("FacultyName"),rs.getString("Enrollment"),rs.getString("UserPassword"),rs.getString("RegisteredDate")};
                        df.addRow(o1);
                        }
                    
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }   break;
            case "Enrollment Number":
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                    String s="SELECT * FROM Faculty WHERE Enrollment='"+Data+"';";
                    Statement s1=c.createStatement();
                    ResultSet rs=s1.executeQuery(s);
                    df.setRowCount(0);
                    while(rs.next()){
                        Object[] o1={rs.getString("FacultyId"),rs.getString("FacultyName"),rs.getString("Enrollment"),rs.getString("UserPassword"),rs.getString("RegisteredDate")};
                        df.addRow(o1);
                        }   
                     
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);        
                }   break;
            case "Password":
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                    String s="SELECT * FROM Faculty WHERE FacultyName ='"+Data+"';";
                    Statement s1=c.createStatement();
                    ResultSet rs=s1.executeQuery(s);
                    df.setRowCount(0);
                    while(rs.next()){
                        Object[] o1={rs.getString("FacultyId"),rs.getString("FacultyName"),rs.getString("Enrollment"),rs.getString("UserPassword"),rs.getString("RegisteredDate")};
                        df.addRow(o1);
                        }
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
            java.util.logging.Logger.getLogger(FacultySearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultySearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultySearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultySearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultySearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FacultyDb;
    private javax.swing.JLabel GoBack;
    private javax.swing.JLabel SearchBtn;
    private javax.swing.JComboBox<String> Selection;
    private javax.swing.JTextField data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
