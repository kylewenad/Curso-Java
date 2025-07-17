package com.cdsb.files.serial;

import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.List;

import com.cdsb.files.FileSystem2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonBike {

    List<Bicycle> listOfBikes = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();

    String pathName = "demo-persis/resources/demo";
    
    JacksonBike(){
        Bicycle[] bicycles = {
            new Bicycle("Decathlon", "Nose",30, "black", 20, true),
            new Bicycle("Giant", "Defy", 30, "blue", 18, false),        
        };
        listOfBikes = List.of(bicycles);
    }

    //serialize
    public String toJSON(){
        
        try {
            String jsonString = mapper.writeValueAsString(listOfBikes);
            return jsonString;
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
    }
    //deserialize or parse
    public void fromJSON(String jsonString) {
        mapper.
    }

    public String save(String data) {
        return FileSystem2.writeFile(pathName, data);

    }

    public String read() {
        return FileSystem2.readFileToString(pathName);
    }

    public static void main(String[] args) {
        JacksonBike jBike = new JacksonBike();
        System.err.println(jBike.listOfBikes);
        System.out.println(jBike.toJSON());
    }
}
