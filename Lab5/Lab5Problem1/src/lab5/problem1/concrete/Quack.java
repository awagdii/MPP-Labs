package lab5.problem1.concrete;

import lab5.problem1.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack Quack");
	} 

}
