package Recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeFinder {
    private List<Recipe> cookingRecipes;
    private List<Recipe> bakingRecipes;
    private List<Ingredient> allIngredients;
    private Scanner scanner;

    public RecipeFinder() {
        cookingRecipes = new ArrayList<>();
        bakingRecipes = new ArrayList<>();
        allIngredients = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addIngredient(String name, String type, String measurement) {
        allIngredients.add(new Ingredient(name, type, measurement));
    }

    public void addCookingRecipe(String name, List<String> ingredientNames) {
        List<Ingredient> recipeIngredients = getIngredientsFromNames(ingredientNames);
        cookingRecipes.add(new Recipe(name, recipeIngredients));
    }

    public void addBakingRecipe(String name, List<String> ingredientNames) {
        List<Ingredient> recipeIngredients = getIngredientsFromNames(ingredientNames);
        bakingRecipes.add(new Recipe(name, recipeIngredients));
    }

    private List<Ingredient> getIngredientsFromNames(List<String> ingredientNames) {
        List<Ingredient> recipeIngredients = new ArrayList<>();
        for (String ingredientName : ingredientNames) {
            for (Ingredient ingredient : allIngredients) {
                if (ingredient.getName().equalsIgnoreCase(ingredientName)) {
                    recipeIngredients.add(ingredient);
                    break;
                }
            }
        }
        return recipeIngredients;
    }

    public void start() {
        System.out.println("\n*** Hello are you looking for recipes? You are in the right place. ***\n");
        while (true) {
            System.out.println("Wanna Bake or Cook:\nNeed Help? Enter 'Help'");

            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("quit")) {
                System.out.println("Off");
                break;
            }
            switch (choice) {
                case "bake":
                    processBaking();
                    break;
                case "cook":
                    processCooking();
                    break;
                case "help":
                    helpCommand();
                    continue;
                default:
                    System.out.println("Invalid choice. Please enter 'bake', 'cook', or 'quit'.");
            }
        }
    }

    private void processBaking() {
        System.out.println("What are you baking? (Enter 'cake', 'scones', or 'cupcakes'):");
        String bakingItem = scanner.nextLine().trim().toLowerCase();
        switch (bakingItem) {
            case "cake":
            case "scones":
            case "cupcakes":
                displayRecipe(bakingItem, bakingRecipes);
                break;
            default:
                System.out.println("Invalid choice. Please enter 'cake', 'scones', or 'cupcakes'.");
                processBaking();
                break;
        }
        promptContinue();
    }

    private void helpCommand() {
        System.out.println("\nAvailable Menus:");
        System.out.println("* Cooking");
        System.out.println("  - Available dishes: " + getRecipeNames(cookingRecipes));
        System.out.println("* Baking");
        System.out.println("  - Available scones: scones");
        System.out.println("  - Available cakes: cake");
        System.out.println("  - Available cupcakes: choc cupcakes\n");
    }

    private String getRecipeNames(List<Recipe> recipes) {
        StringBuilder recipeNames = new StringBuilder();
        for (Recipe recipe : recipes) {
            recipeNames.append(recipe.getName()).append(", ");
        }
        if (recipeNames.length() > 2) {
            recipeNames.setLength(recipeNames.length() - 2); // Remove the trailing comma and space
        }
        return recipeNames.toString();
    }

    private void processCooking() {
        System.out.println("What do you want to cook?");
        String dish = scanner.nextLine().trim();
        displayRecipe(dish, cookingRecipes);
        promptContinue();
    }

    private void displayRecipe(String dish, List<Recipe> recipes) {
        Recipe recipe = findRecipe(dish, recipes);
        if (recipe != null) {
            System.out.println("To " + (recipes == bakingRecipes ? "bake " : "cook ") + dish + ", you need the following ingredients:");
            for (Ingredient ingredient : recipe.getIngredients()) {
                System.out.println("* " + ingredient.getMeasurement() + " " + ingredient.getName());
            }
        } else {
            System.out.println("Recipe not found for " + dish);
        }
    }

    private Recipe findRecipe(String dish, List<Recipe> recipes) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().equalsIgnoreCase(dish)) {
                return recipe;
            }
        }
        return null;
    }

    private void promptContinue() {
        System.out.println("Do you need anything else? (yes to continue, no to quit): ");
        String response = scanner.nextLine().trim().toLowerCase();
        if (response.equals("no")) {
            System.out.println("Thank you...");
            System.exit(0);
        }
    }
}
