package com.udigitalproject.udigital.repositories;

import java.util.ArrayList;
import com.udigitalproject.udigital.models.Marca;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MarcaRepository extends CrudRepository<Marca, Long> {
    public abstract ArrayList<Marca> findById(Integer id);

}