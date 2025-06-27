package products;

import enums.typeOfProducts;

//Set: una lista de elementos único
public abstract class Product implements IProduct {

    private String reference;
    int dimension;
    int weight;
    
    
    private Product(String referenceOfProduct, int dimension, int weight){
        this.reference = referenceOfProduct;
        this.dimension = dimension;
        this.weight = weight;
    }
    
    @Override
    public int getDimensionProduct() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getSurfaceProduct() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getTypeOfProduct() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getWeightProduct() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean hasSpace() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isCompatible() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void putInto() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getReferenceOfProduct() {
        return reference;
    }

}
