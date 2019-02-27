
public class Condo implements Property {
	
	private int numOfFloors;
	private Address address;

	Condo(int floors) {
		setNumOfFloors(floors);
	}
	
	@Override
	public double computeRent() {
		return 400 * this.getNumOfFloors();
	}

	@Override
	public String getCity() {
		return this.getAddress().getCity();
	}

	public int getNumOfFloors() {
		return numOfFloors;
	}

	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
