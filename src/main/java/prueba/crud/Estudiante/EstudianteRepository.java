package prueba.crud.Estudiante;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {
    List<Estudiante> findAll();
}
