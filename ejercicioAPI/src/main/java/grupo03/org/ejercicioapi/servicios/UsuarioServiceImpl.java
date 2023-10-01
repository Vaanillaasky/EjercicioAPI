package grupo03.org.ejercicioapi.servicios;
import jakarta.transaction.Transactional;
import grupo03.org.ejercicioapi.modelos.Usuarios;
import grupo03.org.ejercicioapi.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

        @Autowired
        UsuarioRepository usuarioRepository;


        @Override
        public List<Usuarios> listaDeUsuarios() {
            return usuarioRepository.findAll();
        }


        @Override
        public Usuarios guardarLosUsuarios(Usuarios usuarioNuevo) {
            return usuarioRepository.save(usuarioNuevo);
        }

        @Override
        public void borrarLosUsuarios(Long id) {
            usuarioRepository.deleteById(id);
        }

        @Override
        public Usuarios editarLosUsuariosPorId(Long id, Usuarios usuarioEditado) {
            usuarioRepository.existsById(id);
            return usuarioEditado;
        }
}
