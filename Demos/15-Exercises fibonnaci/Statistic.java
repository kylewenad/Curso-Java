public class Statistic {

    static int addAllArray(int[] data) {
        //acumulador de datos (para que vaya sumando los arrays)
        int acumulator = 0;
        for (int i : data) {
            acumulator = acumulator + i;
        }
        return acumulator;
    }
    
    static double averageArray(int[] data) {
        double average = (double)addAllArray(data) / data.length;
        return average;
    }

    static double average(int...args){
        //funcion varargs
        //funcion q calcule la media por medio de los datos
        return averageArray(args);
    }
    
    public static void main(String[] args) {
        //calcular la media
        int[] data = {2,3,4,7,6,3,5,8,1,2};
        int acumulator = addAllArray(data);
        double average = averageArray(data);
        System.out.println("La suma es " + acumulator);
        System.out.println("La media es " + average);

            double average2 = average(2,3,4);
            System.out.println("La media es " + average2);
    }
    
}
