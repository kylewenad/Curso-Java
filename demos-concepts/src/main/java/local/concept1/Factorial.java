package local.concept1;

import java.text.NumberFormat;
import java.util.Locale;

public class Factorial {

    short number;

    Factorial(){}

    Factorial(short number) {
        this.number = number;
    }

    long calculateFactorial(){
        return calculateFactorial(number);
    }
    
    long calculateFactorial(short number) {
        if (number < 0) {
            throw new IndexOutOfBoundsException();
       }
        long result = 1;

        for (short i = number; i > 0; i--) {
           result = result * i;
           //result *=

        }
        return result;

    }

    //void showNumber(long number) {
      //  NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        //formato de los números de Alemania es igual que el de España
        
        //System.out.println(nf.format(number));
    //}

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        short num = 10;
        num = 0;
        num = 1;
        num = -5;
        long result = factorial.calculateFactorial(num);
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(nf.format(result));

    }

    try
}