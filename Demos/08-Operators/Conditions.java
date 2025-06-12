public class Conditions {
    //Mecanismos de control de código:
        //Condicionales y las iteraciones o bucles
        // If --> else
    
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Tienes que añadir tu edad en la línea de comandos");
        } else {
            int age = Integer.valueOf(args[0]);
            System.out.println("Tu edad es " + age);

        }


    }
}
