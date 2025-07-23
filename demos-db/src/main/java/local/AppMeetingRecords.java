package local;

import local.entities.MeetingRecord;
import local.repositories.MeetingRecordDAO;

public class AppMeetingRecords {
    
    private static void checkMeetingRecord(){
        MeetingRecordDAO dao = new MeetingRecordDAO();
        
        dao.save(new MeetingRecord("Info de una reunión"));
        dao.save(new MeetingRecord("Info de otra reunión"));
        
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
            ()-> System.out.println("Grabación no encontrada: no se ha podido eliminar"));
        System.out.println("Find All after delete ----------------------------------------");
        System.out.println(dao.findAll());
        
        try {
            MeetingRecord p3 = dao.findById(4).orElseThrow(() -> new RuntimeException("Record not found"));
            System.out.println("Update by Id 2 -----------------------");
            p3.setContent("Info Actualizada de la reunión");
            dao.update(p3);
            System.out.println("Find All after update ----------------------------------------");
            System.out.println(dao.findAll());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    
    }
    
    
    public static void main(String[] args) {
        System.out.println("Persons application");
        checkMeetingRecord();
    }
//TODO revisar
}
