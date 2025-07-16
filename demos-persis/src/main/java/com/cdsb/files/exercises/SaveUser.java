package com.cdsb.files.exercises;

import java.util.Scanner;

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

    public saveUser(String pathName){
        this.pathName = pathName;
        askUserData();
        System.out.println(this);
    }
    
    @SuppressWarnings
    private void askUserData() {

        String[] answers = new String[3];
        String[] questions = {
            "Dime tu nombre",
            "Dime tu primer apellido",
            "Dime tu segundo apellido"
        };
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions.length);    
        }
        return
    }

    public static void main(String[] args) {
        SaveUser user = new SaveUser("demos-persis/resources/sample.txt");
        user.saveUserData();
        user.readUserData();
    }
}
