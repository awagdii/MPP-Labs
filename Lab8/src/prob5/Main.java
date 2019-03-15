package prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
        fruits.stream().forEach(x->System.out.println(x));
        fruits.stream().forEach(System.out::println);

    }
}
