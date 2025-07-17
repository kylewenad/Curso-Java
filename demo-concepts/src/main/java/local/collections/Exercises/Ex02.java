package local.collections.exercises;

import java.util.Collections;
import java.util.Stack;
//Use la clase Stack de Java para invertir una palabra.
//A partir de este programa determine si una palabra es palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)
public class Ex02 {
    
    String word;
    String inverse;

    public Ex02(String word){
        this.word = word;
        this.inverse = generateInverse();
    }

    private String generateInverse() {
        Stack<Character> stack = new Stack<Character>();
        StringBuffer inverse = new StringBuffer();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        while (!stack.isEmpty()){
            inverse.append(stack.pop());
        }
        return inverse.toString();
    }

    public void showResult() {
        System.out.println(word + " - " + inverse);
        String message = word.equals(inverse) ? "si" : "no";
        System.out.println(message.toUpperCase() + " son palíndromos");
    }


    public static void main(String[] args) {
        
        Ex02 ex1 = new Ex02("Hola");
        ex1.showResult();
    }
    
}
