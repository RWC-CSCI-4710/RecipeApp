package rwc.csci4710.recipeapp;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.google.firebase.FirebaseOptions;
import java.io.IOException;

/**
 *
 * @author Gibbons
 */
public class FirebaseInit {
    
    public void initialize() throws FileNotFoundException, IOException{
        
        FileInputStream serviceAccount =
        new FileInputStream("\"C:\\Users\\chuck\\Documents\\RobertsWork\\Junior\\Spring\\SWEng\\RecipeApp\\RecipeApp\\RecipeAdmKey.json\"");

        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://real-time-recipes-default-rtdb.firebaseio.com")
            .build();

        FirebaseApp.initializeApp(options);
    }
}
