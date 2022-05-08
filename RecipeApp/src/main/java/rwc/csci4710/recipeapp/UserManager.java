package rwc.csci4710.recipeapp;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * UserManager.java
 * 
 * @author Gibbons
 * @author Matt Wurl
 */
public class UserManager {
    
    public static void createUser(String name, String email, String password) {
        User newUser = new User(name, email, password);
        System.out.println("New User: "+ newUser.toString());
    }
    
    public static void registerUser(User inUser) throws FileNotFoundException {
        System.out.println("New User: "+ inUser.toString());
        
        DatabaseManager dbManager = new DatabaseManager();
        ArrayList<User> userList = dbManager.readUsers("Users.txt");
        
        for (User user1 : userList) {
            if(user1.getUsername().equals(inUser.getUsername())){
                
            }
        }
    }
    
    public static void loginUser(String inUsername, String inPassword) {
        System.out.println("User Logged in: "+ inUsername);
    }
}