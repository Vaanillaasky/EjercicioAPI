package grupo03.org.ejercicioapi.servicios;

import grupo03.org.ejercicioapi.modelos.Tareas;

import java.util.List;
public interface TareaService {
    List<Tareas> listaDeTareas();
    Tareas guardarLaTarea(Tareas tareaNueva);

    void borrarLaTarea(Long id);

    Tareas editarLaTareaPorId(Long id, Tareas tareaActualizada);
}
