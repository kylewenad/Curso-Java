public class E9RemoveLetter {
//Crea una función que elimine el primer y último carácter de un string recibido por parámetros.

    static String removeLetter(String lion) {
        String result = "";
        for(int i = 1; i < lion.length()-1; i++){
            result = result + lion.charAt(i);
        }
        System.out.println(result);
        return result;
    }
    
    public static void main(String[] args) {
        String animal = "Leon";
        System.out.printf("%s sin la primera y ultima letra es ", animal);
        removeLetter(animal);
    }
}
