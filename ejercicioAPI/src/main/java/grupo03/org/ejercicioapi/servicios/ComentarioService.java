package grupo03.org.ejercicioapi.servicios;
import grupo03.org.ejercicioapi.modelos.Comentarios;

import java.util.List;
public interface ComentarioService {
    List<Comentarios> listaDeComentarios();

    Comentarios guardarElComentario(Comentarios comentarioNuevo);

    Comentarios borrarElComentario(Long id);

    Comentarios editarElComentarioPorId(Long id, Comentarios comentarioActualizado);
}
