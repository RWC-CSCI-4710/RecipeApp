package rwc.csci4710.recipeapp;

/**
 * Ingredient.java
 * 
 * @author Matt Wurl
 */
public class Ingredient {
    private String name;
    private int quantity;
    private String measurementUnit;
    
    public Ingredient(String name, int quantity, String measurementUnit) {
        this.name = name;
        this.quantity = quantity;
        this.measurementUnit = measurementUnit;
    }
    
    @Override
    public String toString() {
        return (quantity + " " + measurementUnit + " of " + name);
    }
}
