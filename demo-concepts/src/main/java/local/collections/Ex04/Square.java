package local.collections.Ex04;

public class Square implements IShape {
    
    double side;

    
    public Square(double side) {
        this.side = side;
    }
        double result = side*side;
        System.out.println(result);
        return result;
    }


    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateArea'");
    }
    
}
