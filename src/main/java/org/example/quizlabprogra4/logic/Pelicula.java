package org.example.quizlabprogra4.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pelicula {
    String nombre;
    String codigo;
    String formato;
    String duracion;
    String censura;
    String genero;

    List<Tanda> tandas;
    int precioGen;
    int precioAM;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Tanda> getTandas() {
        return tandas;
    }

    public void setTandas(List<Tanda> tandas) {
        this.tandas = tandas;
    }

    public int getPrecioGen() {
        return precioGen;
    }

    public void setPrecioGen(int precioGen) {
        this.precioGen = precioGen;
    }

    public int getPrecioAM() {
        return precioAM;
    }

    public void setPrecioAM(int precioAM) {
        this.precioAM = precioAM;
    }

    public Pelicula() {
        nombre="";
        codigo="";
        formato="";
        duracion="";
        censura="";
        genero="";
        tandas=new ArrayList<>();
        precioGen=0;
        precioAM=0;
    }

    public Pelicula(String nombre, String codigo, String formato, String duracion,String censura, String genero, int precioGen, int precioAM) {
        this.nombre = nombre;
        this.codigo=codigo;
        this.formato=formato;
        this.duracion=duracion;
        this.censura=censura;
        this.genero=genero;
        tandas=new ArrayList<>();
        this.precioGen=precioGen;
        this.precioAM=precioAM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return precioGen == pelicula.precioGen && precioAM == pelicula.precioAM && Objects.equals(nombre, pelicula.nombre) && Objects.equals(codigo, pelicula.codigo) && Objects.equals(formato, pelicula.formato) && Objects.equals(duracion, pelicula.duracion) && Objects.equals(censura, pelicula.censura) && Objects.equals(genero, pelicula.genero) && Objects.equals(tandas, pelicula.tandas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo, formato, duracion, censura, genero, tandas, precioGen, precioAM);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pelicula clone(){
        return new Pelicula(this.nombre,this.codigo,this.formato,this.duracion,this.censura,this.genero,this.precioGen,this.precioAM);
    }
}
