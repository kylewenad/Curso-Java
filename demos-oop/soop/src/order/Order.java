package order;
import java.util.HashSet;
import java.util.Set;

import contain.IContainer;
import products.IProduct;
// ";" tipo genérico
public abstract class Order implements IOrder {

    private String reference;//referencia del pedido
    private Set<IContainer> containers;//lista de contenedores

    
    public Order(String reference) {
        this.reference = reference;
        this.containers = new HashSet<>();
    }

    @Override
    public String getReference() {
        return reference;
    }
    
    @Override
    public Set<IContainer> getContainer() {
        return containers;
    }

    @Override
    public Set<IProduct> getCalculatedProducts() {//calcula los productos comprados
        Set<IProduct> products = new HashSet<>();
        for (IContainer container : containers){ //recorre los productos que están dentro delos contenedores
        products.addAll(container.getProducts()); //recibe un conjunto(de productos comprados) y la añade a lista de productos
        }
        return products;        
    }


    @Override
    public void addContainer(IContainer container) {
    //para que guarde el contenedor en set IContainer
        containers.add(container);
    }

    @Override
    public IContainer addProduct(IProduct product) {
        for (IContainer container : containers) {
            if (container.canInsert(product));
                return container;
        }
        return null;
    }
    
    @Override
    public String toString() {
        String message = """
                Referencia: %s
                Hash:    %s
                """.formatted(reference, super.toString());

        for (IContainer container : containers) {
            message += container;
            //anotación húngara ej iContainer
        }
        return message;
    }//para que en vez de devolver un @.... nos devuelva la referencia del pedido y el hash
//los pedidos tienen que tener contenedores (bolsas, productos)
//tienen que calcular el numero de contenedores y tamaño que van a necesitar

    

    
    
}
