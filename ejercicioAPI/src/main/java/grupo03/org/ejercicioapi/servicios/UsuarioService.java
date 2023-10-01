package grupo03.org.ejercicioapi.servicios;
import grupo03.org.ejercicioapi.modelos.Usuarios;
import java.util.List;

public interface UsuarioService {
    List<Usuarios> listaDeUsuarios();

    Usuarios guardarLosUsuarios (Usuarios usuarioNuevo);

    void borrarLosUsuarios(Long id);

    Usuarios editarLosUsuariosPorId(Long id, Usuarios usuarioEditado);
}
