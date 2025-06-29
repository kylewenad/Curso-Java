package products;

//Set: una lista de elementos único
public abstract class Product implements IProduct {

    private String reference;
    int dimension;
    int weight;
    
    
    protected Product(String referenceOfProduct, int dimension, int weight){
        this.reference = referenceOfProduct;
        this.dimension = dimension;
        this.weight = weight;
    }
    
    @Override
    public String getReferenceOfProduct() {
        return reference;
    }
    
    @Override
    public int getDimensionProduct() {
        return dimension;
    }

    @Override
    public int getWeightProduct() {
        return weight;
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
    public String toString() {
        String message = "[%s] %s %s cm3 - %s g".formatted(
        getTypeOfProducts().toString().toUpperCase(),    
        reference, dimension, weight);
        return message;
    }

}
