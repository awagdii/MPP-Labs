package prob2;
import java.lang.Math;

final public class Circle implements Figure {
	
	final private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
