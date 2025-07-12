package local.collections;

import java.util.LinkedList;

public class Demo05LinkedList {
    
    public static void main(String[] args) {
        //Crear una LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        //Añadir 5 elementos a la lista
        for (int i = 1; i <= 5; i ++) {
            linkedList.add("Elemento: " + i);
        }
        //Mostrar la lista
        System.out.println("LinkedList: " + linkedList.getClass().getSimpleName());
        System.out.println("Size: " + linkedList.size());
        System.out.println("Elements: " + linkedList);

        //Acceso a los elementos de cualquier List
        System.out.println("Primer elemento: " + linkedList.getFirst());//Acceso a primer elemento
        System.out.println("Ultimo elemento: " + linkedList.getLast());//Acceso a último elemento
        System.out.println("Elemento en el índice 2: " + linkedList.get(2));//Acceso al tercer elemento
        
        //Solo en linkedList
        System.out.println("Primer elemento (peek): " + linkedList.peek()); //Acceso al primer elemento
    
        // Extraer elementos (solo en LinkedList)
        System.out.println("Primer elemento (pop): " + linkedList.pop()); //Elimina el primer elemento
        System.out.println("Después del pop: " + linkedList); //Elementos que quedan después del pop
        System.out.println("Primer elemento (poll): " + linkedList.poll());//Recupera y elimia el primer elemento de la cola
        System.out.println("Después de poll: " + linkedList);//??

        System.out.println("Último elemento (poll): " + linkedList.pollLast());
        System.out.println("Después de pollLast: " + linkedList);

        linkedList.addFirst("Primer Elemento");
        linkedList.addLast("Último Elemento");
        System.out.println("---------------------------------");
        //Solo para linkedList
        linkedList.push("Pushed Element"); //Añadir un elemento al principio (similar a addFirst)
        linkedList.offerFirst("Offered First Element");//Añadir elemento al principio
        linkedList.offer("Offered Last Element");//Añadir elemento al final

        System.out.println("Después de añadir Elementos " + linkedList);
    }   
}
