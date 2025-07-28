package local.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "meetings")
public class Meeting implements IEntities{
    @Column(name="meeting_id")
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String description;
    private LocalDateTime date;
    
    @OneToOne (cascade = CascadeType.ALL,
    fetch = FetchType.LAZY)
    @JoinColumn(name="meetingRecord_id", 
        unique = true)
    private MeetingRecord meetingRecord;
    
    
    @ManyToOne(fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)
    @JoinColumn(name="room_id")
    private Room room;
    
    
    @ManyToMany(mappedBy = "meetings",
        fetch = FetchType.LAZY)
    
    private Set<Person> persons;//no debería ser una lista para que no se dupliquen los datos, con set obligamos a que sean únicas
    private Set<Room> rooms;
    
    public Meeting() { //JPA default constructor
        persons = new HashSet<>();
    }
    
    public Meeting(String description, LocalDateTime date) { //Sin id porque se genera automáticamente con GenerateValue
        this.description = description;
        this.date = date;
    }
    
    public Set<Person> getPersons() {
        return persons;
    }
    
    public Set<Room> getRooms() {
        return rooms;
    }
    
    public int getId() {
        return id;
    }
    
    public void setRoom(Room room) {
        this.room = room;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    
    public void setMeetingRecord(MeetingRecord meetingRecord) {
        this.meetingRecord = meetingRecord;
    }

    public void addParticipant(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        if (persons.contains(person)){
            return; //la persona ya fue añadida
        }
        persons.add(person);
        if (!person.getMeetings().contains(this)){
            person.getMeetings().add(this);
        }
    }

    @Override
    public String toString(){
        return toString(false);
    }

    public String toString(boolean isFull) {
        StringBuilder sb = new StringBuilder();
        sb.append("Meeting {id:").append(id)
            .append(", description:").append(description)
            .append(", date:").append(date.format(DateTimeFormatter.ISO_LOCAL_DATE))
            .append(", time:").append(date.format(DateTimeFormatter.ISO_LOCAL_TIME));
        
            if(isFull && room != null) {
                sb.append(", room=:").append(room);
            }

            if(isFull && meetingRecord != null){
                sb.append(", record:").append(meetingRecord);
            }

            if (isFull && persons != null) {
                sb.append(", persons:").append(persons);
            }

            sb.append("}");
            return sb.toString();
    }
}
