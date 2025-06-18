import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    
    //los arrays tiene las dimensiones LIMITADAS desde el principio
    //por lo tanto utilizamos una lista
    //Lista: un array limitado
    // for te da el limite de vueltas
    //while con el centinela no necesitas saber el numero de vueltas
     //sino que vigila hasta donde tiene que llegar

    private static List<Integer> serie;
    private static int limit;
                
    private static void calculateFibonacci() {
        int prev = 0, next = 1;
        Fibonacci.serie = new ArrayList<>();
                    
        while (prev <= Fibonacci.limit) {
            Fibonacci.serie.add(prev);
            int temp = prev + next;
            prev = next;
            next = temp;
                        
            //next = next+ prev;
            //prev = next - prev;
            }
    }
    
    static void showFibonacci() {
        String message = "Sucesión de Fibonacci (hasta %s):\n";
        System.out.printf(message, Fibonacci.limit);
        for (int item : Fibonacci.serie) {
            System.out.println(item);
        }
    }

    static void askLimit() {
        String message = "Dime el número en el que quieres que pare la serie de Fibonnaci";
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        Fibonacci.limit = scanner.nextInt();
        //scanner.close();
    }

    static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        String[] messages = {
        "¿Quieres continuar (S/N)?",
        "Gracias por todo"
        };

        while(wantContinue) {
            askLimit();
            calculateFibonacci();
            showFibonacci();

            System.out.printf(messages[0]);
            String answer = scanner.nextLine();
            if(
                answer.toLowerCase().equals("n") ||
                answer.toLowerCase().equals("no")
            ) {
                wantContinue = false;
            }
        }
        scanner.close();
        System.out.printf(messages[1]);
    }


    public static void main(String[] args) {
        askContinue();
    }
}
