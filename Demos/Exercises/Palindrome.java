public class Palindrome {
    //frase
    //poner a minusculas
    //quitar los espacios
    //darle la vuelta
    //comparar
    static String removeSpaces(String text) {
        String result = "";
        
        for(int i = 0; i <text.length(); i++) {
            //Para rellenar result
            if (text.charAt(i) == ' ') {
                continue;
            }
            result += text.charAt(i); 
        }
            return result;
    }
    
    static String reverse(String text) {
        String result = "";
        for(int i = 0; i <text.length(); i++) {
            if (text.charAt(i) == ' ') {
                continue;
            }
            //Para rellenar result
        result = text.charAt(i) + result;
        }
        return result;

     }
    static boolean isPalindrome(String text) {
        String initialText = text.toLowerCase();
        String noSpacesText = removeSpaces(initialText);
        String reverseText = reverse(noSpacesText);
        System.out.println(reverseText);
        return noSpacesText.equals(reverseText);
    }

    static void showPalindromeInfo(String text) {
        String message = isPalindrome(text)
                ? " es palíndromo"
                : " NO es palíndromo";
        message = "\"" + text + "\"" + message;
        System.out.println(message);
    }

public static void main(String[] args) {
    String text = "Atar a la rata";
    showPalindromeInfo(text);
    }    
}


