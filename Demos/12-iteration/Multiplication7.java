import java.util.Scanner;

public class Multiplication7 {

    static final int END = 10;
    
    static int whatTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime qué tabla multiplicar quieres del 1 al 10");
         System.out.println("Escribe 0 si quieres todas las tablas");
        int numTable = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return numTable;
    }
    
    public static void showTable(int number) {
        System.out.printf("Tabla del %s\n", number);
        for (int i = 0; i <= END; i++) {
            System.out.printf("%s x %s = %s\n", number, i, number);
            System.out.println("-----------------");
        }
    }

    public static void showAllTables() {
        for (int i = 0; i <= END; i++) {
        showTable(i);
        }
    }
    
    public static void main(String[] args) {
        
        int numTable = whatTable();
        if (numTable != 0) {
            showTable(numTable);
        } else {
            showAllTables();
        }
    }
 }

