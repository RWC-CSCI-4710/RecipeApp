package rwc.csci4710.recipeapp;

/**
 *
 * @author mattx
 */
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