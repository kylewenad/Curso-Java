public class MainCars2 {
    //Añadido id en el archivo Car2
    Car2 car1;
    Car2 car2;

    public static void main(String [] args){
        Car2 car1 = new Car2("Toyota", 'N', 5,  3,"Azul", true);
        Car2 car2 = new Car2("Seat", 'F', 5,  5,"Rojo", false);
        car1.showInfo();
        car2.showInfo();

    }
}
