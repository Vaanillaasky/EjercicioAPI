package grupo03.org.ejercicioapi.servicios;
import grupo03.org.ejercicioapi.modelos.Comentarios;
import grupo03.org.ejercicioapi.repositorios.ComentarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ComentarioServiceImpl implements ComentarioService {

        @Autowired
        ComentarioRepository comentarioRepository;

        @Override
        public List<Comentarios> listaDeComentarios() {
            return null;
        }

        @Override
        public Comentarios guardarElComentario(Comentarios comentarioNuevo) {
            return null;
        }

        @Override
        public Comentarios borrarElComentario(Long id) {
            return null;

        }

        @Override
        public Comentarios editarElComentarioPorId(Long id, Comentarios comentarioActualizado) {
                return null;
            }
        }


