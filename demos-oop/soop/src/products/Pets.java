package products;

import enums.typeOfProducts;

public class Pets extends Product {

    public Pets(String referenceOfProduct, int dimensionOfProduct, int weightOfProduct){
        super(referenceOfProduct, dimensionOfProduct, weightOfProduct);
    }

    @Override
    public typeOfProducts getTypeOfProducts() {
        return typeOfProducts.PETS;
    }

}
