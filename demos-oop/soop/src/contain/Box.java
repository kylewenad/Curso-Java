package contain;

import java.util.Set;
//referencia del producto
//dimension inicial del contenedor
//añadir el producto
//espacio que queda después de añadir el producto
//las cajas no tienen peso límite
//tipo de producto si es compatible para ponerlo en ese contenedor

import enums.typeOfContainer;
import products.IProduct;
import products.Product;

public class Box extends Container {

    private int depth; //ancho
    private int height; //largo
    private int length; //alto
    
    public Box(String reference, int depth, int height, int length) {
        super(reference);
        this.depth = depth; //ancho
        this.height = height; //largo
        this.length = length; //alto
    
    }
   
   
    
    
    @Override
    public typeOfContainer getTypeOfContainer() {
        return typeOfContainer.BOX;
    }
    
    @Override
    public int calculateSurface() {
        return length*depth;
    }

    @Override
    public int calculateDimension() {
        return calculateSurface() * height;
    }
    
    @Override
    public boolean isResistanceOf(IProduct product) {
        return true; //verdadero en las cajas
    }




    @Override
    public boolean canInsert(IProduct product) {
        // TODO Auto-generated method stub
        return super.canInsert(product);
    }
    @Override
    public int getDimensionProduct() {
        // TODO Auto-generated method stub
        return super.getDimensionProduct();
    }
    @Override
    public Set<IProduct> getProducts() {
        // TODO Auto-generated method stub
        return super.getProducts();
    }
    @Override
    public String getReference() {
        // TODO Auto-generated method stub
        return super.getReference();
    }
    @Override
    public int getWeightProduct() {
        // TODO Auto-generated method stub
        return super.getWeightProduct();
    }
    @Override
    public int initialDimension() {
        // TODO Auto-generated method stub
        return super.initialDimension();
    }
    @Override
    public int leftDimension() {
        // TODO Auto-generated method stub
        return super.leftDimension();
    }

   
}
