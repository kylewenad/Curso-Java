import java.util.Scanner;

public class Shop {

    static double getNumPacksScanner() {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Dime cuántos paquetes has comprado.");
            double numPacks = scanner.nextInt();
            System.out.println("");
            scanner.close();
            return numPacks;
            
        }
    public static double main(String[] args) {
        double numPacks = getNumPacksScanner();
        double costOfShipping;
        double discount;
        double totalPrice;
        if(numPacks < 5) {
            System.out.println("No puedes comprar menos de 5 paquetes.");
        } else if(numPacks < 10) {
            costOfShipping = 10;
            discount = 5%numPacks;
            totalPrice = costOfShipping*numPacks + discount;

            System.out.println(
                costOfShipping, 
                discount,
                totalPrice);
        } else if(numPacks < 20) {
            System.out.println("El coste del envío es de 5 euros por paquete, y se le aplica un descuento del 10%");
        } else {
            System.out.println("El coste del envío es gratuito y se le aplica un descuento del 15%");
        }
    }
    }
    
costedeenvío = 10;
descuentoaplicado = 5% numPacks;
total a pagar = numpacks*0,10 + 10 * numPacks