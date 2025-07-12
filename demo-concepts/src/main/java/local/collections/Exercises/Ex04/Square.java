package local.collections.Exercises.Ex04;

public class Square implements IShape {
    
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
       double result = side*side;
    
    return result;
    }
}
