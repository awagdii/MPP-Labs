package lab3.prob4;

public class House implements Property {

	private double lotSize;
	private Address address;
	
	House(double size) {
		setLotSize(size);
	}
	
	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return 0.1 * getLotSize();
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return this.getAddress().getCity();
	}

	public double getLotSize() {
		return lotSize;
	}

	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
