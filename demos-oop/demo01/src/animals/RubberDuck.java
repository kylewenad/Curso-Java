package animals;

public class RubberDuck implements IDuck{

    @Override
    public void makeSound() {
        System.out.println("CuaCua");
    }

    @Override
    public void swim() {
        System.out.println("Estoy flotando");
    }

}
