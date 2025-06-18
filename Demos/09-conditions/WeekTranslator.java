//preguntas el día y contesta en español

import java.util.Scanner;

public class WeekTranslator {
    
    static String getDayByScanner() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Dime un día de la semana en español");
            String day = scanner.nextLine();
            System.out.println("");
            scanner.close();
            return day;
        }

    public static void main(String[] args) {
        
        String day = getDayByScanner();
         
        switch (day.toLowerCase()) {
            //para que los días se escriban de cualquier manera (mayúsculas o minúsculas) y sepa detectarlo
            //si están en mayúsculas también las aceptaría
            //si hay una sóla letra en mayúscula también lo aceptaría
            //signica que pone toda la palabra en minúsculas
            //switch cambia "day" el día lunes por Monday
            case "lunes":
                System.out.println("Monday");
                break;
            case "martes":
                System.out.println("Tuesday");
                break;
            case "miercoles":
            case "miércoles":
                System.out.println("Wednesday");
                break;
            case "jueves":
                System.out.println("Thursday");
                break;
            case "viernes":
                System.out.println("Friday");
                break;
            case "sabado":
            case "sábado":
                System.out.println("Saturday");
                break;
            case "domingo":
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Algo has escrito mal, vuelve a intentarlo");
            break;

        }
    }
}
