package com.cdsb.files.serial;

import java.time.LocalDate;
import java.util.TimeZone;

import com.cdsb.files.FileSystem2;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonCyclist {

    Cyclist cyclist;
    String pathName = "demos-persis/resources/bikes.json";
    ObjectMapper mapper = new ObjectMapper();
    
    public JacksonCyclist() throws JsonMappingException, JsonProcessingException{
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        mapper.setDateFormat(null)
        cyclist = new Cyclist("Pepe", LocalDate.of(1983, 9, 18));
        
        System.out.println(cyclist);
    
    }

    void readBikes() throws JsonMappingException, JsonProcessingException {
        String jsoString = FileSystem2.readFileToString(pathName);
        bikes = bikesFromJSON(jsoString);
    }
    

    //deserialize or parse
    public Bicycle[] bikesFromJSON(String jsonString) throws JsonMappingException, JsonProcessingException {
        return mapper.readValue(jsonString, Bicycle[].class);
    }

    public static void main(String[] args) {
        try {
            JacksonCyclist jCyclist = new JacksonCyclist();
        } catch {

        }
    }
}
