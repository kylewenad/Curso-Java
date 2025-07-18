package com.cdsb.serial;

import java.time.LocalDate;

//Cómo estructurar el código y trabajar con funciones genéricas
public class JacksonCyclist2 {

    Cyclist cyclist;
    String pathCyclistJson = "demos-persis/resources/cyclist.json";
    String pathBikesJson = "demos-persis/resources/bikes.json";
    JsonTools jsonTools = new JsonTools();
    
    public JacksonCyclist2(JsonTools jsonTools) {
        this.jsonTools = jsonTools;
        cyclist = new Cyclist("Pepe", LocalDate.of(1983, 9, 18));
        addBikes();
        System.out.println(cyclist);
    }
    
    private void addBikes(){
        Bicycle[] bikes;
        bikes = JsonTools.fromJsonFile(pathBikesJson, Bicycle[].class);
        for (int i = 0; i < bikes.length; i++) {
            cyclist.addBike(bikes[i]);
        } 
    }

    private void saveCyclist () {
        System.out.println("Saving cyclist...");
        JsonTools.toJsonFile(cyclist, pathCyclistJson);
        Cyclist saveCyclist = JsonTools.fromJsonFile(pathCyclistJson, Cyclist.class);
        System.out.println("Saved Cyclist: " + saveCyclist);

    }
    //deserialize or parse
  
    public static void main(String[] args) {
        JacksonCyclist2 jCyclist = new JacksonCyclist2(new JsonTools());
        jCyclist.saveCyclist();
    }
}
//TODO, no funciona arreglar
