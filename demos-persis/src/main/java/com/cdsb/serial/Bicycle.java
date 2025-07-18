package com.cdsb.serial;

public class Bicycle {

    private String brand;
    private String model;
    private int radioWheel;
    private String color;
    private int gears;
    private boolean isCustomizable;
    
    public Bicycle(){
        //constructor por defecto para la serialización
    }

    public Bicycle(String brand, String model, int radioWheel, String color, int gears, boolean isCustomizable) {
        this.brand = brand;
        this.model = model;
        this.radioWheel = radioWheel;
        this.color = color;
        this.gears = gears;
        this.isCustomizable = isCustomizable;
    }

    @Override
    public String toString() {
        return 
            "-------------------------------------------" +
            "Bicycle [brand=" + brand +
            ", model=" + model + 
            ", radioWheel=" + radioWheel + 
            ", color=" + color + 
            ", gears=" + gears + 
            ", isCustomizable=" + isCustomizable + "]";
    }
}
