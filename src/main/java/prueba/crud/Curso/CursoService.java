package prueba.crud.Curso;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    // CRUD GUARDAR
    public Curso saveCurso(Curso entity) {
        return cursoRepository.save(entity);
    }

    public Curso findByCurso(long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public void deleteById(long id) {
        cursoRepository.deleteById(id);
    }

    public List<Curso> findCurso() {
        return cursoRepository.findAll();
    }

    // CRUD ACTUALIZAR
    public Curso updateCurso(long id, Curso updatedCurso) {
        Curso existingCurso = cursoRepository.findById(id).orElse(null);
        if (existingCurso != null) {

            return cursoRepository.save(existingCurso);
        } else {
            return null;
        }
    }
}
