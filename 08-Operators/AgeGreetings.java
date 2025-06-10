public class AgeGreetings {
    //int age (18, 33);
    //int age (34, 65);
    //int age > 65
    public static void mode1(String[] args) {
        if(args.length == 0) {
            System.out.println("Tienes que escribir tu edad");
            
            } else {
                int age = Integer.valueOf(args[0]);
                if(age < 18) {
                    System.out.println("Hola, eres menor de edad");

                } else {
                    if(age == 33);
                    System.out.println("Hola, eres adulto");

            }
        }
        
    }
    


    public static void main(String[] args) {
    mode1(args);
    }
}