package prob6;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
        Arrays.sort(names, String::compareToIgnoreCase);
        Arrays.asList(names).forEach(System.out::println);
    }
}
