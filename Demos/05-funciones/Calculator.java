import java.util.Scanner;

public class Calculator {
    
    static int add(int num1, int num2){
        int result = num1 + num2;;
        return result;
    }
    
    static int subtraction(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    static int multiply(int num1, int num2){
         int result = num1 * num2;
        return result;
    }

    static int intDivide(int num1, int num2){
        int result = num1 / num2;
        return result;
    }

    static int restDivision (int num1, int num2) {
        int result = num1 % num2;
        return result;

    }
    static void showResult(String operation, int result) {
        System.out.println(result);
        System.out.println("");
    }
    static int getInteger (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        //Para esperar a que conteste un número entero
        int num = scanner.nextInt();
        //scanner.close();
        return num;
    }

    public static void main(String[] args){

        int num1 = getInteger("Dime un número entero");
        int num2 = getInteger("Dime otro número entero");
        
        System.out.printf("Operaciones con %s y %s\n", num1, num2);
        System.out.printf("Suma %s + %s = ", num1, num2);
        showResult("suma", add(num1, num2));
        System.out.printf("Resta %s - %s = ", num1, num2);
        showResult("resta", subtraction(num1, num2));
        System.out.printf("Multiplicación %s * %s = ", num1, num2);
        showResult("multiplicacion", multiply(num1, num2));
        System.out.printf("División %s / %s = ", num1, num2);
        showResult("división", intDivide(num1, num2));
        System.out.printf("Resto de la división = ", num1, num2);
        showResult("resto", restDivision(num1, num2));
        //showResult sólo demuestra el resultado de la operación

    }
}
