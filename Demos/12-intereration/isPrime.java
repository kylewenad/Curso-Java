import java.util.Scanner;

public class isPrime {
    
    private static int getNumberByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número entero");
        int number = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return number;
    }
    
    public static boolean isPrime(int number) {
        System.out.println("El número %s es ");
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
            
        }
        return true;
    }
        public static void main(String[] args) {
        int number = getNumberByScanner();
        String message = isPrime(number);
            ? "%s SI es primo"
            ? "%s No es primo";
        System.out.println(message, number);
        
    }
    
}




