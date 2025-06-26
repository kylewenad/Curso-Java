package contain;

import java.util.Set;

import enums.typeOfContainer;
import products.IProduct;

public interface IContainer {

    String getReference(); //referencia del pedido
    int initialDimension(); //espacio antes de añadir el producto
    int getDimensionProduct(); //espacio que ocupa el producto
    int getWeightProduct(); //peso del producto
    typeOfContainer getTypeOfContainer(); // tipo de producto (alimento, mascota, higiene ó farmacia)
    Set<IProduct> getProducts();  //lista de productos añadidos
    
    //Lógica de negocio
    boolean addIf(IProduct product); //añadir el producto si cumple las condiciones de tamaño
    boolean isResistanceOf(IProduct product); //añadir el producto en bolsa o caja si aguanta el peso
    int leftDimension(); // espacio que queda después de añadir el producto

}