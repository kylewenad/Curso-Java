package animals;

public class Cat extends Pet implements ICat{
 //A la clase superior pasar le la información que necesita   
    public Cat(String name, int age){
        super(name,age);
        //"pet" se ocupa de esa información
    };

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat(int nu){
        super.eat();
        String message = "comida para gatos";
        System.out.println(message);
    }

    @Override
    public void scratch() { 
        String message = "Estoy arañando el suelo";
        System.out.println(message);
    }

    @Override
    public void makeSounds(){
        System.out.println("miau");
    }
}