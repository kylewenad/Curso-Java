import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        
        String name;
        double age;

        Scanner scanner = new Scanner(System.in);
        //método scanner para preguntar al usuario y guardar las respuestas

        System.out.println("Escribe tu nombre");
        name = scanner.nextLine(); //guarda el nombre escrito por el usuario
        System.out.println("Escribe tu edad");
        age = scanner.nextDouble(); //guarda la edad escrita por el usuario

        System.out.println("Hola " + name);
        System.out.println("Tienes " + age + " años.");
        scanner.close();
    }
}
