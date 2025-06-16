import java.util.Scanner;

public class Primes {
    
    public static int getNumberByScanner(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int number = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return number;
    }
    
    public static boolean isPrime(int number) {
        //necesito que me des un entero y te devuelvo un boolean
        //"number" como cambiar el agua de un vaso a una jarra

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
            
        }
        return true;
    }

    private static void showInfo(int number) {
        //show suele ir con void, que no devuelve nada
        String C
        

    }

    public static void main(String[] args) {
        //opcion 1
        //int number = getNumberByScanner();
        //showInfo(number);
        //intermediario
        //opcion 2
        String message = "Dime un número entero para saber si es primo";
        int number = getNumberByScanner(message);
        showInfo(number);
    }
    
}




