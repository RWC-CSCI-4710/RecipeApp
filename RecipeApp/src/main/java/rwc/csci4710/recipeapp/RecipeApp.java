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
        
        User user1 = new User("JackBoy7", "jack@gmail.com", 123, "Redhawks#1");
        
        String [] arrIngredients = {"Chicken", "Pasta"};
        String [] arrInstructions = {"Boil pasta", "Grill chicken"};
        
        Recipe rec1 = new Recipe("Chicken Pasta", 473, "Entree", arrIngredients, arrInstructions);
        
        System.out.println("Here Works!!");
    }
}