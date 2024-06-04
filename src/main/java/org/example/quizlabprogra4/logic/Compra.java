package org.example.quizlabprogra4.logic;

public class Compra {
    String tiquete;
    String cedula;
    String nombre;
    String tarjeta;
    String tanda;
    int boletosGen;
    int boletosAM;

    public Compra(String tiquete, String cedula, String nombre, String tarjeta, String tanda, int boletosGen, int boletosAM) {
        this.tiquete = tiquete;
        this.cedula = cedula;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.tanda = tanda;
        this.boletosGen = boletosGen;
        this.boletosAM = boletosAM;
    }

    public Compra() {
    }

    public String getTiquete() {
        return tiquete;
    }

    public void setTiquete(String tiquete) {
        this.tiquete = tiquete;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getTanda() {
        return tanda;
    }

    public void setTanda(String tanda) {
        this.tanda = tanda;
    }

    public int getBoletosGen() {
        return boletosGen;
    }

    public void setBoletosGen(int boletosGen) {
        this.boletosGen = boletosGen;
    }

    public int getBoletosAM() {
        return boletosAM;
    }

    public void setBoletosAM(int boletosAM) {
        this.boletosAM = boletosAM;
    }

    public Compra clone(){
        return new Compra(this.tiquete,this.cedula, this.nombre, this.tarjeta, this.tanda, this.boletosGen, this.boletosAM);
    }
}
