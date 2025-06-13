public class Week {
    public static void main(String[] args) {
        //Valores discretos: Switch
        //Si tuviera condiciones entonces no se podría usar Switch
        int day = 3;

        //if(day == 1) {
            //System.out.println("Lunes");
        //} else if(day == 2) {
           // System.out.println("Martes");
        //} else if (day == 3) {
          //  System.out.println("Miércoles");
        //}else if (day == 4) {
          //  System.out.println("Jueves");
        //} else if (day == 5) {
          //  System.out.println("Viernes");
        //} else {
          //  System.out.println("Fin de semana");
        //}
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6: //si no escribo nada salta al caso siguiente
            case 7:
                System.out.println("Fin de semana");
                break;

            default:
                System.out.println("Número no válido, la semana sólo tiene 7 días");
            break;

        }
    }
}
