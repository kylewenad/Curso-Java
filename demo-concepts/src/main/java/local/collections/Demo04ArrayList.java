package local.collections;

import java.util.ArrayList;

public class Demo04ArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(10);
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        System.out.println("Yo soy: " + arrayList.getClass().getSimpleName());
        System.out.println("Tengo: " + arrayList.size() + " elementos");
        System.out.println("Elementos: " + arrayList);
            // Ver diferencia en el debugger
            // desactivando Logical Structure View 

        arrayList.trimToSize();
        arrayList.ensureCapacity(20); // Aumenta la capacidad a 20
    }
}
