package rwc.csci4710.recipeapp;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* 
 *@author Jared Gibbons 
 */

public class RecipeApp {

    public static void main(String[] args) throws IOException {
        System.out.print("Hello");
        User user1 = new User("Jack", "jack@gmail.com", "Jack Smith", "AA11", "Redhawks#1");
        
        /*Attempting to connect to database*/
        FileInputStream serviceAccount =
        new FileInputStream("C:\\Users\\chuck\\Documents\\RobertsWork\\Junior\\Spring\\SWEng\\RecipeApp\\RecipeApp\\ADMNKey.json\\");

        
        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://real-time-recipes-default-rtdb.firebaseio.com")
            .build();

        FirebaseApp.initializeApp(options);
        
        DatabaseReference ref = FirebaseDatabase.getInstance()
            .getReference("restricted_access/secret_document");
        DatabaseReference usersRef = ref.child("users");
        
        
        Map<String, User> users = new HashMap<>();
        users.put("Vinny", user1);
        
        usersRef.setValueAsync(users);
        
        System.out.println(user1.getUserID());
        
    }
    
}