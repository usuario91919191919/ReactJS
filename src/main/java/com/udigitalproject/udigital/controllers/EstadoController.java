package com.udigitalproject.udigital.controllers;


import java.util.ArrayList;
import java.util.Optional;

import com.udigitalproject.udigital.models.Estado;
import com.udigitalproject.udigital.services.EstadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/estado")
public class EstadoController 
{

    @Autowired
    EstadoService estadoService;

    @GetMapping()
    public ArrayList<Estado> obtenerEstados(){
        return estadoService.obtenerEstados();
    }

    @PostMapping()
    public Estado guardarEstado(@RequestBody Estado estado){
        return this.estadoService.guardarEstado(estado);
    }

    @GetMapping( path = "/{id}")
    public Optional<Estado> obtenerEstadoPorId(@PathVariable("id") Long id) {
        return this.estadoService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.estadoService.eliminarEstado(id);
        if (ok){
            return "Se eliminó el estado con id " + id;
        }else{
            return "No pudo eliminar el estado con id" + id;
        }
    }

}
