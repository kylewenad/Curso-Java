package local.collections.exercises.ex04;

public class Triangle implements IShape{

    double base;
    double high;
 
    public Triangle(double base, double high) {
        this.base = base;
        this.high = high;
    }

    @Override
    public double calculateArea() {
        double result = base*high/2.0;
        return result;
    }

}
