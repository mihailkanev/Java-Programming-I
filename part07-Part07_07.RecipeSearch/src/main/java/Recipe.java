import java.util.ArrayList;


public class Recipe {
    
    private String recipeName;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String recipeName, int cookingTime) {
        
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredients(String ingredients) {
        this.ingredients.add(ingredients);
    }

    public String getName() {
        return this.recipeName;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients() {  
        return this.ingredients;
    }

    @Override
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookingTime;
    }
}