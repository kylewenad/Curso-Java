package base;
//visibilidad por defecto paquete
public class Pet {

    String name;
    int age;

    public Pet() {};

    public Pet(String name, int age){
        this.name = name;
        this.age = age;

    };

    public void sleep(){
        //private de los objetos de la clase pet
        System.out.println("Estoy durmiendo"); 
    }

    public void eat(){
        System.out.println("Estoy comiendo");
    }
}
