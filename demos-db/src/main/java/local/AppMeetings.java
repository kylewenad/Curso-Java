package local;

import java.time.LocalDateTime;
import java.util.List;

import local.entities.Meeting;
import local.repositories.MeetingDAO;

    

public final class AppMeetings {

    static MeetingDAO meetingDAO = new MeetingDAO(); 

    private static void checkMeetingInitial(){
         
        Meeting m1 = meetingDAO.save(new Meeting ("Primera reunión", LocalDateTime.now().plusDays(2)));
        Meeting m2 = meetingDAO.save(new Meeting ("Segunda reunión", LocalDateTime.now().plusDays(3)));
    
        System.out.println(m1);
        System.out.println(m2);
       
        System.out.println("Find All --------------------------------");
        System.out.println(meetingDAO.findAll());
        System.out.println("Find by Id valid -----------------------------------------");
        System.out.println(meetingDAO.findById(1));
        System.out.println("Find by Id invalid-----------------------------");
        System.out.println(meetingDAO.findById(100));
        
        System.out.println("Delete by id (if exist)-----------------------");
            try {
                meetingDAO.delete(meetingDAO.findById(2).get());
                System.out.println(meetingDAO.findAll());
            } catch (Exception e) {
            System.out.println("Meeting is removed");
            }

        meetingDAO.findById(1).ifPresentOrElse(
            //meetingDAO::delete,    
            entity -> meetingDAO.delete(entity),
            ()-> System.out.println("Reunión no encontrada: no se ha podido eliminar"));
        System.out.println("Find All after delete ----------------------------------------");
        System.out.println(meetingDAO.findAll());
        

        try {
            Meeting m3 = meetingDAO.findById(3).orElseThrow(() -> new RuntimeException("Meeting not found"));
            System.out.println("Update by Id 2 -----------------------");
            m3.setDescription("Reunión actualizada");
            m3.setDate(LocalDateTime.now().plusDays(4));
            meetingDAO.update(m3);
        
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("Meetings application");
        //checkMeetingInitial();
        System.out.println("Find All --------------------------------");
        System.out.println(meetingDAO.findAll());

        System.out.println("Find by date ------------------------------");
        List<Meeting> m = meetingDAO.findByDate(LocalDateTime.of(2025, 07, 23, 0, 0, 0));
        System.out.println(m);
        
    }
}
