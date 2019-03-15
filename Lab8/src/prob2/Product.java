package prob2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {
    enum SortingMethod {
        TITLE,
        PRICE
    }

    final String title;
    final double price;
    final int model;
    static SortingMethod sortingMethod;


    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getModel() {
        return model;
    }

    public Product(String title, Double price, int model) {
        this.title = title;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("\n %s : %s : %s", title, price, model);
    }

    public static void sort(List<Product> products, final SortingMethod method) {
        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product e1, Product e2) {
                if (method == SortingMethod.TITLE) {
                    return e1.title.compareTo(e2.title);
                } else {
                    if (e1.price == e2.price) return 0;
                    else if (e1.price < e2.price) return -1;
                    else return 1;
                }
            }
        }
        Collections.sort(products, new ProductComparator());
    }
}
