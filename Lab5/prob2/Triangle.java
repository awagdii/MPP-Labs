package prob2;

final public class Triangle implements Figure {
	
	final private double base;
	final private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		return 1 / 2 * base * height;
	}

}
