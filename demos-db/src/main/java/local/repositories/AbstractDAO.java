package local.repositories;

import java.util.List;
import java.util.Optional;


import jakarta.persistence.EntityManager;
import local.connections.EntityManagerProvider;

public abstract class AbstractDAO<E> implements IDAO<E>{

    EntityManager entityManager;
    Class<E> entityClass;

    public AbstractDAO(Class<E> entityClass) {
        entityManager = EntityManagerProvider.getEntityManager();
        this.entityClass = entityClass;
    }

    public AbstractDAO(Class<E> entityClass, EntityManager entityManager) {
        this.entityClass = entityClass;
        this.entityManager = entityManager;
    }

    @Override
    public List<E> findAll() {
        String finalSQL = " FROM " + entityClass.getCanonicalName();
        return entityManager
            .createQuery(finalSQL, entityClass)
            .getResultList();
    }

    @Override
    public <ID> Optional<E> findById(ID id) {
       // String finalSQL = 
         //   " FROM " + entityClass.getCanonicalName() + 
         //   " WHERE id= " + id;
        return Optional.ofNullable(entityManager.find(entityClass, id));
    }

    @Override
    public E save(E entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);//para guardar(persist)
        entityManager.getTransaction().commit();
        return entity;
    }

    @Override
    public void update(E entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(E entity) {
        entityManager.getTransaction().begin();
        entityManager.remove(entity);
        entityManager.getTransaction().commit();
    }

    
}
