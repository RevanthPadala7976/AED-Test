/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

/**
 *
 * @author revanth
 */
public class ProfessorSignUp extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorSignUp
     */
    public ProfessorSignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Title = new javax.swing.JLabel();
        lbl_ProfFirstName = new javax.swing.JLabel();
        lbl_ProfLastName = new javax.swing.JLabel();
        txt_ProfFirstName = new javax.swing.JTextField();
        txt_ProfLastName = new javax.swing.JTextField();
        lbl_ProfEmailID = new javax.swing.JLabel();
        lbl_ProfSkillPulseID = new javax.swing.JLabel();
        lbl_ProfUserName = new javax.swing.JLabel();
        lbl_ProfCreatePassword = new javax.swing.JLabel();
        txt_ProfEmailID = new javax.swing.JTextField();
        txt_ProfSkillPulseID = new javax.swing.JTextField();
        txt_ProfUserName = new javax.swing.JTextField();
        jpf_ProfCreatePassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_ProfConfirmPassword = new javax.swing.JLabel();
        jpf_ProfConfirmPassword = new javax.swing.JPasswordField();

        lbl_Title.setText("New Professor Registration");

        lbl_ProfFirstName.setText("First Name:");

        lbl_ProfLastName.setText("Last Name:");

        lbl_ProfEmailID.setText("Email ID:");

        lbl_ProfSkillPulseID.setText("SkillPulse ID:");

        lbl_ProfUserName.setText("User Name:");

        lbl_ProfCreatePassword.setText("Create Password:");

        lbl_ProfConfirmPassword.setText("Confirm Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_ProfFirstName)
                                    .addComponent(lbl_ProfEmailID)
                                    .addComponent(lbl_ProfLastName)
                                    .addComponent(lbl_ProfSkillPulseID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Title)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_ProfFirstName)
                                        .addComponent(txt_ProfLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(txt_ProfEmailID)
                                        .addComponent(txt_ProfSkillPulseID))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_ProfUserName)
                            .addComponent(lbl_ProfCreatePassword)
                            .addComponent(lbl_ProfConfirmPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ProfUserName)
                            .addComponent(jpf_ProfCreatePassword)
                            .addComponent(jpf_ProfConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lbl_Title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ProfFirstName)
                    .addComponent(txt_ProfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ProfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ProfLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ProfEmailID)
                    .addComponent(txt_ProfEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ProfSkillPulseID)
                    .addComponent(txt_ProfSkillPulseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ProfUserName)
                    .addComponent(txt_ProfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_ProfCreatePassword)
                    .addComponent(jpf_ProfCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ProfConfirmPassword)
                    .addComponent(jpf_ProfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField jpf_ProfConfirmPassword;
    private javax.swing.JPasswordField jpf_ProfCreatePassword;
    private javax.swing.JLabel lbl_ProfConfirmPassword;
    private javax.swing.JLabel lbl_ProfCreatePassword;
    private javax.swing.JLabel lbl_ProfEmailID;
    private javax.swing.JLabel lbl_ProfFirstName;
    private javax.swing.JLabel lbl_ProfLastName;
    private javax.swing.JLabel lbl_ProfSkillPulseID;
    private javax.swing.JLabel lbl_ProfUserName;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JTextField txt_ProfEmailID;
    private javax.swing.JTextField txt_ProfFirstName;
    private javax.swing.JTextField txt_ProfLastName;
    private javax.swing.JTextField txt_ProfSkillPulseID;
    private javax.swing.JTextField txt_ProfUserName;
    // End of variables declaration//GEN-END:variables
}
