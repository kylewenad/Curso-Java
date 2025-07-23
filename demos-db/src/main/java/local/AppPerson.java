package local;

import local.entities.Person;
import local.repositories.PersonDAO;

public class AppPerson {
    
    private static void checkPersons(){
        PersonDAO dao = new PersonDAO();
        
        dao.save(new Person("Pepe", "Perez","pp@sample.com"));
        dao.save(new Person("Luisa", "Gomez", "lg@sample.com"));
        
        System.out.println("Find All --------------------------------");
        System.out.println(dao.findAll());
        System.out.println("Find by Id valid -----------------------------------------");
        System.out.println(dao.findById(1));
        System.out.println("Find by Id invalid-----------------------------");
        System.out.println(dao.findById(100));

        System.out.println("Delete by id (if exist)-----------------------");
        dao.findById(1).ifPresentOrElse(
            //meetingDAO::delete,    
            entity -> dao.delete(entity),
            ()-> System.out.println("Persona no encontrada: no se ha podido eliminar"));
        System.out.println("Find All after delete ----------------------------------------");
        System.out.println(dao.findAll());
        

        try {
            Person p3 = dao.findById(4).orElseThrow(() -> new RuntimeException("Person not found"));
            System.out.println("Update by Id 2 -----------------------");
            p3.setEmail("new@sample.com");
            dao.update(p3);
            System.out.println("Find All after update ----------------------------------------");
            System.out.println(dao.findAll());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    
    }
    
    
    public static void main(String[] args) {
        System.out.println("Persons application");
        checkPersons();
    }
//TODO revisar
}
