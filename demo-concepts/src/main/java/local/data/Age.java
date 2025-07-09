package local.data;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Age {
//propiedades objeto "edad"
    private String birthDateString;
    private int years;
    private int months;
    private int days;


    void calculateAge(String birthDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDay = LocalDate.parse(birthDate, formatter);
        LocalDate actualDate = LocalDate.now();
        Period period = Period.between(birthDay, actualDate);
        years = period.getDays();
        months = period.getMonths();
        days = period.getDays();
    }

    void calculateAge(){
        calculateAge(birthDateString);
    }
    void askUserBirthDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (formato: dd/MM/yyyy):");
        birthDateString = scanner.nextLine();
        scanner.close();
    }

    @Override
    public String toString() {
        return "Usted tiene " + years + "años" +  months + "meses" + days+ "días";
    }

    public static void main(String[] args) {
        Age age = new Age();
        
        try {
            age.askUserBirthDate();
            age.calculateAge();
            System.out.println(age);

        } catch (Exception e) {
            System.out.println("Formato de fecha incorrecto. Use dd/MM/yyyy.");
        }
    }
}
