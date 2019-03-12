package prob3;

import prob3.concrete.*;

public class Main {

    public static void main(String[] args) {

        MallarDuck mallarDuck = new MallarDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();

        mallarDuck.quack();
        mallarDuck.fly();
        decoyDuck.quack();
        decoyDuck.fly();
        redHeadDuck.quack();
        redHeadDuck.fly();
        rubberDuck.quack();


    }

}
