import java.util.Random;

public class E4Random {
    //Crea una función que imprima por consola un número al azar entre 0 y 10.

    public static void main(String[] args) {
        Random randomMaker = new Random();
        int random = randomMaker.nextInt(9 + 1);
        System.out.println(random);
    }

}
