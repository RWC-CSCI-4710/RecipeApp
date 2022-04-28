package rwc.csci4710.recipeapp;

/* Gibbons_Jared

*/

import java.util.Arrays;

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
    
    public String getCategory(){
        return category;
    }

    public String[] getIngredients(){
        return ingredients;
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
        return "Name: "+ name +"\nCategory: "+ category + "\nIngredients" + Arrays.toString(ingredients) + "\nInstructions" + Arrays.toString(instructions);
    }

    void setIngredients(String ingredients) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}