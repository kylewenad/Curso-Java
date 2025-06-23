package acountingZara;

import java.text.NumberFormat;
import java.util.Locale;

public class Item {
    
    private static final NumberFormat NF = NumberFormat.getCurrencyInstance(Locale.GERMANY);
    //NF instancia que corresponde al método getCurrencyInstance
    //en Alemania porque no hay una de España    

    private Product product;
    private int amount;
    private int value;
    //son públicas dentro del paquete "defold"

    public Item(Product product, int amount){
        this.product = product;
        this.amount = amount;
        this.value = calculatePrice();


    }

   
    private int calculatePrice() {
        return items * amount;
    }




    private static int totalPriceTshirt = numberOfTshirts * tshirtPrice;
        private static int totalPrices(){
            int totalPriceTrousers = numberOfTrousers * trousersPrice;
            int totalPriceShoes = numberOfShoes * shoesPrice;

            int totalPrice = totalPriceTshirt + totalPriceTrousers + totalPriceShoes;
            
            return totalPrice;
        
        }
        
        public static void showItem(){
            System.out.println(message.formatted(tshirtDescription, numberOfTshirts, tshirtPrice, totalPriceTshirt));
        }
        public static int getTotalPriceTshirt() {
            return totalPriceTshirt;
        }

        String renderInvoiceLine() {

            String start = "%-25s : %s u. a %s". formatted(
                product.getSku() + " " + product.getName
            )
        }

        public int getValue() {
            return value;
        }
}

