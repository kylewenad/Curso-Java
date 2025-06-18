import java.util.Scanner;
import java.util.Random;

public class Game {
    //Piedra gana tijera
    //Tijera gana papel
    //papel gana piedra

    //1. Elige Piedra, papel o tijera
    //2. Random(piedra, papel o tijera)
    //3. Mensaje
    //Calcular el ganador -> con una matriz: cálculo matricial
    
    //evitar elementos mágicos, que TODOS los elementos esten definidos
    static final byte STONE = 1;
    static final byte PAPER= 2;
    static final byte SCISSORS = 3;
    
    private static final String[] DICES = {
        //dices (tirada)
        "Nada", "PIEDRA", "PAPEL", "TIJERA"
    };
    
    static final byte EQUALS = 1;
    static final byte USER = 1;
    static final byte COMPUTER = 2;

    private static final String[] DICESRESULT = {
        "Empate", "Has ganado", "Ha ganado la máquina"
    };


    private static final String[][] RESULT = {
        {EQUALS, USER, COMPUTER},
        {COMPUTER, EQUALS, USER},
        {USER, COMPUTER, EQUALS},
    };

    private static byte userDice;
    private static byte computerDice;

    
    

    static void choose(){
        String message = "Elige piedra, papel o tijera, (PI, PA, TI)";
        Scanner scanner = new Scanner(System.in);
        userDice = 0;
        while (userDice == 0) {
            System.out.println(message);
        }
        
    }

    static void chooseComputer() {
        Random random = new Random();
        Game.computerDice = (byte)random.nextInt(3);
        // (byte) convierteme a byte el entero que me estás dando
        // hacer arrays en vez de if

    }

    static void showResult() {
        System.out.printf("El ordenador ha sacado ", + DICES[computerDice]);
        System.out.printf("Has elegido %s", userDice); + dices [userDice]);
    }

    static void askUser() {
        //función para preguntar
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        while(wantContinue) {
            choose();
            chooseComputer();
            showResult();
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
    public static void main(String[] args) {
        askUser();
    }
    
}
