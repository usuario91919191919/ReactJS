package com.udigitalproject.udigital.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.udigitalproject.udigital.models.Tipo;
import com.udigitalproject.udigital.services.TipoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/tipo")
public class TipoController 
{

    @Autowired
    TipoService tipoService;

    @GetMapping()
    public ArrayList<Tipo> obtenerTipos(){
        return tipoService.obtenerTipos();
    }

    @PostMapping()
    public Tipo guardarTipo(@RequestBody Tipo tipo){
        return this.tipoService.guardarTipo(tipo);
    }

    @GetMapping( path = "/{id}")
    public Optional<Tipo> obtenerTipoPorId(@PathVariable("id") Long id) {
        return this.tipoService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.tipoService.eliminarTipo(id);
        if (ok){
            return "Se eliminó el tipo con id " + id;
        }else{
            return "No pudo eliminar el tipo con id" + id;
        }
    }

}
