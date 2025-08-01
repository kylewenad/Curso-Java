package local.entities;

import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="records")

public class MeetingRecord implements IEntities{
    @Column(name="record_id")
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    
    @OneToOne(cascade = CascadeType.ALL)
    private Meeting meetings;

    private UUID id;
    private String content;
    
    
    public MeetingRecord() {//para que lo pueda usar Hibernate
    }
    
    public MeetingRecord(String content) {
        this.content = content;
    }
   

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MeetingRecord [id=" + id +
        ", content=" + content  + 
        "]";
    }

    @Override
    public String toString(boolean isFull) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

    
}
