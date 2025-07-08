package local.lambdas;

public class Compose implements LambdaNoString{
    @Override
    public String execute (String txt) {

        return "Info recibida " + txt;
    }

    void foo() {
        System.out.println("Soy foo");
    }
}
