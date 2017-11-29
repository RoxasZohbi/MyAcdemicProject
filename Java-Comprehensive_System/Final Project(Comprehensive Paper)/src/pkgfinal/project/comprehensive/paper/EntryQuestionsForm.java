package pkgfinal.project.comprehensive.paper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EntryQuestionsForm extends javax.swing.JFrame {
    String naam;
    public EntryQuestionsForm() {
        initComponents();
    }
    
    public EntryQuestionsForm(String Name) {
        initComponents();
        naam=Name;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QuestionDetail = new javax.swing.JTextArea();
        Option1 = new javax.swing.JTextField();
        Option2 = new javax.swing.JTextField();
        Option3 = new javax.swing.JTextField();
        Option4 = new javax.swing.JTextField();
        CorrectAns = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Precaution = new javax.swing.JLabel();
        GoBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, -10, 100, 130);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/logo3.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 0, 150, 120);

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

        jLabel7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("QUESTIONS ENTRY FORM");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 120, 620, 40);

        jLabel8.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel8.setText("Question:-");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 190, 180, 32);

        QuestionDetail.setColumns(20);
        QuestionDetail.setRows(5);
        jScrollPane1.setViewportView(QuestionDetail);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 580, 130);

        Option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option1ActionPerformed(evt);
            }
        });
        jPanel1.add(Option1);
        Option1.setBounds(30, 390, 180, 30);
        jPanel1.add(Option2);
        Option2.setBounds(410, 390, 180, 30);

        Option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option3ActionPerformed(evt);
            }
        });
        jPanel1.add(Option3);
        Option3.setBounds(30, 470, 180, 30);

        Option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option4ActionPerformed(evt);
            }
        });
        jPanel1.add(Option4);
        Option4.setBounds(410, 470, 180, 30);
        jPanel1.add(CorrectAns);
        CorrectAns.setBounds(220, 520, 180, 30);

        jLabel9.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel9.setText("Option 1");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 370, 70, 20);

        jLabel10.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel10.setText("Option 2");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(410, 370, 60, 19);

        jLabel11.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel11.setText("Option 3");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 450, 60, 19);

        jLabel12.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel12.setText("Option 4");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(410, 450, 60, 19);

        jLabel14.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Correct Answer");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(220, 500, 180, 19);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Submit btn.png"))); // NOI18N
        jLabel15.setMaximumSize(new java.awt.Dimension(105, 40));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15);
        jLabel15.setBounds(480, 560, 105, 40);
        jPanel1.add(Precaution);
        Precaution.setBounds(400, 520, 220, 30);

        GoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/arrow.png"))); // NOI18N
        GoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackMouseClicked(evt);
            }
        });
        jPanel1.add(GoBack);
        GoBack.setBounds(5, 120, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 820);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 0, 500, 820);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(525, 120, 620, 630);

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

    private void Option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option1ActionPerformed

    private void Option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option3ActionPerformed

    private void Option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option4ActionPerformed

    private void GoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMouseClicked
            FacultyFrame Dashboard=new FacultyFrame(naam);
            Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
            Dashboard.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_GoBackMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        String[] Options={Option1.getText(),Option2.getText(),Option3.getText(),Option4.getText(),CorrectAns.getText()};
            String FinalQuestion="";
            String Question=QuestionDetail.getText();
            String[] arr = Question.split(" ");
            for(int i=0;i<arr.length;i++){
            if((i%8==0 || i%8>=8) && i!=arr.length){
                if(i==0){
                FinalQuestion=FinalQuestion+arr[i];
                }
                else{
                FinalQuestion=FinalQuestion+"<br/>"+arr[i];
                }
            }
            else{
            FinalQuestion=FinalQuestion+"  "+arr[i];
            }
            }
            FinalQuestion = "<html>"+FinalQuestion+"</html>";
            
        if(Options[4].equals(Options[0])&&Options[4]!=Options[1]&&Options[4]!=Options[2]&&Options[4]!=Options[3]){
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                String s="INSERT INTO question VALUES ('"+FinalQuestion+"','"+Options[0]+"','"+Options[1]+"','"+Options[2]+"','"+Options[3]+"','"+Options[4]+"');";
                Statement s1=c.createStatement();
                s1.execute(s);
                JOptionPane.showMessageDialog(null, "Sucessfully Saved");
              }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if(Options[4].equals(Options[1]) && Options[4]!=Options[2] && Options[4]!=Options[3] && Options[4]!=Options[0]){
           try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                String s="INSERT INTO question VALUES ('"+FinalQuestion+"','"+Options[0]+"','"+Options[1]+"','"+Options[2]+"','"+Options[3]+"','"+Options[4]+"');";
                Statement s1=c.createStatement();
                s1.execute(s);
                JOptionPane.showMessageDialog(null, "Sucessfully Saved");
              }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            } 
        }
        else if(Options[4].equals(Options[2]) && Options[4]!=Options[1] && Options[4]!=Options[3] && Options[4]!=Options[0]){
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                String s="INSERT INTO question VALUES ('"+FinalQuestion+"','"+Options[0]+"','"+Options[1]+"','"+Options[2]+"','"+Options[3]+"','"+Options[4]+"');";
                Statement s1=c.createStatement();
                s1.execute(s);
                JOptionPane.showMessageDialog(null, "Sucessfully Saved");
              }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if(Options[4].equals(Options[3]) && Options[4]!=Options[2] && Options[4]!=Options[1] && Options[4]!=Options[0]){
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                String s="INSERT INTO question VALUES ('"+FinalQuestion+"','"+Options[0]+"','"+Options[1]+"','"+Options[2]+"','"+Options[3]+"','"+Options[4]+"');";
                Statement s1=c.createStatement();
                s1.execute(s);
                JOptionPane.showMessageDialog(null, "Sucessfully Saved");
              }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
        JOptionPane.showMessageDialog(null, "there Must be one option who is equal to correct Answer");
        }
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(EntryQuestionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryQuestionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryQuestionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryQuestionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryQuestionsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CorrectAns;
    private javax.swing.JLabel GoBack;
    private javax.swing.JTextField Option1;
    private javax.swing.JTextField Option2;
    private javax.swing.JTextField Option3;
    private javax.swing.JTextField Option4;
    private javax.swing.JLabel Precaution;
    private javax.swing.JTextArea QuestionDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
