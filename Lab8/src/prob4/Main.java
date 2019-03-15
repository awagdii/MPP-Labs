package prob4;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<Double> methodReferanceSupplier = Math::random;
        System.out.println("Method Refrence Supplier :  " + methodReferanceSupplier.get());
        Supplier<Double> lamdaSupplier = () -> Math.random();
        System.out.println("LamdaSupplier :  " + lamdaSupplier.get());

        class MySupplier implements Supplier<Double> {
            @Override
            public Double get() {
                return Math.random();
            }
        }
        MySupplier rc = new MySupplier();
        Double result = rc.get();
        System.out.println("My Supplier: " + result);

    }
}
