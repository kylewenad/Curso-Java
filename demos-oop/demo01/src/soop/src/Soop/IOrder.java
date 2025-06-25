package Soop;

import java.util.Set;

public interface IOrder {
    
    String getReference();
    Set<IProduct> getProducts();
    Set<IContainer> getContainer();

    void addContainer(IContainer container);
    IContainer addProduct(IProduct product);
}