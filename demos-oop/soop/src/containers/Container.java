package containers;

import java.util.Set;

import enums.typeOfContainer;
import products.IProduct;

public abstract class Container implements IContainer {

    private String reference;
    private typeOfContainer type;
    private int dimension;


    public Container(String reference){
        this.reference = reference;
    }
    @Override
    public String getReference() {
        return reference;
    }
        
    @Override
    public typeOfContainer getType() {
        return type;
    }    
    
    @Override
    public int getDimension() {
        return dimension;
    }
    
    @Override
    public containers.Set<Product> getProducts() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public boolean addIf(IProduct product) {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public int getResistance() {
        // TODO Auto-generated method stub
        return 0;
    }

   
    }

    @Override
    public int initialDimension() {
        // TODO Auto-generated method stub
        return 0;
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
