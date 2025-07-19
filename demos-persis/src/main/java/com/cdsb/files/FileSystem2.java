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
            return MessagesFS.FIL_NOT_EX.message.formatted(pathName);
        }

        if (!Files.isDirectory(path)){
            return MessagesFS.DIR_IS_NOT.message.formatted(pathName);
        }

        try {
            Files.list(path).forEach((p) -> { //para saber el tipo de documento 'D' carpeta, 'F' archivo
                char type = Files.isDirectory(p) ? 'D' :'F';
                sb.append("[").append(type).append("]");
                sb.append(pathName.toString()).append("\n");
            });
            return sb.toString();
        } catch (IOException e) {
            return MessagesFS.ERROR_READ + "\n" + e.getMessage();
        }
    }

    public static String listFiles(String pathName, boolean onlyFiles) {
        StringBuilder sb = new StringBuilder();
        if(!onlyFiles) {
            return listFiles(pathName);
        }

        Path path = Paths.get(pathName);
        
        if (Files.notExists(path)) {
            return MessagesFS.DIR_NOT_EX.message.formatted(pathName);
        }

        if(!Files.isDirectory(path)) {
            return MessagesFS.DIR_IS_NOT.message.formatted(pathName);
        }

        try {
            Files.list(path).filter(file ->!Files.isDirectory(file)).forEach((p) -> {
                char type = Files.isDirectory(p) ? 'D' : 'F';
                sb.append("[").append(type).append("]");
                sb.append(p.getFileName()).append("\n");
            });
            return sb.toString();
        } catch (IOException e) {
            return MessagesFS.ERROR_LIST + "\n" + e.getMessage();
        }
    }

    //Crear carpetas
    public static String createFolder(String pathName) {

        Path path = Path.of(pathName);

        if(Files.exists(path) && Files.isDirectory(path)) {
            return MessagesFS.DIR_EX.message.formatted(pathName);
        }

        if(Files.exists(path) && !Files.isDirectory(path)) {
            return MessagesFS.DIR_IS_NOT.message.formatted(pathName);
        }

        try {
            Files.createDirectories(path);
            return MessagesFS.DIR_CREATED.message.formatted(pathName);
        } catch (IOException e) {
            return MessagesFS.FAIL_DIR_CREATE.message.formatted(pathName) + "\n" + e.getMessage();
        }
    }

    //Borra carpetas y ficheros
    public static String deleteFile(String pathName) {
        Path path = Paths.get(pathName);
        if(Files.notExists(path)) {
            return MessagesFS.FIL_NOT_EX.message.formatted(pathName);
        }
        try {
            Files.delete(path);
        } catch (Exception e) {
            return MessagesFS.FAIL_DEL.message.formatted(pathName) + "\n" + e.getMessage();
        }
        return MessagesFS.DEL_OK.message.formatted(pathName);
    }
    
    public static String deleteFileOrFolder(String pathName) {
        
        Path path = Path.of(pathName);
        
        if(Files.notExists(path)) {
            return ("File of directory does not exist: " + pathName);
        }
        if (!Files.isDirectory(path)) {
            deleteFile(pathName);
        } 
        
        try {
            boolean hasError = Files.walk(path).sorted((a,b) -> b.compareTo(a))
            .anyMatch(p -> {
                try {
                    Files.delete(p);
                    return false;
                } catch (IOException e) {
                    return true;
                }
            });
            if (hasError) {
                return MessagesFS.FAIL_DEL.message.formatted("directory", pathName);
            }
            return MessagesFS.DEL_OK.message.formatted(pathName);
        } catch (IOException e) {
            return MessagesFS.FAIL_DEL.message.formatted(pathName) + "\n" + e.getMessage();
        }
    }     
    //Crear ficheros
    public static String createFile(String pathName) {
        
        Path path = Paths.get(pathName);

        if(Files.exists(path) && Files.isDirectory(path)) {
            return MessagesFS.DIR_EX.message.formatted(pathName);
        }

        if(Files.exists(path)) {
            return MessagesFS.FIL_EX.message.formatted(pathName);
        }

        try {
            Files.createFile(path);
            return MessagesFS.FIL_CREATE.message.formatted(pathName);
        } catch (IOException e) {
            return MessagesFS.FAIL_FIL_CREATE.message.formatted(pathName) + "\n" + e.getMessage();
        }
    }

    //Escribir en ficheros
    public static String writeFile(String pathName,String content) {
        
        Path path = Paths.get(pathName);

        if (content == null || content.isEmpty()) {
            return MessagesFS.FIL_EMPTY.message.formatted(pathName);
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
            return MessagesFS.ERROR_WRITE.message.formatted(pathName) + "\n" +
            e.getMessage();
        }
        return MessagesFS.WRITING.message.formatted(pathName, content);
    }

    //Leer un fichero
    public static List<String> readFileToList(String pathName) {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get(pathName);
        if (!Files.exists(path)) {
            lines.add(MessagesFS.FIL_NOT_EX.message.formatted(pathName));
            return lines;
        }
        try {
            lines.addAll(Files.readAllLines(path));
            return lines;
        } catch (IOException e) {
            lines.add(MessagesFS.ERROR_READ.message.formatted(pathName));
            return lines;
        }
    }

    public static String readFileToString(String pathName) {
        
        Path path = Paths.get(pathName);
        if (!Files.exists(path)){
            return MessagesFS.FIL_NOT_EX.message.formatted(pathName);
        }
        try {
            return Files.readString(path);
        } catch (IOException e) {
            return MessagesFS.ERROR_READ.message.formatted(pathName) + "\n" + e.getMessage();
        }
        
    }

    public static void main(String[] args) {
        String pathName;
        pathName = "no_folder";
        pathName = "demo-persis/pom.xml";
        pathName = "demo-persis";
        System.out.println(pathName);
        pathName = "demos-persis/resources";
        pathName = "demos-persis/pom.xml";
        pathName = "demos-persis/resources/sample";
        System.out.println(createFolder(pathName));
        pathName = "demo-persis/resources/sample/sample.txt";
        System.out.println(writeFile(pathName, "Holaaaaaaaaaaaaa"));
        pathName = "demos-persis/resources/sample.txt";
        System.out.println(readFileToList(pathName));
    }
}
