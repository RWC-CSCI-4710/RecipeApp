
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
    
    public User(String inUserName, String inUserEmail, String inFullName, String inUserID, String inPassword){
        userName = inUserName;
        userEmail = inUserEmail;
        fullName = inFullName;
        userID = inUserID;
        password = inPassword;
    }

    public String getUserName(){
        return userName;
    }
    public String getUserEmail(){
        return userEmail;
    }
    public String getFullName(){

        return fullName;
    }
    public String getUserID(){
        return userID;
    }
}
