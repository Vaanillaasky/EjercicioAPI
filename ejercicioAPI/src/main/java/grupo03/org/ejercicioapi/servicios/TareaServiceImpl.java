package grupo03.org.ejercicioapi.servicios;
import grupo03.org.ejercicioapi.modelos.Tareas;
import grupo03.org.ejercicioapi.repositorios.TareaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TareaServiceImpl implements TareaService {

        @Autowired
        TareaRepository tareaRepository;

        @Override
        public List<Tareas> listaDeTareas() {
            return tareaRepository.findAll();
        }

        @Override
        public Tareas guardarLaTarea(Tareas tareaNueva) {
            return null;
        }

        @Override
        public void borrarLaTarea(Long id) {

        }

        @Override
        public Tareas editarLaTareaPorId(Long id, Tareas tareaEditada) {
            return null;
        }
}
