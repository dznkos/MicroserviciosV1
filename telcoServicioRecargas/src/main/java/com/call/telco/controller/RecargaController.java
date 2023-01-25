package com.call.telco.controller;

import com.call.telco.daos.RecargaRepository;
import com.call.telco.entities.Recarga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recarga")
public class RecargaController {

    @Autowired
    private RecargaRepository dao;

    @GetMapping("/server")
    public String hello(){
        return "Aqui Servicio Recargas 1  *-*";
    }

    @GetMapping
    public Iterable<Recarga> getRecarga(){
        return dao.findAll();
    }
    @GetMapping("/{id}")
    public Recarga getRecarga(@PathVariable Integer id){
        return dao.findById(id).get();
    }

    @PostMapping
    public Recarga addRecarga(@RequestBody Recarga recarga){
        return dao.save(recarga);
    }

    @DeleteMapping("/{id}")
    public void removeRecarga(@PathVariable Integer id){
        dao.deleteById(id);
    }
    @PutMapping("/{id}")
    public Recarga updateRecarga(@RequestBody Recarga recarga,@PathVariable Integer id){

        return dao.save(recarga);
    }
}

