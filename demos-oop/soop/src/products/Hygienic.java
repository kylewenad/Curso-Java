package products;

import enums.typeOfProducts;

public class Hygienic extends Product {

    public Hygienic(String referenceOfProduct, int dimensionOfProduct, int weightOfProduct){
        super(referenceOfProduct, dimensionOfProduct, weightOfProduct);
    }

    @Override
    public typeOfProducts getTypeOfProducts() {
        return typeOfProducts.HYGIENIC;
    }


}
