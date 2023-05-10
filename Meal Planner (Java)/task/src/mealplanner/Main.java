package mealplanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MealPlaner mealPlaner = new MealPlaner();

    System.out.println("What would you like to do (add, show, exit)?");
    String usersCommand = scanner.nextLine();
    while (!usersCommand.equals("exit")) {

      switch (usersCommand) {
        case "add":
          String mealType;
          System.out.println("Which meal do you want to add (breakfast, lunch, dinner)?");

          while (true) {
            mealType = scanner.nextLine();
            if (mealType.equals("breakfast") || mealType.equals("lunch") || mealType.equals("dinner")) {
              break;
            } else {
              System.out.println("Wrong meal category! Choose from: breakfast, lunch, dinner");
            }
          }

          System.out.println("Input the meal's name:");
          String mealName = scanner.nextLine();
          System.out.println("Input the ingredients:");
          String ingredients = scanner.nextLine();
          Meal usersMeal = new Meal(mealType, mealName, ingredients);
          mealPlaner.addMeal(usersMeal);
          System.out.println("The meal has been added!");
          break;
        case "show":
          if (mealPlaner.getMealList().isEmpty()) {
            System.out.println("No meals saved. Add a meal first.");
          } else {
            for (Meal meal : mealPlaner.getMealList()) {
              System.out.println(meal);
            }
          }
          break;
        default:
          break;
      }
      System.out.println("What would you like to do (add, show, exit)?");
      usersCommand = scanner.nextLine();
    }
    System.out.println("Bye!");

  }
}