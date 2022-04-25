package rwc.csci4710.recipeapp;

/**
 *
 * @author liberto_vincent
 */
public class User {
    String userName;
    String userEmail;
    int userID;
    String password;
    
    public User(String userName, String userEmail, int userID, String password) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userID = userID;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public int getUserID() {
        return userID;
    }
}
