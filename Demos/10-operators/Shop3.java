import java.util.Scanner;

//precio superior 1000 euros 10%
//si no llega a los 1000 indicar cuánto falta para llegar


public class Shop3 {
    
    static final double PACK_PRICEPANTS = 100;
    static final double PACK_PRICETSHIRTS = 50;
    
    static int[] getNumPacks() {
        //Se le añade un array [] porque tiene dos valores
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vendemos paquetes de pantalones a %s euros\n", PACK_PRICEPANTS);
        System.out.printf("Vendemos paquetes de camisetas a %s euros\n", PACK_PRICETSHIRTS);
        System.out.println("Dime el número de paquetes de pantalones que quieres comprar");
        int numPacksPants = scanner.nextInt();
        System.out.println("Dime el número de paquetes de camisetas que quieres comprar");
        int numPacksTshirts = scanner.nextInt();
        System.out.println("");
        scanner.close();
        int[] result = {numPacksPants, numPacksTshirts};
        //Hay que crear la variable para que se pueda hacer la función
        return result;
    }
    
    public static void main(String[] args) {
        int[] numPacks = getNumPacks();
        //Agrupar los valores creando un array [pantalones, camisetas]
        //Desagrupar los valores
        //[pantalones]
        //[Camisetas]
        int numPacksPants = numPacks[0];
        int numPacksTshirts = numPacks[1];
        int totalNumPacks = numPacksPants + numPacksTshirts;

        //control + d para seleccionar varias cosas a la vez
        double discount = 0;
        int costOfShippingByPack = 0;
        double discountPromotion = 0;
        
        
        if(totalNumPacks < 5) {
            System.out.printf("No se pueden comprar menos de 5 paquetes", numPacks);
            return;
            
            } else if(totalNumPacks < 10) {
            costOfShippingByPack = 10;
            discount = 0.05;
            } else if(totalNumPacks < 20) {
            costOfShippingByPack = 5;
            discount = 0.1;
            } else if(totalNumPacks < 20) {
            costOfShippingByPack = 0;
            discount = 0.15;
            } 
        // if(totalPricePacks > 1000) {
            //    discountPromotion = 0.1;
            //} 
            
            double totalPricePacks = numPacksPants * PACK_PRICEPANTS + numPacksTshirts * PACK_PRICETSHIRTS;
            double totalDiscount = totalPricePacks * discount;
            double totalShipping = totalNumPacks * costOfShippingByPack;
            double finalPrice = totalPricePacks - totalDiscount + totalShipping;
            
            discountPromotion = 0;
            double promotion = 1000 - totalPricePacks;
            String line1 = "PROMOCIÓN NO APLICADA";
            String line2 = "Cantidad que falta \npara aplicar la promoción";

            if(totalPricePacks >= 1000) {
                discountPromotion = totalPricePacks * 0.1;
                promotion = finalPrice - discountPromotion; 
                line1 = "PROMOCIÓN APLICADA";
                line2 = "Precio TOTAL PROMOCIÓN";
                // %d para que salga el total en enteros
                // %f para poner decimales
                // %.2f --> el 2 es para que haya dos decimales} else {
                } 

                
                System.out.printf("""
                Nº paquetes de pantalones:  %d
                Nº paquetes de camisetas:   %d
                Nº paquetetes total:        %d

                Precio total del producto:  %.2f EU
                Descuento aplicado:         %.2f EU
                Gastos de envío:            %.2f EU
                --------------------------------
                TOTAL:                      %.2f EU
                --------------------------------
                %s
                %s: %.2f EU
                """.formatted(numPacksPants, numPacksTshirts, totalNumPacks, 
                totalPricePacks, totalDiscount, totalShipping, finalPrice, line1, line2, promotion));
        
    }
}