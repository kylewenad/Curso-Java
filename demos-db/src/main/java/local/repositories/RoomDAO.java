package local.repositories;

import java.util.List;

import jakarta.persistence.TypedQuery;
import local.entities.Room;

public class RoomDAO extends AbstractDAO<Room>{
    public RoomDAO() {
        super(Room.class);
    }

    public Room findByName(String name){
        String finalQuery = " FROM " + Room.class.getCanonicalName() +
        " WHERE name= :name";
        TypedQuery<Room> query = entityManager.createQuery(finalQuery, Room.class)
        .setParameter("name", name);
        return query.getSingleResult();
    }

    public List<Room> findByCapacity(int capacity){
        String finalQuery = " FROM " + Room.class.getCanonicalName() +
        " WHERE capacity >= :capacity ORDER BY name ASC";
        TypedQuery<Room> query = entityManager.createQuery(finalQuery, Room.class)
        .setParameter("capacity", capacity);
        return query.getResultList();
    }
}
