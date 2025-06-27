package contain;

import java.util.Set;

import enums.typeOfContainer;
import products.IProduct;
import products.Product;

public class Bag extends Container {
    //propiedades
  
    private int length;

    public Bag(String reference, int  height, int length, int weight){
        super(reference);
        this.height = height; //largo
        this.length = length; //alto
        this.maxWeight = weight;
            return ;
    }
    private int getDiameter() {
		return (int) ((2 * length) / Math.PI);
	}
    
    public int calculateSurface() {
    int radio = getDiameter() / 2;
		return (int) (Math.PI * radio * radio);
    }
    
    @Override
    public typeOfContainer getTypeOfContainer() {
        return typeOfContainer.BAG;
    }

    @Override
    public boolean isResistanceTo(IProduct product) {//añadir el producto si cumple las condiciones de peso
        return false;
    }
}
