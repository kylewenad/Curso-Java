package enums;
public enum typeOfProducts {

    FOOD("alimentos"), HYGIENIC("higiene"), PHARMACY("farmacia"), PETS("animales");

    String name;
    typeOfProducts (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
