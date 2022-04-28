package rwc.csci4710.recipeapp;

/**
 *
 * @author liberto_vincent
 */
public class User {
    private String userName;
    String userEmail;
    private int userID;
    String userPassword;
    
    public User(String userName, String userEmail, String password) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = password;
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
    
    public String toString(){
        return "Username: "+ userName +"\nEmail: "+ userEmail +"\nPassword: "+ userPassword;
    }
}
