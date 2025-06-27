package contain;

import java.util.Set;

import enums.typeOfContainer;
import products.IProduct;
import products.Product;
//referencia del pedido
//dimension inicial del paquete
//espacio que queda después de añadir el producto
//peso del producto
//peso inicial del contenedor
//si el contenedor resiste el peso
//peso después de añadir el producto
//tipo de producto y si es compatible para añadirlo con los otros
//productos que ya están en el contenedor
//tamaños de las bolsas
//pequeño, mediano, grande
//peso máximo de cada tipo de bolsa
public class PlasticBag extends Container {
    //propiedades
    String typeOfBag; //tipo de bolsa (pequeña, mediana, grande)
    int initialDimension;//espacio inicial de la bolsa
    int leftDimension;//espacio que queda en la bolsa después de añadir el producto
    int initialWeight; //peso inicial de la bolsa
    int maxWeight;//peso máximo del contenedor
    
    int height;
    int length;


    String getReference(); //referencia del pedido
    Set<Product> getProducts(); //lista de productos añadidos
    typeOfContainer getTypeOfContainer(); //tipo de contenedor

    boolean canInsert(IProduct product); //añadir el producto si cumple las condiciones de tamaño
    boolean weight(IProduct product);//añadir el producto si cumple las condiciones de peso

    public PlasticBag(String reference, int  height, int length, int weight){
        super(reference);
        this.height = height; //largo
        this.length = length; //alto
        this.maxWeight = weight;

        return ;
    }
    
     @Override
    public boolean isResistanceOf(IProduct product) {
        return false;
    }
    private int getDiameter() {
		return (int) ((2 * length) / Math.PI);
	}
    
    private int calculateSurface() {
    int radio = getDiameter() / 2;
		return (int) (Math.PI * radio * radio);
    }
    
    
}
