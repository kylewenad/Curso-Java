import java.util.ArrayList;
import java.util.List;

public class PrimeList {
    
    //hardcodear poner un dato sin escribir la variable
    // ej suma() espero que sume, pero no le he dado el dato
    // cuando le añado los datos suma(6, 9) sería hardcodear
    //suma(a, b), int a = 3, int b = 3
    //a y b serían las variabales creadas para en un
    //futuro si quiero cambiar el dato no afecte a la suma
    
    private static void showPrimes(List<Integer> numbers) {
        for (int item : numbers) {
            System.out.println(item);
        }
        //for (int i = 0; i < numbers.size(); i++) {
          //  System.out.println(numbers.get(i));
        //}
       }
    private static List<Integer> calculatePrimes(int number)  {
        List<Integer> result = new ArrayList<Integer>();
        //ArrayList tipo de lista?
        for (int i = 1; i < number; i++) {
            if (Primes.isPrime(i)) {
                result.add(i);
                }   
            }
            return result;
        }
    public static void main(String[] args) {
            String message = "Dime un número grande para calcular todos los primos que haya por debajo.";
            int number = Primes.getNumberByScanner(message);
            //showPrimes(number);
            List<Integer> numbers = calculatePrimes(number);
            showPrimes(numbers); 
            }
    
}



