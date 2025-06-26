package containers;

import java.util.Set;
//referencia del pedido
//dimension inicial del paquete
//espacio que queda después de añadir el producto
//peso del producto
//peso inicial del contenedor
//si el contenedor resiste el peso
//peso después de añadir el producto
//tipo de producto y si es compatible para añadirlo con los otros
//productos que ya están en el contenedor
//tamaños de las bolsas
//pequeño, mediano, grande
//peso máximo de cada tipo de bolsa
import products.IProduct;

public class PlasticBag extends Container {
    
    String getReference();
    char typeOfBag;
    int initialDimension;
    int leftDimension;
    int maxWeight = 9;
    Set<Product> getProducts();
    String getType();

    boolean add(IProduct product);
    boolean weight(IProduct product);

    bag(char type, int initialDimension, int leftDimension, int maxWeight, set products, type products){
        this.typeOfBag = type;
        this.initialDimension = Dimension;
        this.dimensionLeft = dimensionLeft;
        this.maxWeight = maxWeight;
        this.getProducts = products;
        this.getType = type;
    }

}
