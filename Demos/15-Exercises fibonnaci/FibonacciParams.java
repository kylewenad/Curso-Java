import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciParams {
                
    private static List<Integer> calculateFibonacci(int limit) {
        int prev = 0, next = 1;
        List<Integer>serie = new ArrayList<>();
                    
        while (prev <= limit) {
            int temp = prev + next;
            prev = next;
            next = temp;
                        
            //next = next+ prev;
            //prev = next - prev;
            }
    }
    
    static void showFibonacci(int limit, List<Integer> serie) {
        for (int item : serie) {
            System.out.println(item);
        }
    }

    static int askLimit()  {
        String message = "Dime el número en el que quieres que pare la serie de Fibonnaci";
        Scanner scanner = new Scanner (System.in) {
        int limit = scanner.nextInt();
        System.out.printf(message);
        System.out.println("");
        }
    scanner.close();
    return limit;
    }

    static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        String[] messages = {
        "¿Quieres continuar (S/N)?",
        "Gracias por todo"
        }

        while(wantContinue) {
            int limit = askLimit();
            List<Integer> serie = calculateFibonacci();

            System.out.println(messages[0]);
            String answer = scanner.nextLine();
            if(
                answer.toLowerCase().equals("n") ||
                answer.toLowerCase().equals("no")
            ) {
                wantContinue = false;
            }
        }
        scanner.close();
        System.out.println(messages[1]);
    }

    }

    public static void main(String[] args) {
        askContinue();
        }    
    }
