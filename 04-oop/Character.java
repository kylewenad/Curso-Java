//Propiedades de los personajes
//Azul tipo (molde)
//Blanco propiedad (objeto)
//Naranja (variable) datos

public class Character {

    String name = "Zelda";
    int live = 100;
    char type;
    boolean isZombi = false;

    Character(String name, char type) {
        this.name = name;
        this.type = type;
    }
}
