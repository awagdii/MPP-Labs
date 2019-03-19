package prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Integer> myIntStream = Stream.of(1, 2, 3);

        IntSummaryStatistics stats = myIntStream
                .collect(Collectors.summarizingInt(Integer::intValue));

        int min = stats.getMin();
        int max = stats.getMax();
        System.out.println("Max Value is = " + max);
        System.out.println("Min Value is = " + min);
    }
}
