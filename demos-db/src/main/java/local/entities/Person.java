package local.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
    @Column(name="person_id")
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Person() {
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
}
