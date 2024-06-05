package org.example.quizlabprogra4.presentation;

import org.example.quizlabprogra4.logic.Service;
import org.example.quizlabprogra4.logic.Tanda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/tandas")
public class Tandas {
    @Autowired
    Service service;

    @GetMapping("/{fecha}")
    public List<Tanda> searchByDate(@PathVariable String fecha){
        return service.findByFechaTanda(fecha);
    }

    @GetMapping()
    public List<Tanda> findAll(){
        return service.findAllTandas();
    }

    @GetMapping("/{id}")
    public Tanda read(@PathVariable String id){
        try{
        return service.findByIdTanda(id);}
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

}
