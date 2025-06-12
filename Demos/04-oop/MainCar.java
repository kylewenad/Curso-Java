public class MainCar {
    Car car1;
    Car car2;

    public static void main(String [] args){
    
        Car car1 = new Car("Toyota", 'N', 5, 3, "Azul", true);
        Car car2 = new Car("Seat", 'F', 5, 5, "Rojo", false);
        car1.showInfo();
        car2.showInfo();

    }
}
