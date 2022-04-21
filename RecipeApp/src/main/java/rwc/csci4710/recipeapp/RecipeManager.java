package rwc.csci4710.recipeapp;

import java.util.*;

/**
 *
 * @author liberto_vincent
 * @author gbane_aboubakr
 */
public class RecipeManager {
     /* Creation of Recipe Where the user inputs will be in the GUI class
    this is just the storing and sorting of the recipes
    */ 
    
    ArrayList<Recipe> addRecipe = new ArrayList<Recipe>();
    
    public void addRecipe(User user, Recipe recipe) {
        
        addRecipe.add(recipe);
        
        Recipe temp = addRecipe.get(0);
    
    }
    

    public void removeRecipe(User user, Recipe recipe) {
        // Remove recipe from database...
        addRecipe.remove(recipe);
        
        Recipe temp = addRecipe.get(0);
        
    }
    public void editRecipe(User user, Recipe recipe) {
        // edit  recipe in database... 
        
    }
}
