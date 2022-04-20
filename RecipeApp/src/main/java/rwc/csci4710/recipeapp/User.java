package rwc.csci4710.recipeapp;

/**
 *
 * @author liberto_vincent
 */
public class User {
    String userName;
    String userEmail;
    String fullName;
    String userID;
    String password;
    
    public User(String userName, String userEmail, String fullName, String userID, String password) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.fullName = fullName;
        this.userID = userID;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public String getFullName() {

        return fullName;
    }
    public String getUserID() {
        return userID;
    }
}
