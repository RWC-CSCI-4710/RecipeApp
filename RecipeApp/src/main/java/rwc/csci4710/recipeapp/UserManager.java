package rwc.csci4710.recipeapp;

/**
 *
 * @author mattx
 * @author Gibbons
 */
public class UserManager {
    public static void registerUser(User inUser) {
        System.out.println("New User: "+ inUser.toString());
    }
    
    public static void loginUser(String inUsername, String inPassword) {
        System.out.println("User Logged in: "+ inUsername);
    }
}
