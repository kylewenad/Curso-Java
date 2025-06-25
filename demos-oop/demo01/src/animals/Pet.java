package animals;
//visibilidad por defecto paquete
public abstract class Pet implements IPet {
//si soy una clase abstracta no me puedes instanciar
//define constructores, métodos y métodos abstractos
//interfaz es una clase abstracta que me dice qué es lo que quiero
//implementa
    String name;
    int age;

    public Pet() {};

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    };

    public Pet(String name){
        this.name = name;
        this.age = 0; //valor por defecto 0
    };

    @Override
    public void sleep(){
        //private de los objetos de la clase pet
        System.out.println("Estoy durmiendo"); 
    }

    @Override
    public void eat(){
        System.out.println("Estoy comiendo");
    }

    @Override
    public void eat(int n){
        System.out.println("Estoy comiendo");
    }

    @Override
    public abstract void makeSounds();
    //todos los pets emiten sonidos
    //esto obliga a especificar los métodos de makeSounds en las clases dog, cat
}
