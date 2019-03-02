package lab5.problem1.concrete;

import lab5.problem1.abstractclasses.Duck;
import lab5.problem1.interfaces.FlyBehaviour;
import lab5.problem1.interfaces.QuackBehavior;

public class MallarDuck extends Duck {

	public MallarDuck(FlyBehaviour fly,QuackBehavior quack) {
		setFlyBehaviour(fly);
		setQuackBehavior(quack);
	}
	 
	@Override
	public void display() {
		// TODO Auto-generated method stub
	    System.out.println("display");
	}

}
