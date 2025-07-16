package com.cdsb.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileSystem2 {

    //Leer lista ficheros y carpetas
    public static String listFiles(String pathName) {

        StringBuilder sb = new StringBuilder();
        Path path = Path.of(pathName);//crea objetos
        
        if (Files.notExists(path)){
            return MessagesFS.FIL_NOT_EX.message;
        }

        if (!Files.isDirectory(path)){
            return MessagesFS.DIR_NOT.message;
        }

        try {
            Files.list(path).forEach((p) -> {
                char type = Files.isDirectory(p) ? 'D' :'F';
                sb.append("[").append(type).append("]");
                sb.append(pathName.toString()).append("\n");
            });
            return sb.toString();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    //Crear carpetas
    public static String createFolder(String pathName) {

        Path path = Path.of(pathName);

        if(Files.exists(path) && Files.isDirectory(path)) {
            return MessagesFS.DIR_EX.message;
        }

        if(Files.exists(path) && !Files.isDirectory(path)) {
            return MessagesFS.DIR_NOT.message;
        }

        try {
            Files.createDirectories(path);
            return MessagesFS.DIR_CREATED.message;
        } catch (Exception e) {
            return MessagesFS.FAIL_DIR.message.formatted(pathname) + "\n" +
            e.getMessage();
        }

        return "";
    }

    //Borra carpetas y ficheros
    public static String deleteFile(String pathName) {
        Path path = Paths.get(pathName);
        if(Files.notExists(path)) {
            return MessagesFS.FIL_NOT_EX.message;
        }
        try {
            Files.delete(path);
        } catch (Exception e) {
            return MessagesFS.FAIL_DEL.message.formatted(pathName)
            e.getMessage();
        }
    }
    
    public static String deleteFolder(String pathName) {
        
        Path path = Path.of(pathName);
        
        if(Files.isDirectory(path)) {
            try {
                Files.deleteIfExists(path);
            } catch (IOException e) {
                e.getMessage();
            }
            return MessagesFS.DEL_OK.message;
        }

        if(!Files.isDirectory(path)) {
            return MessagesFS.DIR_NOT.message;
        }

        if(Files.exists(path)) {
            try {
                Files.delete(path);
            } catch (IOException e) {
               e.getMessage();
            }
            return MessagesFS.DEL_OK.message;
        }

        if(Files.notExists(path)) {
            return MessagesFS.FIL_NOT_EX.message;
        }
        return pathName;
        
    }


    //Crear ficheros
    public static String createFile(String pathName) {
        
        Path path = Path.of(pathName);

        if(Files.exists(path)) {
            return MessagesFS.FIL_EX.message;
        }

        if(Files.notExists(path)) {
            try {
                Files.createFile(path);
                return MessagesFS.FIL_CREATE.message;
            } catch (IOException e) {
               return MessagesFS.FAIL_CREATE.message.formatted(pathName) + "\n" +
                e.getMessage();
            }
        }
        return pathName;
    }

    //Escribir en ficheros
    public static String writeFile(String pathName,String content) {
        
        Path path = Paths.get(pathName);

        if (content == null || content.isEmpty()) {
            return MessagesFS.FIL_EMPTY.message.formatted(pathName)
        }
        if (Files.notExists(path)) {
            String result = createFile(pathName);
            if (!result.contains("created")){
                return result;
            }
        }
        try {
            Files.writeString(path, content);
        } catch (IOException e) {
            return MessagesFS.FAIL_WRITE.message.formatted(pathName) + "\n" +
            e.getMessage();
        }
        return MessagesFS.WRITING.message.formatted(pathName);
        }

    //Leer un fichero
    public static List<String> readFileToList(String pathName) {
        List<String> lines = new ArrayList<>();
        return lines;
    }

    public static String readFileToString() {
        return "";
    }

    public static void main(String[] args) {
        String pathName;
        pathName = "demo-persis";
        pathName = "no_folder";
        //pathName = "demo-persis/pom.xml"
        System.out.println(pathName);
    }
}
