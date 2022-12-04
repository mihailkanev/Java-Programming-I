import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {

    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }

    public void readFile(String fileName) {
        
        try (Scanner inputFile = new Scanner(Paths.get(fileName))) {

            while (inputFile.hasNextLine()) {

                String recipeName = inputFile.nextLine();
                int cookingTime = Integer.valueOf(inputFile.nextLine());

                // Initialize recipe
                Recipe recipe = new Recipe(recipeName, cookingTime);

                // Fetch ingredients
                while (inputFile.hasNextLine()) {
                    
                    String ingredient = inputFile.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredients(ingredient);
                }

                this.recipes.add(recipe);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void searchName(String recipeHint) {

        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(recipeHint)) {
                System.out.println(recipe);
            }
        }
    }

    public void searchCookingTime(int maxTime) {

        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }

    public void searchIngredient(String ingredient) {
        
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {

            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }   
        }
    }

    public void printRecipes() {

        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
}