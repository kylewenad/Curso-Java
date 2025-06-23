import java.text.NumberFormat;
import java.util.Locale;

import acountingZara.DataCompany;
import acountingZara.Invoice;
import acountingZara.Payment;
import acountingZara.Product;


public class Economy {

    public static void main(String[] args) {
          
        // Crea una empresa
        DataCompany company = new DataCompany("Zara", "55544433Z", "Paseo de la Castellana 32, Madrid", 913456789);

        DataCompany client = new DataCompany("Ropa de Sara", "57936624P", "calle hermosilla, 12, Madrid", 915501312);
         Product product = new Product("C236", "Camiseta", 3);
        
        // Crea una factura para la empresa
        Invoice invoice = new Invoice(client, product, 2, 1.21, Payment.TRANSFER);
        
        // Add extra items to the invoice
        Product product1 = new Product("C236", "Camiseta", 3);
        invoice.addItem(product1, 2);
        
        Product product2 = new Product("P126", "Pantalón", 25);
        invoice.addItem(product2, 5);

        Product product3 = new Product("Z989", "Zapatos", 50);
        invoice.addItem(product3, 7);
        
        // Calcular el precio total e imprimirlo
        double totalPrice = invoice.calculatePrice();
        System.out.println("");
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.printf("Total Price: %s\n", nf.format(totalPrice));

        // Imprimir la factura
        invoice.printInvoice();
    }

}
    
         
