public class Exercise {

    static void countDown(){
        for(int i = 10; i > 0; i--) {
        System.out.println(i);
        }
    }    
    
    static String removeFirstLast(String letter) {

        String result = "";
        for(int i = 1; i <letter.length()-1; i++) {
            //Para rellenar result
            result = result + letter.charAt(i);
        }
        return result;
    }
   
    static String reverseString(String letter) {
        String result = "";
        for(int i = 0; i <letter.length(); i++) {
            //Para rellenar result
            result = letter.charAt(i) + result;
        }
    
        return result;
    }
    
    static String reverseString2(String letter) {
        String result = "";
        for(int i = letter.length()-1; i >= 0; i--) {
            //Para rellenar result
            result = result + letter.charAt(i);
        }
    
        return result;
    }
  
    public static void main(String[] args) {
        String test = "Prueba";
        String reverse = reverseString2(test);
        String removed = removeFirstLast(test);
        System.out.println("Original: " + test);
        System.out.println("Removed " + removed);
        System.out.println("Reverse " + reverse);
    
        countDown();

    }   
}
