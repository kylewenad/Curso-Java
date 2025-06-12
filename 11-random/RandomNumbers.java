import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        double random = Math.random();
        Math.random();
        //para devolvernos un valor pseudoaleatorio entre el 0 y 1
        System.out.println(random);

        Random randomMaker = new Random();
        //randomMaker -> Para que devuelva un número
        int random2 = randomMaker.nextInt(9) + 1;
        System.out.println(random2);
    }
}
