package prueba.crud.Estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/estudiante")
@CrossOrigin({"*"})
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    // Paso 1: Crear un nuevo estudiante
    @PostMapping("/")
    public Estudiante saveEstudiante(@RequestBody Estudiante entity) {
        return estudianteService.saveEstudiante(entity);
    }

    // Paso 2: Obtener todos los estudiantes
    @GetMapping("/")
    public List<Estudiante> findAll() {
        return estudianteService.findEstudiante();
    }

    // Paso 3: Actualizar un estudiante por su ID
    @PutMapping("/{id}")
    public Estudiante updateEstudiante(@PathVariable long id, @RequestBody Estudiante entity) {
        return estudianteService.updateEstudiante(id, entity);
    }

    // Paso 4: Eliminar un estudiante por su ID
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        estudianteService.deleteById(id);
    }
}

