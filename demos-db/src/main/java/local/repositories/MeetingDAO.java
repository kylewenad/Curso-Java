package local.repositories;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.TypedQuery;
import local.entities.Meeting;

public class MeetingDAO extends AbstractDAO<Meeting> {

    public MeetingDAO() {
        super(Meeting.class);
    }

    public List<Meeting> findByDate(LocalDate date) {
        
        String qs = "FROM Meeting m WHERE DATE(m.date) = ?1";
        //Query query0 = entityManager.createQuery(qs);//devuelve objetos
        TypedQuery<Meeting> query = entityManager.createQuery(qs,Meeting.class); //devuelve meetings
        query.setParameter(1, date);//lo hace sql? inyección sql?
        //return query.getResultList(); //lanza la consulta y devuelve la lista de reuniones
        return query.getResultList();
    }

    public Optional<Meeting> nextMeetingBasic(){
        
        try {
            String qs = "FROM " + Meeting.class.getCanonicalName()
           + " WHERE date > :currentDate ORDER BY date ASC LIMIT 1"; //para que el resultado lo de por orden ascendente, LIMIT para que sólo devuelva un elemento
        TypedQuery<Meeting> query = entityManager.createNamedQuery(qs, Meeting.class);
        query.setParameter("currentDate", LocalDateTime.now());
        return Optional<T>.ofNullable(null);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
            return query.getSingleResult();
    }

}
