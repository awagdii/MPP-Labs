package prob9;

import java.util.Optional;

import static prob9.Dish.menu;

public class Main {

    public static void main(String[] args) {
        System.out.println(isThereAnyVegetarianMeal());
        System.out.println(isThereAnyHealthyMeal());
        System.out.println(isThereAnyUnHealthyMeal());
        System.out.println(findFirstMeatItem());
        System.out.println(calculateTotalCaloriesWithLamda());
        System.out.println(calculateTotalCaloriesWithMethodRefrance());

    }

    private static boolean isThereAnyVegetarianMeal() {
        return menu.stream().anyMatch(Dish::isVegetarian);
    }

    private static boolean isThereAnyHealthyMeal() {
        return menu.stream().anyMatch(x -> x.getCalories() < 1000);
    }

    private static boolean isThereAnyUnHealthyMeal() {
        return menu.stream().anyMatch(x -> x.getCalories() > 1000);
    }

    private static Optional<Dish> findFirstMeatItem() {
        return menu.stream().filter(x -> x.getType() == Dish.Type.MEAT).findFirst();
    }

    private static int calculateTotalCaloriesWithLamda() {
        return menu.stream().map(Dish::getCalories).reduce(0, (x, y) -> x + y);
    }

    private static int calculateTotalCaloriesWithMethodRefrance() {
        return menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
    }
}
