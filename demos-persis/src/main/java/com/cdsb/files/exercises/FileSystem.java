package com.cdsb.files.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class FileSystem {

    private static String[] messages = {
        "[0][DIR_NOT_EXIST][DIR]Directory %s does not exist",
        "[1][DIR_EXIST][DIR][DIR] Directory %s exist",
        "[2][FIL_EXIST][FIL] %s File exist"
    };

    public static String listFiles(String pathName) {
        // El objeto File representa un archivo o directorio en el sistema de archivos.
        // Independientemente de si este existe o no.
        File file = new File(pathName);
        File[] filesList;
        StringBuilder sb  = new StringBuilder();

        if(!file.exists()) {
            return messages[0].formatted(pathName);
        }
        if(!file.isDirectory()) {
            return messages [1].formatted(pathName);
        }
        filesList = file.listFiles();
    
        if(filesList == null || filesList.length == 0) {
            return messages[2].formatted(pathName);
        }
    
        for (File fileItem : filesList) {
        char type = fileItem.isDirectory() ? 'D' : 'F';
        sb.append("[%s] - %s".formatted(type, fileItem.getName()));
        }
        return sb.toString();
    }
    //Crear carpetas
    public static String createFolder(String pathName) {
        File file = new File(pathName);

        if(file.exists() && file.isDirectory()) {
            return messages[3].formatted(pathName);
            
        }
        if(file.exists() && !file.isDirectory()) {
            return messages[4].formatted(pathName);
        }
        // Para crear un directorio, debemos llamar al método mkdir() o mkdirs()
        // mkdir() crea un único directorio, mientras que mkdirs() crea todos los
        // directorios necesarios en la ruta especificada.
        // Devuelven true o false dependiendo de si la operación fue exitosa o no.

        if(!file.mkdirs()){
            return messages[5].formatted(pathName);
        }
        return messages[6].formatted(pathName);
    }

    public static String deleteFolder(String pathName) {
        File file = new File(pathName);
        char type = file.isDirectory() ? 'D' : 'F';

        if(!file.exists()){
            return messages[0].formatted(pathName);
        }

        if (!file.delete()){
            return messages[7].formatted(type, pathName);
        }
        return messages[9].formatted(pathName);
    }

    public static String createFile(String pathName) {
        File file = new File(pathName);
        
        if(file.exists() && file.isDirectory()) {
            return messages[10].formatted(pathName);
        }

        if(file.exists() && !file.isDirectory()) {
            return messages[4].formatted(pathName);
        }

        try {
            if(!file.createNewFile()) {
                return messages[9].formatted(pathName);
            }
        } catch (Exception e) {
            return messages[9].formatted(pathName);
        }
        // If the file is created successfully, we can write to it.
        // For now, we just print a message.
        // In a real application, we would write to the file here.
        return messages[10].formatted(pathName);
    }

    public static String writeFile(String pathName, String content) {
        
        if(content == null || content.isEmpty()) {
            return messages[11].formatted(pathName);
        }

        try (FileWriter writer = new FileWriter(pathName)){
            writer.write(content);
        } catch (IOException e) {
            return messages[12].formatted(pathName);
        }
        return messages[13].formatted(pathName);
    }
 
    public static List<String> readFileToList(String pathName) {
        File file = new File(pathName);
        List<String> lines = new ArrayList<>();

        if (!file.exists()) {
            lines.add(messages[14].formatted(pathName));
            return lines;
        }

        try (Scanner scanner = new Scanner (file)){
            // Scanner es utilizado para leer el archivo línea por línea.
            // Lanza FileNotFoundException si el archivo no existe o 
            // si ha habido algún error leyendo el archivo.
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            lines.add(messages[15].formatted(pathName));
            return lines;
        }
        return lines;
    }

    public static String readFileToString(String pathName) {
        File file = new File(pathName);
        StringBuilder sb = new StringBuilder();

        if (!file.exists()) {
            return messages[14].formatted(pathName);
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                sb.append(line);
                sb.append("\n");
            }
        } catch (FileNotFoundException e) {
            return messages[15].formatted(pathName);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String pathName = "demos-persis/resources";
        //pathName = "demos-persis/resources"
        //pathName = "demos-persis/pom.xml"
        listFiles(pathName);
        //createFolder(pathName);
        //deleteFolder(pathName);
        //pathName = "demos_fault";
        //deleteFolder(pathName);
        //pathName = "demos-persis/resources/sample.txt";
        //createFile(pathName);
        //writeFile(pathName, "Hola \nAdiós");
        //System.out.println("=".repeat(50));
        //readFileToList(pathName);
    }
}//TODO revisar

