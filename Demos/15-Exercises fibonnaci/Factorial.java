public class Factorial {
    //5! factorial de 5 = 5*4*3*2*1 = 125
    //5! = 5 * 4!; 4! = 4*3!

    //recursividad: una función que puede llamarse a sí misma
    //la parte negativa es que hay procesos que se vuelven mucho más complejos
    //es otra manera de plantear un bucle for

    //solo existen factoriales de tipo entero

    static long calculateFactorial(long number) {
        //enetero largo -> long
        if (number < 0) {
            number = number * -1;
            //no se puede calcular el factorial de un número negativo
            //para que se pueda calcuar los numeros negativos
            //lo multiplicamos por -1 para que esté el numero en positivo
        }
        long result = 1;

        for (long i = number; i > 0; i--){
        result = result * i;
        }
    return result;
    }

    static long recursiveFactorial(long number) {
        //recursivo: dentro de una funcion ejecuta la misma funcion
        //para que pare el bucle se le añade un if para pararlo
        if (number == 1) {
            return number;
        }
        long result = number * recursiveFactorial(number-1);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(10));
        System.out.println(recursiveFactorial(10));
        //si el resultado es 0 es que la maquina ha desbordado el numero
    }
}
