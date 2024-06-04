package org.example.quizlabprogra4.logic;

public class Tanda {
    String id;
    Pelicula pelicula;
    String fecha;
    String hora;
    int sala;

    public Tanda(String id, Pelicula pelicula, String fecha, String hora, int sala) {
        this.id = id;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.hora = hora;
        this.sala = sala;
    }

    public Tanda() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Tanda clone(){
        return new Tanda(this.id, this.pelicula,this.fecha,this.hora,this.sala);
    }
}
