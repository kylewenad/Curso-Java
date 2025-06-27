package order;

import java.util.Set;

import contain.IContainer;
import products.IProduct;

public interface IOrder {
    // get
    
    //set es un conjunto que "de momento" está vacío
    //set no tiene orden ej, cuando hago la compra no añado
    //en orden los productos que voy a comprar

    String getReference();//referencia del pedido
    Set<IContainer> getContainer();//referencia contenedores utilizados
    
    //añadir contenedores
    //añadir conjuntos
    Set<IProduct> getCalculatedProducts();//referencia de productos comprados
    void addContainer(IContainer container);
    IContainer addProduct(IProduct product);
}