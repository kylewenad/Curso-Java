public class Palindrome {
    //frase
    //poner a minusculas
    //quitar los espacios
    //darle la vuelta
    //comparar
    
    static void removeSpacesTest(String space) {
        String result = "";
     
        for(int i = 0; i <space.length(); i++) {
            //Para rellenar result
            result = space + space.charAt(i);
        }
        return;
    }
   
    static void reverseTest(String letter) {
         String result = "";
        for(int i = 0; i <letter.length(); i++) {
            if (letter.charAt(i) == ' ') {
                continue;
            }
            //Para rellenar result
            result += letter.charAt(i);
        }
        return;
    }
}
static boolean isPalindrome(String text) {
        String initialText = text.toLowerCase();
        String noSpacesText = removeSpacesTest(initialText);
        String reverseText = reverseTest(noSpacesText);
        return noSpacesText.equals(reverseText);
     }

static void showPalindromeInfo() {
        String result = "";
        for(int i = 0; i <letter.length(); i++) {
            //Para rellenar result
            result = letter.charAt(i) + result;
        }
    
        return result;
    }
public static void main(String[] args) {
    String test = "Atar la rata";
    showPalindromeInfo(test);
        
}
        
//static boolean isPalindrome(String text){
           


