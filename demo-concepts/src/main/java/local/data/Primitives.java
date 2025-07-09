package local.data;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

@SuppressWarnings("unused")
public class Primitives {

    byte byteNumber = 1;
        short shortNumber = 1;
        int i = 1;
        long l = 1;
        float f = 1;
        double d = 1;
        char c = 1;
        boolean bo = true;

    void foo () {
        shortNumber = byteNumber;
        byteNumber = (byte)shortNumber;
        byteNumber = (byte) i;
        byteNumber = (byte) l;
        byteNumber = (byte) f; //si fuera un decimal lo obliga a poner en entero
        byteNumber = (byte) d; //si fuera un decimal lo obliga a poner en entero 
        byteNumber = (byte) c;
        //byteNumber = (byte) bo; cast imposible
    }

    void Wrappers() {
        //Integer iObj = new Integer(1);
        
        //Autoboxing
        Byte byteObj = 1;
        Short shortObj = 1;
        Integer intObj = 1;
        Long longObj = (long) 1;
        Float floatObj = 1f;
        Double doubleObj = 1d;
        Character charObj = 'A';
        Boolean booleanObj = true;

        //Unboxing
        byte byteNumber = byteObj;
        Short shortNumber = shortObj;
        Integer intNumber = intObj;
        Long longNumber = longObj;
        Float floatNumber = floatObj;
        Double doubleNumber = doubleObj;
        Character charNumber = charObj;
        Boolean booleanNumber = true;
    }

    void numbersRanges() {
        
        System.out.println("--------------------------------------------");
        System.out.println("Max and Min values of primitive types:");
        System.out.println("--------------------------------------------");
        System.out.println("Character: " + Character.MAX_VALUE + "," + Character.MIN_VALUE);
    }

    void bigNumbers() {

        //BigDecimal y BigInteger
        BigDecimal bigDecimal = new BigDecimal();
        BigInteger bigInteger = new BigInteger();

        System.out.println("BigDecimal: " + nf.format(bigDecimal));
        System.out.println("BigInteger: " + nf.format(bigInteger));
    
        BigDecimal result = bigDecimal.add
        
    }

    void genericNumber(){
        Number numberObj = 2;
        long longObj = numberObj.longValue();
    }

    void formats() {
        //Formatos de salida
        System.out.printf("byte: %d, short: %d, int: %d, long: %d, float: %.2f, double: &.2f, char: %c, boolean: %b%n"
            (byte) 1, (short) 1, 1, 1L, 1.0f, 1.0d, 'A', true);
    
        
        NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    
        }
    
    public static void main(String[] args) {
     Primitives primitives = new Primitives();
        primitives.numbersRanges();   
        primitives.bigNumbers();
        primitives.formats();
    }
}