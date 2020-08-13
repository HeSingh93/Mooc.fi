
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }

    }

    public void clearMenu() {
        meals.clear();
    }
}
