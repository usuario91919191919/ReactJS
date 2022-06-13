package com.udigitalproject.udigital.repositories;

import java.util.ArrayList;
import com.udigitalproject.udigital.models.Estado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long> {
    public abstract ArrayList<Estado> findById(Integer id);

}