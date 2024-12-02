package com.api.crud.Controlador;

import com.api.crud.Modelos.Usuario;
import com.api.crud.Servicio.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/crudusuario")
public class ControladorUsuario {
    @Autowired
    private ServicioUsuario servicioUsuario;

    @GetMapping
    public ArrayList<Usuario> getUsuarios(){
        return this.servicioUsuario.getUsuarios();
    }

    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario user){
        return this.servicioUsuario.guardarUsuario(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuario> getUsuariosPorId(@PathVariable Long id){
        return this.servicioUsuario.encontrarId(id);
    }

    @PutMapping(path = "/{id}")
    public Usuario actualizarUsuarioPorId(@RequestBody Usuario request, Long id){
        return this.servicioUsuario.actualizarId(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        Boolean ok = this.servicioUsuario.eliminarUsuario(id);
        if (ok){
            return "Usuario " + id + " eliminado";
        } else {
            return "Error, Usuario: " + id;
        }
    }

}
