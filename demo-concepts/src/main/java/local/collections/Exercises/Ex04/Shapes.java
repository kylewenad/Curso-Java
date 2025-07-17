package local.collections.exercises.ex04;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    private List<IShape> shapesList = new ArrayList<>();
    double totalArea;

    void calculateTotalArea() { //Calcula el área de cada forma y las suma
        shapesList.forEach(shape -> totalArea += shape.calculateArea());
        
    }

    void showCalculatedArea() {
        shapesList.forEach(shape -> System.out.println(shape));//Muestra cada forma
        shapesList.forEach(shape -> System.out.printf("El área del %s es: %.2f%n",shape, shape.calculateArea())); //Muestra el área calculada de cada forma
        System.out.println("El area total es %.2f%n".formatted(totalArea));//Muestra la suma total de todas las áreas de las formas.
    }
    
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.shapesList.add(new Square(3));
        shape.shapesList.add(new Triangle(3, 6));
        shape.shapesList.add(new Square(4));
        shape.shapesList.add(new Triangle(2, 5));
        shape.shapesList.add(new Circle(5));
        shape.calculateTotalArea();
        shape.showCalculatedArea();
    }

   
}
