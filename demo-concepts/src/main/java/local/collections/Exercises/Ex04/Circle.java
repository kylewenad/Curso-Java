package local.collections.exercises.ex04;

public class Circle implements IShape{
    
    double radio;
    
    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        double result = radio * radio * Math.PI;
        return result;
    }
}
