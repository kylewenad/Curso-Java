package enums;

public enum typeOfFood {

    FRESHFOOD("alimentos frescos"), FROZEN("congelados"), NONPERISHABLE("no perecederos");

    String name;
    typeOfFood (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
