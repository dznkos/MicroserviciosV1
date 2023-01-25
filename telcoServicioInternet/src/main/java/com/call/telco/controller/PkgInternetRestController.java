package com.call.telco.controller;


import com.call.telco.crud.service.SequenceGeneratorService;
import com.call.telco.daos.PkgInternetRepository;
import com.call.telco.entities.PkgInternet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/internet")
public class PkgInternetRestController {


    @Autowired
    private PkgInternetRepository dao;

    @Autowired
    private SequenceGeneratorService generatorService;

    @GetMapping("/server")
    public String hello(){
        return "Here Servicio Package Internet 1 :3";
    }

    @GetMapping
    public Iterable<PkgInternet> getPkgInternet() {
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public PkgInternet getPkgInternet(@PathVariable long id) {
        return dao.findById(id).get();
    }

    @PostMapping
    public PkgInternet addPkgInternet(@RequestBody PkgInternet pkgInternet){
        pkgInternet.setId(generatorService.generateSequence(pkgInternet.SEQUENCE_NAME));
        return dao.save(pkgInternet);
    }

    @DeleteMapping("/{id}")
    public void removePkgInternet(@PathVariable long id){
        dao.deleteById(id);
    }

    @PutMapping("/{id}")
    public PkgInternet updatePkgInternet(@RequestBody PkgInternet pkgInternet, @PathVariable long id){
        pkgInternet.setId(id);
        return dao.save(pkgInternet);
    }


}
