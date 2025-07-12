package local.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//Ejemplos de las colleciones
public class Demo01Collection {
    
    @SuppressWarnings("rawtypes")
    void showCollection(Collection collection) {
    
            System.out.println("Collection " + collection.getClass().getSimpleName());
            System.out.println("Size: " + collection.size());
            System.out.println("Elements " + collection);
            System.out.println("Is empty " + collection.isEmpty());

            for (Object element : collection) {
                System.out.println("Element: " + element);
            }
    }
    
    public static void main(String[] args) {
        
        Demo01Collection app = new Demo01Collection();
        // Ejemplo de uso con una colección concreta
        // Aquí se puede usar cualquier implementación de Collection,
        // como ArrayList, LinkedList, etc.
        // Por ejemplo, usando ArrayList:

        List<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");

        app.showCollection(list);
        
        // Ejemplo con un LinkedList
        Deque<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) { // Hace una lista del 1 al 5
            linkedList.add(i);
        }

        app.showCollection(linkedList);
        
        // Ejemplo con HashSet
        Set<Character> set = new HashSet<>();
        String str = "collection";
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        
        app.showCollection(set);
    
    }   

}
