package local.collections;

public class Person {

    public static int numOfPerson = 0;
    // Método static o de clase
    public static void updateNumOfPerson(){
        numOfPerson++;
        //este método incrementa el numero de personas instanciadas
    }
    
    // Propiedades de instancia
    private String name;
    private String surname;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < this.age) {
            return;
        }
        this.age = age;
    }

    // Método constructor
    public Person(String name, String surname, int age) {        
        this.name = name;
        this.surname = surname;
        this.age = age;
        updateNumOfPerson();
    }

    private String getFullName() {
        return name + surname + age;
    }

    //Método de instancia
    public void greetings() {
        System.out.printf("Hola soy %s %s y tengo %s años.\n", name, surname, age);
      }  

    @Override
    public String toString() {
        return;
    }

    @Override
    public int compareTo(Person other) { //son comparaciones numéricas, NO booleanas

    }

}
