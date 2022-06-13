package com.udigitalproject.udigital.services;

import java.util.ArrayList;
import java.util.Optional;
import com.udigitalproject.udigital.models.Tipo;
import com.udigitalproject.udigital.repositories.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoService 
{

    @Autowired
    TipoRepository tipoRepository;

    public ArrayList<Tipo> obtenerTipos(){
        return (ArrayList<Tipo>) tipoRepository.findAll();
    }

    public Tipo guardarTipo(Tipo estado){
        return tipoRepository.save(estado);
    }

    public Optional<Tipo> obtenerPorId(Long id){
        return tipoRepository.findById(id);
    }

    public boolean eliminarTipo(Long id) {
        try{
            tipoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}