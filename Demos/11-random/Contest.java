import java.util.Random;
import java.util.Scanner;

public class Contest {
    static int guessNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Adivina el número del 1 al 10");
    int number = scanner.nextInt();
    System.out.println("");
    scanner.close();
    return number;
    }


    public static void main(String[] args) {
        
        int number = guessNumber();
        
        Random randomMaker = new Random();
        //randomMaker -> Para que devuelva un número
        int random1 = randomMaker.nextInt(9) + 1;
        
        System.out.printf("No lo has adivinado, el número era %s, prueba otra vez.", random1);
    

        if(number == random1) {
            System.out.printf("¡Enhorabuena, has adivinado el número! El número era %s", random1);
            return;
        }
    }

}

