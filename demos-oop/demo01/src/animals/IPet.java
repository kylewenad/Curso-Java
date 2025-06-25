package animals;

public interface IPet {

    void sleep();

    void eat();

    void eat(int n);

    void makeSounds();
    //todos los pets emiten sonidos
    //esto obliga a especificar los métodos de makeSounds en las clases dog, cat

}