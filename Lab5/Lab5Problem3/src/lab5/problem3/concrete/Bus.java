package lab5.problem3.concrete;

import lab5.problem3.abstraction.Vehicle;

class Bus implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Iam a Bus");
	}

}
