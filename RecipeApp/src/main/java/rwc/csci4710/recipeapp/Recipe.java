package rwc.csci4710.recipeapp;

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
    private String[] ingredients;
    private String[] instructions;
    
    public Recipe(String name, String category, String[] ingredients, String[] instructions) {
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

    public String[] getIngredients() {
        return ingredients;
    }
    
    public String[] getInstructions() {
        return instructions;
    }
    
    /* Mutators */
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void setCategory(String newCategory) {
        category = newCategory;
    }
    
    public void setIngredients(String[] newIngredients) {
        ingredients = newIngredients;
    }
    
    public void setInstructions(String[] newInstructions) {
        instructions = newInstructions;
    }
        
    /* Other */
    
    @Override
    public String toString() {
        return "Name: "+ name
                + "\nCategory: " + category
                + "\nIngredients: " + Arrays.toString(ingredients)
                + "\nInstructions" + Arrays.toString(instructions);
    }
}
