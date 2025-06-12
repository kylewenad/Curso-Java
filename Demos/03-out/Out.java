//Escribir algo de tres formas diferentes en pantalla
//(println, printf, println con formato)
//println -> sólo vale para String
//printf -> para String y variables
//println .formatted templated String - > para escribir el mensaje de la forma que quieras
//se usan string y variables
public class Out {
 public static void main(String[] args) {
    String name = "Pepe";
    String surname = "Pérez";
   int age = 33;

    // println -> expresión
    System.out.println(" 1." + "Hola " + name + " " + surname +"\n¿cómo estás a tus " + age + " años?");
   
    // printf -> expresión, variables...
    System.out.printf("2. Hola %s %s\n¿cómo estás a tus %s años?\n", name, surname, age);

     //println -> template string
     System.out.println("""
         3. Hola %s %s
         ¿cómo estás a tus %s años?
           """.formatted( name, surname, age)); 
   }   // %s para que escriba una variable de tipo String con un valor que le hemos dado anteriormente

}
