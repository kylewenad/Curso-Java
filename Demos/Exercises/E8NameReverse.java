public class E8NameReverse {
    //Crea una función que reciba un parámetro de tipo string
    //e imprima por consola el string revertido. (ejemplo: 'casa' => 'asac).
   
    static String reverseCat(String cat){
        String result = "";
        for (int i = 0; i < cat.length(); i++){
            result = cat.charAt(i) + result;
            //charAt(i) devuelve un caracter en la posicion i
            //charAt(3) sería "o".
            //"o" + result sería "o" + ""(espacio vacío) = "o".
            //result se convertiría en "o".
            //charAt(2) sería "t"
            //result sería "ot"
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
       String animal = "gato";
       System.out.printf("%s al revés es ", animal);
       reverseCat(animal);
    }
}
