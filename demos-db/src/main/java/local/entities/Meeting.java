package local.entities;

import java.time.LocalDateTime;
import java.util.Set;

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
public class Meeting {
    @Column(name="meeting_id")
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private LocalDateTime date;

    @OneToOne
    @JoinColumn(name="meetingRecord_id", unique = true)
    private MeetingRecord meetingRecord;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="room_id")
    private Room room;

    @ManyToMany(mappedBy = "meetings",fetch = FetchType.LAZY)
    private Set<Person> assistance;//no debería ser una lista para que no se dupliquen los datos, con set obligamos a que sean únicas
    
    public Meeting() { //JPA default constructor
    }

    public Meeting(String description, LocalDateTime date) { //Sin id porque se genera automáticamente con GenerateValue
        this.description = description;
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Meeting [id=" + id + ", description=" + description + ", date=" + date + ", room=" + room + "]";
    }
}
