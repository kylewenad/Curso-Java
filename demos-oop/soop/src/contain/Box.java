package contain;

import java.util.Set;
//referencia del producto
//dimension inicial del contenedor
//añadir el producto
//espacio que queda después de añadir el producto
//las cajas no tienen peso límite
//tipo de producto si es compatible para ponerlo en ese contenedor

import products.IProduct;
import products.Product;

public class Box extends Container {

    String getReference();
    int initialDimension();
    int dimensionLeft();
    int getResistance();
    Set<Product> getProducts();
    String getType();

    boolean add(IProduct product);
    boolean resistance(IProduct product);
}
