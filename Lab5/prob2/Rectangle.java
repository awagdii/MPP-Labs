package prob2;

final public class Rectangle implements Figure {

	final private double width;
	final private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		return width * height;
	}

}
