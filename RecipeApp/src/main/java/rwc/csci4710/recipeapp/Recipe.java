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
    private Category category;
    private Ingredient[] ingredients;
    private String[] instructions;
    
    public Recipe(String name, Category category, Ingredient[] ingredients, String[] instructions) {
        this.name = name;
        this.category = category;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
    
    /* Accessors */
    
    public String getName() {
        return name;
    }
    
    public Category getCategory() {
        return category;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
    
    public String[] getInstructions() {
        return instructions;
    }
    
    /* Mutators */
    
    public void setName(String newName) {
        name = newName;
    }
    
    public void setCategory(Category newCategory) {
        category = newCategory;
    }
    
    public void setIngredients(Ingredient[] newIngredients) {
        ingredients = newIngredients;
    }
    
    public void setInstructions(String [] newInstructions) {
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
