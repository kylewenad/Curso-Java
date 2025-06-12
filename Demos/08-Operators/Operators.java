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
        System.out.println(num1 == num2); // = igual -> false
        System.out.println(num1 != num2); // ! Distinto -> true
        System.out.println(num1 > num2); // > mayor que -> false
        System.out.println(num1 < num2); // < menor que -> true

        String s1 = "Pepe";
        String s2 = "Juan";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
    
}
