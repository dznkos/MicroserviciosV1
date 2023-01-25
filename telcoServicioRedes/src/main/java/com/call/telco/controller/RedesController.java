package com.call.telco.controller;

import com.call.telco.daos.RedesRepository;
import com.call.telco.entities.Redes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redes")
public class RedesController {

    @Autowired
    private RedesRepository dao;

    @GetMapping("/server")
    public String hello(){
        return "Aqui Servicio Redes 1  :P";
    }
    @GetMapping
    public Iterable<Redes> getRedes(){
    return dao.findAll();
}
    @GetMapping("/{id}")
    public Redes getRedes(@PathVariable Integer id){
        return dao.findById(id).get();
    }

    @PostMapping
    public Redes addRedes(@RequestBody Redes redes){
        return dao.save(redes);
    }

    @DeleteMapping("/{id}")
    public void removeRedes(@PathVariable Integer id){
        dao.deleteById(id);
    }
    @PutMapping("/{id}")
    public Redes updateRedes(@RequestBody Redes redes,@PathVariable Integer id){

        return dao.save(redes);
    }
}
