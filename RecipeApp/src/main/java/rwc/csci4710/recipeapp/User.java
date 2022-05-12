package rwc.csci4710.recipeapp;

/**
 * User.java
 * 
 * @author liberto_vincent
 * @author gibbons_jared
 * @author Matt Wurl
 */
public class User {
    private String username;
    private String email;
    private String password;
    
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
    public String getPassword() {
        return password;
    }
    
    /* Other */
    
    @Override
    public String toString() {
        return "Username: "+ username
                + "\nEmail: "+ email
                + "\nPassword: "+ password;
    }
}
