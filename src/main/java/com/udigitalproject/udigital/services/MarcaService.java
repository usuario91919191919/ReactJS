package com.udigitalproject.udigital.services;

import java.util.ArrayList;
import java.util.Optional;
import com.udigitalproject.udigital.models.Marca;
import com.udigitalproject.udigital.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaService 
{

    @Autowired
    MarcaRepository marcaRepository;

    public ArrayList<Marca> obtenerMarcas(){
        return (ArrayList<Marca>) marcaRepository.findAll();
    }

    public Marca guardarMarca(Marca marca){
        return marcaRepository.save(marca);
    }

    public Optional<Marca> obtenerPorId(Long id){
        return marcaRepository.findById(id);
    }

    public boolean eliminarMarca(Long id) {
        try{
            marcaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}

