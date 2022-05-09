package rwc.csci4710.recipeapp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Recipe.java
 * 
 * @author Gibbons_Jared
 * @author Matt Wurl
 */
public class Recipe {    
    private String name;
    private String category;
    private ArrayList<String> ingredients = new ArrayList<String>();
    private ArrayList<String> instructions = new ArrayList<String>();
    
    public Recipe(String name, String category, ArrayList<String> ingredients, ArrayList<String> instructions) {
        this.name = name;
        this.category = category;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
    
    /* Accessors */
    
    public String getName() {
        return name;
    }
    
    public String getCategory() {
        return category;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public ArrayList<String> getInstructions() {
        return instructions;
    }
    
    /* Mutators */
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void setCategory(String newCategory) {
        category = newCategory;
    }
    
    public void setIngredients(ArrayList<String> newIngredients) {
        ingredients = newIngredients;
    }
    
    public void setInstructions(ArrayList<String> newInstructions) {
        instructions = newInstructions;
    }
        
    /* Other */
    
    @Override
    public String toString() {
        return "Name: "+ name
                + "\nCategory: " + category
                + "\nIngredients: " + ingredients
                + "\nInstructions" + instructions;
    }
}
