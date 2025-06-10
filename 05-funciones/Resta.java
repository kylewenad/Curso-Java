public class Resta {

    static int subtraction(int num1, int num2) {
        int result = num1 - num2;
        return result;
        //return num1 - num2;
        //Sin el println no muestra el resultado en pantalla
        //Para poder hacerlo hay que imprimirlo en la función de abajo
    }
   
    static void showResult(int result){
        System.out.println("El resultado es" + result);
    }

    public static void main(String[] args){
        int resultSubtraction = subtraction(48, 23);
        System.out.println("El resultado es " + resultSubtraction);

    }
}
