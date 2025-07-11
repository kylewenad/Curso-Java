package local.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Defina una lista List con la clase Empleado antes definida 
//(con nombre, apellidos, fecha de contratación y
//número de empleado). 
//Use la función sort de la clase Collections para ordenar
//la lista. Use la antigüedad como criterio a seguir 
//(es “mayor” si es más antiguo) y si entraron en el 
//mismo día, utilice el número de empleado para desempatar.
//Esta ordenación se reflejará en un método de la 
//clase Empleado, compareTo(obj o), que permite comparar 
//el objeto en curso (this) con el objeto recibido, 
//que devuelve -1 si es menor que el recibido, 0 si son 
//iguales y 1 si es mayor que el recibido.
public class Employee implements Comparable <Employee>{
    List<String> employees = new ArrayList<>();
    private String name;
    private String surname;
    private LocalDate dateOfContraction;
    private String employeeNumber;
    
    void Employee(String name, String surname, String dateOfContraction, String employeeNumber) {
        this.name = name;
        this.surname = surname;
        this. dateOfContraction = formatDate(dateOfContraction);
        this.employeeNumber = employeeNumber;
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
            + ", employeeNumber=" + employeeNumber + "]";
    }

    @Override
    public int compareTo(Employee other) {

        int diffDays = (int)(other.calculatEmployDays() - this.caculateEmployDays());
        
        if (diffDays == 0) {
            return this.id - other.id;
        }
        return diffDays;
        
    }
}
