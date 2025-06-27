package products;

import enums.typeOfProducts;

//Set: una lista de elementos único
public abstract class Product implements IProduct {

    private String reference;
    typeOfProducts products;
    int surface;
    int dimension;
    int weight;
    
    
    private Product(typeOfProducts products, String referenceOfProduct, int surface, int dimension, int weight){
        this.products = products;
        this.reference = referenceOfProduct;
        this.surface = surface;
        this.dimension = dimension;
        this.weight = weight;
    }
    
    @Override
    public String getReferenceOfProduct() {
        return reference;
    }
    
    @Override
    public int calculateDimension() {
        return calculateSurface() * height;
    }
    
    @Override
    public int calculateSurface() {
        return length*depth;
    }

    


}
