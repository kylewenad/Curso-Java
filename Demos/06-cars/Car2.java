public class Car2 {
   //para saber el número de coches creados
    static private int numCars = 0;

    private int id;
    private String brand;
    private char type;
    private int numSeats;
    private int numDors;
    private String color;
    private boolean isAuto;
    
    //Constructor
    Car2(
        String brand,
        char type,
        int numSeats,
        int numDors,
        String color,
        boolean isAuto
        ) {
        
        numCars = numCars + 1;
        // numCars creado para tener un identificador de coches creados
        this.id = numCars;
        this.brand = brand;
        this.type = type;
        this.numSeats = numSeats;
        this.numDors = numDors;
        this.color = color;
        this.isAuto = isAuto;
        }
            void showInfo(){
            String message = """
            ======================
            Id:                 %s
            Marca:              %s
            Tipo:               %s
            Número de asientos: %s
            Número de puertas:  %s
            Color:              %s
            Is automático:      %s
            ======================
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
