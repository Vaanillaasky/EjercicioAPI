package grupo03.org.ejercicioapi.controladores;
import grupo03.org.ejercicioapi.servicios.TareaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tareas")
public class TareaRestController {
    @Autowired
    TareaServiceImpl tareaService;

}
