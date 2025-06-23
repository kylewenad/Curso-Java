import java.util.HashSet;
import java.util.Set;

public class E13Pangram {
    //Crea una función que verifique si una cadena de texto recibida por parámetros
    //es un pangram (contiene todas las letras del abecedario).

    //es un pangram?
    //verificar pangram (contiene todas las letras) -> bucle

    static boolean isPangram(String text) {
        
        text = text.toLowerCase();

        Set<Character> letters = new HashSet<>();

        for (char c : text.toCharArray()) {
            System.out.println(letters);
            if ( c >= 'a' && c <= 'z'){
                letters.add(c);
            }
            return false;
        }
        
        return letters.size() == 26;
            
        }

    public static void main(String[] args) {
        String test = "no se que es esto";
        isPangram(test);
    }
}
