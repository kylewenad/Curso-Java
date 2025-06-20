import acountingZara.Data;
import acountingZara.Products;
import base.Person;
import game.Character;
import game.Role;
import game.Species;

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

    static void shop(){
        
        Data shop = new Data("Zara", "Plaza Castilla, Madrid", 91345345);
        shop.showData();


        Products.tshirt();
    }
  

    public static void main(String[] args) {
        //playWithPersons();
        //prepareGame();
        shop();
    }
}
         
