package local.collections.exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.DateFormatter;

//Defina una List con la clase Empleado antes definida
//(con nombre, apellidos, fecha de contratación y número de empleado).

//Esta ordenación se reflejará en un método de la clase Empleado, compareTo(obj o),
//que permite comparar el objeto en curso (this) con el objeto recibido,
//que devuelve -1 si es menor que el recibido, 0 si son iguales y 1 si es mayor que el recibido.
public class Employee implements Comparable <Employee>{
    
    private String name;
    private String surname;
    private LocalDate date;
    private int employeeId;
    
    public Employee(String name, String surname, String date, int employeeId) {
        this.name = name;
        this.surname = surname;
        this.date = formatDate(date);
        this.employeeId = employeeId;
    }

    private LocalDate formatDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        
        return date;
    }

    private long calculateEmployDays(){ //Para calcular los dias que lleva el empleado contratado
        LocalDate actualDate = LocalDate.now(); //Fecha actual
        return ChronoUnit.DAYS.between(date, actualDate); //Días que lleva en la empresa desde el día de contratación hasta la fecha actual
    }

    @Override
    public String toString() {
        return 
            "Employee:\n[name = " + name + 
            ",\nsurname = " + surname + 
            ",\ndateOfContraction = " + date
            + ",\nemployeeId = " + employeeId + "]";
    }

    @Override
    public int compareTo(Employee other) {//Compara un empleado con otro los días que llevan en la empresa

      int diffDays = (int)(other.calculateEmployDays() - this.calculateEmployDays());
        if (diffDays == 0) {
            return this.employeeId - other.employeeId;
        }
       return diffDays;
    }
}
