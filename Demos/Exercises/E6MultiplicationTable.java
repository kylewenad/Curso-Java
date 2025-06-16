public class E6MultiplicationTable {

    //Crea una función que imprima por consola la tabla de multiplicar de un número introducido como parámetro.

    static final int LIMIT = 10;
    static final int SEVEN = 7;

    static void multiplyTable(int SEVEN) {
        
        System.out.printf("La tabla del %s es \n", SEVEN);
        for(int i = 0; i <= LIMIT; i++) {
            int result = SEVEN * i;
            System.out.printf("%s x %s = %s \n", SEVEN, i, result);
            
        }
        
    }


    public static void main(String[] args) {
        multiplyTable(SEVEN);
    
    }
}