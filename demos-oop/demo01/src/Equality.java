import base.Square;


//unboxing se refiere a la conversión automática de un objeto de una clase envoltorio (como Integer)
// a su tipo primitivo correspondiente (como int). 
//Esto permite utilizar objetos donde se espera un valor primitivo, simplificando el código.
public class Equality {

    public static void primitives() {
        System.out.println("Valores primitivos");
        byte num1 = 5;
        byte num2 = 5;
        System.out.println(num1 == num2); // true
        short num3 = 5;
        System.out.println(num1 == num3); // true debido al unboxing
        int num4 = 5;
        System.out.println(num1 == num4); // true debido al unboxing
        float num5 = 5.0f;
        System.out.println(num1 == num5); // true
        char char1 = 'a'; // char es -> short (2 bytes)
        char char2 = 'b';
        byte valueA = 97;
        System.out.println(char1 == char2); // false
        System.out.println(char1 == valueA);
        //boolean bool = false;
        //byte likeBool = 0;
        //System.out.println(bool == likeBool);
        //no es posible comparar directamente un boolean con un byte.
        //Tienen tipos incompatibles y el compilador lo marcará como error.
    }

        //un wrapper (o "envoltorio") es un objeto, función o clase que "envuelve"
        // o encapsula otra función, objeto o recurso para proporcionar una interfaz diferente,
        //agregar funcionalidad o facilitar su uso.
    public static void wrappers() {
        System.out.println("Wrappers de valores primitivos");
        Integer num1 = 5;//new Integer(5);
        Integer num2 = 5;//new Integer(5);
        System.out.println(num1 == num2); // false
        System.out.println(num1);
        System.out.println(num1.toString());
    }

    //La coerción en Java se produce principalmente para evitar errores de tipo
    //en operaciones que involucran diferentes tipos de datos, como la concatenación 
    //de una cadena y un número. 
    public static void casting() {
         System.out.println("Castings y coerción de valores primitivos");

         int num1 = 23;
         byte num2 = 20;
         //num1 + num2 tendría que ser un int, por lo que si queremos que el resultado sea byte
         //hay que especificarlo
         byte result = (byte) (num1 + num2);
         System.out.println(result);
         String text = "Result ";   
         System.out.println(text + (num1 + num2));
         System.out.println((2*2)+(4*4/2));
    }

    public static void compareStrings () {
        System.out.println("Strings and equality");
        String str1 = "Hola mundo";
        String str2 = new String("Hola mundo");
        String str3 = "Hola mundo";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        String str4 = str2;
        System.out.println(str4 == str2);
        str1.charAt(3);

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
            //Recorre el string por letras
        }

        for (char item : str1.toCharArray()) {
            System.out.println(item);
        }

        System.out.println("_________");
        System.out.println(str1.charAt(5));
        //str1[5] = 'M';
          //  str1 = "Hola Mundo";
        System.out.println(str1.codePointAt(5));

    }

    public static void compareObjects() {
        System.out.println("Objects and equality");

        Square sq1 = new Square(10);
        Square sq2 = new Square(10);
        Square sq3 = sq1;

        System.out.println(sq1 == sq2); //false porque tienen diferentes referencias aunque "sean iguales en nombre y tamaño"
        System.out.println(sq1.toString()); 
        System.out.println(sq2);
        System.out.println(sq3 == sq1); // true
        System.out.println(sq3);
        System.out.println(sq1.equals(sq2)); // debería ser true, como java "no entiende" le aplicamos un override para que diga true
    
        sq1.side = 12;
        System.out.println(sq2.side); //10
        System.out.println(sq3.side); //12
    
    }   
    //Garbage conector detecta las referencias no utilizadas y las elimina liberando espacio cada cierto tiempo
    //system.gc para invocarlo
    //null solo con objetos

    public static void main(String[] args) {
        System.out.println("Aprendiendo acerca de la igualdad en Java");
        primitives();
        System.out.println("-----------------");
        wrappers();
        System.out.println("-----------------");
        casting();
        System.out.println("-----------------");
        compareStrings();
        System.out.println("-----------------");
        compareObjects();
    }

}
