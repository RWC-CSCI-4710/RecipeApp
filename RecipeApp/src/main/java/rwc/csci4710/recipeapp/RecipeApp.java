package rwc.csci4710.recipeapp;

import java.io.IOException;
import java.sql.SQLException;

/**
 * RecipeApp.java
 * 
 * @author Jared Gibbons
 */
public class RecipeApp {
    public static void main(String[] args) throws IOException, SQLException {
        LoginFrame loginFrame = new LoginFrame();
        
        loginFrame.setVisible(true);
    }
}