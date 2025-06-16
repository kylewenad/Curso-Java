public class E3TriangleArea {
    
    static final int BASE = 5;
    static final int HEIGHT = 7;
    
    
    static int area(int b, int h) {
        int result = BASE * HEIGHT;
        System.out.printf("El área del triángulo de base %s y altura %s es " +  result, BASE, HEIGHT);
        return result;
    }
    
    public static void main(String[] args) {
        area(BASE, HEIGHT);
    }
    
}
