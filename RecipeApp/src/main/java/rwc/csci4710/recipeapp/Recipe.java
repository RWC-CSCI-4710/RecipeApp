package rwc.csci4710.recipeapp;

import java.util.Arrays;

public class Recipe {
    private String name;
    private final int recipeID;
    private String category;
    private String[] ingredients;
    private String[] instructions;
    
    public Recipe(String name, int recipeID, String category, String[] ingredients, String[] instructions) {
        this.name = name;
        this.recipeID = recipeID;
        this.category = category;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }
    
    /* Accessors */
    
    public String getName() {
        return name;
    }
    
    public int getRecipeID(){
        return recipeID;
    }
    
    public String getCategory(){
        return category;
    }
    
    /* Mutators */
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setCategory(String newCategory){
        category = newCategory;
    }
    
    public void setIngredients(String [] newIngredients){
        ingredients = newIngredients;
    }
    
    public void setInstructions(String [] newInstructions){
        instructions = newInstructions;
    }
        
    /* Other */
    
    @Override
    public String toString(){
        return "Name: "+ name +"\nID: "+ recipeID +"\nCategory: "+ category + "\nIngredients" + Arrays.toString(ingredients) + "\nInstructions" + Arrays.toString(instructions);
    }
}