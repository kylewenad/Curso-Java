package local.repositories;

import java.util.List;
import java.util.Optional;

//Repository
public interface IDAO <E> {
//E Datos de la entidad
    
    List<E> findAll();//findAll //getAll
    <ID> Optional<E> findById(ID id);//findById //getById
    E save (E entity);
    void update (E entity);
    void delete(E entity);//<ID> void deleteById (ID id);   
}
