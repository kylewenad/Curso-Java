package acountingZara;

public class Products {
    private static String message = """

            Producto:       %s
            Descripción:    %s
            Precio:                %s EU
                """;

    public static void tshirt() {
        String name = "Camiseta";
        String description = "De lana";
        int price = 15;
        
        System.out.println(message.formatted(name, description, price));
    }

    public static void pants() {
        String name = "Pantalones";
        String description = "vaqueros";
        int price = 30;
        
        System.out.println(message.formatted(name, description, price));
    }
    
    public static void shoes() {
        String name = "Zapatos";
        String description = "running";
        int price = 50;
        System.out.println(message.formatted(name, description, price));
    }

    public static void showProducts(){
        tshirt();
        pants();
        shoes();
    }

    }

