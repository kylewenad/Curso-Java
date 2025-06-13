import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        double random = Math.random();
        Math.random();
        //Primera forma de hacerlo:
        //para devolvernos un valor pseudoaleatorio entre el 0 y 1
        System.out.println(random);

        Random randomMaker = new Random();
        //Segunda forma:
        //randomMaker -> Para que devuelva un números con los valores que queramos
        //ej con números enteros
        int random2 = randomMaker.nextInt(9) + 1;
        System.out.println(random2);
    }
}
