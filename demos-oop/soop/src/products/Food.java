package products;

import enums.typeOfProducts;

public abstract class Food extends Product {

    public Food(String referenceOfProduct, int dimensionOfProduct, int weightOfProduct){
        super(referenceOfProduct, dimensionOfProduct, weightOfProduct);
    }

    @Override
    public typeOfProducts getTypeOfProducts() {
        return typeOfProducts.FOOD;
    }
}
