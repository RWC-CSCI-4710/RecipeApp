package rwc.csci4710.recipeapp;

/* @author Jared Gibbons */

public class RealRecipe {

    public static void main(String[] args) {
        Recipe obj = new Recipe("Chicken", 4, "Entree");
        System.out.println(obj.toString());
        
        User user1 = new User("Jack", "jack@gmail.com", "Jack Smith", "AA11", "Redhawks#1");
        
        System.out.println(user1.getUserId());
    }
}
