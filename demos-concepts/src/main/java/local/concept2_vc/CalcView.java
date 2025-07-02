package local.concept2_vc;

import java.util.Scanner;

import local.exceptions.BusinessException;

public class CalcView extends Calc {
    private int number1 = 20;
    private int number2 = 2;
    private CalcController ctr = new CalcController();

    CalcView(CalcController ctr){
        this.ctr = ctr;
        this.ctr.setNum1(number1);
        this.ctr.setNum2(number1);
    }

    private static int getInteger(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
            int number = scanner.nextInt();
            return number;
    }

    static void showMenu(){

    String menu = new String();
        
        System.out.println(menu);
    }
    
    private void calculate(int option) throws BusinessException{
        System.out.println("Calculando la opción " + option);
        switch (option) {
            case 3:
                showResult("suma", ctr.add());
                break;
            
            case 4:
                showResult("resta", ctr.subtraction());
                break;
            
            case 5:
                showResult("multiplicación", ctr.multiply());
                break;
        
            case 6:
                showResult("división", ctr.intDivide());
                showResult("resto", ctr.restDivision());
                break;
                
            case 7:
                
                break;
            
            case 8:
                
                break;
                
            case 9:
                showResult("factorial", ctr.calculateFactorial());
                break;
        
            default:
                break;
        }
        
        if (option == 8){
            showAllResults();
        }
    }

    static void show() throws BusinessException{
    
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        while (wantContinue) {

            showMenu();
            int answer = scanner.nextInt();
            if (answer == 0) {
                wantContinue = false;
            } else if (answer == 1){
                number1 = getInteger("Dime el primer número");
                ctr.setNum1(answer1);
            }  else if (answer == 2){
                number2 = getInteger("Dime el segundo número");
                ctr.setNum2(answer2); 
            } else {
                calculate(answer);
            }
        }
        scanner.close();
        System.out.println("Gracias por todo");
    }

    @Override
    public String toString() {
        String className = getClass().getSimpleName();
        String hash = Integer.toHexString(hashCode())
        return "%s [%s]".formatted(className, hash);
    }


    private void showResult(String string, int subtraction) {
        System.out.println("El resultado de la %s es ");
        System.out.println("");
    }
    
    void showAllResults()throws BusinessException{
        System.out.printf("Operaciones con %s y %s\n", number1, number2);
        showResult("suma", ctr.add());
        showResult("resta", ctr.subtraction());
        showResult("multiplicación", ctr.multiply());
        showResult("división", ctr.intDivide());
        showResult("resto", ctr.restDivision());

    }

}