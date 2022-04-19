package sweng.realrecipe;

public class Recipe {
    String name;
    int recipeId;
    String category;
    
    public Recipe(String inName, int inId, String inCat){
        name = inName;
        recipeId = inId;
        category = inCat;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return recipeId;
    }
    
    public String getCat(){
        return category;
    }
    
    public String toString(){
        return "Name: "+ name +"\nID: "+ recipeId +"\nCategory: "+ category;
    }
}