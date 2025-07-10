
// Tipos de números
    // byte - 1byte -128 - 127
    // short - 2bytes
    // int - 4bytes
    // long - 8bytes
    // float - decimal 4 bytes
    // double - decimal 8 bytes

public class Person {
    
    public static void main(String[] args) {
        
        byte age; //Declaración de la variable
        age = 22; //Asignación de dato a la variable
        short birthYear = 1990; //
        int cityPopulation = 4_000_000;
        long countryPopulation = 40_000_000;
        float height = 1.78f;
        double weight = 65.74;
        boolean hasPet = true;
        char type = 'A';
        String name = Pepe;

        System.out.println("Edad " + age);
        System. out.println("Fecha " + birthYear);
        System.out.println("Población de mi ciudad " + cityPopulation);
        System.out.println("Población de mi país " + countryPopulation);
        System.out.printf("""
            Altura %s mts
            Peso %s kg
            ¿Tiene mascotas? %s
            Tipo %s
            Nombre %s
                """.formatted(height, weight, hasPet, type, name));
    }
}
