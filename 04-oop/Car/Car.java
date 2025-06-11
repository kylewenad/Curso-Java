public class Car {
    String brand;
    char type;
    int numSeats;
    String color;
    int numDors;
    boolean isAuto;
    

    Car(
        String brand,
        char type,
        int numSeats,
        String color,
        int numDors,
        boolean isAuto) {
            this.brand = brand;
            this.type = type;
            this.color = color;
            this.numDors = numDors;
            this.isAuto = isAuto;
    
        }
            void showInfo(){
            String message = """
            ===================
            Marca: %s
            Tipo:
            Número de asientos:
            Número de puertas:
            Color
            Is automático: true;
            ===================
            """;

        System.out.println(message.formatted(
            brand,
            type,
            numSeats,
            numDors,
            color,
            isAuto));
        
    }

}   
