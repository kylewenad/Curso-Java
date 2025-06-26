package containers;

import enums.typeOfContainer;
import products.IProduct;
//cada producto tiene una referencia
//tamaño inicial del contenedor
//espacio restante del contenedor
//peso del producto y si el contenedor lo aguanta
//añadir los productos a los contenedores
//si entra en el contenedor o si se añade otro
//tipo de producto para saber si se añade a ese contenedor o no
//cantidad de contenedores que se van a utilizar y de qué tipos (bolsa o caja)
public interface IContainer {
//Tiene que hacer operaciones de cantidad de productos pedidos
//tamaño de los productos
//espacio que ocupan los pedidos
//si caben o no en bolsas o cajas
//peso de los productos
    String getReference();
    int initialDimension();
    int getDimension();
    int getResistance();
    Set<Product> getProducts();
    typeOfContainer getType();
    
    //Lógica de negocio
    int leftDimension();
    boolean addIf(IProduct product);
    boolean isResistanceOf(IProduct product);

}