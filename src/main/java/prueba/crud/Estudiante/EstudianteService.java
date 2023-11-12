package prueba.crud.Estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    // Paso 1: Guardar un estudiante
    public Estudiante saveEstudiante(Estudiante entity) {
        return estudianteRepository.save(entity);
    }

    // Paso 2: Obtener todos los estudiantes
    public List<Estudiante> findEstudiante() {
        return estudianteRepository.findAll();
    }

    // Paso 3: Actualizar un estudiante por su ID
    public Estudiante updateEstudiante(long id, Estudiante updatedEstudiante) {
        Estudiante existingEstudiante = estudianteRepository.findById(id).orElse(null);
        if (existingEstudiante != null) {
            existingEstudiante.setNombre(updatedEstudiante.getNombre());
        existingEstudiante.setApellido(updatedEstudiante.getApellido());
            return estudianteRepository.save(existingEstudiante);
        } else {
            return null;
        }
    }

    // Paso 4: Eliminar un estudiante por su ID
    public void deleteById(long id) {
        estudianteRepository.deleteById(id);
    }
}
