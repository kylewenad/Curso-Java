package animals;

public class Dog extends Pet implements IDog {

    public Dog(String name, int age){
        super(name, age);
    };
    
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        String message = "comida para perros";
        System.out.println(message);
    }
    @Override
    public void makeSounds() {
        System.out.println("guau");
    }
}
