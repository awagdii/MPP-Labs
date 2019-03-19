package prob3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> stringList =new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("World");
        stringList.add("World");
        stringList.add("World");
        System.out.println(countWords(stringList,'H','W',4));
        System.out.println(countWords(stringList,'l','K',4));
    }

    public static int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream().filter(x -> x.length() > len).filter(x -> x.contains(c + "")).filter(x -> !x.contains(d + "")).count();
    }
}
