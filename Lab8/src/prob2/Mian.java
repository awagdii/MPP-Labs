package prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Mian {


    private static List<Product> products;

    public static void main(String[] args) {

        //A
        System.out.println("------------------- Problem 2 Part A ------------------");
        initProductsList();
        Collections.sort(products, new PriceComparator());
        System.out.println(products);
        //B
        System.out.println("------------------- Problem 2 Part B ------------------");
        initProductsList();
        Collections.sort(products, new TitleComparator());
        System.out.println(products);

        //C
        System.out.println("------------------- Problem 2 Part C ------------------");
        System.out.println("Sorting by price");
        initProductsList();
        Product.sort(products, Product.SortingMethod.PRICE);
        products.forEach(System.out::println);
        System.out.println("Sorting by title");
        initProductsList();
        Product.sort(products, Product.SortingMethod.TITLE);
        products.forEach(System.out::println);
        //D
        System.out.println("------------------- Problem 2 Part D ------------------");
        initProductsList();
        Collections.sort(products, (x, y) -> x.getTitle().compareTo(y.getTitle()));


    }

    private static void initProductsList() {
        products = new ArrayList<>();
        Collections.addAll(products, new Product("BMW", 20000.0, 200), new Product("Toyota", 2020.0, 200),
                new Product("Ford", 3000.0, 200), new Product("Mazda", 5000.0, 200));
    }
}
