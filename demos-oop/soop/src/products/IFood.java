package products;

import enums.typeOfFood;

public interface IFood {

    typeOfFood getTypeOfFood();
    boolean isFresh();
    boolean isFrozen();
    boolean isNonPerishable();
}