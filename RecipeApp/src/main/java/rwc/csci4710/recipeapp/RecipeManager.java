package rwc.csci4710.recipeapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * RecipeManager.java
 * 
 * @author gbane_aboubakr
 * @author Gibbons_Jared
 * @author liberto_vincent
 */
public class RecipeManager {
     /* Creation of Recipe Where the user inputs will be in the GUI class
    this is just the storing and sorting of the recipes
    */ 
    
    ArrayList<Recipe> newRecipe = new ArrayList<>();
    
    public void createRecipe(String name, String category, String ingredients, String instructions) {
        
        ArrayList<String> ingredientList = new ArrayList<String>();
        ArrayList<String> instructionList = new ArrayList<String>();
        
        Scanner scIng = new Scanner(ingredients);
        while(scIng.hasNext()){
            ingredientList.add
        }
    }
    
    public void addRecipe(Recipe recipe) {
        
        newRecipe.add(recipe);
        Recipe temp = newRecipe.get(0);
    }
    

    public void removeRecipe(Recipe recipe) {
        // Remove recipe from database...
        newRecipe.remove(recipe);
        
        Recipe temp = newRecipe.get(0);
        
    }
    public void editRecipe(User user, Recipe oldRecipe, Recipe changedRecipe) {
        // edit  recipe in database... 
        
        String name = changedRecipe.getName();
        oldRecipe.setName(name);
        
        String cat = changedRecipe.getCategory();
        oldRecipe.setCategory(cat);
        
        ArrayList<String> ingredients = changedRecipe.getIngredients();
        oldRecipe.setIngredients(ingredients);
         
        ArrayList<String> instructions = changedRecipe.getInstructions();
        oldRecipe.setInstructions(instructions);
    }
}
