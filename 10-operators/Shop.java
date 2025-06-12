import java.util.Scanner;

public class Shop {
    
    static final double PACK_PRICE = 100;
    //static significa que no instanciamos nada
    //solo voy a tener una tienda y defino todo sobre esa tienda
    //variable constante, que no cambia nunca
    //"final" obliga a que sea constante la variable
    //la constante se escribe en mayúsculas

    static int getNumPacksByScanner() {
        //función "getNumPacksByScanner" creada.
        //te 'devuelvo' un entero
        //una función es un constructor
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vendemos paquetes de pantalones y camisetas a %s euros\n", PACK_PRICE);
        // \n caracter de escape --> salto de línea
        System.out.println("Dime el número de packs que quieres comprar");
        int numPacks = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return numPacks;
    }
 
    public static void main(String[] args) {
        //función "getNumPacksByScanner" a ejecutar
        int numPacks = getNumPacksByScanner();
        //escribo lo que pasaría "y si... no" antes de los if
        //para ahorrame el último else
        double discount = 0.15;
        int costOfShippingByPack = 0;
        double totalPrice;
       
        if(numPacks < 5) {
            System.out.println("No se pueden comprar menos de 5 paquetes");
            return;

        } else if(numPacks < 10) {
            costOfShippingByPack = 10;
            discount = 0.05;
        } else if(numPacks < 20) {
            costOfShippingByPack = 5;
            discount = 0.1;
        }

        double total = numPacks * PACK_PRICE;
        double totalDiscount = total * discount;
        double totalShipping = numPacks * costOfShippingByPack;
        double finalPrice = total - totalDiscount + totalShipping;

        System.out.println("""
                Número de paquetes:         %s
                Precio total del producto:  %s
                Descuento aplicado:         %s
                Gastos de envío:            %s
                ------------------------
                TOTAL:                      %s EU
                """.formatted(numPacks, total, totalDiscount, totalShipping, finalPrice));
                // %d para que salga el total en decimal
    }
}