package org.example.quizlabprogra4.presentation;

import org.example.quizlabprogra4.logic.Compra;
import org.example.quizlabprogra4.logic.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class Compras {
    @Autowired
    Service service;

    @GetMapping()
    public List<Compra> findAll(){
        return service.findAllCompras();
    }

    @GetMapping("/{id}")
    public Compra read(@PathVariable String id) {
        try {
            return service.findByIdCompra(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }
}
