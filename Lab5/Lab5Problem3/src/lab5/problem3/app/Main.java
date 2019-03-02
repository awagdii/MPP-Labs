package lab5.problem3.app;

import lab5.problem3.abstraction.Vehicle;
import lab5.problem3.concrete.VehicleFactory;

public class Main {
	public static void main(String[] args) {
	
		Vehicle v1=VehicleFactory.getVehicle("Bus");
		Vehicle v2=VehicleFactory.getVehicle("Car");
		Vehicle v3=VehicleFactory.getVehicle("ElectricCar");
		Vehicle v4=VehicleFactory.getVehicle("Trunck");
		
		v1.startEngine();
		v2.startEngine();
		v3.startEngine();
		v4.startEngine();

	}
}
