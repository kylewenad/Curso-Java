public class E1MultiplyExercise {

    //Crea una función que, al ser llamada,
    //imprima por consola el resultado de
    //la multiplicación de dos números introducidos como parámetros.
    static final int NUM1 = 5;
    static final int NUM2 = 7;

    static int multiply(int num1, int num22) {
        int result = NUM1 * NUM2;
        System.out.printf("El resultado de la multiplicación %s * %s es " + result, NUM1, NUM2);
        return result;
    }
    
    public static void main(String[] args) {
        multiply(NUM1, NUM2);
    }
}