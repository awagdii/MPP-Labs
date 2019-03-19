package prob6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();

        set1.add("A");
        set1.add("B");
        set2.add("D");
        set3.add("1");
        set3.add("2");
        set3.add("3");
        List<Set<String>> list = new ArrayList<>();
        list.add(set1);
        list.add(set2);
        list.add(set3);

        System.out.println(union(list));
    }

    public static Set<String> union(List<Set<String>> sets) {
        sets.stream().reduce((x,y) -> x);
//        return sets.stream().reduce((x,y) -> {y.addAll(x.stream().collect(Collectors.toSet())); return y;}).get();
        return sets.stream().reduce((x, y) -> {x.addAll(y); return x;}).get();
    }
}
