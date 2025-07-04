import contain.Box;
import contain.IContainer;
import contain.Bag;
import order.IOrder;
import order.Order;
//import products.Food;
//import products.IProduct;

public class Supermarket {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("Bienvenido a nuestro supermercado");

        IOrder order1 = new Order("Pepe-O001");
        System.out.println(order1);

        IContainer box1 = new Box("B001", 50, 50, 50);
        IContainer plasticBag1 = new Bag("P001", 50, 50, 5);
        
        System.out.println(box1);
        System.out.println(plasticBag1);

        order1.addContainer(box1);
        order1.addContainer(plasticBag1);
        
        //IProduct p1 = new Food("Patatas", 1500, 1000);
       // IProduct p2 = new Food("Patatas", 1500, 1000);
        //IProduct p3 = new Food("Patatas", 1500, 1000);
        //IProduct p4 = new Food("Patatas", 1500, 1000);
        

       // IContainer c1 = order1.addProduct(p1);
       // IContainer c2 = order1.addProduct(p1);
        //IContainer c3 = order1.addProduct(p1);
        //IContainer c4 = order1.addProduct(p1);
        //para saber en qué contenedor está


        //los objetos escribimos toString para que salga el nombre que queramos
    }
}
