import java.util.Scanner;

public class AgeGreetings {
    //Condiciones:
    //Si edad menor de 18, "hola, eres menor de edad"
    //Si edad entre18 y 33, "hola eres joven"
    //Si edad entre 34 y 65, "hola, eres adulto"
    //Si edad mayor de 65, "hola, eres jubilado"


    //static int getAgeByScanner() {
        //Coge la edad por medio de la clase Scanner
         //Segunda forma de hacer el ejercicio: mediante Scanner
      //  Scanner scanner = new Scanner(System.in);
        // scanner se puede llamar de otra forma
        //System.out.println("Dime tu edad");
        //int age = scanner.nextInt();
        //System.out.println("");
        //scanner.close();
        //return age;
    }
    
        public static void main(String[] args) {
        
        //Primera forma de hacerlo: mediante if

            if(args.length == 0) {
            System.out.println("Tienes que escribir tu edad");
            return;
            }
        
            int age = Integer.valueOf(args[0]);
            //int age = Integer.valueOf(args[0]);
            if(age < 18) {
            System.out.println("Hola, eres menor de edad");
                
                } else if (age <= 33) {
                    System.out.println("Hola, eres joven");
                } else if (age < 65) {
                    System.out.println("Hola, eres adulto");
                } else {
                    System.out.println("Hola, eres un jubilado)");
                }
        }
            
    
    
 
