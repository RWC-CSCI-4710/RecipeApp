package rwc.csci4710.recipeapp;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RegisterFrame.java
 * 
 * @author Gibbons_Jared
 * @author Matt Wurl
 * @author Ortiz_Marcos
 */
public class RegisterFrame extends javax.swing.JFrame {

    private boolean flagN, flagE, flagP, flagU = false;
    
    public RegisterFrame() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        inputUsername = new javax.swing.JTextField();
        inputPassword = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        errName = new javax.swing.JLabel();
        errEmail = new javax.swing.JLabel();
        errUsername = new javax.swing.JLabel();
        errPass = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegister.setText("Registration");

        lblName.setText("Name");

        lblEmail.setText("Email");

        lblUsername.setText("Username");

        lblPassword.setText("Password");

        inputName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputNameMousePressed(evt);
            }
        });

        inputEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputEmailMousePressed(evt);
            }
        });

        inputUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputUsernameMousePressed(evt);
            }
        });

        inputPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputPasswordMousePressed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegisterMousePressed(evt);
            }
        });

        errName.setText("jLabel2");

        errEmail.setText("jLabel2");

        errUsername.setText("jLabel2");

        errPass.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegister)
                            .addComponent(lblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errName)
                    .addComponent(errEmail)
                    .addComponent(errUsername)
                    .addComponent(errPass))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegister)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errUsername))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword)
                    .addComponent(errPass))
                .addGap(52, 52, 52)
                .addComponent(btnRegister)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNameMousePressed
        inputName.setText("");
    }//GEN-LAST:event_inputNameMousePressed

    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        /*validate(); */
        valName();
        valPass();
        valEmail();
        valUser();
        
        if(flagN == true && flagP == true && flagE == true && flagU ==true){
            new LoginFrame().setVisible(true);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_btnRegisterMousePressed

    private void inputEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputEmailMousePressed
        inputEmail.setText("");
    }//GEN-LAST:event_inputEmailMousePressed

    private void inputUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUsernameMousePressed
        inputUsername.setText("");
    }//GEN-LAST:event_inputUsernameMousePressed

    private void inputPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPasswordMousePressed
        inputPassword.setText("");
    }//GEN-LAST:event_inputPasswordMousePressed

    private void valName(){
        String name = inputName.getText();
        String regex = "[a-zA-Z-]+"; //type check
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(name);
        
        if(name.equals("") || name.equals("[Enter Name]")){
            inputName.setBackground(Color.RED);
            errName.setText("Input Required");
            errName.setVisible(true);
            flagN = false;
        }
        else if(!(mat.matches())){
            inputName.setBackground(Color.RED);
            errName.setText("Invalid input (Letters only)");
            errName.setVisible(true);
            flagN = false;
        }
        else{
            errName.setVisible(false);
            inputName.setBackground(Color.WHITE);
            flagN = true;
        }
    }   
        
    private void valPass(){
        String pass = inputPassword.getText();
        
        if(pass.equals("") || pass.equals("[Enter Password]")){
            inputPassword.setBackground(Color.RED);
            errPass.setText("Input Required");
            errPass.setVisible(true);
            flagP = false;
        }
        else{
            errPass.setVisible(false);
            inputPassword.setBackground(Color.WHITE);
            flagP = true;
        }
        if(pass.length() < 6){
            inputPassword.setBackground(Color.RED);
            errPass.setText("Must be at least 6 characters long");
            errPass.setVisible(true);
            flagP = false;
        }
        else{
            errPass.setVisible(false);
            inputPassword.setBackground(Color.WHITE);
            flagP = true;
        }
    }
    
    public void valEmail(){
        String email = inputEmail.getText();
        
        if(email.equals("") || email.equals("[Enter Password]")){
            inputEmail.setBackground(Color.RED);
            errEmail.setText("Input Required");
            errEmail.setVisible(true);
            flagE = false;
        }
        
        else if(!inputEmail.getText().contains("@") || !inputEmail.getText().contains(".")){
            inputEmail.setBackground(Color.RED);
            errEmail.setText("Not a valid email");
            errEmail.setVisible(true);
            flagE = false;
        }
        
        else{
            errEmail.setVisible(false);
            inputEmail.setBackground(Color.WHITE);
            flagE = true;
        }
    }
    
    public void valUser(){
        String username = inputUsername.getText();
        
        if(username.equals("") || username.equals("[Enter Username]")){
            inputUsername.setBackground(Color.RED);
            errUsername.setText("Input Required");
            errUsername.setVisible(true);
            flagU = false;
        }
        else{
            errUsername.setVisible(false);
            inputUsername.setBackground(Color.WHITE);
            flagU = true;
        }
    }
    
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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel errEmail;
    private javax.swing.JLabel errName;
    private javax.swing.JLabel errPass;
    private javax.swing.JLabel errUsername;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
