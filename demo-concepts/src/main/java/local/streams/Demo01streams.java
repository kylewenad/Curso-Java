package local.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

//Tutoriales de java, específicamente streams.
//https://dev.java/learn/api/streams/
public class Demo01streams {
    //Crear un array de enteros:
    //int[] number = new int [4]; //Sin valores de hasta 4 elementos.
    //number[0] = 2;
    private int[] numbers = {1,2,32,4}; //Con valores, 4 elementos
    IntStream streamNumbers = Arrays.stream(numbers); //Convertir el array en stream
    
    public int sumSquaresGreaterThan(int limit, IntStream streamNumbers) {
        return streamNumbers
            .map(number -> number * number)
            .filter(number -> number > limit)
            .reduce((acc, number)-> acc += number)
            .orElse(-1);
    }

    public void makeForEach(IntStream streamNumbers){
        streamNumbers.forEach(number -> System.out.println(number));
            //(number) ->   {} //Lambda: () elementos que le van a llegar -> {lo que quieras}
            //recorre todos los elementos y los imprime
            //puede escribirse sin paréntesis si sólo tiene un parámetro y sin corchetes 
    }

    public void makeMap(){
        IntStream streamNumbers2 = streamNumbers.map(number ->  number * number
            //return number * number; //los lambdas llevan implícitos que devuelvan algo 'return' por lo tanto no es necesario escribir 'return'
        );
        makeForEach(streamNumbers2);
    }

    public void makeFilter() {
        IntStream streamNumbers3 = streamNumbers.filter(number -> number > 10);
        makeForEach(streamNumbers3);
    }

    public void makeReduce() {
        OptionalInt newValue = streamNumbers.reduce((int acc, int number) -> {
            acc = acc += number;
            return acc;
        });
        System.out.println(newValue);
    }


    public static void main(String[] args) {
        Demo01streams demo = new Demo01streams();
        //demo.makeForEach(demo.streamNumbers);
        //demo.makeMap();
        //demo.makeFilter();
        //demo.makeReduce();
        System.out.println(demo.sumSquaresGreaterThan(10,demo.streamNumbers));
    }
}
