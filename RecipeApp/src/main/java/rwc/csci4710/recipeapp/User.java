package rwc.csci4710.recipeapp;

/**
 *
 * @author liberto_vincent
 */
public class User {
    private String username;
    private String email;
    private String password;
    private int id;
    
    public User(String username, String email, String password, int id) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = id;
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
                + "\nEmail: "+ email;
    }
}
