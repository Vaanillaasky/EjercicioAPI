package grupo03.org.ejercicioapi.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
//Asignar un nombre a la tabla
@Table(name = "usuarios_ejercicio")

public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuario_id;

    @Column(name = "nombre")//Asignar un nombre a la columna
    @NotNull
    private String nombreUsuario;


    @NotNull
    private String email;

    @JsonIgnore
  @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Tareas> tareasUsuario;



}