package rwc.csci4710.recipeapp;

/**
 *
 * @author liberto_vincent
 * @author gbane_aboubakr
 */
public class RecipeManager {
    public static void addRecipe(User user, Recipe recipe) {
        // Add recipe to database...
     ArrayList<Recipe> receipe = new ArrayList<Recipe>();
        
        for(int i = 0; i < 3; i++)
        {
            Recipe r = new Recipe();
            if (i==0)
            {
                r.setTitle("Scrambled Eggs");
            }
            if (i==1)
            {
                r.setTitle("Steak Sandwich");
            }
            if (i==2)
            {
                r.setTitle("Cake");
            }
            receipe.add(r);
        }
    }
    public static void addIngredient() {
     ArrayList<Ingredient> ingredient = new ArrayList<Ingredient>();
        
        for(int i = 0; i < 3; i++)
        {
            Ingredient ri = new Ingredient();
            if (i==0)
            {
                ri.setAmount("2 Egg");
                ri.setiDescription("Break Egg");
            }
            if (i==1)
            {
                ri.setAmount("2 bread");
                ri.setiDescription("Toast the bread");
            }
            if (i==2)
            {
                ri.setAmount("1 Pound Bag");
                ri.setiDescription("Mix the batter");
            }
            ingredient.add(ri);
        }

    public void removeRecipe(User user, Recipe recipe) {
        // Remove recipe from database...
        
  
    }
    public void editRecipe(User user, Recipe recipe) {
        // edit  recipe in database... 
        
    }
}
