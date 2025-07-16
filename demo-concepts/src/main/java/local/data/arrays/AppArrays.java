package local.data.arrays;

import java.util.Arrays;

public class AppArrays {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

 
    public static void main(String[] args) {
        System.out.println("Demo of Arrays in Java");

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr);//imprime el hashCode
        System.out.println("Arrays.toString:");
        System.out.println(Arrays.toString(arr)); //imprime los valores del array
        
        System.out.println("Array as parameter:");
        System.out.println();
    }

}
