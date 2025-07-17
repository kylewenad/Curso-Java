package local.collections.exercises;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Defina una List con la clase Empleado antes definida
//(con nombre, apellidos, fecha de contratación y número de empleado).
public class Employee implements Comparable <Employee>{
    List<String> employees = new ArrayList<>();
    private String name;
    private String surname;
    private LocalDate dateOfContraction;
    private String employeeId;
    
    void Employee(String name, String surname, String dateOfContraction, String employeeNumber) {
        this.name = name;
        this.surname = surname;
        this.dateOfContraction = formatDate(dateOfContraction);
        this.employeeId = employeeNumber;
    }

    private LocalDate formatDate(String dateOfContraction2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'formatDate'");
    }

    public static void main(String[] args) {
        
    }
    
    @Override
    public String toString() {
        return 
            "Employee [name=" + name + ", surname=" + surname + ", dateOfContraction=" + dateOfContraction
            + ", employeeId=" + employeeId + "]";
    }

    @Override
    public int compareTo(Employee other) {

        int diffDays = (int)(other.calculateEmployDays() - this.caculateEmployDays());
        
        if (diffDays == 0) {
            return this.id - other.id;
        }
        return diffDays;
        
    }
}
