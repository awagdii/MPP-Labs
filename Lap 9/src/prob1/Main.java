package prob1;

import java.util.stream.Stream;

public class Main {

    public static void main(String [] args){
        Stream.of("Bill", "Thomas", "Mary").map(x->x+',').forEach(System.out::print);
    }
}
