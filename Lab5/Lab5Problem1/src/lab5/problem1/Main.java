package lab5.problem1;

import lab5.problem1.abstractclasses.Duck;
import lab5.problem1.concrete.CannotFly;
import lab5.problem1.concrete.DecoyDuck;
import lab5.problem1.concrete.FlyWithWings;
import lab5.problem1.concrete.MallarDuck;
import lab5.problem1.concrete.MuteQuack;
import lab5.problem1.concrete.Quack;
import lab5.problem1.concrete.RedHeadDuck;
import lab5.problem1.concrete.RubberDuck;
import lab5.problem1.concrete.Squeak;

public class Main {

	
	public static void main(String[] args) {
		Duck[] ducks={
				new MallarDuck(new FlyWithWings(), new Quack()),
				new DecoyDuck(new CannotFly(), new MuteQuack()),
				new RedHeadDuck(new FlyWithWings(), new Quack()),
				new RubberDuck(new CannotFly(), new Squeak()),
				};
		for(Duck d:ducks){
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.getFlyBehaviour().fly();
			d.getQuackBehavior().quack();
			d.swim();
			
		}
	}
}
