package com.api.crud.Repositorio;

import com.api.crud.Modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IUsuario extends JpaRepository<Usuario, Long> {

}
