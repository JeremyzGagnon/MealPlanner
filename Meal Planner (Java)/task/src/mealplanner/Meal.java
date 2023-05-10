package mealplanner;
import java.util.ArrayList;
import java.util.List;

public class Meal {

    private String type;
    private String name;
    private List<String> ingredientsList = new ArrayList<>();

    public Meal(String type, String name, String ingredient) {
        this.type = type;
        this.name = name;
        this.ingredientsList = setIngredients(ingredient);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<String> getIngredientsList() {
        return this.ingredientsList;
    }

    public List<String> setIngredients(String incredients) {
        String[] ingredientArray = incredients.split(",");
        List<String> ingredientsList = new ArrayList<>();
        for (String ingredient : ingredientArray) {
            ingredientsList.add(ingredient);
        }
        return ingredientsList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Category: " + this.type + "\n");
        sb.append("Name: " + this.name + "\n");
        sb.append("Ingredients: \n");
        for (String ingredient : ingredientsList) {
            sb.append(ingredient + "\n");
          }
        return sb.toString();
    }
}
