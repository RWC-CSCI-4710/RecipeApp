package rwc.csci4710.recipeapp;

/**
 * User.java
 * 
 * @author liberto_vincent
 * @author Matt Wurl
 */
public class User {
    private String username;
    private String email;
    private String password;
    private int id;
    
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    /* Accessors */
    
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public int getID() {
        return id;
    }
    
    /* Other */
    
    @Override
    public String toString() {
        return "Username: "+ username
                + "\nEmail: "+ email
                + "\nPassword: "+ password;
    }
}
