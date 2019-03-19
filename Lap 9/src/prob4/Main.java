package prob4;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String [] args){
        printSquares(4);
    }

    public static void printSquares(int num){
        IntStream.iterate(1,x->x+1).map(x->x*x).limit(num).forEach(System.out::println);

        //Another way
        IntStream.range(1,num+1).map(x->x*x).forEach(System.out::println);
    }
}
