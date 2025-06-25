import animals.Cat;
import animals.Dog;
import animals.Duck;
import animals.Pet;
import animals.RubberDuck;


public class AppPets {
    //instanciar 'crear'personas
    //importa la clase Person
    
    
    static void playWithDog () {

        Dog pet1 = new Dog("Lua", 4);
        System.out.println(pet1 instanceof Dog);
        System.out.println(pet1 instanceof Pet);
        System.out.println(pet1 instanceof Object);
        //Object: clase es hija de object es herencia de object
        
        pet1.sleep();
        pet1.eat();
        pet1.makeSounds();
    }

    static void playWithCat() {
        Cat pet1 = new Cat("Shorty", 7);
        System.out.println(pet1 instanceof Cat);
        System.out.println(pet1 instanceof Pet);
        System.out.println(pet1 instanceof Object);

        pet1.sleep();
        pet1.eat(3);
        pet1.scratch();
        pet1.makeSounds();
    }
    //no puedo hacer cosas de "cat" porque me has definido como "Pet"
    // cambiamos "Pet" por "Cat"

    //static void playWithPet() {
    //"pet" es demasiado abstracto
        //Pet pet1 = new Pet ("Cleo", 1);
        //System.out.println(pet1 instanceof Cat);
        //System.out.println(pet1 instanceof Pet);
        //System.out.println(pet1 instanceof Object);
    
        //pet1.sleep();
        //pet1.eat();

    //}
    public static void main(String[] args) {
        //playWithDog();
        playWithCat();
        //playWithPet();
        Duck d = new Duck();
        d.fly();
        RubberDuck rd = new RubberDuck();
        rd.swim();
    }
}
         
