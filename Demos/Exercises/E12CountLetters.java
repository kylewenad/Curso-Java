public class E12CountLetters {
    //Crea una función que cuente las vocales que contiene una palabra dada por parámetros.

    
    
    static int countLetters(String word){
        int a = 0, e =0, i = 0, o = 0, u = 0; 
        for (int x = 0; x< word.length(); x++) {
            char letter = word.charAt(x);
            switch (letter) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;

                default:
                    break;
            }
        }

        int counter = (a+e+i+o+u);
        
        System.out.println("Cantidad de a: " + a);
        System.out.println("Cantidad de e: " + e);
        System.out.println("Cantidad de i: " + i) ;
        System.out.println("Cantidad de o: " + o);
        System.out.println("Cantidad de u: " + u);
        System.out.println("Total de vocales: " + (a+e+i+o+u));
        return counter;
    }

    public static void main(String[] args) {
        String word = "jirafa";
        countLetters(word);
        
    }
    
}
