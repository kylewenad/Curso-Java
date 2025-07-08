package local.lambdas;

public class LambdasApp {
    public static void main(String[] args) {
        Compose compose1 = new Compose();
        System.out.println(compose1.execute("Patata"));

        //expresión funcional
        LambdaString make = (String txt) -> { return "Info recibida: " + txt;};
        //implementar sin utilizar una clase
        System.out.println(make.execute("Patata"));
        LambdaString make2 = (String txt) -> "Info almacenada: " + txt;
        System.out.println(make2.execute("Más patatas"));
    }
}
