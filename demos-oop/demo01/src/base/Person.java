package base;
//crear un método constructor se llama igual que la clase
//las propiedades son siempre PRIVADAS
//para que el usuario no pueda cambiar las propiedades
//ámbitos de la visibilidad: public, private, protect
//un objeto expone una interfaz

// getter método que da información
// setter método puede cambiar el valor
// si una propiedad no tiene métodos getter ni setter, no son visibles

// maven y gradle gestos de paquetes de java

public class Person {

    // Propiedades static o de clase
    public static int numOfPerson = 0;

    // Método static o de clase
    public static void updateNumOfPerson(){
        numOfPerson++;
        //este método incrementa el numero de personas instanciadas
    }
    
    // Propiedades de instancia
    private String name;
    private int age;

        // Métodos getter y setter
        //public String getName() {
        //    return name;
       //}

        //public void setName(String name) {
        //    this.name = name;
        //}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < this.age) {
            return;
        //setter no hace el cambio porque hemos creado la condición
        //que no puede tener menos años que la edad inicial en la que se registró
        }
        this.age = age;
    }

    // Método constructor
    public Person(String name, int age) {
        System.out.println("Se ha instanciado una Person");
        
        this.name = name;
        this.age = age;
        updateNumOfPerson();
    }
        //numOfPerson++;
        //se crea un constructor para ayudar a que tenga parámetros
        //no es necesario utilizarlo
        //cuando me llegue una propiedad "name"
        //this.name "name en blanco"(propiedad) = "name en naranja"(parámetro) que es el dato 
        //que vamos a escribir ej Pepe
        //numOfPerson++ para que vaya sumando las instancias creadas
    

    //Método de instancia
    public void greetings() {
        System.out.printf("Hola soy %s y tengo %s años.\n", name, age);
      }  

}
