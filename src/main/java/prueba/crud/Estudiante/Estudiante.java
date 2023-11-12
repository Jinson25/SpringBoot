package prueba.crud.Estudiante;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import prueba.crud.Curso.Curso;

@Data
@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String apellido;

    @ManyToOne
    private Curso curso;
}

