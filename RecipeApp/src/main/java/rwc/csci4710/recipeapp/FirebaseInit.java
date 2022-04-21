package rwc.csci4710.recipeapp;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.IOException;

/**
 *
 * @author Jared Gibbons
 */
public class FirebaseInit {
    
    DatabaseReference refR;
    
    public void initialize() throws FileNotFoundException, IOException{
        
        FileInputStream serviceAccount =
        new FileInputStream("\"C:\\Users\\chuck\\Documents\\RobertsWork\\Junior\\Spring\\SWEng\\RecipeApp\\RecipeApp\\RecipeAdmKey.json\"");

        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://real-time-recipes-default-rtdb.firebaseio.com")
            .build();

        FirebaseApp.initializeApp(options);
        
        // As an admin, the app has access to read and write all data, regardless of Security Rules
        DatabaseReference ref = FirebaseDatabase.getInstance()
            .getReference("restricted_access/secret_document");
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
          @Override
          public void onDataChange(DataSnapshot dataSnapshot) {
            Object document = dataSnapshot.getValue();
            System.out.println(document);
          }

          @Override
          public void onCancelled(DatabaseError error) {
          }
        });
    }
}
