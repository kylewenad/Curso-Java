package Soop.containers;

import Soop.products.IProduct;

public interface IContainer {

    String getReference();
    int initialDimension();
    int dimensionLeft();
    int getResistance();
    Set<Product> getProducts();
    String getType();

    boolean put(IProduct product);
    boolean resistance(IProduct podruct);

}