package examen.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import examen.Domain.Conciertos;

@Repository
public interface ConciertosDao extends CrudRepository<Conciertos, Long> {

}
