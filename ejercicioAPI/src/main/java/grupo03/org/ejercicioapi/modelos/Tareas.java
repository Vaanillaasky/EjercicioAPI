package grupo03.org.ejercicioapi.modelos;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "tarea_ejercicio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tareas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tareas_Id;

    @NotNull
    private String tareasTitulo;

    @NotNull
    private String tareasDescripcion;

    @NotNull
    private String tareasFecha;


    @ManyToOne
    @JoinColumn(name = "usuarios", nullable = false)
    private Usuarios usuario;

    @OneToMany(mappedBy = "tareas", cascade = CascadeType.ALL)
    private List<Comentarios> comentariosTareas;

}
