import base.Person;

public class App {
    public static void main(String[] args) {
        //instanciar 'crear'personas
        //importa la clase Person
        
        Person person1 = new Person("Pepe", 22);
        //new sólo se ejecuta UNA vez
        //Person.numOfPerson++;
            // person1.name = "Pepe";
            // person1.age = 22;
            person1.greetings();

        Person juan = new Person("Juan", 25);
        //Person.numOfPerson++;
            //juan.name = "Juan";
            //juan.age = 25;
            juan.greetings();

        System.out.printf("Nº de personas: %s",Person.numOfPerson);

    }
}
