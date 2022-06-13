package com.udigitalproject.udigital.services;

import java.util.ArrayList;
import java.util.Optional;
import com.udigitalproject.udigital.models.Estado;
import com.udigitalproject.udigital.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService 
{

    @Autowired
    EstadoRepository estadoRepository;

    public ArrayList<Estado> obtenerEstados(){
        return (ArrayList<Estado>) estadoRepository.findAll();
    }

    public Estado guardarEstado(Estado estado){
        return estadoRepository.save(estado);
    }

    public Optional<Estado> obtenerPorId(Long id){
        return estadoRepository.findById(id);
    }

    public boolean eliminarEstado(Long id) {
        try{
            estadoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
