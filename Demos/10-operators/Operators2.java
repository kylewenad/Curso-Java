public class Operators2 {

    //Operadores -> expresiones

        //Asignación

        // =

        //Aritméticos

         // +
        // -
        // *
         // /
        // %

        //Aritméticos de asignación
        // +=
        //-=
        //*=
        // /=
        // %=

        //Incremento y decremento
        //++ suma 1
        //-- resta 1

        // Operaciones relacionales o de Comparación -> expresión boolean
        // == igual
        // != Distinto
        // >  >= mayor que
        // <  <= menor que
        // .equals
    
        //Lógicos

        // && -> AND ampersand
        // || -> OR

        //Operadores de bits (no se suelen usar en java)

    static boolean checkAge(int age){
        System.out.println("Chequeando la edad " + age);
        return age < 25 ? true : false;
    } 
        
    public static void main(String[] args) {
        int number = 22;
        number += 3;
        //es lo mismo que number = number + 3
        number ++;
        System.out.println(number++); //primero imprime y después suma Postincremento
        System.out.println(++number);//primero suma y después imprime Preincremento
        System.out.println(number);
        
        String job = "Developer";
        int age = 28;
    
        if (job == "Developer" && checkAge(age) ) {
            System.out.println("Bienvenido a la Hackaton juvenil");
        } else {
            System.out.println("No puedes participar en la Hackaton");
        }
    }
}
