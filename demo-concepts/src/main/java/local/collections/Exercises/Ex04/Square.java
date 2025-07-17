package local.collections.exercises.ex04;

public class Square implements IShape {
    
    double side;
    
    @Override
    public String toString() {
        return "Cuadrado [lado = " + side + "]";
    }
    

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
       double result = side*side;
    
    return result;
    }
}
