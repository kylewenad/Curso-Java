import java.util.Scanner;

public class AskUser {

    static void ask() {
        //función para preguntar
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        while(wantContinue) {

            // cualquier función

            System.out.println("¿Quieres continuar (S/N)?");
            String answer = scanner.nextLine();
            if(
                answer.toLowerCase().equals("n") ||
                answer.toLowerCase().equals("no")
            ) {
                wantContinue = false;
            }
        }
        scanner.close();
        System.out.println("Gracias por todo");
    }

    static void ask2() {
        Scanner scanner = new Scanner(System.in);
        String answer = "S";

        while( !answer.toLowerCase().equals("n") &&
                !answer.toLowerCase().equals("no")) {

            // cualquier función

            System.out.println("¿Quieres continuar (S/N)?");
            answer = scanner.nextLine();
        }

        scanner.close();
        System.out.println("Gracias por todo");
    }
    public static void main(String[] args) {
       //ask();
       //ask2();
    }

    
}

