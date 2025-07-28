package local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import local.entities.IEntities;
import local.entities.Meeting;
import local.repositories.MeetingDAO;

public final class AppMeetings {

    static MeetingDAO meetingDAO = new MeetingDAO();

    private static <T extends IEntities> void showList(Collection <T> collection) {
        String className = collection.getClass().getSimpleName();
        if (collection == null || collection.isEmpty()) {
            System.out.println("No items found.");
            return;
        }
        System.out.println(className + ": [");
        collection.forEach(item -> System.out.println(item.toString(true)));
        System.out.println("]");
        System.out.println();
    }

    private static void showOptional(Optional<Meeting> optional) {
        optional.ifPresentOrElse(
                item -> System.out.println(item.toString(true)),
                () -> System.out.println("Meeting no encontrado"));
    }

    private static void showMeetings(){
        System.out.println("Find All --------------------------------");
        showList(meetingDAO.findAll());
        System.out.println("Find by Id valid -----------------------------------------");
        showOptional(meetingDAO.findById(2));
        
        System.out.println("Find by Id invalid-----------------------------");
        showOptional(meetingDAO.findById(100));

        System.out.println("Find by date-----------------------------");
        List<Meeting> m = meetingDAO.findByDate(LocalDate.of(2025, 07, 25));
        showList(m);
        System.out.println("-------------------Next Meeting----------");
        Optional<Meeting>
    }

    private static void checkMeetingInitial() {// firma qué hace la función no cómo lo hace
        // implementación cómo lo hace
        Meeting m1 = meetingDAO.save(new Meeting("Primera reunión", LocalDateTime.now().plusDays(2)));
        Meeting m2 = meetingDAO.save(new Meeting("Segunda reunión", LocalDateTime.now().plusDays(3)));

        System.out.println(m1);
        System.out.println(m2);

        System.out.println("Find All --------------------------------");
        showList(meetingDAO.findAll());
        System.out.println("Find by Id valid -----------------------------------------");
        showOptional(meetingDAO.findById(2));
        System.out.println("Find by Id invalid-----------------------------");
        showOptional(meetingDAO.findById(100));

        System.out.println("Delete by id (if exist)-----------------------");
        try {
            meetingDAO.delete(meetingDAO.findById(2).get());
            showList(meetingDAO.findAll());
        } catch (Exception e) {
            System.out.println("Meeting is removed");
        }

        meetingDAO.findById(1).ifPresentOrElse(
                // meetingDAO::delete,
                entity -> meetingDAO.delete(entity),
                () -> System.out.println("Reunión no encontrada: no se ha podido eliminar"));
        System.out.println("Find All after delete ----------------------------------------");
        showList(meetingDAO.findAll());

        try {
            Meeting m3 = meetingDAO.findById(3).orElseThrow(() -> new RuntimeException("Meeting not found"));
            System.out.println("Update by Id 2 -----------------------");
            m3.setDescription("Reunión actualizada");
            m3.setDate(LocalDateTime.now().plusDays(4));
            meetingDAO.update(m3);
            System.out.println("---Find All After Update-------------------");
            showList(meetingDAO.findAll());

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Meetings application");
        // checkMeetingInitial();
        showMeetings();
    }
}
