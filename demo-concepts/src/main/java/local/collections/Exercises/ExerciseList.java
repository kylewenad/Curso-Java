package local.collections.Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

        
    public class ExerciseList {
            
        private List<String> listDays = new ArrayList<>();
        private List<String> list2 = new ArrayList<>(listDays);
        private String[] messages = {
            "Crea una lista que contenga los días de la semana:",
            "Inserta en la posición 4 el elemento «Juernes»:",
            "Copia esa lista a otra llamada listaDos:",
            "Muestra el contenido de las posiciones 3 y 4 de la lista original:",
            "Añade a listDias el contenido de listaDos:",
            "Muestra el primer elemento y el último de la lista original:",
            "Elimina el elemento que contenga «Juernes» de la lista y comprueba si elimina algo o no:",
            "Crea un iterador y muestra uno a uno los valores de la lista original:",
            "Busca si existe en la lista un elemento que se denomine «Lunes»:",
            "Busca si existe en la lista un elemento que se denomine «Lunes». No importa si está en mayúscula o minúscula:",
            "Ordena la lista y muestra su contenido:",
            "Borra todos los elementos de la lista:"
            };

    //Crea una lista que contenga los días de la semana.
        void daysOfTheWeek(){
            listDays.add("Lunes");
            listDays.add("Martes");
            listDays.add("Miércoles");
            listDays.add("Jueves");
            listDays.add("Viernes");
            listDays.add("Sábado");
            listDays.add("Domingo");
            System.out.println(listDays + "\n");
        }
        
        //Inserta en la posición 4 el elemento «Juernes».
        void addElement(){
            listDays.add(4, "Juernes");
            System.out.printf("Añadido en la posición 4: «Juernes» ", listDays);
            System.out.println(listDays + "\n");
        }
        
        //Copia esa lista a otra llamada listaDos.
        void copyListDays(){
            list2.addAll(listDays);
            System.out.println("list2: " + list2);
        }

        //Muestra el contenido de las posiciones 3 y 4 de la lista original.
        void showPosition(int position){
            if(position >= 0 && position < listDays.size()) {
                System.out.println("Elemento en la posición " + position + ": " + listDays.get(position));
            } else {
                System.out.println("Posición fuera de rango.");
            }
        }
        //Añade a listDias el contenido de listaDos.
        void addListDays(){
            listDays.addAll(list2);
            System.out.println("Nueva listDays: " + listDays);
        }
        
        //Elimina el elemento que contenga «Juernes» de la lista y comprueba si elimina algo o no.
        void removeElement(){
            
            while (listDays.contains("Juernes")) {
                listDays.remove("Juernes");
            }
            System.out.println("Nueva lista con elementos eliminados: " + listDays);
        }

        //Crea un iterador y muestra uno a uno los valores de la lista original.
        void newIterator() {

            Iterator<String> iterator = listDays.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            return;
        }

        //Busca si existe en la lista un elemento que se denomine «Lunes».
        void findElement(String element) {
            if (listDays.contains(element)) {
                System.out.printf("Sí existe %s\n", element);
            } else {
            System.out.printf("No existe %s\n", element);
            }
        }

        //Busca si existe en la lista un elemento que se denomine «Lunes». No importa si está en mayúscula o minúscula.
        void findElement2(String element) {
            
            Iterator<String> iterator = listDays.iterator();
            while (iterator.hasNext()) {
                String currentElement = iterator.next().toUpperCase();
                if(currentElement.equals(element.toUpperCase())){
                    System.out.printf("Sí existe %s\n", element);
                return;
                }
            }
            System.out.printf("El elemento %s no existe\n", element);
        }

        //Ordena la lista y muestra su contenido.
        void organizeList() {
            Collections.sort(listDays);
            System.out.println("Nueva lista organizada: "+ listDays);
        }

        //Borra todos los elementos de la lista.
        void removeAllElements() {
            listDays.removeAll(listDays);
            System.out.println("La lista queda vacía. :) " + listDays);
        }
        
        void answerOfExercise() {
            System.out.println("-------------------------------------------------");
            System.out.println(messages[0]);
            daysOfTheWeek();
            System.out.println("-------------------------------------------------");
            System.out.println(messages[1]);
            addElement();
            System.out.println("-------------------------------------------------");
            System.out.println(messages[2]);
            copyListDays();
            System.out.println("-------------------------------------------------");
            System.out.println(messages[3]);
            showPosition(3);
            showPosition(4);
            System.out.println("-------------------------------------------------");
            System.out.println(messages[4]);
            addListDays();
            System.out.println("-------------------------------------------------");
            System.out.println(messages[5]);
            System.out.println(listDays.getFirst());
            System.out.println(listDays.getLast());
            System.out.println("-------------------------------------------------");
            System.out.println(messages[6]);
            removeElement();
            System.out.println("-------------------------------------------------");
            System.out.println(messages[7]);
            newIterator();
            System.out.println("-------------------------------------------------");
            System.out.println(messages[8]);
            findElement("Lunes");
            findElement("Juernes");
            System.out.println("-------------------------------------------------");
            System.out.println(messages[9]);
            findElement2("lunes");
            System.out.println("-------------------------------------------------");
            System.out.println(messages[10]);
            organizeList();
            System.out.println("-------------------------------------------------");
            System.out.println(messages[11]);
            removeAllElements();
        
        }
        
    public static void main(String[] args) {
        
        ExerciseList ex = new ExerciseList();
        ex.answerOfExercise();

    }
}
