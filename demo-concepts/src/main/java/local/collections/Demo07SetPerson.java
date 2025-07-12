package local.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo07SetPerson {

    Person person1 = new Person("Charlie", "Pan", 27);
    Person person2 = new Person("Joseph", "Cortes", 13);
    Person person3 = new Person("Sebastián", "Paz", 35);

    public void makeHashSetPersons() {
        //Crear un conjunto de objetos de Person
        Set<Person> persons = new HashSet<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        System.out.println(persons);
    }

    public void makeLinkedSetPerson(){
        //Crear un conjunto de objetos Person
        Set<Person> persons = new LinkedHashSet<>();
        
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        
        System.out.println(persons);
    }

    public void makeTreeSetPerson() {
        
        Set<Person> persons = new TreeSet<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        System.out.println(persons);
    }

    public static void main(String[] args) {
        Demo07SetPerson demo = new Demo07SetPerson();
        demo.makeHashSetPersons();
        System.out.println("------------------------");
        demo.makeLinkedSetPerson();
        System.out.println("------------------------");
        demo.makeTreeSetPerson();
    }
}
