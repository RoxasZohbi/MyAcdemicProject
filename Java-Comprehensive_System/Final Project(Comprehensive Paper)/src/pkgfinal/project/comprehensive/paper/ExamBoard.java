package pkgfinal.project.comprehensive.paper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class ExamBoard extends javax.swing.JFrame {
    int i=0,obt=0, Lenght=0;
    int j=1,id ,i2;
    int[] Qid;
    String naam;
    String correctAns;
    public ExamBoard() {
        initComponents();
    }

    public ExamBoard(String Name){
        initComponents();
        naam=Name;
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                String s="Select count(QuestionID) as id from question;";
                Statement s1=c.createStatement();
                ResultSet rs=s1.executeQuery(s);
                if(rs.next()){
                    Lenght=rs.getInt("id");
                    Qid=new int[Lenght];
                    i2=Qid.length-1;    

                    }
                s="select QuestionId from Question";
                s1=c.createStatement();
                rs=s1.executeQuery(s);
                while(rs.next()){
                    int n=rs.getInt(1);;
                    Qid[i]=n;
                    i++;
                }
                String s2="select Questions, Option1, Option2, Option3, Option4, CorrectAnswer from Question where QuestionId="+Qid[0];
                s1=c.createStatement();
                rs=s1.executeQuery(s2);
                if(rs.next()){
                Question.setText(rs.getString(1));
                option1.setText(rs.getString(2));
                option2.setText(rs.getString(3));
                option3.setText(rs.getString(4));
                option4.setText(rs.getString(5));
                correctAns=rs.getString(6);
                }
                s="Select StudentId from Student where StudentName='"+naam+"';";
                s1=c.createStatement();
                rs=s1.executeQuery(s);
                if(rs.next()){
                id=rs.getInt(1);
                }
                
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
    }
    
    public void questions(int ID){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
            String s2="select Questions, Option1, Option2, Option3, Option4, CorrectAnswer from Question where QuestionId="+Qid[ID];
            Statement s1=c.createStatement();
            ResultSet rs=s1.executeQuery(s2);
            if(rs.next()){
                Question.setText(rs.getString(1));
                option1.setText(rs.getString(2));
                option2.setText(rs.getString(3));
                option3.setText(rs.getString(4));
                option4.setText(rs.getString(5));
                correctAns=rs.getString(6);
                }
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }
    }
    
    public void FinalQuestion(int ID,int obtained, int total){
            try{
                     
                     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                     Connection c=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ComprehensiveDB;username=sa;password=1.republic");
                     String s2="insert into result values("+ID+","+obtained+","+total+")";
                     Statement s1=c.createStatement();
                     s1.execute(s2);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Options = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        GoBack = new javax.swing.JLabel();
        Timer = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        option1 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option4 = new javax.swing.JRadioButton();
        Question = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel1.add(Timer);
        Timer.setBounds(290, 120, 190, 50);

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/Strip.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, -10, 100, 130);

        Options.add(option1);
        option1.setOpaque(false);
        jPanel1.add(option1);
        option1.setBounds(50, 410, 210, 50);

        Options.add(option3);
        option3.setOpaque(false);
        jPanel1.add(option3);
        option3.setBounds(50, 491, 210, 40);

        Options.add(option2);
        option2.setOpaque(false);
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });
        jPanel1.add(option2);
        option2.setBounds(290, 410, 200, 50);

        Options.add(option4);
        option4.setOpaque(false);
        option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option4ActionPerformed(evt);
            }
        });
        jPanel1.add(option4);
        option4.setBounds(290, 480, 200, 50);

        Question.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Question.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(Question);
        Question.setBounds(50, 150, 420, 200);

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setText("Q10");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 170, 50, 50);

        Btn.setText("Next");
        Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Btn);
        Btn.setBounds(330, 580, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/loginBack.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 820);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(580, 80, 500, 630);

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgfinal/project/comprehensive/paper/Images/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1600, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackMouseClicked
        StudentFrame Dashboard=new StudentFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        Dashboard.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_GoBackMouseClicked

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        //        Precaution.setText("");
    }//GEN-LAST:event_jLabel1MouseMoved

    private void BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActionPerformed
        
        String Option1=option1.getText();
        String Option2=option2.getText();
        String Option3=option3.getText();
        String Option4=option4.getText();

        
    if(j<Qid.length){
        if(option1.isSelected() && Option1.equals(correctAns)){
        
            obt=obt+1;
            questions(j);
            j++;
            }
        else if(option2.isSelected() && Option2.equals(correctAns)){
            obt=obt+1;
            questions(j);
            j++;
        }
        else if(option3.isSelected() && Option3.equals(correctAns)){
            obt=obt+1;
            questions(j);
            j++;
        }
        else if(option4.isSelected() && Option4.equals(correctAns)){
            obt=obt+1;
            questions(j);
            j++;
            }
        else{
            questions(j);
            j++;
            }
        if(j==i2){
            Btn.setText("Finish");
        }
        }
    else if(j==Qid.length){
        Btn.setText("Finish");
        
        if(option1.isSelected() && Option1.equals(correctAns)){
            j++;
            obt=obt+1;
            FinalQuestion(id,obt, Qid.length);
            }
        else if(option2.isSelected() && Option2.equals(correctAns)){
            j++;
            obt=obt+1;
            FinalQuestion(id,obt, Qid.length);
        }
        else if(option3.isSelected() && Option3.equals(correctAns)){
            j++;
            obt=obt+1;
            FinalQuestion(id,obt, Qid.length);
        }
        else if(option4.isSelected() && Option4.equals(correctAns)){
            j++;
            obt=obt+1;
            FinalQuestion(id,obt, Qid.length);
            }
        else{
            FinalQuestion(id,obt, Qid.length);
            StudentFrame Dashboard=new StudentFrame(naam);
            Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
            Dashboard.setVisible(true);
            this.dispose();
            }
        }
    if(j>Qid.length){
        StudentFrame Dashboard=new StudentFrame(naam);
        Dashboard.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        Dashboard.setVisible(true);
        this.dispose();
    }
    Options.clearSelection();
    }//GEN-LAST:event_BtnActionPerformed

    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option2ActionPerformed

    private void option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option4ActionPerformed

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
            java.util.logging.Logger.getLogger(ExamBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn;
    private javax.swing.JLabel GoBack;
    private javax.swing.ButtonGroup Options;
    private javax.swing.JLabel Question;
    private javax.swing.JLabel Timer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JRadioButton option4;
    // End of variables declaration//GEN-END:variables
}
