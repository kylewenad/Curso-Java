package contain;
import java.util.Set;

//import enums.typeOfContainer;
import products.IProduct;
//import products.Product;

public abstract class Container implements IContainer {

    private String reference; //referencia del contenedor
    //? private typeOfContainer type; //tipo de contenedor: bolsa o caja
    //?private int initialDimension; //dimensiones del contenedor antes de añadir el producto
    //? private int leftDimension; //espacio que queda en el contenedor
    protected int maxWeight; //peso máximo del contenedor
    protected int height;
    
    private Set<IProduct> products;
    

    public Container(String reference){
        this.reference = reference;
    }

    @Override
    public String getReference() {
        return reference;
    }
    
    @Override
    public Set<IProduct> getProducts() {
        return products;
    }

    @Override
    public int calculateDimension() {
        return calculateSurface() * height; 
    }

    @Override
    public boolean canInsert(IProduct product) {
        return false;
    }

    @Override
    public boolean isResistanceTo(IProduct product) {
        return false;
    }

    @Override
    public int leftDimension() {
        return 0;
    }

     @Override
    public String toString() {
        String message = """
                %s ref %s
                Hash:    %s
                """.formatted(getTypeOfContainer(), reference, super.toString()); //se puede utilizar el getType porque la interfaz de container está escrito
        return message;
    }
}
