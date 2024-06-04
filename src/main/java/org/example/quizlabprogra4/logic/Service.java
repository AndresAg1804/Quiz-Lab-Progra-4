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


}
