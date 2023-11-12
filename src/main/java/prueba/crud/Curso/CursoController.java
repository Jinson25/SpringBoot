package prueba.crud.Curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/curso")
@CrossOrigin({"*"})
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping("/")
    public Curso saveCurso(@RequestBody Curso entity) {
        return cursoService.saveCurso(entity);
    }

    @GetMapping("/")
    public List<Curso> findAll() {
        return cursoService.findCurso();
    }

    @PutMapping("/{id}")
    public Curso updateCurso(@PathVariable long id, @RequestBody Curso entity) {
        return cursoService.updateCurso(id, entity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        cursoService.deleteById(id);
    }
}
