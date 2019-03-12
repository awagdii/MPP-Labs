package prob2;

public class EquilateralTriangle implements Polygon {

    double length;

    public EquilateralTriangle(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double[] getSides() {
        return new double[]{length, length, length};
    }
}
