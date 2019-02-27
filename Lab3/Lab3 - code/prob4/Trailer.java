package lab3.prob4;

public class Trailer implements Property {

	private Address park;
	
	@Override
	public double computeRent() {
		return 500;
	}

	@Override
	public String getCity() {
		return this.getPark().getCity();
	}

	public Address getPark() {
		return park;
	}

	public void setPark(Address park) {
		this.park = park;
	}

}
