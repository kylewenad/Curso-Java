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

    public int getValue() {
        return value;
    }
    
    public Item(Product product, int amount){
        this.product = product;
        this.amount = amount;
        this.value = calculatePrice(amount);
    }

    private int calculatePrice(int items) {
        return items * product.getUnityPrice();
    }

    String renderInvoiceLine() {

        String start = "%-20s : %s u. a %s". formatted(
            product.getSku() + " " + product.getName(), amount,
            NF.format(product.getUnityPrice()));
            
        String message = """
            %50s........Total %s
            """.formatted(
            start,
            NF.format(value));
            return message;
        }

}

