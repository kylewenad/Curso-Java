package local.concept2_vc;

import java.util.Scanner;

import local.exceptions.BusinessException;

public class CalcController extends Calc{

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    int add(){
        int result = num1 + num2;;
        return result;
    }
    
    int subtraction(){
        int result = num1 - num2;
        return result;
    }

    int multiply(){
         int result = num1 * num2;
        return result;
    }

    int intDivide(){
        int result = num1 / num2;
        return result;
    }

    int restDivision () {
        int result = num1 % num2;
        return result;
    }
    
    long calculateFactorial(short number) throws BusinessException{

    }
    @Override
    public String toString() {
        String className = getClass().getSimpleName();
        String hash = Integer.toHexString(hashCode());
        return "%s [%s]".formatted(className, hash);
    }

    
}
