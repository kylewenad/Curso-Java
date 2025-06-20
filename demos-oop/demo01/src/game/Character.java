package game;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//Crea la clase Character con las propiedades:
//name; -> String
//especies; -> char
//life; -> int
//strength; -> int
//role; -> String
//iZombie; -> boolean

//Añade un método show para mostrar la información

public class Character {
 //UUID un tipo de forma de escribir los id que no sean sólo números
    private UUID id;
    private String name;
    private Species species;
    private int live;
    private int strength;
    private Role role;
    private boolean isZombie;
   
    private static List<Character> characterList = new ArrayList<Character>();

    private static int numOfCharacter = 0;

    public Character(String name, Species species, int live, int strength, Role role, boolean isZombie){
        
        this.id = UUID.randomUUID();
        //la propiedad id no la crea el usuario
        this.name = name;
        this.species = species;
        this.live = live;
        this.strength = strength;
        this.role = role;
        this.isZombie = isZombie;
    
            if (checkName(this.name)) {
                System.err.println("Error, nombre repetido: cámbialo");
                return;
            }
            
            characterList.add(this);
            updateNumOfCharacter();
    }

    public static void updateNumOfCharacter(){
        numOfCharacter++;
        System.out.printf("Personajes creados: %s\n", numOfCharacter);
    } 

    private static boolean checkName(String name){
        for (Character character  : characterList) {
            if (character.name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void showList() {
        for (Character character : characterList) {
            System.out.println(character.name);
        }
    }

    public void renameInvalidName(String name) {
        if (characterList.contains(this)) {
            return;
        }
        this.name = name;
        characterList.add(this);
    }

    public void showCharacter() {
        String zombieMessage = isZombie? "Es un zombie" : "No es un zombie";

        String message = """
            ===============================
            Nombre del personaje:   %s
            ===============================
            Id: %s
            Especie:                %s
            Vida:                   %s
            Fuerza:                 %s
            Roll:                   %s
            %s
            ===============================
            """;

        System.out.println(message.formatted(
            name,
            id,
            species.toString().toLowerCase(),
            // para que salga en minúscula
            live,
            strength,
            role.toString().toLowerCase(),
            zombieMessage));
    }
}