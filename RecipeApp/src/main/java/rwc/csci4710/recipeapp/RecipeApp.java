package rwc.csci4710.recipeapp;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * RecipeApp.java
 * 
 * @author Jared Gibbons
 * @author Matt Wurl
 */

public class RecipeApp {
    public static void main(String[] args) throws IOException, SQLException {
        DatabaseManager dbManager = new DatabaseManager();
        
        RegisterFrame registerFrame = new RegisterFrame();
        registerFrame.setVisible(true);
        
        dbManager.readUsers("Users.txt");
        
    }
}