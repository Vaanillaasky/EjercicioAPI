package grupo03.org.ejercicioapi.controladores;
import grupo03.org.ejercicioapi.servicios.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comentario")
public class ComentarioRestController {
    @Autowired
    ComentarioServiceImpl comentarioService;

}
