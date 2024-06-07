package org.example.quizlabprogra4.presentation;

import org.example.quizlabprogra4.logic.Pelicula;
import org.example.quizlabprogra4.logic.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class Peliculas {
    @Autowired
    Service service;

    @GetMapping("/fechas")
    public List<String> fechas(){
       Date fecha = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        List<String> fechas = new ArrayList<String>();
        for(int i=0; i<4; i++){
            fechas.add(sdf.format(fecha));
            fecha.setDate(fecha.getDate()+1);
        }
        return fechas;
    }

    @GetMapping()
    public List<Pelicula> findAll(){
        return service.findAllPeliculas();
    }

    @GetMapping("/{codigo}")
    public Pelicula read(@PathVariable String codigo){
        try{
        return service.findByIdPelicula(codigo);}
        catch(Exception e){
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }


}
