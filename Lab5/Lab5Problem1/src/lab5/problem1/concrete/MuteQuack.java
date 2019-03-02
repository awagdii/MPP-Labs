package lab5.problem1.concrete;

import lab5.problem1.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	
	
	@Override
	public void quack() {
		
		System.out.println("Mute Quack");	
	}

}
