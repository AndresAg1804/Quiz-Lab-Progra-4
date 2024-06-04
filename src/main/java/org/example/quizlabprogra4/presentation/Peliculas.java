package org.example.quizlabprogra4.presentation;

import org.example.quizlabprogra4.logic.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
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

}
