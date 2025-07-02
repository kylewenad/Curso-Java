package local.concept2_vc;

import local.exceptions.BusinessException;
import local.exceptions.ErrorCodes;

public class CalcController extends Calc{
    
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    int add() {
        int result = num1 + num2;
        return result;
    }

    int subtract() {
        int result = num1 - num2;
        return result;
    }

    int multiply() {
        int result = num1 * num2;
        return result;
    }

    int intDivide() throws BusinessException {
        try {
            int result = num1 / num2;
            return result;

        } catch (ArithmeticException e) {
            throw new BusinessException(
                    ErrorCodes.ERROR_ZERO,
                    "Dividiendo por 0",
                    e);
        }
    }

    int restDivision() {
        int result = num1 % num2;
        return result;
    }

    long calculateFactorial() throws BusinessException {
        return calculateFactorial((short) num1);
    }

    long calculateFactorial(short number) throws BusinessException  {
        if (number < 0) {
           String message = "No se puede calcular el factorial de " + number; 
           // throw new TechnicalException(message);
           throw new BusinessException(ErrorCodes.ERROR_NEGATIVE, message);
        }

        if (number > 10) {
            String message = "No se puede calcular el factorial de " + number; 
           // throw new TechnicalException(message);
           throw new BusinessException(ErrorCodes.ERROR_BIGGER_20, message);
        }

        long result = 1;

        for (short i = number; i > 0; i--) {
            result = result * i;
            // result *= i;
        }
        return result;
    }
}
