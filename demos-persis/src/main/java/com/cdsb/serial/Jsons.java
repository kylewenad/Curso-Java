package com.cdsb.serial;

import com.cdsb.files.FileSystem2;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

//Misma clase que JsonTools pero son STATIC
public class Jsons {

    private static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public static <T extends Object> String toJson(T obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T fromJson(String json, Class<T> clazz){
        try {
            return mapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T extends Object> void toJsonFile(T obj, String filePath){
        try {
            String json = mapper.writeValueAsString(obj);
            FileSystem2.writeFile(filePath, json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public static <T> T fromJsonFile(String filePath, Class<T> clazz) {
        try{
        String json = FileSystem2.readFileToString(filePath);
            return mapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
