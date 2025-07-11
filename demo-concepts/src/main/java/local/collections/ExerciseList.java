package local.collections;

import java.util.ArrayList;
import java.util.List;


//Copia esa lista a otra llamada listaDos.
//Pista: List listaDos = new ArrayList<>(listaUno);
//Añade a listDias el contenido de listaDos.
//Muestra el contenido de las posiciones 3 y 4 de la lista original.
//Muestra el primer elemento y el último de la lista original.
//Pista: getFirst() y getLast()

//Elimina el elemento que contenga «Juernes» de la lista y comprueba si elimina algo o no.
//Pista: if (listaDias.remove(«Juernes»)) {
    //System.out.println(«Borrado»);
    //} else {
        //System.out.println(«No existe»);
        //}
        
        //Crea un iterador y muestra uno a uno los valores de la lista original.
        
        //Busca si existe en la lista un elemento que se denomine «Lunes».
        //Pista: listaDias.contains(«Lunes»)
        
        //Busca si existe en la lista un elemento que se denomine «Lunes». No importa si está en mayúscula o minúscula.
        
        //Ordena la lista y muestra su contenido.
        //Pista: método sort().
        
        //Borra todos los elementos de la lista.
        //Pista: clear()
        
    public class ExerciseList {
            
        private List<String> listDays = new ArrayList<>();
        private List<String> list2 = new ArrayList<>(listDays);
            
    //Crea una lista que contenga los días de la semana.
        void daysOfTheWeek(){
            listDays.add("Lunes");
            listDays.add("Martes");
            listDays.add("Miércoles");
            listDays.add("Jueves");
            listDays.add("Viernes");
            listDays.add("Sábado");
            listDays.add("Domingo");
        }
        
    //Inserta en la posición 4 el elemento «Juernes».
        void addElement(){
            listDays.add(4, "Juernes");
            System.out.printf("Añadido en la posición 4 Juernes", listDays);
        }

    //Copia esa lista a otra llamada listaDos.
        void copyListDays(){
            listDays.addAll
        }
    public static void main(String[] args) {
        
        ExerciseList ex = new ExerciseList();
        ex.daysOfTheWeek();

        listDays.addAll(list2);

        System.out.println(ex);
        System.out.println("Posición 3 " + listDays.get(3));
        System.out.println("Posición 4 " + listDays.get(4));

        System.out.println(listDays.getFirst());
        System.out.println(listDays.getLast());

        listDays.remove(3);
        System.out.printf("Día Juernes eliminado", listDays);
        listDays.remove(9);
        System.out.println(listDays);

        listDays.iterator();
        System.out.println(listDays);
    
        if listDays<String>.contains("Lunes") {
            System.out.println("Sí existe Lunes");
        } else {
            System.out.println("No existe Lunes");
        }
    }
}