import Recipe.RecipeFinder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        RecipeFinder finder = new RecipeFinder();

        // Add ingredients
        finder.addIngredient("pasta", "Grain", "1 pound");
        finder.addIngredient("tomato sauce", "Condiment", "2 cups");
        finder.addIngredient("cheese", "Dairy", "1 cup grated");
        finder.addIngredient("lettuce", "Vegetable", "1 head");
        finder.addIngredient("tomato", "Vegetable", "2 medium");
        finder.addIngredient("cucumber", "Vegetable", "1 large");
        finder.addIngredient("dressing", "Condiment", "1/2 cup");
        finder.addIngredient("flour", "Baking", "1 ⅓ cups");
        finder.addIngredient("cocoa powder", "Baking", "¾ cup unsweetened");
        finder.addIngredient("baking powder", "Baking", "2 teaspoons");
        finder.addIngredient("baking soda", "Baking", "¼ teaspoon");
        finder.addIngredient("salt", "Baking", "⅛ teaspoon");
        finder.addIngredient("sugar", "Baking", "1 ½ cups white");
        finder.addIngredient("butter", "Dairy", "3 tablespoons softened");
        finder.addIngredient("eggs", "Baking", "2 large");
        finder.addIngredient("vanilla extract", "Baking", "¾ teaspoon");
        finder.addIngredient("milk", "Dairy", "1 cup");
        finder.addIngredient("buttermilk", "Dairy", "1 ¼ cups");
        finder.addIngredient("melted butter", "Dairy", "⅓ cup");
        finder.addIngredient("cooking spray", "Misc", "as needed");
        finder.addIngredient("all-purpose flour", "Baking", "2 ⅔ cups");
        finder.addIngredient("white sugar", "Baking", "1 cup");
        finder.addIngredient("baking powder", "Baking", "1 tablespoon");
        finder.addIngredient("vanilla extract", "Baking", "1 tablespoon");
        finder.addIngredient("salt", "Baking", "2 pinches");
        finder.addIngredient("eggs", "Baking", "3 large");
        finder.addIngredient("milk", "Dairy", "¾ cup");
        finder.addIngredient("vegetable oil", "Oil", "¾ cup");

        // Add new ingredients
        finder.addIngredient("olive oil", "Oil", "3 tablespoons");
        finder.addIngredient("onion", "Vegetable", "1 small, chopped");
        finder.addIngredient("garlic", "Spice", "2 cloves, minced");
        finder.addIngredient("curry powder", "Spice", "3 tablespoons");
        finder.addIngredient("cinnamon", "Spice", "1 teaspoon");
        finder.addIngredient("paprika", "Spice", "1 teaspoon");
        finder.addIngredient("bay leaf", "Herb", "1");
        finder.addIngredient("ginger root", "Spice", "½ teaspoon grated fresh");
        finder.addIngredient("sugar", "Spice", "½ teaspoon white");
        finder.addIngredient("chicken breast", "Meat", "2 skinless, boneless halves - cut into bite-size pieces");
        finder.addIngredient("tomato paste", "Condiment", "1 tablespoon");
        finder.addIngredient("yogurt", "Dairy", "1 cup plain");
        finder.addIngredient("coconut milk", "Dairy", "¾ cup");
        finder.addIngredient("lemon", "Fruit", "½, juiced");
        finder.addIngredient("cayenne pepper", "Spice", "½ teaspoon");
        finder.addIngredient("celery", "Vegetable", "1 cup chopped");
        finder.addIngredient("beef bouillon", "Condiment", "2 cubes");
        finder.addIngredient("water", "Liquid", "10 cups");
        finder.addIngredient("peppercorns", "Spice", "6 whole black");
        finder.addIngredient("canola oil", "Oil", "¼ cup");
        finder.addIngredient("beef oxtail", "Meat", "3 pounds, cut into pieces");
        finder.addIngredient("onion", "Vegetable", "1 large, chopped");
        finder.addIngredient("kidney beans", "Bean", "1 (12 ounce) can, drained");
        finder.addIngredient("cornstarch", "Thickener", "¼ cup dissolved in ½ cup water");
        finder.addIngredient("beef stew meat", "Meat", "2 pounds, cut into cubes");
        finder.addIngredient("butter", "Dairy", "¼ cup");
        finder.addIngredient("seasoned salt", "Spice", "1 teaspoon");
        finder.addIngredient("beef broth", "Liquid", "8 cups, divided");
        finder.addIngredient("carrots", "Vegetable", "6 cups sliced");
        finder.addIngredient("potatoes", "Vegetable", "6 cups diced");
        finder.addIngredient("balsamic vinegar", "Condiment", "2 tablespoons");
        finder.addIngredient("Worcestershire sauce", "Condiment", "1 tablespoon");
        finder.addIngredient("parsley", "Herb", "1 teaspoon dried");
        finder.addIngredient("basil", "Herb", "1 teaspoon dried");
        finder.addIngredient("garlic powder", "Spice", "½ teaspoon");

        // Add cooking recipes
        finder.addCookingRecipe("Pasta", List.of("pasta", "tomato sauce", "cheese\n"));
        finder.addCookingRecipe("Salad", List.of("lettuce", "tomato", "cucumber", "dressing\n"));
        finder.addCookingRecipe("Indian Chicken Curry", List.of("olive oil", "onion", "garlic", "curry powder", "cinnamon", "paprika", "bay leaf", "ginger root", "sugar", "salt", "chicken breast", "tomato paste", "yogurt", "coconut milk", "lemon", "cayenne pepper\n"));
        finder.addCookingRecipe("Oxtail Curry", List.of("celery", "garlic", "tomato paste", "beef bouillon", "water", "peppercorns", "bay leaf", "canola oil", "beef oxtail", "onion", "salt", "pepper", "kidney beans", "cornstarch\n"));
        finder.addCookingRecipe("Beef Stew", List.of("beef stew meat", "flour", "butter", "olive oil", "seasoned salt", "onion", "beef broth", "carrots", "potatoes", "celery", "balsamic vinegar", "Worcestershire sauce", "parsley", "basil", "paprika", "garlic powder\n"));

        // Add baking recipes
        finder.addBakingRecipe("chocolate cupcakes", List.of("flour", "cocoa powder", "baking powder", "baking soda", "salt", "sugar", "butter", "eggs", "vanilla extract", "milk\n"));
        finder.addBakingRecipe("scones", List.of("flour", "baking powder", "salt", "buttermilk", "melted butter\n"));
        finder.addBakingRecipe("cake", List.of("cooking spray", "all-purpose flour", "white sugar", "baking powder", "vanilla extract", "salt", "eggs", "milk", "vegetable oil\n"));

        finder.start();
    }
}
