package contain;

import java.util.Set;
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
    int leftDimension;//espacio que queda en la bolsa despues de añadir el producto
    int initialWeigth; //peso inicial de la bolsa
    int maxWeight;//peso máximo del contenedor
    
    String getReference(); //referencia del pedido
    Set<Product> getProducts(); //lista de productos añadidos
    typeOfContainer getTypeOfContainer(); //tipo de contenedor

    boolean addIf(IProduct product); //añadir el producto si cumple las condiciones de tamaño
    boolean weight(IProduct product);//añadir el producto si cumple las condiciones de peso

    public String PlasticBag(String typeOfBag, int initialDimension, int leftDimension, int maxWeight, set products, type products){
        this.typeOfBag = typeOfBag;
        this.initialDimension = 0;
        this.dimensionLeft = dimensionLeft;
        this.maxWeight = maxWeight;
        this.getProducts = products;
        this.getTypeOfContainer = type;

        return PlasticBag(typeOfBag, initialDimension, leftDimension, maxWeight, products, null);
    }
    
    
}
