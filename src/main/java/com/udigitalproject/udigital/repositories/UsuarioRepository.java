package com.udigitalproject.udigital.repositories;

import java.util.ArrayList;
import com.udigitalproject.udigital.models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    public abstract ArrayList<Usuario> findById(Integer id);

}