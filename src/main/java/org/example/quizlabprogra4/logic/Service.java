package org.example.quizlabprogra4.logic;

import org.example.quizlabprogra4.data.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@org.springframework.stereotype.Service("service")
public class Service {
    @Autowired
    private CompraRepository compraRepository;
    @Autowired
    private TandaRepository tandaRepository;
    @Autowired
    private PeliculaRepository peliculaRepository;

    public Pelicula findByIdPelicula(String id) throws Exception {
        return peliculaRepository.findById(id);
    }

    public List<Pelicula> findAllPeliculas(){
        return peliculaRepository.findAll();
    }

    public Compra findByIdCompra(String id) throws Exception {
        return compraRepository.findById(id);
    }

    public List<Compra> findAllCompras(){
        return compraRepository.findAll();
    }

    public Tanda findByIdTanda(String id) throws Exception {
        return tandaRepository.findById(id);
    }

    public List<Tanda> findAllTandas(){
        return tandaRepository.findAll();
    }

    public List<Tanda> findByFechaTanda(String fecha){
        return tandaRepository.findByFecha(fecha);
    }
}
