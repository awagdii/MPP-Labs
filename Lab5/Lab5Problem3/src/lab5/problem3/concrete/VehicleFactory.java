package lab5.problem3.concrete;

import lab5.problem3.abstraction.Vehicle;

public class VehicleFactory {

	
	public static Vehicle getVehicle(String vehicleType){
		
	  if(vehicleType.equals("Bus")){
		  return new Bus();
	  }else if(vehicleType.equals("Car")){
		  return new Car();
	  }else if(vehicleType.equals("ElectricCar")){
		  return new ElectricCar();
	  }else if (vehicleType.equals("Trunck")){
		  return new Truck();
	  }
		return null;
	}
	
}
