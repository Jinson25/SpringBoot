package prueba.crud.Curso;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository <Curso, Long>
{
    List<Curso> findAll();
}