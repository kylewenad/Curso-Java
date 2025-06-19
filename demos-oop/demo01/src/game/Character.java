package game;

public class Character {
    
    public static int numOfCharacter = 0;
    
    public static void updateNumOfCharacter(){
        numOfCharacter++;
        System.out.printf("Personajes creados: %s\n\n", numOfCharacter);
    }
    
    private String name;
    private char specie;
    public int live;
    public int strength;
    public String roll;
    public boolean isZombie;

    public void showCharacter() {
        String message = """
            ========================
            Nombre:              %s
            Especie:             %s
            Vida:                %s
            Fuerza:              %s
            Roll:                %s
            ¿Es un zombie?:      %s
            ========================
            """;

        System.out.println(message.formatted(
            name,
            specie,
            live,
            strength,
            roll,
            isZombie));
    }
    
    public Character(String name, char specie, int live, int strength, String roll, boolean isZombie){
        System.out.println("Se ha creado un personaje nuevo");
        
        this.name = name;
        this.specie = specie;
        this.live = live;
        this.strength = strength;
        this.roll = roll;
        this.isZombie = isZombie;

        showCharacter();
        updateNumOfCharacter();
    }
    
}
