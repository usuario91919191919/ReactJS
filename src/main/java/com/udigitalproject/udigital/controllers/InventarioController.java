package com.udigitalproject.udigital.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.udigitalproject.udigital.models.Inventario;
import com.udigitalproject.udigital.services.InventarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/inventario")
public class InventarioController 
{

    @Autowired
    InventarioService inventarioService;

    @GetMapping()
    public ArrayList<Inventario> obtenerInventarios(){
        return inventarioService.obtenerInventarios();
    }

    @PostMapping()
    public Inventario guardarInventario(@RequestBody Inventario inventario){
        return this.inventarioService.guardarInventario(inventario);
    }

    @GetMapping( path = "/{serial}")
    public Optional<Inventario> obtenerInventarioPorSerial(@PathVariable("serial") Long serial) {
        return this.inventarioService.obtenerPorSerial(serial);
    }

    @DeleteMapping( path = "/{serial}")
    public String eliminarPorId(@PathVariable("id") Long serial){
        boolean ok = this.inventarioService.eliminarInventario(serial);
        if (ok){
            return "Se eliminó el inventario con serial " + serial;
        }else{
            return "No pudo eliminar el inventario con serial" + serial;
        }
    }

}
