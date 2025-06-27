package contain;

import java.util.Set;
//referencia del producto
//añadir el producto
//espacio que queda después de añadir el producto
//las cajas no tienen peso límite
//tipo de producto si es compatible para ponerlo en ese contenedor

import enums.typeOfContainer;
import products.IProduct;
import products.Product;

public class Box extends Container {

    private int depth; //ancho
    private int length; //alto
    
    public Box(String reference, int depth, int height, int length) {
        super(reference);
        this.depth = depth; //ancho
        this.height = height; //largo
        this.length = length; //alto

    }
   
    @Override
    public typeOfContainer getTypeOfContainer() {
        return typeOfContainer.BOX;
    }
    
    @Override
    public int calculateSurface() {
        return length*depth;
    }

}
