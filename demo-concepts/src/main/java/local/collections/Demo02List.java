package local.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Demo02List {
    
    public void showList(List<Integer> list){
    //ejemplos de las clases de la API de colecciones como
    //ArrayList, LinkedList, siempre que implementen el interface List.
    
    System.out.println("--------------------------------");
    System.out.println("List: " + list.getClass().getSimpleName());
    System.out.println("Size: " + list.size());
    System.out.println("Elements: " + list);
    System.out.println("Is Empty: " + list.isEmpty());

    for (Object element : list) {
        System.out.println("Element: " + element);
    }

    list.set(1, 100); //Reemplaza el segundo elemento por 100
    System.out.println("Elemento 1: " + list.get(1));//Para ver el elemento cambiado

    System.out.println("Índice del elemento de valor 30: " + list.indexOf(30));//Para saber en qué lugar está el elemento que contiene el valor de 30
    System.out.println("Último índice del elemento de valor 30: " + list.lastIndexOf(30));

    System.out.println("Elements: " + list);//Para que muestre de nuevo la lista con todos los cambios realizados
    }

    public static void main(String[] args) {
        //Crear instancias de clases que implementan a List
        
        // Ejemplo de uso de ArrayList
        List<Integer> arraylist = new ArrayList<>(); 
        List<Integer> linkedList = new LinkedList<>(); 
        List<Integer> vector = new Vector<>(); 
        List<Integer> stack = new Stack<>();
        
        for (int i = 10; i <= 50 ; i = i + 10) {
            //Añadir elementos a las listas
            //Estos elementos son comunes a todas las implementaciones de List
            //Puedes usar add(E e) para añadir un elemento al finla de la lista.
            //También puedes usar add(index, E element) para añadir en una posición específica.

            arraylist.add(i);
            linkedList.add(i);
            vector.add(i);
            stack.add(i);
        }

        Demo02List demo = new Demo02List();//instancia
        demo.showList(arraylist);
        demo.showList(linkedList);
        demo.showList(vector);
        demo.showList(stack);

    // Ejemplo de uso de LinkedList
    // LinkedList es una implementación de lista basada en nodos enlazados.
    // Permite añadir y eliminar elementos de manera eficiente en ambos extremos.
    
    }
}
