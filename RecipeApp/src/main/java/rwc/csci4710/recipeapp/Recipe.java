package rwc.csci4710.recipeapp;

public class Recipe {
    String name;
    int recipeID;
    String category;
    String [] ingredients;
    
    public Recipe(String name, int recipeID, String category, String [] ingredients) {
        this.name = name;
        this.recipeID = recipeID;
        this.category = category;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRecipeID(){
        return recipeID;
    }
    
    public String getCategory(){
        return category;
    }
    
    public String toString(){
        return "Name: "+ name +"\nID: "+ recipeID +"\nCategory: "+ category + "\nIngredients" + ingredients;
    }
    
    public String[] addIngredient() {
        
        return ingredients;
    }
}