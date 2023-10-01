package grupo03.org.ejercicioapi.controladores;
import grupo03.org.ejercicioapi.modelos.Usuarios;
import grupo03.org.ejercicioapi.servicios.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {
    @Autowired
    UsuarioServiceImpl usuarioService;

    @GetMapping("/lista")
    public List<Usuarios> listaDeUsuarios() {
        List<Usuarios> listaMostrar = usuarioService.listaDeUsuarios();
        return listaMostrar;
    }

    @PostMapping("/nuevo")
    public Usuarios crearUsuario(@RequestBody Usuarios usuarioNuevo) {
        return usuarioService.guardarLosUsuarios(usuarioNuevo);
    }

    @PutMapping("/editar")
    public Usuarios editarUsuarioPorId(@RequestParam Long id, @RequestBody Usuarios usuarioEditado) {
        Usuarios ElusuarioestaEditado = usuarioService.editarLosUsuariosPorId(id, usuarioEditado);
        return ElusuarioestaEditado;
    }


    @DeleteMapping("/borrar")
    public String borrarUsuarioPorId(@RequestParam Long id) {
        usuarioService.borrarLosUsuarios(id);
        return "El usuario ha sido borrado.";
    }
}
