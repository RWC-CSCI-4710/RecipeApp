package rwc.csci4710.recipeapp;

import java.io.IOException;
import javax.swing.*;

/* 
 *@author Jared Gibbons 
 */

public class RecipeApp {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        
        String text = JOptionPane.showInputDialog("Enter Name");
        
        System.out.println(text);
        
        FirebaseInit databaseLink = new FirebaseInit();
        databaseLink.initialize();
        
        System.out.println("Here Works!!");
    }
}