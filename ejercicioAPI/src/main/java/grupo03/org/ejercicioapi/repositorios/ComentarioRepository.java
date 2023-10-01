package grupo03.org.ejercicioapi.repositorios;
import grupo03.org.ejercicioapi.modelos.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ComentarioRepository extends JpaRepository<Comentarios, Long>{

}
