package acountingZara;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Invoice {
    
    private static final NumberFormat NF = NumberFormat.getCurrencyInstance(Locale.GERMANY);

    private static final DataCompany BRAND = new DataCompany("Zara", "55598946E", "Plaza Castilla, Madrid", 91345345);
    private static byte lastId = 0;

    private static String generateID(){
        int year = LocalDate.now().getYear();
        String id = String.valueOf(year) + '/' + ++lastId;
        return id;
        //para calcular el año local del año actual que devuelve int
        //int lo convierto en string para que escriba año/numero de factura
        //
    }

    private String id = Invoice.generateID();
    private DataCompany client;
    private List<Item> items = new ArrayList<>();
    private double iva;
    private double total = 0;
    private Payment paymentMethod;

    public DataCompany getClient() {
        return client;
    }

    public Invoice (DataCompany client, Product product, int amount, double iva, Payment paymentMethod){
        this.id = Invoice.generateID();
        this.client = client;
        //this.items.add(new Item(product, amount));
        //this.total = this.items.get(0).value;
        this.client = client;
        this.iva = iva;
        this.paymentMethod = paymentMethod;
        addItem(product, amount);
    }

    public Invoice (DataCompany client, Product product, int amount,  Payment paymentMethod) {
        this.(client, product, amount, 1.21, paymentMethod);
    }
    
    public Invoice (DataCompany client, Product product, int amount) {
        this(client, product, amount, 1.21, Payment.TARJETA);
    }


    public void addItem(Product product, int amount){
        Item item = new Item(product, amount);
        this.items.add(item);
        this.total += item.getValue();
    }

    public double calculatePrice(){
        return total * this.iva;
    }
    
    private String renderDate() {
        return LocalDate.now().toString();
    }

    private String renderItems() {
        String itemsList = "";
        for (Item item : items) {
            itemsList += item.renderItems();
        }
    }

    private 
        double totalWithIVA = calculatePrice();
        double totalIVa = totalWithIva - total;

    private String renderPayment() {
        String invoice = """
            %s
            %s        

            Factura %s
                """;
    }

    .formatted(
        Brand.renderHeaderCompany(),
        client.renderClient(),
        id,

    )
}