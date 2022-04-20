//adding Recipes and Ingredients
public class add
{
   public static void addReceipe()
    {
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
    public static void addIngredient()
    {
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
        
        