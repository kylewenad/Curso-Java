package animals;

public class Duck implements IDuck, IBirds {

    @Override
    public void makeSound() {
        System.out.println("Cuac");
    }

    @Override
    public void fly(){
        System.out.println("Flying");
    }

    @Override
    public void swim(){
        System.out.println("Swimming");
    }
}
