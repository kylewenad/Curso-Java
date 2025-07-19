
package local.collections.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Use la función sort de la clase Collections para ordenar la lista.
//Use la antigüedad como criterio a seguir (es “mayor” si es más antiguo)
//y si entraron en el mismo día, utilice el número de empleado para desempatar.
public class Ex03 {

    static List<Employee> listOfEmployees = new ArrayList<>();

    static void sortList(){
        Collections.sort(listOfEmployees);
    }

    public static void main(String[] args) {
        listOfEmployees.add(new Employee("Amanada", "Perez", "25/10/2010", 101));
        listOfEmployees.add(new Employee("Juan", "Cuesta", "12/06/2008", 56));
        listOfEmployees.add(new Employee("José Miguel", "Cuesta", "18/11/2020", 327));
        listOfEmployees.add(new Employee("Natalia", "Cuesta", "18/11/2020", 326));
        System.out.println(listOfEmployees);

        sortList();
        System.out.println("Lista ordenada de empleados: " + listOfEmployees);
    }
}


