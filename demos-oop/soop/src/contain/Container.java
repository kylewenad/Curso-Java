package contain;
import java.util.Set;

import enums.typeOfContainer;
import products.IProduct;
import products.Product;

public abstract class Container implements IContainer {

    private String reference; //referencia del contenedor
    private typeOfContainer type; //tipo de contenedor: bolsa o caja
    private int initialDimension; //dimensiones del contenedor antes de añadir el producto
    private int leftDimension; //espacio que queda en el contenedor
    private int maxWeight; //peso máximo del contenedor
    private Set<IProduct> products;

    public Container(String reference){
        this.reference = reference;
    }

    @Override
    public String getReference() {
        return reference;
    }
    
    @Override
    public int initialDimension() {
        return initialDimension;
    }   
    
    @Override
    public int getDimensionProduct() {
        return getDimensionProduct();
    }
    
    @Override
    public int getWeightProduct() {
       return getWeightProduct();
   }
    
   @Override
    public typeOfContainer getTypeOfContainer() {
        return type;
    }    
    
    @Override
    public Set<IProduct> getProducts() {
        return products;
    }


    @Override
    public boolean addIf(IProduct product) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isResistanceOf(IProduct product) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int leftDimension() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
