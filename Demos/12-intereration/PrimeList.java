import java.util.Scanner;

public class PrimeList {
    
    private static int getNumberByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número grande para calcular todos los primos que haya por debajo.");
        int number = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return number;
    }
    
    private static boolean primesAre(int number) {
       
        for (int i = 1; i < number; i++) {
            if (i % i == 0);
            int result = i % i;
            return true;    
        }  
        return false;
    }
    private static void showPrimes(int number) {
       for (int i = 1; i < number; i++) {
        if (PrimeList.isPrime(i)) {
            System.out.println(i);

    }
     private static List<Integer> calculatePrimes(int number)  {
        List<Integer> result = new ArrayList<Integer>();
        for

     }
        public static void main(String[] args) {
            int number = getNumberByScanner();
            showPrimes(number);
      
    }
    
}




