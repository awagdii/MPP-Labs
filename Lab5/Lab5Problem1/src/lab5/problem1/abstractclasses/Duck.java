package lab5.problem1.abstractclasses;

import lab5.problem1.interfaces.FlyBehaviour;
import lab5.problem1.interfaces.QuackBehavior;

public abstract class Duck {

	private FlyBehaviour flyBehaviour;
	private QuackBehavior quackBehavior;
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void swim() {
		System.out.println("I'm Swimming");
	}
	
	
	abstract public void display();
}
