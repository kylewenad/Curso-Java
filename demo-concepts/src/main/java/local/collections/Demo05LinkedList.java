package local.collections;

import java.util.LinkedList;

public class Demo05LinkedList {
    
    public static void main(String[] args) {
        //Crear una LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        //Añadir elementos
        for (int i = 1; i <= 5; i ++) {
            linkedList.add("Elemento " + i);
        }
        //Mostrar la lista
        System.out.println("LinkedList: " + linkedList.getClass().getSimpleName());
        System.out.println("Size " + linkedList.size());
        System.out.println("Elements " + linkedList);

        //Acceso a los elementos de cualquier List
        System.out.println("Primer elemento: " + linkedList.getFirst());//primer elemento
        System.out.println("Ultimo elemento: " + linkedList.getLast());
        System.out.println("d" + linkedList.getClass());
    
    
    
    }   
}
