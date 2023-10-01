package grupo03.org.ejercicioapi.repositorios;
import grupo03.org.ejercicioapi.modelos.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long>{

}
