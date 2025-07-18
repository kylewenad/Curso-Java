package com.cdsb.serial;

import com.cdsb.files.FileSystem2;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

//tener todo lo relacionado con Json (Refactorización)
public class JsonTools {
    
    private static ObjectMapper mapper = new ObjectMapper();
    
    private static void setConfig() {
        mapper.setVisibility(PropertyAccessor.FIELD,Visibility.ANY);// Para que sean visibles
                                                                    // This allows Jackson to serialize/deserialize private fields
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); // This is needed to avoid writing dates as timestamps
        mapper.registerModule(new JavaTimeModule());
    }

    //Obj -> (toJson) -> String (JSON)
    public static <T extends Object> String toJson(T obj) {//cojo objeto(el padre de todos los objetos de java) y lo convierto a Json
        setConfig();
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    //String -> (fromJson) -> clase -> Obj
    public static <T> T fromJson(String jsonString, Class <T> clazz) {//String con formato Json y me da un objeto Json
        setConfig();
        try {
            return mapper.readValue(jsonString, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
        
    }

    public static <T extends Object> void toJsonFile(T obj, String filePath) {
        setConfig();
        try {
            String jSonValue = mapper.writeValueAsString(obj);
            FileSystem2.writeFile(filePath, jSonValue);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public static <T> T fromJsonFile(String filePath, Class<T> clazz) {//String con formato Json y me da un objeto Json
        setConfig();
        try {
        String jsonString = FileSystem2.readFileToString(filePath);
        return mapper.readValue(jsonString, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
