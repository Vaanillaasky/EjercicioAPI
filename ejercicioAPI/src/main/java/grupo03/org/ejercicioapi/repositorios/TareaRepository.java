package grupo03.org.ejercicioapi.repositorios;
import grupo03.org.ejercicioapi.modelos.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tareas, Long>{
}
