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

    int calculateSurfaceOfProduct();
    int calculateDimensionOfProduct();
      
    
    

}