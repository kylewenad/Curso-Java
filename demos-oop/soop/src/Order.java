import java.util.Set;
//por defecto tienen un constructor pero no definido
import containers.IContainer;
import products.IProduct;

public abstract class Order implements IOrder {

    private String reference;
    private Set<IContainer> containers;
    private Set<IProduct> products;

    
    public Order(String reference) {
        this.reference = reference;
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
    public Set<IProduct> getProducts() {
        return products;
    }

    @Override
    public void addContainer(IContainer container) {
    //para que lo guarde en set Icontainer
        this.containers.add(container);
    }

    @Override
    public IContainer addProduct(IProduct product) {
    //IContainer es de tipo void, me tiene que devolver
    //el contenedor     
        products.add(product);

        //TODO añadir al container

        return null;
    }



//los pedidos tienen que tener contenedores (bolsas, productos)
//tienen que calcular el numero de contenedores y tamaño que van a necesitar

    

    
    
}
