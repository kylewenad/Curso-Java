package com.cdsb.files.exercises;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class FileSystem {

    private static String[] messages = {
        "[FOLDER_NOT] Directory %s does not exist",
        "[NOT_IS_FOLDER] %s is not a directory",
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

    public static String listFiles(String pathName) {
        File file = new File(pathName);
        File[] fileList;
        StringBuilder sb = new StringBuilder();

        if(!file.exists()) {
            return messages[0].formatted(pathName);
        }
        if(!file.isDirectory()) {
            return messages [1].formatted(pathName);
        }
        fileList = fileList.toString()
    }

    public static String createFolder(String pathName) {
        File file = new File(pathName);

        if(file.exists() && file.isDirectory()) {
            return messages[3].formatted(pathName);
        }
        if(file.exists() && !file.isDirectory()) {
            return messages[4].formatted(pathName);
        }
        if(!file.mkdirs()) {
            return messages[5].formatted(pathName);
        }
        return messages[6].formatted(pathName);
    }

    public static String deleteFolder(String pathName) {
        return messages[7]. formatted(pathName);
    }

    public static String createFile(String pathName) {
        return messages[10].formatted(pathName);
    }

    public static String writeFile(String pathname, String content) {
        if(content == null)
        return;
    }
 
    public static List<String> readFileToList(String pathName) {
        File file = new File(pathName);
        List<String> lines = new ArrayList<>();

        if (!file.exists()) {

        }
        return "";
    }

    public static String readFileToString(String pathname) {
        File file = new File(pathName);

        StringBuilder sb = new StringBuilder();

        if (!file.exists()){
            return;
        }


        return sb.toString();
    }

}
