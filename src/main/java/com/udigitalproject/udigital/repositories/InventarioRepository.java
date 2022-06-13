package com.udigitalproject.udigital.repositories;

import java.util.ArrayList;
import com.udigitalproject.udigital.models.Inventario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventarioRepository extends CrudRepository<Inventario, Long> {
    public abstract ArrayList<Inventario> findBySerial(Integer id);

}
