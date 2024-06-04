package org.example.sanpedro.data;

import org.example.sanpedro.logic.Tanda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component("tandaRepository")
public class TandaRepository {

    List<Tanda> list;

    public Tanda findById(String id) throws Exception{
        Tanda r = list.stream()
                .filter( e->e.getId().equals(id))
                .findFirst().get();
        return r.clone();
    }
    public List<Tanda> findAll(){
        return list;
    }

    public List<Tanda> findByFecha(String fecha){
        return list.stream()
                .filter( e->e.getFecha().equals(fecha))
                .sorted((o1, o2) -> o1.getPelicula().getCodigo().compareTo(o2.getPelicula().getCodigo()))
                .toList();
    }

    public TandaRepository() {
        PeliculaRepository peliculaRepository=new PeliculaRepository();
        list = new ArrayList<Tanda>();
        try{
            list.add(new Tanda("1",peliculaRepository.findById("batman"), "2024-06-04","02:30 p. m.",6));
            list.add(new Tanda("2",peliculaRepository.findById("batman"),"2024-06-04","06:00 p. m.",4));
            list.add(new Tanda("3",peliculaRepository.findById("morbius"),"2024-06-04","12:20 p. m.",5));
            list.add(new Tanda("4",peliculaRepository.findById("morbius"),"2024-06-04","02:35 p. m.",5));
            list.add(new Tanda("5",peliculaRepository.findById("morbius"),"2024-06-04","04:45 p. m.",5));
            list.add(new Tanda("6",peliculaRepository.findById("jujutsu"),"2024-06-072","11:00 a. m.",3));
            list.add(new Tanda("7",peliculaRepository.findById("jujutsu"),"2024-06-04","02:30 p. m.",3));
            list.add(new Tanda("8",peliculaRepository.findById("jujutsu"),"2024-06-04","04:40 p. m.",3));
            list.add(new Tanda("9",peliculaRepository.findById("jujutsu"),"2024-06-04","06:55 p. m.",3));
            list.add(new Tanda("10",peliculaRepository.findById("batman"),"2024-06-05","01:00 p. m.",4));
            list.add(new Tanda("11",peliculaRepository.findById("tiposmalos"),"2024-06-05","11:30 a. m.",5));
            list.add(new Tanda("12",peliculaRepository.findById("tiposmalos"),"2024-06-05","05:30 p. m.",5));
            list.add(new Tanda("13",peliculaRepository.findById("sonic2"),"2024-06-05","01:30 a. m.",6));
            list.add(new Tanda("14",peliculaRepository.findById("sonic2"),"2024-06-06","04:00 p. m.",6));
            list.add(new Tanda("15",peliculaRepository.findById("sonic2"),"2024-06-06","02:00 p. m.",6));
            list.add(new Tanda("16",peliculaRepository.findById("animales3"),"2024-06-06","01:00 p. m.",5));
            list.add(new Tanda("17",peliculaRepository.findById("animales3"),"2024-06-06","03:30 p. m.",5));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
