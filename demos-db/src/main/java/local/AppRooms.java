package local;

import local.entities.Room;
import local.repositories.RoomDAO;

public class AppRooms {
    static RoomDAO dao = new RoomDAO();

    private static void showRooms(){
        System.out.println("Find All --------------------------------");
        System.out.println(dao.findAll());

        System.out.println("Find by name ------------------------");
        System.out.println(dao.findByName("Sala principal"));

        System.out.println("Find by capacity--------------------------");
        System.out.println(dao.findByCapacity(5));
    }

    @SuppressWarnings("unused")
    private static void checkRoom(){
        
        
        try {    
            dao.save(new Room("S0101", "Sala principal", 10));
        } catch (Exception e) {
            System.out.println("Salas ya creadas");
        }
        
        dao.save(new Room("S0201", "Sala pequeña", 5));
        System.out.println("Find All --------------------------------");
        System.out.println(dao.findAll());
        System.out.println("Find by Id valid -----------------------------------------");
        System.out.println(dao.findById(1));
        System.out.println("Find by Id invalid-----------------------------");
        System.out.println(dao.findById(100));

        System.out.println("Delete by id (if exist)-----------------------");
        dao.findById("S0201").ifPresentOrElse(
            //meetingDAO::delete,    
            entity -> dao.delete(entity),
            ()-> System.out.println("Sala no encontrada: no se ha podido eliminar"));
        System.out.println("Find All after delete ----------------------------------------");
        System.out.println(dao.findAll());
        

        try {
            Room r1 = new Room("S0101","Sala principal", 15);
    
            System.out.println("Update by Id 2 -----------------------");
            dao.update(r1);
            System.out.println("Find All after update ----------------------------------------");
            System.out.println(dao.findAll());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    
    
    public static void main(String[] args) {
        System.out.println("Persons application");
        //checkRoom();
        showRooms();
    }

}//TODO faltan cosas
