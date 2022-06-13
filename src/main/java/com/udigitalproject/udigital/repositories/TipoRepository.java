package com.udigitalproject.udigital.repositories;

import java.util.ArrayList;
import com.udigitalproject.udigital.models.Tipo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TipoRepository extends CrudRepository<Tipo, Long> {
    public abstract ArrayList<Tipo> findById(Integer id);

}
