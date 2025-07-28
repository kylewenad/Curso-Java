package local.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="rooms")

public class Room implements IEntities{
    //columnas de la tabla rooms
    @Column(name="room_id")
    @Id()
    private String id;
    private String name;
    private int capacity;

    @OneToMany(mappedBy = "room",
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY)
    private Set <Meeting> meetings;
    
    public Room() {
        meetings = new HashSet<>();
    }
    public Room(String id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }
    
    public void addMeeting(Meeting meetings) {
        meetings.add(meetings);
    }
    

    @Override
    public String toString() {
        return "Room [id=" + id + ", name=" + name + ", capacity=" + capacity + ", meetings=" + meetings + "]";
    }
    @Override
    public String toString(boolean isFull) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
}
