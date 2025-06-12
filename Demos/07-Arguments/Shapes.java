

public class Shapes {
      // Sobrecarga de funciones (Overload)

    public static double calculateAreaOfSquare (double side) {
        //Para calcular el área de un cuadrado
        return side * side;
    }

     public static double calculateAreaOfRectangle (double base, double height) {
        return base * height;
    }

    public static double calculateAreaOfTriangle (double base, double height, boolean isTriangle) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        System.out.printf("El área del cuadrado es %s\n", calculateAreaOfSquare(3));
        System.out.printf("El área del rectángulo es %s\n", calculateAreaOfRectangle(2, 5));
        System.out.printf("El área del triángulo es %s\n", calculateAreaOfTriangle(2, 5, true));

    
    }

}
    

