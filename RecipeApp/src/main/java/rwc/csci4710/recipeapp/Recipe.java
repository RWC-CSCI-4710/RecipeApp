package rwc.csci4710.recipeapp;

/* Gibbons_Jared

*/

import java.util.Arrays;

public class Recipe {    
    private String name;
    private Category category;
    private String[] ingredients;
    private String[] instructions;
    
    public enum Category {
        BREAKFAST("Breakfast"),
        LUNCH("Lunch"),
        DINNER("Dinner"),
        APPETIZER_SNACK("Appetizer or Snack"),
        DESSERT("Dessert"),
        DRINK("Drink");
        
        private final String label;
        
        Category(String label) {
            this.label = label;
        }
        
        public String getLabel() {
            return label;
        }
    }
    
    public Recipe(String name, Category category, String[] ingredients, String[] instructions) {
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

    public String[] getIngredients() {
        return ingredients;
    }
    
    public String[] getInstructions() {
        return instructions;
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
        return "Name: "+ name +"\nCategory: "+ category + "\nIngredients" + Arrays.toString(ingredients) + "\nInstructions" + Arrays.toString(instructions);
    }

    void setIngredients(String ingredients) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
