package com.cdsb.files.exercises;

import java.util.List;
import java.util.Scanner;

import com.cdsb.files.FileSystem;

//Pregúntale al usuario:
//Nombre
//Apellido1
//Apellido2
//Guárdalo en un fichero user.txt
//Muéstrale al usuario lo que has guardado
public class SaveUser {

    private String name;
    private String surname1;
    private String surname2;
    private String pathName;

    public SaveUser(String pathName){
        this.pathName = pathName;
        askUserData();
        System.out.println("=".repeat(50));
        System.out.println("Usuario guardado");
        System.out.println("=".repeat(50));
        System.out.println(this);    
    }
    
    public void askUserData() {

        String[] answers = new String[3];
        String[] questions = {
            "Dime tu nombre",
            "Dime tu primer apellido",
            "Dime tu segundo apellido"
        };
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions.length);
            answers[i] =scanner.nextLine();    
        }
        
        name = answers[0];
        surname1 = answers[1];
        surname2 = answers[2];
    }

    public void saveUserData() {
        FileSystem.createFile(pathName);
        String result = FileSystem.writeFile(pathName, makeFullName());
        System.out.println(result);
    }

    private String makeFullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(name.trim());
        sb.append(" ").append(surname1.trim());
        sb.append(" ").append(surname2.trim());
        return sb.toString();
    }

    public void readUserData() {
        List<String> read = FileSystem.readFileToList(pathName);
        showUserData(read);
    }

    private void showUserData(List<String> list){
        System.out.println("-".repeat(50));
        System.out.println("Leído desde el fichero");
        System.out.println("-".repeat(50));
        list.stream().forEach(System.out::println);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("SaveUser\n");
        sb.append("name: ");
        sb.append(name);
        sb.append("\n");
        sb.append("surname1: ");
        sb.append(surname1);
        sb.append("\n");
        sb.append("surname2: ");
        sb.append(surname2);
        sb.append("\n");
        sb.append("pathName: ");
        sb.append(pathName);
        sb.append("\n");
        return sb.toString();
    }
    public static void main(String[] args) {
        SaveUser user = new SaveUser(String pathName);
        user.askUserData(pathName);
        user.saveUserData(pathName);
        user.readUserData("demos-persis/resources/sample.txt");
    }
}
