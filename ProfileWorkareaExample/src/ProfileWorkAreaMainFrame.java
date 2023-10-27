/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Profiles.EmployeeProfile;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.Profile;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;

import UserInterface.WorkAreas.AdminRole.AdminRoleWorkAreaJPanel;
import UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp.ManageUserAccountsJPanel;
import UserInterface.WorkAreas.FacultyRole.FacultyWorkAreaJPanel;
import UserInterface.WorkAreas.StudentRole.StudentWorkAreaJPanel;
import UserInterface.WorkArea.SignUp.SignUpJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author kal bugrara
 */
public class ProfileWorkAreaMainFrame extends javax.swing.JFrame {

    Business business;

    /**
     * Creates new form PricingMainFrame
     */

    public ProfileWorkAreaMainFrame() {
        initComponents();
        business = ConfigureABusiness.initialize();
        

    }

    public void insert(JPanel jpanel) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitHomeArea = new javax.swing.JSplitPane();
        actionsidejpanel = new javax.swing.JPanel();
        btn_LogIn = new javax.swing.JButton();
        lbl_UserName = new javax.swing.JLabel();
        txt_UserName = new javax.swing.JTextField();
        lbl_Password = new javax.swing.JLabel();
        btn_SignUp = new javax.swing.JButton();
        jpf_Password = new javax.swing.JPasswordField();
        CardSequencePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actionsidejpanel.setMinimumSize(new java.awt.Dimension(200, 200));

        btn_LogIn.setText("Login");
        btn_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        lbl_UserName.setText("User Name");

        lbl_Password.setText("Password");

        btn_SignUp.setText("Sign Up");
        btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionsidejpanelLayout = new javax.swing.GroupLayout(actionsidejpanel);
        actionsidejpanel.setLayout(actionsidejpanelLayout);
        actionsidejpanelLayout.setHorizontalGroup(
            actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsidejpanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_UserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(actionsidejpanelLayout.createSequentialGroup()
                        .addGroup(actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_UserName)
                            .addComponent(lbl_Password)
                            .addGroup(actionsidejpanelLayout.createSequentialGroup()
                                .addComponent(btn_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_SignUp)))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jpf_Password))
                .addContainerGap())
        );
        actionsidejpanelLayout.setVerticalGroup(
            actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsidejpanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbl_UserName)
                .addGap(4, 4, 4)
                .addComponent(txt_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpf_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actionsidejpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_LogIn)
                    .addComponent(btn_SignUp))
                .addGap(397, 397, 397))
        );

        SplitHomeArea.setLeftComponent(actionsidejpanel);

        CardSequencePanel.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Baloo 2", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome to SkillPulse");
        jLabel3.setPreferredSize(new java.awt.Dimension(920, 570));
        CardSequencePanel.add(jLabel3, "card2");

        SplitHomeArea.setRightComponent(CardSequencePanel);

        getContentPane().add(SplitHomeArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        //      WorkAreaJPanel ura = new WorkAreaJPanel(workareajpanl);

        String un = txt_UserName.getText();
        
        //Converting Char Array to the String type
//        String pw = hashPassword(new String(jpf_Password.getPassword()));

        String pw = new String(jpf_Password.getPassword());
        
        System.out.println(pw);

        UserAccountDirectory uad = business.getUserAccountDirectory();
        
        for(UserAccount u : uad.getUserAccountList()){
            System.out.println(u.getUserLoginName() + u.getRole());
        }
        
        UserAccount useraccount = uad.AuthenticateUser(un, pw);
        
        if (useraccount == null) {
            
            JOptionPane.showMessageDialog(this, "Incorrect UserName or Password");
        }
        else if (useraccount!=null && useraccount.isIsEnabled()){
            StudentWorkAreaJPanel studentworkareajpanel;
            FacultyWorkAreaJPanel facultyworkarea;
            AdminRoleWorkAreaJPanel adminworkarea;
            String r = useraccount.getRole();
            Profile profile = useraccount.getAssociatedPersonProfile();
        //       if (r.equalsIgnoreCase("sales")) {

            if (profile instanceof EmployeeProfile) {

                adminworkarea = new AdminRoleWorkAreaJPanel(business, CardSequencePanel);
                CardSequencePanel.removeAll();
                CardSequencePanel.add("Admin", adminworkarea);
                ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

            }
        
            else if (profile instanceof StudentProfile) {

                StudentProfile spp = (StudentProfile) profile;
                studentworkareajpanel = new StudentWorkAreaJPanel(business, spp, CardSequencePanel);
                CardSequencePanel.removeAll();
                CardSequencePanel.add("student", studentworkareajpanel);
                ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
            }

            if (profile instanceof ProfessorProfile) {
                facultyworkarea = new FacultyWorkAreaJPanel(business, CardSequencePanel);
                CardSequencePanel.removeAll();
                CardSequencePanel.add("faculty", facultyworkarea);
                ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

            }
        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignUpActionPerformed
        // TODO add your handling code here:
        
        SignUpJPanel signupPanel = new SignUpJPanel(business, CardSequencePanel);
                
        //ManageUserAccountsJPanel aos = new ManageUserAccountsJPanel(business, CardSequencePanel);

        CardSequencePanel.add("SignUpPanel", signupPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btn_SignUpActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileWorkAreaMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileWorkAreaMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequencePanel;
    private javax.swing.JSplitPane SplitHomeArea;
    private javax.swing.JPanel actionsidejpanel;
    private javax.swing.JButton btn_LogIn;
    private javax.swing.JButton btn_SignUp;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jpf_Password;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_UserName;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables
}
