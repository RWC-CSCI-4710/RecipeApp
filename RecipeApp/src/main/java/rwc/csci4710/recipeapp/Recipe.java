package rwc.csci4710.recipeapp;

import java.util.Arrays;

public class Recipe {    
    private String name;
    private final int recipeID;
    private Category category;
    private String[] ingredients;
    private String[] instructions;
    
    enum Category {
        BREAKFAST("Breakfast"),
        LUNCH("Lunch"),
        DINNER("Dinner"),
        APPETIZER_SNACK("Appetizer or Snack"),
        DESSERT("Dessert"),
        DRINK("Drink");
        
        public final String label;
        
        Category(String label) {
            this.label = label;
        }
    }
    
    public Recipe(String name, int recipeID, Category category, String[] ingredients, String[] instructions) {
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
    
    public Category getCategory(){
        return category;
    }
    
    /* Mutators */
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setCategory(Category newCategory){
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