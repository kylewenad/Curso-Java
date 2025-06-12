//Escribir algo de tres formas diferentes en pantalla
//Guardándolo previamente en una variable

public class OutResults {
  
   public static void main(String[] args) {
      
      String name = "Pepe";
      String surname = "Pérez";
      int age = 33;

      // println con la variable result
      String result ="1. " +  "Hola " + name + " " +  surname + "\n¿cómo estás a tus " + age +" años?";
      System.out.println(result);

      // printf -> expresión, variables... (concatenación)
      result = "2. Hola %s %s \n¿cómo estás a tus %s años?\n";
      System.out.printf(result, name, surname, age);

      //println -> template string
      result = """
         3. Hola %s %s
         cómo estás a tus %s años?
         """;
      System.out.println(result.formatted( name, surname, age));
   }   
}

