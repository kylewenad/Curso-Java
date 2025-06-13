

public class BucleFor {
//la clase BucleFor tiene dos métodos estáticos y públicos
//de tipo void
//las propiedades se crean en las clases
    static final int LIMIT = 10;
    static final String[] NAMES = {"Pepe", "Ernestina", "Sofía", "Juan"};
    

    public static void showInfo(int counter) {
        int round = counter + 1;
        System.out.println("Vuelta número " + round );
    }

    public static void arrayFor() {
        //Array estructura de datos, conjunto de elementos
        //[] permite añadir n variables

            for (int i = 0; i < NAMES.length; i++) {
                System.out.println("Hola " + NAMES[i]);
                
            }
    } 
 
    public static void arrayForEach() {
        //Si no quiero saber por qué vuelta va, forEach
           
        for (String itemName : NAMES) {
            System.out.println("Hola " + itemName);
        }

    }

    public static void iterateString() {
        String sample = "Pues eso";
        for (int i = 0; i < sample.length(); i++) {
            System.out.println(sample.charAt(i));
        }
    }

    public static void main(String[] args) {
        //las variables se crean en las funciones
        
        //for (int i = 0; i < args.length; i++) {
        // i -> de índice, número por donde empieza a contar
        //puede llamarse de cualquier de otra forma
        // pero por norma general se escribe i.
        // < args.length; i++ -> hasta dnde quiera
        //ej int i =0; <10; i++; va dando vueltas de 1 en 1 (i++) hasta la 10
        for (int i = 0; i < LIMIT; i++) {
        //variables y propiedades
        showInfo(i);
        }
        arrayFor();
        arrayForEach();
        iterateString();
    }

}
