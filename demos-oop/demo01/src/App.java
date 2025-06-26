import animals.Dog;
import animals.Pet;
import base.Person;
import base.Square;
import game.Character;
import game.Role;
import game.Species;
//diseño de UML lenguaje especifico donde cada dibujito se entienda
public class App {
    //instanciar 'crear'personas
    //importa la clase Person
    
    static void playWithPersons() {
        //static darle a la clase "que vigile" que esté correcto
        Person person1 = new Person("Pepe", 22);
        //new sólo se ejecuta UNA vez
        //Person.numOfPerson++;
        // person1.name = "Pepe";
        // person1.age = 22;
        person1.greetings();
        person1.setAge(25);
        
        Person juan = new Person("Juan", 25);
        //Person.numOfPerson++;
        //juan.name = "Juan";
        //juan.age = 25;
        juan.greetings();
        
        System.out.printf("Nº de personas: %s",Person.numOfPerson);
        
    }
    
    static void prepareGame() {
        Character char1 = new Character("Robert", Species.HUMANO, 100, 50, Role.GUERRERO, false);
        char1.showCharacter();
        Character char2 = new Character("Ryu", Species.ELFO,120, 50, Role.LUCHADOR, true);
        
        Character char3 = new Character("Sora", Species.HUMANO, 120, 30, Role.MAGO, false);
        
        Character char4 = new Character("Ryu", Species.ORCO, 50, 10, Role.MAGO, false);
        char4.showCharacter();

        Character.showList();
        char4.renameInvalidName("Orco Ryu");
        char4.showCharacter();
        Character.showList();
    }

    static void playPets () {

        Dog pet1 = new Dog("Lua", 4);
        System.out.println(pet1 instanceof Dog);
        //System.out.println(pet1 instanceof Pet);
        //System.out.println(pet1 instanceof Object);
        //Object: clase es hija de object es herencia de object
        
        pet1.sleep();
        pet1.eat();

    }
  
    

    public static void main(String[] args) {
        //playWithPersons();
        //prepareGame();
        //playPets();
        Square sq = new Square(3);
        String type = "Cuadrado";
        System.out.println(sq instanceof Object);
        System.out.println(type instanceof Object);
        System.out.println(type);
        System.out.println(type.toString());
        System.out.println(sq);
        //System.out.println(sq.toString());
        //sale por pantalla su referencia, por lo tanto reescribimos toString
        //para que imprima en pantalla directamente el objeto "Square {side: 3}"
 

        Square sq2 = new Square(3);
        System.out.println(sq == sq2);

        System.out.println(sq2);

        System.out.println(sq.equals(sq2));
    }
}
         
