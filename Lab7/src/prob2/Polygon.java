package prob2;

public interface Polygon extends ClosedCurve {

    double[] getSides();

    default double computePerimeter() {
        double[] lengths = getSides();
        double result = 0;
        for (int i = 0; i < lengths.length; i++) {
            result += lengths[i];
        }
        return result;
    }
}
