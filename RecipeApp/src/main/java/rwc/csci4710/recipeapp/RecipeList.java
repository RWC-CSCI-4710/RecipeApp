package rwc.csci4710.recipeapp;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * RecipeList.java
 * 
 * @author liberto_vincent
 * @author gibbons_jared
 */
public class RecipeList extends javax.swing.JFrame {

    private static ArrayList<Recipe> recipeList;
    /** 
     * Creates new form SearchResults
     */
    public RecipeList(ArrayList<Recipe> inRecList) {
        initComponents();
        recipeList = inRecList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRecipe = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        ViewList = new javax.swing.JButton();
        RecipeListFull = new java.awt.List();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecipe = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRecipe.setBackground(new java.awt.Color(255, 204, 204));
        lblRecipe.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        lblRecipe.setText("Recipe List ");

        BackButton.setBackground(new java.awt.Color(255, 204, 204));
        BackButton.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackButtonMousePressed(evt);
            }
        });

        ViewList.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        ViewList.setText("View List");
        ViewList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewListMousePressed(evt);
            }
        });

        RecipeListFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecipeListFullActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 104, 104));
        jLabel2.setText("Recipe List ");

        txtRecipe.setColumns(20);
        txtRecipe.setRows(5);
        jScrollPane1.setViewportView(txtRecipe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ViewList)
                        .addGap(34, 34, 34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(RecipeListFull, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRecipe)
                        .addGap(345, 345, 345))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(ViewList)
                .addGap(30, 30, 30)
                .addComponent(RecipeListFull, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        try {
            // TODO add your handling code here:
            new MainMenu().setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RecipeList.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose(); 
    }//GEN-LAST:event_BackButtonMousePressed

    private void ViewListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewListMousePressed
        // TODO add your handling code here:
        for(int k=0; k<recipeList.size(); k++)
        {
            RecipeListFull.add(recipeList.get(k).getName());
        }
    }//GEN-LAST:event_ViewListMousePressed

    private void RecipeListFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecipeListFullActionPerformed
        String str = RecipeListFull.getSelectedItem().trim();
        System.out.println(str);
        lblRecipe.setVisible(true);
        lblRecipe.setText(str);
        
        DatabaseManager dbManager = new DatabaseManager();
        try {
            ArrayList<Recipe> RecipeList = dbManager.readRecipes("Recipes.txt");
            
            for(Recipe recs:RecipeList){
                System.out.println(str);
                System.out.println(recs.getName());
                if(str.equals(recs.getName())){
                    txtRecipe.setText(recs.toString());
                    break;
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchResults.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RecipeListFullActionPerformed

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
            java.util.logging.Logger.getLogger(RecipeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResults(recipeList).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private java.awt.List RecipeListFull;
    private javax.swing.JButton ViewList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRecipe;
    private javax.swing.JTextArea txtRecipe;
    // End of variables declaration//GEN-END:variables
}
