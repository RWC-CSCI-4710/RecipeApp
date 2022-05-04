package rwc.csci4710.recipeapp;

import java.util.ArrayList;
import rwc.csci4710.recipeapp.Recipe.Category;

/**
 * @author Gibbons_Jared
 * @author liberto_vincent
 * @author gbane_aboubakr
 */
public class RecipeManager {
     /* Creation of Recipe Where the user inputs will be in the GUI class
    this is just the storing and sorting of the recipes
    */ 
    
    ArrayList<Recipe> newRecipe = new ArrayList<>();
    
    public void addRecipe(User user, Recipe recipe) {
        
        newRecipe.add(recipe);
        Recipe temp = newRecipe.get(0);
    
    }
    

    public void removeRecipe(User user, Recipe recipe) {
        // Remove recipe from database...
        newRecipe.remove(recipe);
        
        Recipe temp = newRecipe.get(0);
        
    }
    public void editRecipe(User user, Recipe oldRecipe, Recipe changedRecipe) {
        // edit  recipe in database... 
        
        String name = changedRecipe.getName();
        oldRecipe.setName(name);
        
        Category cat = changedRecipe.getCategory();
        oldRecipe.setCategory(cat);
        
        String [] ingredients = changedRecipe.getIngredients();
        oldRecipe.setIngredients(ingredients);
         
        String[] instructions = changedRecipe.getInstructions();
        oldRecipe.setInstructions(instructions);
    }
}
