public class Factorial {
    //5! factorial de 5 = 5*4*3*2*1 = 125
    //5! = 5 * 4!; 4! = 4*3!

    //recursividad: una función que puede llamarse a sí misma
    //la parte negativa es que hay procesos que se vuelven mucho más complejos
    //es otra manera de plantear un bucle for

    //solo existen factoriales de tipo entero

    static int calculateFactorial(int number) {
        if (number < 0) {
            number = number + -1;
        }
        int result = 1;

        for (int i = number; i > 0; i--){
        result = result * i;
        }
    return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(20));
    }
}
