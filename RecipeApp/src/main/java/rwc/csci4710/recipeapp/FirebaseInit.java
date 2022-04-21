package rwc.csci4710.recipeapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Gibbons
 */
public class FirebaseInit {
    
    public void initialize() throws FileNotFoundException{
        
        FileInputStream serviceAccount =
        new FileInputStream("\"C:\\Users\\chuck\\Documents\\RobertsWork\\Junior\\Spring\\SWEng\\RecipeApp\\RecipeApp\\RecipeAdmKey.json\"");

        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://real-time-recipes-default-rtdb.firebaseio.com")
            .build();

        FirebaseApp.initializeApp(options);
    }

}
