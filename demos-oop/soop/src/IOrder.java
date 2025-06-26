
import java.util.Set;
// get
//referencia del pedido
//referencia de productos
//referencia contenedores

import containers.IContainer;
import products.IProduct;

public interface IOrder {
    
    String reference = "";
    
    //set es un conjunto que "de momento" está vacío
    //set no tiene orden ej, cuando hago la compra no añado
    //en orden los productos que voy a comprar

    String getReference();
    Set<IProduct> getProducts();
    Set<IContainer> getContainer();

    //añadir contenedores
    //añadir conjuntos
    void addContainer(IContainer container);
    IContainer addProduct(IProduct product);
}