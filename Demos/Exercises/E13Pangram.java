public class E13Pangram {
    //Crea una función que verifique si una cadena de texto recibida por parámetros
    //es un pangram (contiene todas las letras del abecedario).

    //es un pangram?
    //verificar pangram (contiene todas las letras) -> bucle

    static boolean isPangram(String text) {
        
        text = text.toLowerCase();
        boolean[] lettersFound = new boolean[26];
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lettersFound[c - 'a'] = true;
            }
        }
        //verificar si todas las letras han sido encontradas
        for (boolean found : lettersFound) {
            if (!found) {

                return false;
            } 
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "no se que es esto";
        
        if (isPangram(test)) {
            System.out.println("La cadena contiene todas las letras del abecedario.");
        } else {
            System.out.println("La cadena NO contiene todas las letras del abecedario.");
        }
    }
}
