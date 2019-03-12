package prob2;

public class Ellipse implements ClosedCurve{
    double a;
    double e;

    public Ellipse(double a, double e) {
        this.a = a;
        this.e = e;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    @Override
    public double computePerimeter() {
        return 4*a*e;
    }
}
