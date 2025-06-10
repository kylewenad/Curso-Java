public class Car2 {
   //para saber el número de coches creados
    static private int numCars = 0;

    private int id;
    private String brand;
    private char type;
    private int numSeats;
    private String color;
    private int numDors;
    private boolean isAuto;
    
    //Constructor
    Car2(
        String brand,
        char type,
        int numSeats,
        String color,
        int numDors,
        boolean isAuto
        ) {
        
        numCars = numCars + 1;
        this.id = numCars;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.numDors = numDors;
        this.isAuto = isAuto;
        }
            void showInfo(){
            String message = """
            ===================
            Id: %s
            Marca: %s
            Tipo:
            Número de asientos:
            Número de puertas:
            Color:
            Is automático: true:
            ===================
            """;

        System.out.println(message.formatted(
            id,
            brand,
            type,
            numSeats,
            numDors,
            color,
            isAuto));
        
    }

}   
