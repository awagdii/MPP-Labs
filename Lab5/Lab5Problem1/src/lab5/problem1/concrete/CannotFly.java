package lab5.problem1.concrete;

import lab5.problem1.interfaces.FlyBehaviour;

public class CannotFly implements FlyBehaviour {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Can not Fly");
	}

}
