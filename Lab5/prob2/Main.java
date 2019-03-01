package prob2;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Figure t = new Triangle(2.5, 1.6);
		Figure r = new Rectangle(10, 20);
		Figure c = new Circle(4);
		List<Figure> list = Arrays.asList(t, r, c);
		double sumArea = 0;
		for (Figure figure : list) {
			sumArea += figure.computeArea();
		}
		System.out.println("Sum of Areas = " + sumArea);
	}
}
