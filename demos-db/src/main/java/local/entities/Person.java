package local.entities;

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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="persons")

public class Person implements IEntities{

    @Column(name="person_id")
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
        joinColumns = { 
            @JoinColumn(name = "meeting_id")}, 
        inverseJoinColumns =  {
            @JoinColumn(name = "person_id")}
        )
    
    private Set<Meeting> meetings;
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
        meetings = new HashSet<>();
    }

    public Set<Meeting> getMeetings() {
        return meetings;
    }

    public void addMeeting(Meeting meeting) {
        if(meeting == null)
         throw new IllegalArgumentException("Person cannot be null");
        
        if (meetings.contains(meeting)){
            return; //la persona ya fue añadida
        }

        this.meetings.add(meeting);
        
        if (!meeting.getPersons().contains(this))
            meeting.getPersons().add(this);
    }
    
    
    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Person [Id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + "]";
    }

    @Override
    public String toString(boolean isFull) {
        
    }
}
