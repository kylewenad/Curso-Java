import java.util.Random;

public class E5EvenOdds {
//Crea una función que reciba un número como parámetro e imprima por consola si el número dado es par o impar.

    static int Random(){
        Random randomMaker = new Random();
        int random = randomMaker.nextInt(9 + 1);
        System.out.println(random);
        int result = random;
        return result;
    }

    static boolean isEven(int random) {
        if (random % 2 == 0) {
            return true;
        }
        return false;
    }

    static void showInfoNumber(int random){
        
        String message = isEven(random) 
            ? "%s es PAR"
            : "%s es IMPAR";
            System.out.printf(message, random);
    }
    
    public static void main(String[] args) {
        int random = Random ();
        showInfoNumber(random);
        
    }
}