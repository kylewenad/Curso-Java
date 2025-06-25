import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//para no sobrescribir datos del original
public class ArraysDemo {

    public static int[] foo(int[] data) {
        int[] newData = data.clone();
        //se añade un clon para que no sobrescriba data3 y valga 400
        newData [0] = 400;
        System.out.println(newData[0]);
        return newData;
    }

    public static void showArray(int[] data){
        System.out.print("[");
        System.out.print(data[0]);
        int [] shortArray = Arrays.copyOfRange(data, 1, data.length - 1);
        
        for (int i = 0; i < data.length; i++) {
            System.out.print(", " + data[i]);
            if (i >= data.length);

        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        
        int[] data = {1, 2, 3, 7, 89};
        int[] data2 = data;
        int[] data3 = {1, 2, 3, 7, 89};
        System.out.println(data == data2); //true
        System.out.println(data == data3); //false
    
        foo(data3);
        System.out.println("Mi array " + Arrays.toString(data3));
        showArray(data3);
        //System.out.println(data3[0]); //400, no debería salir por lo tanto hay que modificar foo, que debería salir 1

        List<Integer> list = new ArrayList<>();
        // <> genéricos para decir de qué tipo quiero que sea la lista
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(89);
        System.out.println(list);

    }
}
//métodos de clonado de array -> Arrays
