package com.cdsb.serial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cyclist {
    
    private String name;
    private LocalDate birthdate;
    private List<Bicycle> bikes = new ArrayList<Bicycle>();

    public void addBike(Bicycle bike) {
        bikes.add(bike);
    }

    public Cyclist() {}

    public Cyclist(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return 
            "Cyclist [name = " + name + 
            ",\nbirthdate = " + birthdate + 
            ",\nbikes = " + bikes + "]";
    }
}
