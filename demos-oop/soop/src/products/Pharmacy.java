package products;

import enums.typeOfProducts;

public class Pharmacy extends Product {
    public Pharmacy(String referenceOfProduct, int dimensionOfProduct, int weightOfProduct){
        super(referenceOfProduct, dimensionOfProduct, weightOfProduct);
    }

    @Override
    public typeOfProducts getTypeOfProducts() {
        return typeOfProducts.PHARMACY;
    }
}
