package products;
//crear la referencia del producto
//crear el producto, dimensiones, peso y tipo

import enums.typeOfProducts;

public interface IProduct {
    
    String getTypeOfProduct();
    String getReferenceOfProduct();
    int getSurfaceProduct();
    int getDimensionProduct();
    int getWeightProduct();

    boolean isCompatible(); //si el producto a añadir es compatible con los productos ya añadidos
    boolean hasSpace();//si el producto entra en el contendeor
    void putInto();//si se cumpllen las condiciones de compatibilidad y espacio, añadir el producto al contenedor
    
    

}