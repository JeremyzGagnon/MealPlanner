package mealplanner;
import java.util.ArrayList;
import java.util.List;
public class MealPlaner {

    private List<Meal> mealList = new ArrayList<>();

    public void addMeal(Meal meal) {
        mealList.add(meal);
    }
    public List<Meal> getMealList() {
        return mealList;
    }

}
