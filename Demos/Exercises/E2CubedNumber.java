public class E2CubedNumber {
    
    // Crea una función que imprima por consola el resultado de elevar al cubo un número dado como parámetro.

    static int cubed(int num){
        int result = num * num * num;
        System.out.printf("El cubo del número %s es " + result, num);
        return result;
    }

    public static void main(String[] args) {
        int num = 3;
        cubed(num);
        
    }
}
