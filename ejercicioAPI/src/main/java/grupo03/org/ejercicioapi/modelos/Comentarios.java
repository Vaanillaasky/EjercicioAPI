package grupo03.org.ejercicioapi.modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comentario_ejercicio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comentarioId;

    @NotNull
    private String comentarioTexto;

    @NotNull
    private String Fecha;

    @ManyToOne
    @JoinColumn(name = "tarea_id", nullable = false)
    private Tareas tareas;


}
