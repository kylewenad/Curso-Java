package acountingZara;

public class Products {
    
        private static String tshirtName = "Camiseta";
        private static String tshirtDescription = "De lana";
        private static int tshirtPrice = 15;
        private static int numberOfTshirts;
    
        private static String pantsName = "Pantalones";
        private static String pantsDescription = "vaqueros";
        private static int pantsPrice = 30;
        private static int numberOfPants;

        private static String shoesName = "Zapatos";
        private static String shoesDescription = "running";
        private static int shoesPrice = 50;
        private static int numberOfShoes;
    
        private static String message = """

            Producto:       %s %s
            Número de unidades:           %s
            Precio unidad:                %s EU
            Precio total:                 %s
                """;

        private static int totalPriceTshirt = numberOfTshirts * tshirtPrice;
        private static int totalPrices(){
            int totalPricePants = numberOfPants * pantsPrice;
            int totalPriceShoes = numberOfShoes * shoesPrice;

            int totalPrice = totalPriceTshirt + totalPricePants + totalPriceShoes;
            
            return totalPrice;
        
        }
        
        public static void showProducts(){
            System.out.println(message.formatted(tshirtName, tshirtDescription, numberOfTshirts, tshirtPrice, totalPriceTshirt));
        }
    
    }

