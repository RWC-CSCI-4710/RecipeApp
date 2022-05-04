package rwc.csci4710.recipeapp;

import java.io.IOException;
import javax.swing.*;

/**
 * RecipeApp.java
 * 
 * @author Jared Gibbons 
 */

public class RecipeApp {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        
        String text = JOptionPane.showInputDialog("Enter Name");
        
        System.out.println(text);
        
        System.out.println("Here Works!!");
    }
}