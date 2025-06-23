package base;

public class Dog extends Pet {

    public Dog(String name, int age){
        super(name, age);

    };

    @Override
    public void eat() {
        super.eat();
        String message = "Como comida para perros";
        System.out.println(message);
    }
}
