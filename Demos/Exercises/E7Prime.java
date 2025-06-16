public class E7Prime {

    //Crea una función que reciba un número por parámetros e imprima por consola
    //si el número recibido es un número primo

    static final int VERIFY_PRIME = 14;

    static boolean Question(boolean number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
            return true;
            }
        }
        return false;
    }

    static void message(boolean number){
        String message = Question(number)
        ? "%s es PRIMO"
        : "%s no es PRIMO";
        System.out.printf(message, VERIFY_PRIME);
    }

    public static void main(String[] args) {
        boolean number = Question(VERIFY_PRIME);
        message(number);
    }
}