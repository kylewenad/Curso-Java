// Le pedimos al usuario 9 ingredientes 
//y los guardamos como matriz de 3x3
//Le presentamos ingredientes que nos ha dado

//1. Pedirle al usuario los datos
//2. Mostrar los datos

//2 funciones además de Main

import java.util.Random;
import java.util.Scanner;

public class MatrixUser {

    static String[][] getData() {
        String[][] ingredients = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ingredients.length; i++) {
             System.out.printf("Fila número %s\n", i+1);
            for (int j = 0; j < ingredients[0].length; j++) {                
                 System.out.printf("Dime el ingrediente %s\n", j+1);
                 ingredients[i][j] = scanner.nextLine();
             }
            System.out.println("Vamos a la siguiente fila");
        }
        scanner.close();
        return ingredients; 
    }

    static String[][] getIngredientsByScanner() {
    //String de Arrays matriz de dos dimensiones
        String[][] ingredients = new String[3][3];
        
        String [] messages = {
            "Dime ingredientes sólidos\n",
            "Dime ingredientes líquidos\n",
            "Dime más ingredientes sólidos\n",
        };
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ingredients.length; i++) {
            System.out.printf(messages[i]);
        // necesito i y j para ir rellenando los huecos de la matriz
        // para el usuario siempre se empieza por la fila 1 (i+1)
        //int ingredientNumber = 1;
            for(int j = 0; j < ingredients[0].length; j++) {
                System.out.printf("Ingrediente %s\n", j+1);
                ingredients[i][j] = scanner.nextLine();
             }  
             
             if (i < ingredients.length -1) {
                System.out.println("Vamos a la siguiente fila");
             } else {
                System.out.println("Gracias por participar");
                System.out.println("--------------------------------------");
             }
         }
        scanner.close();
        return ingredients;
    }

    static String[] selectedRandoms(String[][] ingredients) {
        String[] selectedIngredients = new String[ingredients.length];
        Random r = new Random();
        for (int i = 0; i < selectedIngredients.length; i++){
                selectedIngredients[i] = ingredients[i][r.nextInt(2)];
        }
        return selectedIngredients;
    }

    static void showIngredients(String [][] ingredients) {
        
        System.out.println("Estos son tus ingredientes:");
        
        for (String[] row: ingredients) {
            for (String ingredient : row) {
                System.out.printf( "%-15s", ingredient);
                // -10 es para que guarde 10 espacios
            }
            System.out.println("");
        }
    }

    static void showIngredients(String[] ingredient) {
        System.out.println("--------------------------------------");
        System.out.println("Estos son tus ingredientes aleatorios:");

        for (String item : ingredient) {
            System.out.printf("%-15s ", item);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String[][] ingredients = getIngredientsByScanner();
        showIngredients(ingredients);

        String[] selectedIngredients = selectedRandoms(ingredients);
        showIngredients(selectedIngredients);

    }
}