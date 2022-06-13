package com.udigitalproject.udigital.services;

import java.util.ArrayList;
import java.util.Optional;
import com.udigitalproject.udigital.models.Inventario;
import com.udigitalproject.udigital.repositories.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventarioService 
{

    @Autowired
    InventarioRepository inventarioRepository;

    public ArrayList<Inventario> obtenerInventarios(){
        return (ArrayList<Inventario>) inventarioRepository.findAll();
    }

    public Inventario guardarInventario(Inventario inventario){
        return inventarioRepository.save(inventario);
    }

    public Optional<Inventario> obtenerPorSerial(Long serial){
        return inventarioRepository.findById(serial);
    }

    public boolean eliminarInventario(Long serial) {
        try{
            inventarioRepository.deleteById(serial);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
