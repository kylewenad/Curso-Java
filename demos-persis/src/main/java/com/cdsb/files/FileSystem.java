package com.cdsb.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class FileSystem {

    private static String[] messages = {
        "Directory %s does not exist",
        "%s is not a directory",
        "No files found in the directory: %s",
        "Directory %s exist",
        "File %s exist",
        "Failed to create directory: ",
        "Directory %s created",
        "Failed to delete: %s %s",
        "%s %s deleted.",
        "Failed to created file: %s",
        "File %s created.",
        "Content empty, nothing to write to file: %s",
        "Error writing file: %s",
        "Writing to file %s: %s",
        "File does not exist: %s",
        "Error reading file: %s"
    };

    public static void listFiles(String pathName) {
        // El objeto File representa un archivo o directorio en el sistema de archivos.
       // Independientemente de si este existe o no.
        File file = new File(pathName);

        if(!file.exists()) {
            System.out.println(messages[0].formatted(pathName));
            return;
        }
        if(!file.isDirectory()) {
           System.out.println(messages [1].formatted(pathName));
            return;
        }
        File[] filesList = file.listFiles();
    
        if(filesList == null || filesList.length == 0) {
            System.out.println(messages[2].formatted(pathName));
            return;
        }
    
        for (File fileItem : filesList) {
        char type = fileItem.isDirectory() ? 'D' : 'F';
        System.out.println("[%s] - %s".formatted(type, fileItem.getName()));
        }
    }
    //Crear carpetas
    public static void createFolder(String pathName) {
        File file = new File(pathName);

        if(file.exists() && file.isDirectory()) {
            System.out.println(messages[3].formatted(pathName));
            return;
        }
        if(file.exists() && !file.isDirectory()) {
            System.out.println(messages[4].formatted(pathName));
            return;
        }
         // Para crear un directorio, debemos llamar al método mkdir() o mkdirs()
        // mkdir() crea un único directorio, mientras que mkdirs() crea todos los
        // directorios necesarios en la ruta especificada.
        // Devuelven true o false dependiendo de si la operación fue exitosa o no.

        if(!file.mkdirs()){
            System.out.println(messages[5].formatted(pathName));
        }
        messages[6].formatted(pathName);
    }

    public static void deleteFolder(String pathName) {
        File file = new File(pathName);

        if(!file.exists()){
            System.out.println(messages[7]. formatted(pathName));
            return;
        }

        char type = file.isDirectory() ? 'D' : 'F';

        if (!file.delete()){
            System.out.println("Failed to delete " + type + pathName);
            return;
        }
        System.out.println(messages[9].formatted(pathName));
    }

    public static void createFile(String pathName) {
        File file = new File(pathName);
        
        if(file.exists() && file.isDirectory()) {
            System.out.println(messages[10].formatted(pathName));
            return;
        }

        if(file.exists() && !file.isDirectory()) {
            System.out.println(messages[4].formatted(pathName));
            return;
        }

        try {
            if(!file.createNewFile()) {
                System.out.println(messages[9].formatted(pathName));
                return;
            }
        } catch (Exception e) {
            System.err.println("Error creating file: " + pathName);
            return;
        }
        // If the file is created successfully, we can write to it.
        // For now, we just print a message.
        // In a real application, we would write to the file here.
        System.out.println("File " + pathName + " created.");
    }

    public static void writeFile(String pathName, String content) {
        

        if(content == null || content.isEmpty()) {
            System.out.println(messages[11].formatted(pathName));
            return;
        }

        try (FileWriter writer = new FileWriter(pathName)){
            writer.write(content);
        } catch (IOException e) {
            System.out.println(messages[12].formatted(pathName));
        }
        System.out.println(messages[13].formatted(pathName));
        return;
    }
 
    public static List<String> readFileToList(String pathName) {
        File file = new File(pathName);
        List<String> lines = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        if (!file.exists()) {
            System.out.println(messages[14].formatted(pathName));
            return lines;
        }
        try (Scanner scanner = new Scanner (file)){
            // Scanner es utilizado para leer el archivo línea por línea.
            // Lanza FileNotFoundException si el archivo no existe o 
            // si ha habido algún error leyendo el archivo.
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
                lines.add(line);
                sb.append(line);
                sb.append("\n");
            }
            System.out.println("Read file: " + pathName);
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + pathName);
            return lines;
        }
        System.out.println(lines);
        System.out.println(sb.toString());
        return lines;
    }

    public static void main(String[] args) {
        String pathName = "demos-persis";
        //pathName = "demos-persis/resources"
        //pathName = "demos-persis/pom.xml"
        listFiles(pathName);
        createFolder(pathName);
        deleteFolder(pathName);
        pathName = "demos_fault";
        deleteFolder(pathName);
        pathName = "demos-persis/resources/sample.txt";
        createFile(pathName);
        writeFile(pathName, "Hola \nAdiós");
        System.out.println("=".repeat(50));
        readFileToList(pathName);
    }
}
