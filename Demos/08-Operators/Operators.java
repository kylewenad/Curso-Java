public class Operators {

    //Operadores -> expresiones

        //Asignación

        // =

        //Aritméticos

         // +
        // -
        // *
         // /
        // %

        // Comparación -> expresión boolean
        // == igual
        // != Distinto
        // >  >= mayor que
        // <  <= menor que
        // .equals
    

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.printf("Los números %s y %s son iguales: ", num1, num2);
            System.out.println(num1 == num2); // = igual -> false
        System.out.printf("Los números %s y %s son distintos: ", num1, num2);
            System.out.println(num1 != num2); // ! Distinto -> true
        System.out.printf("El número %s es mayor que %s: ", num1, num2);
            System.out.println(num1 > num2); // > mayor que -> false
        System.out.printf("El número %s es menor que %s: ", num1, num2);
            System.out.println(num1 < num2); // < menor que -> true

        String s1 = "Pepe";
        String s2 = "Juan";
        System.out.printf("Los nombres %s y %s son iguales: ", s1, s2);
            System.out.println(s1 == s2);
        System.out.printf("Los nombres %s y %s son iguales: ", s1, s2);
            System.out.println(s1.equals(s2));

    }
    
}
