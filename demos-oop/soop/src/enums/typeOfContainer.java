package enums;


public enum typeOfContainer {

    BAG("bolsa"), BOX("caja");

    String name;

    typeOfContainer (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}