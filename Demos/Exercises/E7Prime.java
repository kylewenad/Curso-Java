public class E7Prime {

    //Crea una función que reciba un número por parámetros e imprima por consola
    //si el número recibido es un número primo

    static final int VERIFY_PRIME = 14;

    static boolean isPrime(int VERIFY_PRIME) {
        for (int i = 1; i <= VERIFY_PRIME; i++) {
            if (VERIFY_PRIME % i == 0) {
            return false;
            }
        }
        return true;
    }

    static void message(int verifyPrime){
        String message = isPrime(VERIFY_PRIME)
        ? "%s es PRIMO"
        : "%s no es PRIMO";
        System.out.printf(message, VERIFY_PRIME);
    }

    public static void main(String[] args) {
        //isPrime(VERIFY_PRIME);
        message(VERIFY_PRIME);
    }
}