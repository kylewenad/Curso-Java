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
        int num = scanner.nextInt(message);
        //scanner.close();
        return num;
    }

    public static void main(String[] args){

        int num1 = getInteger("Dime un número entero");
        int num2 = getInteger("Dime otro número entero");

        System.out.println("Operaciones con %s y %s\n", num1, num2);
        showResult("suma", add(num1, num2));

      

    }
}
