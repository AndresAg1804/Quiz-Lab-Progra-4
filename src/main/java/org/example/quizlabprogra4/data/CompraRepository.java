package org.example.quizlabprogra4.data;

import org.example.quizlabprogra4.logic.*;
import org.springframework.stereotype.Component;
import java.util.List;

@Component("compraRepository")
public class CompraRepository {
    List<Compra> list;

    public Compra findById(String id) throws Exception{
        Compra r = list.stream()
                .filter( e-> e.getTiquete().equals(id))
                .findFirst().get();
        return r.clone();
    }
    public List<Compra> findAll(){
        return list;
    }

}
