import base.Square;

public class Equality {

    public static void casting() {

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
        //primitives();
        System.out.println("-----------------");
        //wrappers();
        System.out.println("-----------------");
        casting();
        System.out.println("-----------------");
        compareStrings();
        System.out.println("-----------------");
        compareObjects();
    }

}
