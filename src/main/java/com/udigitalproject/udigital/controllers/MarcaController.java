package com.udigitalproject.udigital.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.udigitalproject.udigital.models.Marca;
import com.udigitalproject.udigital.services.MarcaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/marca")
public class MarcaController 
{

    @Autowired
    MarcaService marcaService;

    @GetMapping()
    public ArrayList<Marca> obtenerMarcas(){
        return marcaService.obtenerMarcas();
    }

    @PostMapping()
    public Marca guardarMarca(@RequestBody Marca estado){
        return this.marcaService.guardarMarca(estado);
    }

    @GetMapping( path = "/{id}")
    public Optional<Marca> obtenerMarcaPorId(@PathVariable("id") Long id) {
        return this.marcaService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.marcaService.eliminarMarca(id);
        if (ok){
            return "Se eliminó la marca con id " + id;
        }else{
            return "No pudo eliminar la marca con id" + id;
        }
    }

}
