public class Functions {
    //Función: código ejecutable
    //Puedo invocarlo por su nombre
    //Puede recibir valores -> los recoge como parámetros
    //Puede devolver un valor

    static int add(int num1,int num2){
        int result = num1 + num2;
        System.out.println("El resultado es " + result);
        return result;
    }
        //"+" para sumar o concatenar
        //imprimir por pantalla, el valor se puede usar
        //si fuera void sería devolver por pantalla
        //el nombre result sólo funciona para esta función
    static int subtraction(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    static void showResult(int result) {
        System.out.println("El resultado es " + result);
    }

    public static void main(String[] args) {
        // Los argumentos son los valores que llegarán a los parámetros
        //num1 dónde va a guardar el valor
        //num2 dónde va a guardar el valor
        int firstResult = add(22,23);
        showResult(firstResult);

        int finalResult = add(1234, firstResult);
        showResult(finalResult);
        //sumar el primer resultado con el segundo valor
        showResult(subtraction(89, 26));
       
    }
}