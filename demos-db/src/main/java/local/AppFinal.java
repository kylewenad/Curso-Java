package local;

import java.time.LocalDateTime;

import local.entities.Meeting;
import local.entities.MeetingRecord;
import local.entities.Person;
import local.entities.Room;
import local.repositories.MeetingDAO;
import local.repositories.PersonDAO;

public class AppFinal {

    static PersonDAO personDAO = new PersonDAO();
    static MeetingDAO meetingDAO = new MeetingDAO();

    public static void main(String[] args) {

        Room r = new Room("S0103", "Sala Deluxe",  12);
        Meeting m = new Meeting("Reunión inicial del proyecto", LocalDateTime.now().plusDays(1));
        m.setRoom(r);
        Person p1 = new Person("Ernestina", "Ramírez", "erni@sample.comm");
        Person p2 = personDAO.findById(3).get();
        m.addParticipant(p1);
        m.addParticipant(p2);
        MeetingRecord rc = new MeetingRecord("Lo que haremos en el proyecto nuevo");
        m.setMeetingRecord(rc);
        m = meetingDAO.save(m);
        
        AppMeetings.showOptional(meetingDAO.findById(null,"Meeting"));
    }
}
