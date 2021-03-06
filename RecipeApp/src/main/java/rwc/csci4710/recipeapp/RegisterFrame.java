package rwc.csci4710.recipeapp;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RegisterFrame.java
 * 
 * @author Gibbons_Jared
 * @author Ortiz_Marcos
 */
public class RegisterFrame extends javax.swing.JFrame {

    private boolean flagN, flagE, flagP, flagU = false;
     
    public RegisterFrame() {
        initComponents();
        errName.setVisible(false);
        errEmail.setVisible(false);
        errPass.setVisible(false);
        errUsername.setVisible(false);
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

        lblRegister.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(255, 104, 104));
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnRegister))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblRegister, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errName)
                    .addComponent(errEmail)
                    .addComponent(errUsername)
                    .addComponent(errPass))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRegister)
                .addGap(33, 33, 33)
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
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNameMousePressed
        inputName.setText("");
    }//GEN-LAST:event_inputNameMousePressed

    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        /*verify(); */
        valName();
        valPass();
        valEmail();
        try {
            valUser();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(flagN == true && flagP == true && flagE == true && flagU ==true){
            try {
                User newUser = new User(inputUsername.getText(), inputEmail.getText(), inputPassword.getText());
                DatabaseManager dbManager = new DatabaseManager();
                dbManager.writeUsers("Users.txt", newUser);
                new LoginFrame().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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
    
    public void valUser() throws FileNotFoundException{
        String username = inputUsername.getText();
        DatabaseManager dbManager = new DatabaseManager();
        ArrayList<User> userList = dbManager.readUsers("Users.txt");
        
    
        if(username.equals("") || username.equals("[Enter Username]")){
            inputUsername.setBackground(Color.RED);
            errUsername.setText("Input Required");
            errUsername.setVisible(true);
            flagU = false;
        }
        else{
            for (User user1 : userList) {
                if(user1.getUsername().equals(inputUsername.getText())){
                    inputUsername.setBackground(Color.RED);
                    errUsername.setText("Username already taken!");
                    errUsername.setVisible(true);
                    flagU = false;
                    break;
                }
                else{
                    errUsername.setVisible(false);
                    inputUsername.setBackground(Color.WHITE);
                    flagU = true;
                }
            }
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
