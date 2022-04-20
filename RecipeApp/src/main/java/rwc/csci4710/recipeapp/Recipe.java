package sweng.realrecipe;

public class Recipe {
    String name;
    int recipeID;
    String category;
    
    public Recipe(String name, int recipeID, String category) {
        this.name = name;
        this.recipeID = recipeID;
        this.category = category;
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
        return "Name: "+ name +"\nID: "+ recipeID +"\nCategory: "+ category;
    }
}