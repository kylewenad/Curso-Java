package local.collections;

public class Demo07SetPerson {

    Person person1 = new Person("Charlie", "Pan", 27);
    Person person2 = new Person("Joseph", "Cortes", 13);
    Person person3 = new Person("Sebastián", "Paz", 35);

    public void makeHashSetPersons() {
        person.add(person1);
        person.add(person2);
        person.add(person3);

        System.out.println(persons);
    }

    public void makeLinkedSetPerson(){

    }

    public void makeTreeSetPerson() {
    Set<Person> persons = newTreeset<>();
    
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
