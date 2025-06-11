import java.util.Scanner;

public class Schoolofenglish {

    
    static int getAgeByScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la edad del alumno");
        int age = scanner.nextInt();
        System.out.println("");
        scanner.close();
        return age;
    }

        public static void main(String[] args) {
        
            String[] messages = {
            "La clase Kinder son los Lunes y Miércoles de 16 a 17 horas",
            "La clase 1st year son los Martes y Jueves de 16:30 a 17:30 horas",
            "La clase 2nd year son los Martes y Jueves de 17:30 a 19 horas",
            "La clase 3rd year son los Lunes y Miércoles de 17 a 18:30 horas",
            "No tenemos clases para mayores de 13 años"
            };
        
         int studentAge = getAgeByScanner();
         int index = 4; // 4 para poder suprimir las últimas líneas de else
            if(studentAge <= 6) {
                index = 0;
            //System.out.println(messages[0]); si queremos escribir el println uno a uno
            } else if(studentAge <= 8) {
            //System.out.println(messages[1]);
                index = 1;
            } else if(studentAge <= 10) {
            //System.out.println(messages[2]);
                index = 2;
            } else if (studentAge <= 13) {
            //System.out.println(messages[3]);
                index = 3;
            //} else {
            //System.out.println(messages[4]);
                //index = 4;
            //}


            //Otra forma de hacerlo
            //int index = (studentAge <= 6) ? 0 :  (un ternario)
            //(studentAge <=8) ? 1 :
            //(studentAge <=10) ? 2 :
            //(studentAge <=13) ? 3 :

            System.out.println(messages[index]);
            }
        }

}
