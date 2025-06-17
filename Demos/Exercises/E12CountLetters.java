public class E12CountLetters {
    //Crea una función que cuente las vocales que contiene una palabra dada por parámetros.

    static int countLetters(String bat){
        for (int i = 0; i< bat.length(); i++) {
            int counter = 0;
            if (bat.charAt(i) == 'a') {
                int a = counter + 1;
                System.out.println(a);
                return a;
                } //|| 'e' || 'i' || 'o' || 'u'>  {
            }
            int a = 0;
            return a;   
        }
        
    

    public static void main(String[] args) {
        String animal = "pamela";
        int counterp = countLetters(animal);
    }
    
}
