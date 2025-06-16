import java.util.Random;

public class BucleWhile {
    
    static void whileSample () {
        boolean sentinel = true;
        
        while (sentinel) {
            Random randomCreator = new Random();
            int number = randomCreator.nextInt(9);
            
            if(number %2 == 0) {
                continue;
            }
            
            System.out.println("Número " + number);
            if (number == 7) {
                sentinel = false;
            }
        }
    }
   
    static void whileSampleWithCounter () {
        boolean sentinel = true;
        int i = 0;
        while (sentinel) {
            i++;
            Random randomCreator = new Random();
            int number = randomCreator.nextInt(9);
            
            if(number %2 == 0) {
                continue;
            }
            
            System.out.printf("Número %s = %s \n ", i, number);
            if (number == 7) {
                sentinel = false;
            }
        }
    }
   
    static void forSample () {

        for(int i = 0; i >= 0; i++) {

             Random randomCreator = new Random();
            int number = randomCreator.nextInt(9);
            
            if(number %2 == 0) {
                continue;
            }
            
            System.out.println("Número " + number);
            if (number == 7) {
            break;
            }
        }
    }

    static void forSample2 () {
        int number = 0;

        for(int i =0; number != 7 ; i++){
            if(number %2 == 0) {
                continue;
            }
        System.out.printf("Número %s = %s" + number, i+1, number);
        }
    }

    public static void main(String[] args) {
        
       //whileSample(); 
        whileSampleWithCounter();
       //forSample();
        //forSample2();
    }
}
