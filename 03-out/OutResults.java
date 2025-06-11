//Escribir algo de tres formas diferentes en pantalla
//Guardándolo previamente en una variable

public class OutResults {
 public static void main(String[] args) {
    String name = "Pepe";
    String surname = "Pérez";
   int age = 33;

      // println -> expresión
       System.out.println("Hola " + name + " " + surname +"\n¿como estás a tus " + age + " años?");

       //Print con un result del print anterior
      String result = "Hola " + name + " " + surname +"\n¿como estás a tus " + age + " años?" ;
      System.out.println(result);  

      // printf -> expresión, variables... (concatenación)
      System.out.printf("Hola %s %s\n¿como estás a tus %s años?\n", name, surname, age);

      result = "Hola %s %s\n¿como estás a tus %s años?\n";
      System.out.printf(result, name, surname, age);


      //println -> template string
      System.out.println("""
         Hola %s %s
         ¿como estás a tus %s años?
           """.formatted( name, surname, age)); 

      result = """
         Hola %s %s
         ¿como estás a tus %s años?
           """;
      System.out.println(result.formatted( name, surname, age));
   }   

}
