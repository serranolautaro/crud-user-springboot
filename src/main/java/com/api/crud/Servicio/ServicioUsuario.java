package com.api.crud.Servicio;

import com.api.crud.Modelos.Usuario;
import com.api.crud.Repositorio.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ServicioUsuario {

    @Autowired
    IUsuario Iusuario;

    public ArrayList<Usuario> getUsuarios() {
        return (ArrayList<Usuario>) Iusuario.findAll();
    }

    public Usuario guardarUsuario(Usuario user) {
        return Iusuario.save(user);
    }

    public Optional<Usuario> encontrarId(Long id) {
        return Iusuario.findById(id);
    }

    public Usuario actualizarId(Usuario request, Long id) {
        Usuario user = Iusuario.findById(id).get();

        user.setNombre(request.getNombre());
        user.setApellido(request.getApellido());
        user.setEmail(request.getEmail());

        return user;
    }

    public Boolean eliminarUsuario(Long id){
        try{
            Iusuario.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
